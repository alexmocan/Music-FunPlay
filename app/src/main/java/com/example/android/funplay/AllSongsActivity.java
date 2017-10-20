package com.example.android.funplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Find the View that shows the Fun player category
        ImageView fun_player = findViewById(R.id.fun_player_bar_image);

        // Set a click listener on Playlists View
        fun_player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Fun player detailed ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent funPlayerIntent = new Intent(AllSongsActivity.this, FunPlayerActivity.class);
                if (funPlayerIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(funPlayerIntent);
                }
            }
        });
    }
}

