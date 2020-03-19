package com.example.shopleading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView paket;
    ArrayList<MainModel>mainModels = new ArrayList<>();
    MainAdapter mainAdapter;

    TabLayout tab;

    RecyclerViewIndicator indicator;


    TextView textView13;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        paket = findViewById(R.id.paket);
        indicator = findViewById(R.id.indicator);
        textView13 = findViewById(R.id.textView13);
        textView13.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tab = findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("Internet").setIcon(R.drawable.internet));
        tab.addTab(tab.newTab().setText("Telepon & SMS").setIcon(R.drawable.call));
        tab.addTab(tab.newTab().setText("Roaming").setIcon(R.drawable.plane));
        tab.addTab(tab.newTab().setText("Multimedia").setIcon(R.drawable.star));






        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this,LinearLayoutManager.HORIZONTAL,false
        );

        paket.setLayoutManager(layoutManager);
        paket.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(mainModels);
        paket.setAdapter(mainAdapter);
        indicator.setRecyclerView(paket);
        dataList();

    }



    public void dataList(){


        MainModel item = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000 ","Rp 199.999");
        mainModels.add(item);
        MainModel item1 = new MainModel(R.drawable.telkomsel,"Internet Unlimited","12 GB","50 Hari","Rp 500.000","Rp 199.999");
        mainModels.add(item1);
        MainModel item2 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item2);
        MainModel item3 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item3);
        MainModel item4 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item4);
        MainModel item5 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item5);
        MainModel item6 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item6);
        MainModel item7 = new MainModel(R.drawable.telkomsel,"Combo Extra Internet OMG!","50 GB","30 Hari","Rp 150.000","Rp 199.999");
        mainModels.add(item7);



    }

}
