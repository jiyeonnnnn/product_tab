package com.example.myapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public PageAdapter(FragmentManager fm, int pageCount) {
        super(fm);
                this.mPageCount=pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment_food fragment_food = new Fragment_food();
                return fragment_food;


            case 1:
                Fragment_wash fragment_wash = new Fragment_wash();
                return fragment_wash;


            case 2:
                Fragment_face fragment_face = new Fragment_face();
                return fragment_face;

            case 3:
                Fragment_body fragment_body = new Fragment_body();
                return fragment_body;

            default:
                return null;
        }
    }
    @Override
    public int getCount(){
        return mPageCount;
    }
}
