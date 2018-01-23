package com.example.minhgiang.pet;

import android.graphics.Bitmap;

public class Friend {
    Bitmap ava;
    String content;
    boolean isOnline;
    String name;

    public Friend(String name, Bitmap ava, boolean isOnline, String content) {
        this.name = name;
        this.ava = ava;
        this.isOnline = isOnline;
        this.content = content;
    }
}
