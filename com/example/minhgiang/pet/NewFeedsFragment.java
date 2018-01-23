package com.example.minhgiang.pet;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class NewFeedsFragment extends Fragment {
    RecyclerView rvContent;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(C0310R.layout.feed_layout, container, false);
        getActivity().setTitle("News Feed");
        this.rvContent = (RecyclerView) v.findViewById(C0310R.id.rvContent);
        new PagerSnapHelper().attachToRecyclerView(this.rvContent);
        this.rvContent.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext(), 0, false));
        Bitmap temp1 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test);
        Bitmap temp2 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test2);
        Bitmap temp3 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test3);
        ArrayList<Content> contents = new ArrayList();
        contents.add(new Content(temp1, "Linh kun", "27 yrs, Hanoi"));
        contents.add(new Content(temp2, "Giang", "22 yrs, Hanoi"));
        contents.add(new Content(temp3, "ducvd", "26 yrs, ThaiBinh"));
        this.rvContent.setAdapter(new adapter(getActivity().getBaseContext(), contents));
        return v;
    }
}
