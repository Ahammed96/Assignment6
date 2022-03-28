package com.cis3515.dogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private DogsContent dogsContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dogsContent = new DogsContent(getApplicationContext());
        setContentView(R.layout.activity_display);
        getSupportActionBar().setTitle(R.string.display_activity_title);

        int dogPosition = getIntent().getExtras().getInt("dogPosition");
        findViewById(R.id.closePage).setOnClickListener(x -> {
            finish();
        });
        TextView description = findViewById(R.id.description);
        description.setText(dogsContent.getDescription(dogPosition));
        ImageView image = findViewById(R.id.image);
        image.setImageResource(dogsContent.getResourceId(dogPosition));
    }
}