package com.example.tablayoutdemo.pageradapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tablayoutdemo.fragment.Todays_Birthday;
import com.example.tablayoutdemo.fragment.Upcoming_Birthdays;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
int count;


    public ViewPagerAdapter(@NonNull FragmentManager fm, int count) {
        super(fm);
        this.count=count;
    }


    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               return new Todays_Birthday();

           case 1:
               return new Upcoming_Birthdays();



       }
       return null;
    }

    @Override
    public int getCount() {
        return count;
    }
}
