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
public class DeleteUserFragment extends Fragment {


    private EditText userId;
    private Button deletebtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
        userId = view.findViewById(R.id.et_delete);
        deletebtn = view.findViewById(R.id.bbtn_delete);

        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(userId.getText().toString());

                User user = new User();
                user.setId(id);
                MainActivity.myApplicationDatabase.myDao().deleteUser(user);
                userId.setText("");
                Toast.makeText(getActivity(), "Delete Done", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
