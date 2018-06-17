package com.sushil.navigationtesting.fragments.acdtabs;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.adapter.ListAdapter;
import com.sushil.navigationtesting.interfaces.RecyclerItemClickInterface;
import com.sushil.navigationtesting.activity.TabScrollingActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ACD extends Fragment implements RecyclerItemClickInterface{
    List<String> list=new ArrayList<>();

    private View mView;
    private RecyclerView mRecyclerView;
    private ListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView= inflater.inflate(R.layout.acd, container, false);
        mRecyclerView=(RecyclerView)mView.findViewById(R.id.recycler_view);
        list.add("Agent ID");
        list.add("Auth Code");
        list.add("VDN");
        list.add("COS");
        list.add("COR");
        list.add("Tenant");
        list.add("Vector");
        list.add("Trunk Group");
        list.add("Announcement");
        list.add("Holiday Table");
        list.add("Call Barging Access");
        list.add("Hunt / Skill/Split Group");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new ListAdapter(list,this);
        mRecyclerView.setAdapter(adapter);
        return mView;
    }

    @Override
    public void passFragmentName(String fragmentName) {
        startActivity(new Intent(getActivity(), TabScrollingActivity.class)
                .putExtra(getString(R.string.fragment_name),fragmentName));
    }
}
