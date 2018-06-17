package com.sushil.navigationtesting.fragments.cms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sushil.navigationtesting.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MaintBackup extends Fragment {


    public MaintBackup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.maint_backup, container, false);
    }

}
