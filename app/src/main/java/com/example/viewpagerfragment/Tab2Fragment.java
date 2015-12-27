package com.example.viewpagerfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Simon on 12/27/2015.
 */
public class Tab2Fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //our outer recyclerview is made up of recyclerview that is match parent and not wrap content so we use the normal linear layout manager
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        TextView text = (TextView) view.findViewById(R.id.tabnumber);
        text.setText("Tab 2");
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment2", "onAttachedContext");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e("Fragment2", "onAttachedActivity");
    }
}
