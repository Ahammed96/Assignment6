package com.cis3515.dogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getSupportActionBar().setTitle(R.string.selection_activity_title);

        TextView tv = findViewById(R.id.message);
        tv.setText(R.string.selection_message);

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.dogsList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new ImageAdapter(getBaseContext()));
    }
}