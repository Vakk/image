package com.vakk.nasaapod.helpers;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by vakk on 3/16/16.
 */

/**
 * Contain all data for image (a.k. name,url, description)
 */
public class Image implements Serializable{
    private String name;
    private String url;
    private String description;
    private String date;
    private  String photographer;
    public Image(String name, String url, String description,String date,String photographer) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.date=date;
        this.photographer=photographer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    public void setPhotographer(String photographer){
        this.photographer=photographer;
    }
    public String getPhotographer(){
        return photographer;
    }
}
