package com.example.ridwan.androidrestapi_retrofitdemo.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by ridwan on 03/01/18.
 */

public class Gambar implements Serializable{

    @Expose
    private int albumId;

    @Expose
    private int id;

    @Expose
    private String title;

    @Expose
    private String url;

    @Expose
    private String thumbnailUrl;


        "albumId": 1,
            "id": 1,
            "title": "accusamus beatae ad facilis cum similique qui sunt",
            "url": "http://placehold.it/600/92c952",
            "thumbnailUrl": "http://placehold.it/150/92c952"

        "albumId": 1,
            "id": 2,
            "title": "reprehenderit est deserunt velit ipsam",
            "url": "http://placehold.it/600/771796",
            "thumbnailUrl": "http://placehold.it/150/771796"

        "albumId": 1,
            "id": 3,
            "title": "officia porro iure quia iusto qui ipsa ut modi",
            "url": "http://placehold.it/600/24f355",
            "thumbnailUrl": "http://placehold.it/150/24f355"

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
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
}

