package com.example.muketour.entity;

public class findHot {
    private String title;
    private String from;
    private String eye;
    private String like;
    private int img;

    public findHot() {

    }

    public findHot(String title, String from, String eye, String like, int img) {
        this.title=title;
        this.from=from;
        this.eye=eye;
        this.like=like;
        this.img=img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
