package com.example.minhgiang.pet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class lsvAdapter extends BaseAdapter {
    ArrayList<Friend> friends = new ArrayList();
    Context mContext;

    public lsvAdapter(ArrayList<Friend> friends, Context mContext) {
        this.friends = friends;
        this.mContext = mContext;
    }

    public int getCount() {
        return this.friends.size();
    }

    public Object getItem(int position) {
        return this.friends.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(C0310R.layout.friend_layout, parent, false);
        Friend friend = (Friend) this.friends.get(position);
        TextView tvnameFriend = (TextView) v.findViewById(C0310R.id.tvnameFriend);
        TextView isOnline = (TextView) v.findViewById(C0310R.id.isOnline);
        TextView tvcontent = (TextView) v.findViewById(C0310R.id.tvcontent);
        ((ImageView) v.findViewById(C0310R.id.civ)).setImageBitmap(friend.ava);
        tvnameFriend.setText(friend.name);
        tvcontent.setText(friend.content);
        if (!friend.isOnline) {
            isOnline.setVisibility(8);
        }
        return v;
    }
}
