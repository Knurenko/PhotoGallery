package com.bignerdranch.android.photogallery;

public class GalleryItem {
    private String title;
    private String id;
    private String url_s;

    public String getCaption() {return title;}

    public void setCaption(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url_s;
    }

    public void setUrl(String url_s) {
        this.url_s = url_s;
    }

    @Override
    public String toString() {
        return "id: " + id + "\ncaption: " + title + "\nurl: " + url_s;
    }


    public GalleryItem(String id, String title, String url_s){
        this.id = id;
        this.title = title;
        this.url_s = url_s;
    }
    public GalleryItem(){}
}
