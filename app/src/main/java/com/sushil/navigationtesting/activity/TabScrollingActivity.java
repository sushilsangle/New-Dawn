package com.sushil.navigationtesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.fragments.acd.Announcement;
import com.sushil.navigationtesting.fragments.acd.COR;
import com.sushil.navigationtesting.fragments.acd.Vector;
import com.sushil.navigationtesting.fragments.cms.AbandonCalls;
import com.sushil.navigationtesting.fragments.cms.AddAgent;
import com.sushil.navigationtesting.fragments.acd.AgentID;
import com.sushil.navigationtesting.fragments.acd.AuthCode;
import com.sushil.navigationtesting.fragments.acd.COS;
import com.sushil.navigationtesting.fragments.acd.CallBarging;
import com.sushil.navigationtesting.fragments.acd.Holiday;
import com.sushil.navigationtesting.fragments.acd.HuntGroup;
import com.sushil.navigationtesting.fragments.acd.Tenant;
import com.sushil.navigationtesting.fragments.acd.TrunkGroup;
import com.sushil.navigationtesting.fragments.acd.VDN;
import com.sushil.navigationtesting.fragments.cms.AdminBackup;
import com.sushil.navigationtesting.fragments.cms.AgentLogin;
import com.sushil.navigationtesting.fragments.cms.CHRFiles;
import com.sushil.navigationtesting.fragments.cms.CMSAgentGrp;
import com.sushil.navigationtesting.fragments.cms.CallProfile;
import com.sushil.navigationtesting.fragments.cms.ChrFiles;
import com.sushil.navigationtesting.fragments.cms.MaintBackup;
import com.sushil.navigationtesting.fragments.cms.Reports;
import com.sushil.navigationtesting.fragments.cms.SupervisorID;
import com.sushil.navigationtesting.fragments.sip.AMS;
import com.sushil.navigationtesting.fragments.sip.SBC;
import com.sushil.navigationtesting.fragments.sip.SIPCallFlow;
import com.sushil.navigationtesting.fragments.sip.SIPResponses;
import com.sushil.navigationtesting.fragments.sip.SM;
import com.sushil.navigationtesting.fragments.sip.SMGR;

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

        //TODO ACD Fragments are here....
        if (mFragmentName.equals("Agent ID")) {
            showFragment(manager, new AgentID());
        }else if(mFragmentName.equals("Auth Code")){
            showFragment(manager, new AuthCode());
        }else if(mFragmentName.equals("VDN")){
            showFragment(manager,new VDN());
        }else if (mFragmentName.equals("Tenant")){
            showFragment(manager,new Tenant());
        }else if(mFragmentName.equals("Holiday Table")){
            showFragment(manager,new Holiday());
        }else if(mFragmentName.equals("Hunt / Skill/Split Group")){
            showFragment(manager,new HuntGroup());
        }else if(mFragmentName.equals("Trunk Group")){
            showFragment(manager,new TrunkGroup());
        }else if(mFragmentName.equals("COS")){
            showFragment(manager,new COS());
        }else if(mFragmentName.equals("COR")) {
            showFragment(manager,new COR());
        }else if(mFragmentName.equals("Call Barging Access")) {
            showFragment(manager, new CallBarging());
        }else if(mFragmentName.equals("Vector")) {
            showFragment(manager, new Vector());
        }else if(mFragmentName.equals("Announcement")) {
            showFragment(manager, new Announcement());


            //TODO CMS fragments are below....
        }else if (mFragmentName.equals("Reports")){
            showFragment(manager,new Reports());
        }else if (mFragmentName.equals("Add Agent")){
            showFragment(manager,new AddAgent());
        }else if (mFragmentName.equals("Login Agent")){
            showFragment(manager,new AgentLogin());
        }else if(mFragmentName.equals("Set Call Profile SLA")){
            showFragment(manager,new CallProfile());
        }else if(mFragmentName.equals("Create CMS Agent Group")){
            showFragment(manager,new CMSAgentGrp());
        }else if(mFragmentName.equals("Maintenance Backup")){
            showFragment(manager,new MaintBackup());
        }else if(mFragmentName.equals("Admin Backup")){
            showFragment(manager,new AdminBackup());
        }else if (mFragmentName.equals("Create Agent Group")){
            showFragment(manager,new CMSAgentGrp());
        }else if (mFragmentName.equals("Create CMS Supervisor ID")) {
            showFragment(manager, new SupervisorID());
        }else if(mFragmentName.equals("Abandon Calls")) {
            showFragment(manager, new AbandonCalls());
        }else if (mFragmentName.equals("ChrFiles")){
            showFragment(manager,new ChrFiles());

            //TODO SIP Fragments are started here....

        }else if (mFragmentName.equals("SIP Flow")){
            showFragment(manager,new SIPCallFlow());
        }else if (mFragmentName.equals("SMGR")){
            showFragment(manager,new SMGR());
        }else if (mFragmentName.equals("SBC")){
            showFragment(manager,new SBC());
        }else if (mFragmentName.equals("AMS")){
            showFragment(manager,new AMS());
        }else if (mFragmentName.equals("SM")){
            showFragment(manager,new SM());
        }else if (mFragmentName.equals("SIP Responses")){
            showFragment(manager,new SIPResponses());
        }


    }
    public void showFragment(FragmentManager manager, Fragment fragment) {
        Toast.makeText(TabScrollingActivity.this,mFragmentName,Toast.LENGTH_SHORT).show();
        manager.beginTransaction().replace(R.id.fm_navi_item, fragment,
                fragment.getTag()).commit();
    }
}
