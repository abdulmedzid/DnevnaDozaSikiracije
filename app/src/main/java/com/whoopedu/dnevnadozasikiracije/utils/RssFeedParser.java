package com.whoopedu.dnevnadozasikiracije.utils;

import android.util.Log;
import android.util.Xml;

import com.whoopedu.dnevnadozasikiracije.model.Article;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RssFeedParser {
    private static final String ns = null;

    private static final String ARTICLE_TAG = "item";
    private static final String FEED_NAME = "rss";

    private static final String TITLE_TAG = "title";
    private static final String DESCRIPTION_TAG = "description";
    private static final String CATEGORY_TAG = "category";
    private static final String URL_TAG = "link";
    private static final String THUMBNAIL_TAG = "media:content"; // mozda media:content
    private static final String THUMBNAIL_URL_ATTR = "url";
    private static final String DATE_TAG = "pubDate";

    public List<Article> getArticles(String in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
        parser.setInput(new StringReader(in));
        parser.nextTag();
        return readFeed(parser);
    }

    private List<Article> readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
        List<Article> entries = new ArrayList<Article>();
        parser.require(XmlPullParser.START_TAG, ns, FEED_NAME);
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            Log.d("tag_name", name);
            // Starts by looking for the entry tag
            if (name.equals(ARTICLE_TAG)) {
                entries.add(readEntry(parser));
            } else if (name.equals("channel")) {
                continue;
            }
            else {
                skip(parser);
            }
        }
        return entries;
    }

    // Parses the contents of an entry. If it encounters a title, summary, or link tag, hands them off
// to their respective "read" methods for processing. Otherwise, skips the tag.
    private Article readEntry(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, ARTICLE_TAG);

        String title = null;
        String description = null;
        String category = null;
        String url = null;
        String thumbnailUrl = null;
        String dateString = null;

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            Log.d("parser.name", name);
            if (name.equals(TITLE_TAG)) {
                title = readTitle(parser);
            } else if (name.equals(DESCRIPTION_TAG)) {
                description = readDescription(parser);
            } else if (name.equals(CATEGORY_TAG)) {
                category = readCategory(parser);
            } else if (name.equals(URL_TAG)) {
                url = readUrl(parser);
            } else if (name.equals(THUMBNAIL_TAG)) {
                thumbnailUrl = readThumbnailTag(parser);
            } else if (name.equals(DATE_TAG)) {
                dateString = readDateTimeTag(parser);
            } else {
                skip(parser);
            }
        }

        Article article = new Article(title, description, category, url, thumbnailUrl, new Date(), null);
        return article;
    }

    // Processes title tags in the feed.
    private String readTitle(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, TITLE_TAG);
        String title = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, TITLE_TAG);
        return title;
    }

    // Processes description tags in the feed.
    private String readDescription(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, DESCRIPTION_TAG);
        String summary = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, DESCRIPTION_TAG);
        return summary;
    }

    // Processes CATEGORY tags in the feed.
    private String readCategory(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, CATEGORY_TAG);
        String category = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, CATEGORY_TAG);
        return category;
    }

    // Processes url tags in the feed.
    private String readUrl(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, URL_TAG);
        String url = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, URL_TAG);
        return url;
    }

    // Processes media thumbnail tags in the feed.
    private String readThumbnailTag(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, THUMBNAIL_TAG);
        String thumbnailUrl = parser.getAttributeValue(null, THUMBNAIL_URL_ATTR);
        Log.d("thumbnailUrl", thumbnailUrl);
        skip(parser);
        parser.require(XmlPullParser.END_TAG, ns, THUMBNAIL_TAG);
        return thumbnailUrl;
    }

    // Processes datetime tags in the feed.
    private String readDateTimeTag(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, DATE_TAG);
        String date = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, DATE_TAG);
        return date;
    }

    // For the tags title and summary, extracts their text values.
    private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

    /*
     * Recursively skip a whole tag that isn't an article
     * */
    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }
}
