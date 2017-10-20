package com.example.android.funplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the Fun player category
        ImageView fun_player = (ImageView) findViewById(R.id.fun_player_bar_image);

        // Set a click listener on Playlists View
        fun_player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Fun player detailed ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent funPlayerIntent = new Intent(AlbumsActivity.this, FunPlayerActivity.class);
                if (funPlayerIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(funPlayerIntent);
                }
            }
        });
    }


}

