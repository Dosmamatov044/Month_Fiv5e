package com.example.month_fiv5e.onBoard;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.example.month_fiv5e.MainActivity;
import com.example.month_fiv5e.R;
import com.google.android.material.tabs.TabLayout;



public class IntroActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tablayout;
    Button buttonSkip;
    Button buttonNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
                R.layout.activity_intro);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        tablayout = findViewById(R.id.tabLayout);
        tablayout.setupWithViewPager(viewPager, true);
        buttonSkip = findViewById(R.id.btn_skip);
        buttonNext = findViewById(R.id.next);
        buttonSkip.setVisibility(View.VISIBLE);
        ViewPagerScrolling();


    }public void next(View view) {
        if (viewPager.getCurrentItem() < 2) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() +1, true);
        } else {
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }

    }public void skip(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();


    }public void ViewPagerScrolling() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        buttonSkip.setVisibility(View.VISIBLE);
                        buttonNext.setVisibility(View.VISIBLE);
                        buttonNext.setText("NEXT");

                        break;
                    case 1:
                        buttonSkip.setVisibility(View.VISIBLE);
                        buttonNext.setVisibility(View.VISIBLE);
                        buttonNext.setText("NEXT");

                        break;
                    case 2:
                        buttonNext.setText("Start");
                        buttonSkip.setVisibility(View.GONE);


                }
            }

            @Override
            public void onPageScrollStateChanged(int state) { }});}

            class PagerAdapter extends FragmentPagerAdapter {


        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT); }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            bundle.putInt("keyForPosition", position);
            IntroFragment fragment = new IntroFragment();
            fragment.setArguments(bundle);
            return fragment;
        }
        @Override
        public int getCount() {
            return 3;
        }
    }
}


// public void swipeRight(int x){
  //      if(x < 2){
    //        saveIsShown();
   //        viewPager.setCurrentItem(x + 1);
//
  //      }
   // }





