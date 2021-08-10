package com.varitechdevelopment.listinventoryproduct.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.varitechdevelopment.listinventoryproduct.Fragment.Category1Fragment;
import com.varitechdevelopment.listinventoryproduct.Fragment.Category2Fragment;
import com.varitechdevelopment.listinventoryproduct.Fragment.Category3Fragment;
import com.varitechdevelopment.listinventoryproduct.Fragment.PageFragment;

public class PageAdapter extends FragmentStateAdapter {


    public PageAdapter(FragmentManager fragmentManager,Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public int getItemCount() {
        return (3);
    }


    @Override
    public Fragment createFragment(int position) {
        //Page to return
        //return (PageFragment.newInstance(position,this.colors[position]));
        switch (position){
            case 0: //Page number 1
                return Category1Fragment.newInstance();
            case 1: //Page number 2
                return Category2Fragment.newInstance();
            case 2: //Page number 1
                return Category3Fragment.newInstance();
            default:
                return null;
        }
    }


}
