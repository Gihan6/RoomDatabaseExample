package com.example.gihan.roomdatabaseexample.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gihan.roomdatabaseexample.R;
import com.example.gihan.roomdatabaseexample.model.User;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddUSerragment extends Fragment {


    private EditText id, name, email;
    private Button save;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_userragment, container, false);

        id = view.findViewById(R.id.add_user_id);
        name = view.findViewById(R.id.add_user_name);
        email = view.findViewById(R.id.add_user_email);
        save = view.findViewById(R.id.add_user_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (email.getText().toString().equals("") || name.getText().toString().equals("") || id.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "Complete data", Toast.LENGTH_SHORT).show();

                } else {
                    int userId = Integer.parseInt(id.getText().toString());
                    String userNAme = name.getText().toString();
                    String userEmail = email.getText().toString();
                    User user = new User();
                    user.setEmail(userEmail);
                    user.setId(userId);
                    user.setName(userNAme);


                    MainActivity.myApplicationDatabase.myDao().addUser(user);

                    Toast.makeText(getActivity(), "User add sucessfully", Toast.LENGTH_SHORT).show();

                    name.setText("");
                    email.setText("");
                    id.setText("");
                }


            }
        });

        return view;
    }

}
