package com.example.minhgiang.pet;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class adapter extends Adapter<ViewHolder> {
    ArrayList<Content> contents = new ArrayList();
    Context mContext;

    public class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        TextView description;
        ImageView ivImage;
        TextView tvname;

        public ViewHolder(View itemView) {
            super(itemView);
            this.ivImage = (ImageView) itemView.findViewById(C0310R.id.ivImage);
            this.tvname = (TextView) itemView.findViewById(C0310R.id.tvName);
            this.description = (TextView) itemView.findViewById(C0310R.id.description);
        }
    }

    public adapter(Context mContext, ArrayList<Content> contents) {
        this.contents = contents;
        this.mContext = mContext;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(C0310R.layout.rv_layout, parent, false));
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Content content = (Content) this.contents.get(position);
        holder.ivImage.setImageBitmap(content.ava);
        holder.tvname.setText(content.name);
        holder.description.setText(content.description);
    }

    public int getItemCount() {
        return this.contents.size();
    }
}
