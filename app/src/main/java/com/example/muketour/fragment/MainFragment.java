package com.example.muketour.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.muketour.MainActivity;
import com.example.muketour.R;
import com.example.muketour.adapter.MainHeadAdAdapter;
import com.example.muketour.util.DataUtil;


public class MainFragment extends Fragment {

    private int[] icoarr;
    ViewPager viewPage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initView(view);
        return view;
    }



    private void initView(View v) {
        icoarr = new int[]{
                R.mipmap.header_pic_ad1,
                R.mipmap.header_pic_ad2
        };
        viewPage = (ViewPager) v.findViewById(R.id.mainHeadVpage);
        MainHeadAdAdapter mainheadad = new MainHeadAdAdapter(getActivity(), DataUtil.getHeadAdImg(getActivity(), icoarr));
        viewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.e("--","滑动结束"+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPage.setAdapter(mainheadad);
    }
}