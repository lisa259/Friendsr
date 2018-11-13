package com.example.mylenovo.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

// Class to adjust activity_profile to specific friend

public class ProfileActivity extends AppCompatActivity {

    SharedPreferences.Editor editor;
    Friend retrievedFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Retrieve friendobject of the friend who was clicked on
        Intent intent = getIntent();
        retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");

        // Set image of friend
        ImageView image = findViewById(R.id.profileImage);
        image.setImageResource(retrievedFriend.getDrawableId());

        // Set name of friend
        TextView name = findViewById(R.id.profileName);
        name.setText(retrievedFriend.getName());

        // Set bio of friend
        TextView bio = findViewById(R.id.profileBio);
        bio.setText(retrievedFriend.getBio());

        // Get location of stored variable
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        editor = prefs.edit();

        // Retrieve rating of friend as float
        float ratingScore = prefs.getFloat(retrievedFriend.getName(), (float) 0.0);

        // Set rating of friend
        RatingBar rating = findViewById(R.id.profileRating);
        rating.setRating(ratingScore);

        // When clicked on ratingbar, call inner class below
        rating.setOnRatingBarChangeListener(new RatingBarChangeListener());
    }

    private class RatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            // Safe new rating in SharedPreferences
            editor.putFloat(retrievedFriend.getName(),v);
            editor.apply();

            // Set new rating
            retrievedFriend.setRating(v);
        }
    }
}
