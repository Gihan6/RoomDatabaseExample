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
public class UpdateUserFragment extends Fragment {


    private EditText userid, userName, userEmai;
    private Button update;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);

        userid = view.findViewById(R.id.update_user_id);
        userName = view.findViewById(R.id.update_user_name);
        userEmai = view.findViewById(R.id.update_user_email);
        update = view.findViewById(R.id.update_user_save);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (userEmai.getText().toString().equals("") || userName.getText().toString().equals("") || userid.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "Complete data", Toast.LENGTH_SHORT).show();

                } else {
                    int userId = Integer.parseInt(userid.getText().toString());
                    String userNAme = userName.getText().toString();
                    String userEmail = userEmai.getText().toString();
                    User user = new User();
                    user.setEmail(userEmail);
                    user.setId(userId);
                    user.setName(userNAme);


                    MainActivity.myApplicationDatabase.myDao().updateUser(user);

                    Toast.makeText(getActivity(), "User update sucessfully", Toast.LENGTH_SHORT).show();

                    userName.setText("");
                    userEmai.setText("");
                    userid.setText("");
                }

            }
        });

        return view;

    }

}
