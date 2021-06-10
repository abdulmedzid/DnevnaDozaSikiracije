package com.whoopedu.dnevnadozasikiracije.model;

public class Comment {
    public int id;
    public String user;
    public String content;
    public int upvotes;
    public int downvotes;

    public Comment(int id, String user, String content, int upvotes, int downvotes) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }
}
