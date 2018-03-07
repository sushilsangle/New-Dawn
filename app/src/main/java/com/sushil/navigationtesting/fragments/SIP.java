package com.sushil.navigationtesting.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SIP extends Fragment {

    List<String> list=new ArrayList<>();

    private View mView;
    private RecyclerView mRecyclerView;
    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView= inflater.inflate(R.layout.acd, container, false);
        mRecyclerView=(RecyclerView)mView.findViewById(R.id.recycler_view);
        list.add("SIP Flow");
        list.add("SBC");
        list.add("SMGR");
        list.add("AMS");
        list.add("SM");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new ListAdapter(list);
        mRecyclerView.setAdapter(adapter);
        return mView;
    }

}