package com.example.minhgiang.pet;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MessengerFragment extends Fragment {
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(C0310R.layout.ms_layout, container, false);
        getActivity().setTitle("Messenger");
        ListView lsvFriend = (ListView) v.findViewById(C0310R.id.lsvFriend);
        Bitmap temp1 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test);
        Bitmap temp2 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test5);
        Bitmap temp3 = BitmapFactory.decodeResource(getResources(), C0310R.mipmap.test4);
        ArrayList<Friend> friends = new ArrayList();
        friends.add(new Friend("Linh kun", temp1, true, "Nice to meet you"));
        friends.add(new Friend("Giang", temp2, false, "Nice!"));
        friends.add(new Friend("ducvd", temp3, false, "You are awesome!"));
        lsvFriend.setAdapter(new lsvAdapter(friends, getActivity()));
        return v;
    }
}
