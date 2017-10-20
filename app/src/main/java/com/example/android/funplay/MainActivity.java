package com.example.android.funplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the all songs category
        LinearLayout all_songs_layout = (LinearLayout) this.findViewById(R.id.all_songs_bar);

        // Set a click listener on All songs LinearLayout view
        all_songs_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the All songs LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);
                if (allSongsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(allSongsIntent);
                }
            }
        });

        // Find the View that shows the Albums category
        LinearLayout albums_layout = (LinearLayout) this.findViewById(R.id.albums_layout);

        // Set a click listener on Albums LinearLayout view
        albums_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Albums LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                if (albumsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(albumsIntent);
                }
            }
        });

        // Find the View that shows the Artists category
        LinearLayout artists_layout = (LinearLayout) this.findViewById(R.id.artists_layout);

        // Set a click listener on Artists LinearLayout view
        artists_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Artists LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                if (artistsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(artistsIntent);
                }
            }
        });

        // Find the View that shows the Genres category
        LinearLayout genres_layout = (LinearLayout) this.findViewById(R.id.genres_layout);

        // Set a click listener on Genres LinearLayout view
        genres_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Genres LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);
                if (genresIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(genresIntent);
                }
            }
        });

        // Find the View that shows the Playlists category
        ImageView playlists = (ImageView) findViewById(R.id.playlists_detailed_image);

        // Set a click listener on Playlists detailsImageView
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Playlists details ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                if (playlistsIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(playlistsIntent);
                }
            }
        });

        // Find the View that shows the Favorites category
        LinearLayout favorites_layout = (LinearLayout) this.findViewById(R.id.favorites_layout);

        // Set a click listener on Favorites LinearLayout view
        favorites_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Favorites LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                if (favoritesIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(favoritesIntent);
                }
            }
        });

        // Find the View that shows the Recently Played category
        LinearLayout recently_played_layout = (LinearLayout) this.findViewById(R.id.recently_played_layout);

        // Set a click listener on Recently Played LinearLayout view
        recently_played_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Recently Played LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentlyPlayedIntent = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                if (recentlyPlayedIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(recentlyPlayedIntent);
                }
            }
        });

        // Find the View that shows the Most Played category
        LinearLayout most_played_layout = (LinearLayout) this.findViewById(R.id.most_played_layout);

        // Set a click listener on Most Played LinearLayout view
        most_played_layout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Most Played LinearLayout (Image, Text, Number text) is clicked on.
            @Override
            public void onClick(View view) {
                Intent mostPlayedIntent = new Intent(MainActivity.this, MostPlayedActivity.class);
                if (mostPlayedIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mostPlayedIntent);
                }
            }
        });

        // Find the View that shows the Fun player category
        ImageView fun_player = (ImageView) findViewById(R.id.fun_player_bar_image);

        // Set a click listener on Playlists View
        fun_player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Fun player detailed ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent funPlayerIntent = new Intent(MainActivity.this, FunPlayerActivity.class);
                if (funPlayerIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(funPlayerIntent);
                }
            }
        });
    }
}


