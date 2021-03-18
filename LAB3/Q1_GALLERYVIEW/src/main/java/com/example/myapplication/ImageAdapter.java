package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {

    private List<Integer> mthumbs;
    private Context context;
    public ImageAdapter(List<Integer> mthumbs, Context context)
    {
        this.mthumbs=mthumbs;
        this.context=context;
    }

    @Override
    public int getCount() {
        return mthumbs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return mthumbs.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView =(ImageView) convertView;
        if(imageView==null)
        {
            imageView=new ImageView((context));
            imageView.setLayoutParams(new GridView.LayoutParams(300,450));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        imageView.setImageResource(mthumbs.get(position));
        return imageView;
    }
}
