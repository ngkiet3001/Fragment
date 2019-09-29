package com.example.test_fragment;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Activity activity;
    private int ListItem;
    private ArrayList<SinhVien> sinhVienArrayList;

    public CustomAdapter(Activity activity, int listItem, ArrayList<SinhVien> sinhVienArrayList) {
        this.activity = activity;
        ListItem = listItem;
        this.sinhVienArrayList = sinhVienArrayList;
    }

    @Override
    public int getCount() {
        return sinhVienArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return sinhVienArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=activity.getLayoutInflater();
        view=inflater.inflate(ListItem,null);

        ImageView img=view.findViewById(R.id.imgHinh);
        TextView txtTen=view.findViewById(R.id.txtTen);
        TextView txtTuoi=view.findViewById(R.id.txtTuoi);

        img.setImageResource(sinhVienArrayList.get(i).getHinh());
        txtTen.setText(sinhVienArrayList.get(i).getTen());
        txtTuoi.setText(sinhVienArrayList.get(i).getTuoi() +" ");

        return view;
    }
}
