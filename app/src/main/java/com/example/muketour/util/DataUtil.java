package com.example.muketour.util;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<ImageView> getHeadAdImg(Context context, int icons[]) {
        List<ImageView> ilist = new ArrayList<>();
        for (int i = 0; i < icons.length; i++) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(icons[i]);
            ilist.add(imageView);
        }
        return ilist;
    }
}
