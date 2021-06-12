package com.whoopedu.dnevnadozasikiracije.presenter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.whoopedu.dnevnadozasikiracije.MainContract;
import com.whoopedu.dnevnadozasikiracije.utils.RssFeedFetcher;
import com.whoopedu.dnevnadozasikiracije.utils.RssFeedParser;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class MainPresenter implements
        MainContract.Presenter,
        RssFeedFetcher.RssFeedFetcherListener {

    private MainContract.MainView mView;

    public MainPresenter(MainContract.MainView view) {
        mView = view;
    }

    @Override
    public void getArticles(Context ctx) {
        if (isNetworkAvailable(ctx)) {
            fetchOnlineData(ctx);
        } else {
            //loadCashedData();
        }
    }

    private void fetchOnlineData(Context ctx) {
        RssFeedFetcher rssFeedFetcher = new RssFeedFetcher(this);
        rssFeedFetcher.getRssFeed(ctx);
    }

    @Override
    public void onRssFetchedRssFeed(String feed) {
        RssFeedParser rssFeedParser = new RssFeedParser();
        try {
            mView.showArticles(rssFeedParser.getArticles(feed));
        } catch (XmlPullParserException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailedRssFetch() {
        loadCashedData();
    }

    private boolean isNetworkAvailable(Context ctx) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void loadCashedData() {

    }
}
