package com.ogulcan.mytraveldiary;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Place.class},version = 1)
public abstract class PlaceDatabase extends RoomDatabase {

    public abstract PlaceDao placeDao();

}
