package com.example.muketour.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MainHeadAdAdapter extends PagerAdapter {

    protected Context context;
    protected List<ImageView> imgviewlist;

    public MainHeadAdAdapter(Context context, List<ImageView> imgviewlist) {
        this.context = context;
        this.imgviewlist = imgviewlist;
    }

    @Override
    public int getCount() {
        return imgviewlist != null ? imgviewlist.size() : 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView imageView= imgviewlist.get(position);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); // 设置ImageView的缩放类型为居中裁剪
        container.addView(imageView);
        return imgviewlist.get(position);  //super.instantiateItem(container, position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imgviewlist.get(position));
        //super.destroyItem(container, position, object);
    }
}
