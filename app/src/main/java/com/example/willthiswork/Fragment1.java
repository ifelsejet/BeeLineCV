package com.example.willthiswork;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    private static final String TAG = "SecondActivity";

    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_activity_layout, container, false);

        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);

        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "Going to Second Activity", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
