package com.varitechdevelopment.listinventoryproduct.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.varitechdevelopment.listinventoryproduct.Adapter.PageAdapter;
import com.varitechdevelopment.listinventoryproduct.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configure ViewPager
        this.configureViewPager();
    }

    private void configureViewPager(){
        // 1 - Get ViewPager from layout
        ViewPager2 pager2 = (ViewPager2)findViewById(R.id.activity_main_viewpager);
        // 2 - Set Adapter PageAdapter and glue it together
        pager2.setAdapter(new PageAdapter(getSupportFragmentManager(),getLifecycle(),
                getResources().getIntArray(R.array.colorPagesViewPager)) {
        });
    }

}