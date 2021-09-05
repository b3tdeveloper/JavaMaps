package com.berol.javamaps.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.berol.javamaps.model.Place;

@Database(entities = {Place.class}, version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();
}
