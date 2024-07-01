package com.example.muketour.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.muketour.MainActivity;
import com.example.muketour.R;
import com.example.muketour.adapter.FindHotListAdapter;
import com.example.muketour.entity.findHot;

import java.util.ArrayList;
import java.util.List;

public class FindFragment extends Fragment {

    private ListView findhotlist;
    FindHotListAdapter findhotlistadapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        findhotlist = view.findViewById(R.id.findhotlist);
        findhotlistadapter = new FindHotListAdapter(view.getContext());

        List<findHot> listfindHot =new ArrayList<>();
        listfindHot.add(new findHot("从广州去东莞仅需半个小时，美食美景统统都在等着你！","羊城攻略","10526","86",R.mipmap.find_hot_city));
        listfindHot.add(new findHot("旅行前最最应该做的10件准备事项，千万别给忽略了","冬夏旅游","10000","105",R.mipmap.find_hot_home));
        listfindHot.add(new findHot("北京周边竟然藏着20个绝美仙境，够你免费玩一年！","北京攻略","860","0",R.mipmap.find_hot_jiangnan));

        findhotlistadapter.addSubList(listfindHot);
        findhotlist.setAdapter(findhotlistadapter);
        findhotlistadapter.notifyDataSetChanged();
        return view;
    }

}