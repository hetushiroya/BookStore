package com.example.bookStore.model;

public class Blog {

    private int id;
    private String blogName;
    private String blogImg;
    private String description;

    public Blog(int id, String blogName, String blogImg, String description) {
        this.id = id;
        this.blogName = blogName;
        this.blogImg = blogImg;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


