package com.whoopedu.dnevnadozasikiracije;

import android.content.Context;

import com.whoopedu.dnevnadozasikiracije.model.Article;

import java.util.List;

public interface MainContract {
    interface MainView {
        void showArticles(List<Article> articles);
    }

    interface Presenter {
        void getArticles(Context ctx);
    }
}
