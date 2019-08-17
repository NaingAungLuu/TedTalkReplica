package com.androboy.tedtalkreplica.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.androboy.tedtalkreplica.fragments.FragmentMostViewed;
import com.androboy.tedtalkreplica.fragments.FragmentNewest;
import com.androboy.tedtalkreplica.fragments.FragmentTrending;

public class TabPagerAdapter extends FragmentPagerAdapter {
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
        {
            return "Newest";
        }
        else if(position == 1)
        {
            return "Trending";
        }
        else
        {
            return "Most Viewed";
        }
    }

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if(i == 0)
        {
            return new FragmentNewest();
        }
        else if(i == 1)
        {
            return new FragmentTrending();
        }
        else
        {
            return new FragmentMostViewed();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
