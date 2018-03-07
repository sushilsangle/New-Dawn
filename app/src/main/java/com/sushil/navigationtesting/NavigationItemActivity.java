package com.sushil.navigationtesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sushil.navigationtesting.fragments.ClanCard;
import com.sushil.navigationtesting.fragments.GfourFifty;
import com.sushil.navigationtesting.fragments.Interview;

public class NavigationItemActivity extends AppCompatActivity {

    private String mFragmentName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_item);
        getDataFromIntent();
        setUpToolBar();
        loadFragment();


    }

    private void getDataFromIntent() {
        Intent intent=getIntent();
        mFragmentName=intent.getStringExtra(getString(R.string.fragment_name));
    }

    private void setUpToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(mFragmentName);
        toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    public void loadFragment(){
        FragmentManager manager=getSupportFragmentManager();
        if(mFragmentName.equals("Interview")){
            showFragment(manager,new Interview());
        }else if (mFragmentName.equals("GfourFifty")){
            showFragment(manager,new GfourFifty());
        }
    }
    public void showFragment(FragmentManager manager,Fragment fragment){
        manager.beginTransaction().replace(R.id.fm_navi_item,fragment,
                fragment.getTag()).commit();
    }

}
