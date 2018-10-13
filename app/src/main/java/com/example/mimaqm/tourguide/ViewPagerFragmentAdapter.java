package com.example.mimaqm.tourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerFragmentAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[]{"Museums", "Restaurants", "Relaxation", "Malls"};

    public ViewPagerFragmentAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new MuseumsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return  new RelaxationFragment();
            case 3:
                return  new MallsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

