package com.ogulcan.mytraveldiary;

import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Place implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "text")
    public String text;

    @ColumnInfo(name = "latitude")
    public Double latitude;

    @ColumnInfo(name = "longitude")
    public Double longitude;

    @ColumnInfo(name = "image")
    public byte[] byteArray;

    public Place(String name,String text, Double latitude, Double longitude, byte[] byteArray) {
        this.name = name;
        this.text = text;
        this.latitude = latitude;
        this.longitude = longitude;
        this.byteArray= byteArray;
    }
}
