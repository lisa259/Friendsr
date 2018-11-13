package com.example.mylenovo.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create new ArrayList of type Friends(object)
        ArrayList<Friend> friends = new ArrayList<>();

        // Add new friends to ArrayList. drawebleId: getResources().getIdentifier(name image, location image, packagename project)
        friends.add(new Friend("Jon", "I know nothing.", getResources().getIdentifier("jon", "drawable", getPackageName())));
        friends.add(new Friend("Arya", "I'm going to kill the queen.", getResources().getIdentifier("arya", "drawable", getPackageName())));
        friends.add(new Friend("Cersei", "Everyone who isn’t us is an enemy.", getResources().getIdentifier("cersei", "drawable", getPackageName())));
        friends.add(new Friend("Daenerys", "Mother of dragons.", getResources().getIdentifier("daenerys", "drawable", getPackageName())));
        friends.add(new Friend("Jaime", "The things i do for love.", getResources().getIdentifier("jaime", "drawable", getPackageName())));
        friends.add(new Friend("Jorah", "There is no word for thank you in Dothraki.", getResources().getIdentifier("jorah", "drawable", getPackageName())));
        friends.add(new Friend("Margaery", "Women in our position must make the best of our circumstances.", getResources().getIdentifier("margaery", "drawable", getPackageName())));
        friends.add(new Friend("Melisandre", "There's only one hell, Princess. The one we live in now.", getResources().getIdentifier("melisandre", "drawable", getPackageName())));
        friends.add(new Friend("Sansa", "Winter is here.", getResources().getIdentifier("sansa", "drawable", getPackageName())));
        friends.add(new Friend("Tyrion", "Every time we deal with an enemy, we create two more.", getResources().getIdentifier("tyrion", "drawable", getPackageName())));

        // Create adapter using subclass FriendsAdapter, passing grid_item.xml and friend ArrayList
        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        // Set adapter to grid of activity_main
        GridView grid = findViewById(R.id.grid);
        grid.setAdapter(adapter);

        // When clicked on grid, call subclass below
        grid.setOnItemClickListener(new GridItemClickListener());
    }

    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // Get friendobject of friend who was clicked on
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);

            // Change activity from MainActivity to ProfileActivity
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            // Safe clickedfriend, so it can be used in ProfileActivity
            intent.putExtra("clicked_friend", clickedFriend);
            // Confirm change
            startActivity(intent);
        }
    }
}
