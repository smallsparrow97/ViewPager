package com.gameloft.pc.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by PC on 9/28/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position) {
            case 0:
                frag = new TabFragment1();
                break;
            case 1:
                frag = new TabFragment2();
                break;
            case 2:
                frag = new TabFragment3();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Mu";
                break;
            case 1:
                title = "Barca";
                break;
            case 2:
                title = "Real";
                break;
        }
        return title;
    }
}
