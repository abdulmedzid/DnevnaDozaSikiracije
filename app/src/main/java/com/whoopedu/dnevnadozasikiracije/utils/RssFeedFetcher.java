package com.whoopedu.dnevnadozasikiracije.utils;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class RssFeedFetcher {

    private static final String URL = "https://www.klix.ba/rss";

    private final RssFeedFetcherListener mListener;

    public RssFeedFetcher(RssFeedFetcherListener listener) {
        mListener = listener;
    }

    public void getRssFeed(Context ctx) {
        RequestQueue queue = Volley.newRequestQueue(ctx);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                response -> mListener.onRssFetchedRssFeed(getFixEncodingString(response)),
                error -> mListener.onFailedRssFetch()
        );

        queue.add(stringRequest);
    }

    public static String getFixEncodingString(String response) {
        byte[] u = response.getBytes(
                StandardCharsets.ISO_8859_1);
        response = new String(u, StandardCharsets.UTF_8);
        return response;
    }

    public interface RssFeedFetcherListener {
        void onRssFetchedRssFeed(String feed);
        void onFailedRssFetch();
    }
}
