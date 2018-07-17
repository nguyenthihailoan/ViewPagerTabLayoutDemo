package com.lx.ltuddd.viewpagertablayoutdemo.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.lx.ltuddd.viewpagertablayoutdemo.R;

import java.util.List;

import static com.lx.ltuddd.viewpagertablayoutdemo.utils.Contants.FIRST_FRAGMENT;
import static com.lx.ltuddd.viewpagertablayoutdemo.utils.Contants.SEC_FRAGMENT;
import static com.lx.ltuddd.viewpagertablayoutdemo.utils.Contants.THIR_FRAGMENT;

/**
 * Created by DaiPhongPC on 7/16/2018.
 */

public class AdapterViewPager extends FragmentStatePagerAdapter {
    private Context context;
    private List<Fragment> mArrFragment;

    public AdapterViewPager(FragmentManager fm, Context context, List<Fragment> mArrFragment) {
        super(fm);
        this.context = context;
        this.mArrFragment = mArrFragment;
    }

    @Override
    public Fragment getItem(int position) {
        if (mArrFragment.get(position) != null) return mArrFragment.get(position);
        else return null;
    }

    @Override
    public int getCount() {
        if (mArrFragment != null) return mArrFragment.size();
        else return -1;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case FIRST_FRAGMENT:
                return context.getResources().getString(R.string.first_fragment);
            case SEC_FRAGMENT:
                return context.getResources().getString(R.string.second_fragment);
            case THIR_FRAGMENT:
                return context.getResources().getString(R.string.thrid_fragment);
            default:
                return null;
        }
    }
}
