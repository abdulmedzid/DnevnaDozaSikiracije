package com.whoopedu.dnevnadozasikiracije.model;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Date;

public class Article {
    public int id;
    public String title;
    public String description;
    public String category;
    public String url;
    public String thumbnailUrl;
    public Date date;
    ArrayList<Comment> comments;

    public Article(String title, String description, String category, String url, String thumbnailUrl, Date date, ArrayList<Comment> comments) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.date = date;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id).append(" title: ").append(title).append(" desc: ").append(description);
        return sb.toString();
    }
}
