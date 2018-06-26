package com.example.gihan.roomdatabaseexample.interfaces;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.gihan.roomdatabaseexample.model.User;

import java.util.List;

/**
 * Created by Gihan on 6/23/2018.
 */

@Dao
public interface MyDao {

    @Insert
    void addUser(User user);

    @Query("select * from users")
    List<User> getUsers();

    @Delete
    void deleteUser(User user);

    @Update
    void updateUser(User user);

}
