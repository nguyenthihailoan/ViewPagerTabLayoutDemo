package com.lx.ltuddd.viewpagertablayoutdemo.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.lx.ltuddd.viewpagertablayoutdemo.R;
import com.lx.ltuddd.viewpagertablayoutdemo.adapters.AdapterViewPager;
import com.lx.ltuddd.viewpagertablayoutdemo.fragments.FirstFragment;
import com.lx.ltuddd.viewpagertablayoutdemo.fragments.SecondFragment;
import com.lx.ltuddd.viewpagertablayoutdemo.fragments.ThirtFragment;
import com.lx.ltuddd.viewpagertablayoutdemo.utils.Contants;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private AdapterViewPager mAdapterViewPager;
    private List<Fragment> mArrFragment;
    private TabLayout mTablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViewPager();
        setUpTablayout();
    }

    public void setUpViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mArrFragment = new ArrayList<>();
        mArrFragment.add(new FirstFragment());
        mArrFragment.add(new SecondFragment());
        mArrFragment.add(new ThirtFragment());
        mAdapterViewPager = new AdapterViewPager(getSupportFragmentManager(),
                getBaseContext(),
                mArrFragment);
        mViewPager.setAdapter(mAdapterViewPager);
        mViewPager.setOffscreenPageLimit(3);

    }

    public void setUpTablayout() {
        mTablayout = (TabLayout) findViewById(R.id.tablayout);
        mTablayout.setupWithViewPager(mViewPager);
        mTablayout.getTabAt(Contants.FIRST_FRAGMENT).setIcon(R.drawable.ic_fragment_first);
        mTablayout.getTabAt(Contants.SEC_FRAGMENT).setIcon(R.drawable.ic_fragment_sec);
        mTablayout.getTabAt(Contants.THIR_FRAGMENT).setIcon(R.drawable.ic_fragment_thrid);
    }
}
