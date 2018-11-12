package com.example.mylenovo.friendsr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class FriendsAdapter extends ArrayAdapter<Friend>{

    @androidx.annotation.NonNull
    public FriendsAdapter(@androidx.annotation.NonNull Context context, int resource, @androidx.annotation.NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        return convertView;
    }


}
