package com.sushil.navigationtesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.fragments.AbandonCalls;
import com.sushil.navigationtesting.fragments.ClanCard;
import com.sushil.navigationtesting.fragments.DS1;
import com.sushil.navigationtesting.fragments.GfourFifty;
import com.sushil.navigationtesting.fragments.GsixFifty;
import com.sushil.navigationtesting.fragments.Interview;
import com.sushil.navigationtesting.fragments.IpsiCard;
import com.sushil.navigationtesting.fragments.MedPro;
import com.sushil.navigationtesting.fragments.OutBoundIssue;
import com.sushil.navigationtesting.fragments.ValBoard;
import com.sushil.navigationtesting.fragments.VoiceQuality;

public class NavigationItemActivity extends AppCompatActivity {

    private String mFragmentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_item);
        getDataFromIntent();
        setUpToolBar();
        loadFragment();
    }

    private void getDataFromIntent() {
        Intent intent = getIntent();
        mFragmentName = intent.getStringExtra(getString(R.string.fragment_name));
    }

    private void setUpToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(mFragmentName);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    public void loadFragment() {

        FragmentManager manager = getSupportFragmentManager();
        if (mFragmentName.equals("Interview")) {
            showFragment(manager, new Interview());
        } else if (mFragmentName.equals("GfourFifty")) {
            showFragment(manager, new GfourFifty());
        } else if (mFragmentName.equals("IpsiCard")) {
            showFragment(manager, new IpsiCard());
        } else if (mFragmentName.equals("VoiceQuality")) {
            showFragment(manager, new VoiceQuality());
        } else if (mFragmentName.equals("OutBoundIssue")) {
            showFragment(manager, new OutBoundIssue());
        } else if (mFragmentName.equals("ClanCard")) {
            showFragment(manager, new ClanCard());
        } else if (mFragmentName.equals("DS1")) {
            showFragment(manager, new DS1());
        } else if (mFragmentName.equals("MedPro")) {
            showFragment(manager, new MedPro());
        } else if (mFragmentName.equals("ValBoard")) {
            showFragment(manager, new MedPro());
        } else if (mFragmentName.equals("GsixFifty")) {
            showFragment(manager, new GsixFifty());
        } else if (mFragmentName.equals("AbandonCalls")) {
            showFragment(manager, new AbandonCalls());
        }

    }

    public void showFragment(FragmentManager manager, Fragment fragment) {
        manager.beginTransaction().replace(R.id.fm_navi_item, fragment,
                fragment.getTag()).commit();
    }

}
