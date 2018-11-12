package com.example.mylenovo.friendsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Friend> friends = new ArrayList<>();

        friends.add(new Friend("Jon", "I know nothing.", getResources().getIdentifier("jon.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Arya", "I'm going to kill the queen.", getResources().getIdentifier("arya.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Cersei", "Everyone who isn’t us is an enemy.", getResources().getIdentifier("cersei.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Daenarys", "Mother of dragons.", getResources().getIdentifier("daenarys.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Jaime", "The things i do for love.", getResources().getIdentifier("jaime.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Jorah", "There is no word for thank you in Dothraki.", getResources().getIdentifier("jorah.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Margaery", "Women in our position must make the best of our circumstances.", getResources().getIdentifier("margaery.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Melisandre", "There's only one hell, Princess. The one we live in now.", getResources().getIdentifier("melisandre.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Sansa", "There are no heroes in life, the monsters win.", getResources().getIdentifier("sansa.png", "draweble", "com.example.mylenovo.friendsr")));
        friends.add(new Friend("Tyrion", "Every time we deal with an enemy, we create two more.", getResources().getIdentifier("tyrion.png", "draweble", "com.example.mylenovo.friendsr")));
    }
}
