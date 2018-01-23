package com.example.minhgiang.pet;

import android.graphics.Bitmap;

public class Content {
    Bitmap ava;
    String description;
    String name;

    public Content(Bitmap ava, String name, String description) {
        this.ava = ava;
        this.name = name;
        this.description = description;
    }
}
