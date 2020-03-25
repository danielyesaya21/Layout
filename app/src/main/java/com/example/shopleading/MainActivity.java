package com.example.shopleading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    RecyclerView paket;
    ArrayList<MainModel>mainModels = new ArrayList<>();
    MainAdapter mainAdapter;
    TabLayout tab;
    ViewPager viewpager;
    PagerAdapter pagerAdapter;
    TabItem tab1,tab2,tab3,tab4;


    ToggleButton button3,button4;
    RelativeLayout expand2,expand1;


    RecyclerViewIndicator indicator;


    TextView textView13;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        paket = findViewById(R.id.paket);
        indicator = findViewById(R.id.indicator);
        textView13 = (TextView)findViewById(R.id.textView13);
//        textView13.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tab = (TabLayout)findViewById(R.id.tab);
        tab1 = (TabItem)findViewById(R.id.tab1);
        tab2 = (TabItem)findViewById(R.id.tab2);
        tab3 = (TabItem)findViewById(R.id.tab3);
        tab4 = (TabItem)findViewById(R.id.tab4);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        button3 = (ToggleButton) findViewById(R.id.button3);
        button4 = (ToggleButton) findViewById(R.id.button4);
        expand1 = (RelativeLayout) findViewById(R.id.expand1);
        expand2 = (RelativeLayout) findViewById(R.id.expand2);
        RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams) expand1.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) expand2.getLayoutParams();




        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.isChecked()) {
                    layoutParams1.width = 1000;
                    expand1.setLayoutParams(layoutParams1);
                    expand2.setVisibility(View.INVISIBLE);
                }
                else{
                    layoutParams1.width = 300;
                    expand1.setLayoutParams(layoutParams1);
                    expand2.setVisibility(View.VISIBLE);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button4.isChecked()) {
                    layoutParams2.width = 1000;
                    expand2.setLayoutParams(layoutParams2);
                    expand1.setVisibility(View.INVISIBLE);
                }
                else{
                    layoutParams2.width = 300;
                    expand2.setLayoutParams(layoutParams2);
                    expand1.setVisibility(View.VISIBLE);
                }
            }
        });


        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tab.getTabCount());
        viewpager.setAdapter(pagerAdapter);

        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 ){
                    pagerAdapter.notifyDataSetChanged();

                }else if (tab.getPosition() == 1 ){
                    pagerAdapter.notifyDataSetChanged();

                }else if (tab.getPosition() == 2 ){
                    pagerAdapter.notifyDataSetChanged();

                }else if (tab.getPosition() == 3 ){
                    pagerAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));

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
