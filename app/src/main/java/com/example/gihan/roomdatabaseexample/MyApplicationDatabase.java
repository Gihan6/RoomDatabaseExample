package com.example.gihan.roomdatabaseexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.gihan.roomdatabaseexample.interfaces.MyDao;
import com.example.gihan.roomdatabaseexample.model.User;

/**
 * Created by Gihan on 6/23/2018.
 */

@Database( entities = {User.class},version = 1)
public abstract class MyApplicationDatabase extends RoomDatabase {


    public abstract MyDao myDao();


}
