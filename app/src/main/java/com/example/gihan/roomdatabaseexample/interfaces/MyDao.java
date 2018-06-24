package com.example.gihan.roomdatabaseexample.interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import com.example.gihan.roomdatabaseexample.model.User;

/**
 * Created by Gihan on 6/23/2018.
 */

@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);

}
