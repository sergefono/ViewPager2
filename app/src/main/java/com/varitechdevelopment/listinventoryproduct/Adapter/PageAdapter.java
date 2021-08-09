package com.varitechdevelopment.listinventoryproduct.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.varitechdevelopment.listinventoryproduct.Fragment.PageFragment;

public class PageAdapter extends FragmentStateAdapter {

    //Array of colors that will be passed to PageFragment
    private final int[] colors;

    public PageAdapter(FragmentManager fragmentManager,Lifecycle lifecycle, int[] colors) {
        super(fragmentManager, lifecycle);
        this.colors = colors;
    }

    @Override
    public int getItemCount() {
        return (5);
    }


    @Override
    public Fragment createFragment(int position) {
        //Page to return
        return (PageFragment.newInstance(position,this.colors[position]));

    }
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
