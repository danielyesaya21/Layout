package com.example.shopleading;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("ALL")
public class PageAdapter extends FragmentPagerAdapter {

    private int numoftab;

    public PageAdapter(@NonNull FragmentManager fm, int numoftab) {
        super(fm);
        this.numoftab = numoftab;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            case 3:
                return new tab4();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return numoftab;
    }




    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
