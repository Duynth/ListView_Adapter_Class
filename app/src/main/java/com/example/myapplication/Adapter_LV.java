package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class Adapter_LV extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<SinhVIen> list_sinhvien;
    public Adapter_LV(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.list_sinhvien = (ArrayList<SinhVIen>) objects;
    }

    private class viewholder{
        TextView tv_hoten, tv_MSSV;
        ImageView img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        viewholder viewholder;

        if (convertView == null){
            viewholder = new viewholder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview,parent,false);

            viewholder.tv_hoten = convertView.findViewById(R.id.item_tv_hoten);
            viewholder.tv_MSSV = convertView.findViewById(R.id.item_tv_mssv);
            viewholder.img = convertView.findViewById(R.id.imageView_listview);

            convertView.setTag(viewholder);
        }else{
            viewholder = (viewholder)convertView.getTag();
        }

        SinhVIen sv = list_sinhvien.get(position);

        viewholder.tv_MSSV.setText("MSSV: "+sv.getMssv());
        viewholder.tv_hoten.setText("Họ tên: "+sv.getHoten().toString());
        if (sv.getGioitinh()==1){
            viewholder.img.setImageResource(R.drawable.icon_nam);
        }else{
            viewholder.img.setImageResource(R.drawable.icon_nu);
        }












        return convertView;

    }
}
