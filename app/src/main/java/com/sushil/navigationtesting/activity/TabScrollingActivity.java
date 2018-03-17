package com.sushil.navigationtesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.fragments.AgentID;
import com.sushil.navigationtesting.fragments.AuthCode;

/**
 * Created by sushil on 8/3/18.
 */

public class TabScrollingActivity extends AppCompatActivity {

    private String mFragmentName;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabscrolling_activity);
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
        if (mFragmentName.equals("Agent ID")) {
            showFragment(manager, new AgentID());
        }else if(mFragmentName.equals("Auth Code")){
            showFragment(manager, new AuthCode());
        }

    }
    public void showFragment(FragmentManager manager, Fragment fragment) {
        Toast.makeText(TabScrollingActivity.this,mFragmentName,Toast.LENGTH_SHORT).show();
        manager.beginTransaction().replace(R.id.fm_navi_item, fragment,
                fragment.getTag()).commit();
    }
}
