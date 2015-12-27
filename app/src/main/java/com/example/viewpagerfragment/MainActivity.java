package com.example.viewpagerfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabFragmentPagerAdapter tabFragmentPagerAdapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(tabFragmentPagerAdapter);
        //to maintain 3 viewpagers in memory:
        // http://stackoverflow.com/questions/14286358/3-android-fragments-in-viewpager-how-to-keep-them-all-alive
        viewPager.setOffscreenPageLimit(3);
        //this should in theory select the middle tab when the app opens
        viewPager.setCurrentItem(1);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);
    }
}
