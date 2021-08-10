package com.varitechdevelopment.listinventoryproduct.Fragment;

import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.varitechdevelopment.listinventoryproduct.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    //create keys for our Bundle
    private static final String KEY_POSITON="position";
    private static final String KEY_COLOR="color";

    public PageFragment() {
        // Required empty public constructor
    }

    //Method that will create a new instance of PageFragment , and add data to this bundle.
    public static PageFragment newInstance(int position, int color) {
        //Create a new fragment
        PageFragment fragment = new PageFragment();

        //Create bundle and add it some data
        Bundle args = new Bundle();
        args.putInt(KEY_POSITON, position);
        args.putInt(KEY_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
          //  mParam1 = getArguments().getString(ARG_PARAM1);
           // mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Get layout of PageFragment
        View result= inflater.inflate(R.layout.fragment_page, container, false);

        //Get widgets form layout and serialise it
        LinearLayout rootView= (LinearLayout)result.findViewById(R.id.fragment_page_rootview);
        TextView textView=(TextView)result.findViewById(R.id.fragment_page_title);

        //Get data from bundle (created in method newInstance)
        int position = getArguments().getInt(KEY_POSITON,-1);
        int color = getArguments().getInt(KEY_COLOR,-1);

        //Update widgets with it
        rootView.setBackgroundColor(color);
        textView.setText("Page numéro "+position);

        Log.e(getClass().getSimpleName(),"onCreateView called for fragment number"+position);
        return  result;
    }
}