package com.example.gihan.roomdatabaseexample.ui;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.gihan.roomdatabaseexample.MyApplicationDatabase;
import com.example.gihan.roomdatabaseexample.R;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static MyApplicationDatabase myApplicationDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        myApplicationDatabase = Room.databaseBuilder(getApplicationContext(), MyApplicationDatabase.class, "userdb").allowMainThreadQueries().build();
        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            fragmentManager.beginTransaction().add(R.id.fragment_container, new HomeFragment()).commit();

        }

    }
}
