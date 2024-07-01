package com.example.muketour.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.muketour.R;
import com.example.muketour.entity.findHot;

import java.util.ArrayList;
import java.util.List;

public class FindHotListAdapter extends BaseAdapter {

    LayoutInflater li;
    Context context;
    List<findHot> findhotlist = new ArrayList<>();

    public FindHotListAdapter(Context context) {
        this.context = context;
        li = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return findhotlist.size();
    }

    @Override
    public Object getItem(int position) {
        return findhotlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //添加列表项刷新
    public void addSubList(List<findHot> sublist) {
        findhotlist.addAll(sublist);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        //完成对convertView的设置
        /// 将布局资源转为view
        if (convertView == null) {
            //优化：利用进入RecycleBin中的View，减少view的重复赋值
            convertView = li.inflate(R.layout.activity_findhotlist, null);
            holder = new ViewHolder();
            holder.title = convertView.findViewById(R.id.hot_title);
            holder.from = convertView.findViewById(R.id.hot_from);
            holder.eye = convertView.findViewById(R.id.hot_eyenum);
            holder.like = convertView.findViewById(R.id.hot_likenum);
            holder.img = convertView.findViewById(R.id.hot_img);
            convertView.setTag(holder);
        } else {
            // 优化：
            // 通过getTag()取出ViewHolder对象，然后能够直接通过holder.控件的方式在外面直接操作控件
            // 从而避免了大幅度使用findViewById操作
            // getTag()操作效率比findViewById要高
            holder = (ViewHolder) convertView.getTag();
        }
        findHot fhm = findhotlist.get(position);
        //标题title
        holder.title.setText(fhm.getTitle());
        //来源from
        holder.from.setText(fhm.getFrom());
        //阅读数量eye
        holder.eye.setText(fhm.getEye());
        //点赞数量like
        holder.like.setText(fhm.getLike());
        //图片img
        holder.img.setImageResource(fhm.getImg());

        return convertView;

        //return null;
    }

    // 优化：
    // 当view为null时，完成对ViewHolder的实例化工作，并为各个控件属性赋值
    // 性能的提升是在view不为null时体现的
    // 当view为null时，完成了ViewHolder及内部控件属性的初始化工作后，调用一句代码：view.setTag(holder);
    // 当view不为null时，holder = view.getTag();
    static class ViewHolder {
        TextView title, from, eye, like;
        ImageView img;
    }


}
