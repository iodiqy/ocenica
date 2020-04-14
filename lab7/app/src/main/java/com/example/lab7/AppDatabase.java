package com.example.lab7;

import androidx.room.Database;
import androidx.room.RoomDatabase;



@Database(entities = {Favorite.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract FavoriteDao favoriteDao();

}