package com.example.gihan.roomdatabaseexample.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gihan.roomdatabaseexample.R;
import com.example.gihan.roomdatabaseexample.model.User;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RaedUsersFragment extends Fragment {


    private TextView read;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_raed_users, container, false);
        read = view.findViewById(R.id.readinfo);

        List<User> users = MainActivity.myApplicationDatabase.myDao().getUsers();

        String info = "";
        for (User user : users) {
            int id = user.getId();
            String name = user.getName();
            String email = user.getEmail();

            info = info + "\n\n" + "id :" + id + "\n" + "name :" + name + "\n" + "email :" + email + "\n";

        }

        read.setText(info);

        return view;

    }


}
