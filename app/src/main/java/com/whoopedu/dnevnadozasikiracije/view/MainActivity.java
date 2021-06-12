package com.whoopedu.dnevnadozasikiracije.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.whoopedu.dnevnadozasikiracije.MainContract;
import com.whoopedu.dnevnadozasikiracije.R;
import com.whoopedu.dnevnadozasikiracije.model.Article;
import com.whoopedu.dnevnadozasikiracije.presenter.MainPresenter;
import com.whoopedu.dnevnadozasikiracije.utils.RssFeedFetcher;
import com.whoopedu.dnevnadozasikiracije.utils.RssFeedParser;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private Toolbar mToolbar;
    private RecyclerView mArticlesRecyclerView;

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadActionBar();
        loadRecyclerView();
        mPresenter = new MainPresenter(this);
        mPresenter.getArticles(this);
    }

    private void loadRecyclerView() {
        mArticlesRecyclerView = findViewById(R.id.rv_articles);
        mArticlesRecyclerView.setLayoutManager(
                new LinearLayoutManager(this,RecyclerView.VERTICAL, false)
        );
    }

    private void loadActionBar() {
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    @Override
    public void showArticles(List<Article> articles) {
        ArticlesAdapter adapter = new ArticlesAdapter(articles);
        mArticlesRecyclerView.setAdapter(adapter);
    }
}