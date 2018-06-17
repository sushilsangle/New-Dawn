package com.sushil.navigationtesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.fragments.cms.AbandonCalls;
import com.sushil.navigationtesting.fragments.navigation.ACDCommands;
import com.sushil.navigationtesting.fragments.navigation.ASA;
import com.sushil.navigationtesting.fragments.navigation.ClanCard;
import com.sushil.navigationtesting.fragments.navigation.DS1;
import com.sushil.navigationtesting.fragments.navigation.GfourFifty;
import com.sushil.navigationtesting.fragments.navigation.GsixFifty;
import com.sushil.navigationtesting.fragments.navigation.Interview;
import com.sushil.navigationtesting.fragments.navigation.IpsiCard;
import com.sushil.navigationtesting.fragments.navigation.MedPro;
import com.sushil.navigationtesting.fragments.navigation.OutBoundIssue;
import com.sushil.navigationtesting.fragments.navigation.ValBoard;
import com.sushil.navigationtesting.fragments.navigation.VoiceQuality;

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
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    public void loadFragment() {

        FragmentManager manager = getSupportFragmentManager();
        if (mFragmentName.equals("Interview")) {
            showFragment(manager, new Interview());
        } else if (mFragmentName.equals(getString(R.string.gfourfifty))) {
            showFragment(manager, new GfourFifty());
        } else if (mFragmentName.equals(getString(R.string.ipsicards))) {
            showFragment(manager, new IpsiCard());
        } else if (mFragmentName.equals(getString(R.string.voicequality))) {
            showFragment(manager, new VoiceQuality());
        } else if (mFragmentName.equals("Out Bound Issue")) {
            showFragment(manager, new OutBoundIssue());
        } else if (mFragmentName.equals("Clan Card")) {
            showFragment(manager, new ClanCard());
        } else if (mFragmentName.equals("DS1")) {
            showFragment(manager, new DS1());
        } else if (mFragmentName.equals("Med Pro")) {
            showFragment(manager, new MedPro());
        } else if (mFragmentName.equals("Val Board")) {
            showFragment(manager, new ValBoard());
        } else if (mFragmentName.equals(getString(R.string.gsixfifty))) {
            showFragment(manager, new GsixFifty());
        } else if (mFragmentName.equals("AbandonCalls")) {
            showFragment(manager, new AbandonCalls());
        }else if (mFragmentName.equals("ACD Commands")){
            showFragment(manager,new ACDCommands());
        }else if (mFragmentName.equals("ASA Web Page")){
            showFragment(manager,new ASA());
        }


    }

    public void showFragment(FragmentManager manager, Fragment fragment) {
        manager.beginTransaction().replace(R.id.fm_navi_item, fragment,
                fragment.getTag()).commit();
    }

}
