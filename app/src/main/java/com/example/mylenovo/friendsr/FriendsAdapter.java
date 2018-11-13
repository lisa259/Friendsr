package com.example.mylenovo.friendsr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// Class to fill a single grid in activity_main with a friend

public class FriendsAdapter extends ArrayAdapter<Friend>{

    private ArrayList<Friend> friends;

    // Safe friends-list as friends
    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);
        this.friends = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Make sure there is a view to use
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // set image using DrawableId (id of image), at index position in friends ArrayList
        ImageView image = convertView.findViewById(R.id.gridImage);
        image.setImageResource(friends.get(position).getDrawableId());

        // Set text of friend at index position
        TextView text = convertView.findViewById(R.id.gridText);
        text.setText(friends.get(position).getName());

        return convertView;
    }
}
