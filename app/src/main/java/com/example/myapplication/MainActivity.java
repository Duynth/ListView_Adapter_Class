package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    EditText hoten,gioitinh,mssv;

    Button btn_nhap;

    ArrayList<SinhVIen> sinhVIenArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        hoten = findViewById(R.id.edt_hoten);
        gioitinh = findViewById(R.id.edt_gioitinh);
        mssv = findViewById(R.id.edt_mssv);
        btn_nhap = findViewById(R.id.btn_nhaphoten);

        sinhVIenArrayList = new ArrayList<>();

        Adapter_LV adapterLv = new Adapter_LV(MainActivity.this,R.layout.item_listview,sinhVIenArrayList);
        listView.setAdapter(adapterLv);

        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp_gt=0;
                if (gioitinh.getText().toString().compareTo("Nam")==0){
                    temp_gt=1;
                }else{
                    temp_gt=0;
                }
                //arraylist sinhvienarraylist


                SinhVIen sinhvien = new SinhVIen(hoten.getText().toString(),mssv.getText().toString(),temp_gt);
                sinhVIenArrayList.add(sinhvien);

                adapterLv.notifyDataSetChanged();
            }
        });


    }
}