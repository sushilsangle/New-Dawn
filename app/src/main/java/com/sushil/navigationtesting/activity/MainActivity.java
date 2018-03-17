package com.sushil.navigationtesting.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.sushil.navigationtesting.R;
import com.sushil.navigationtesting.adapter.ViewPagerAdapter;
import com.sushil.navigationtesting.fragments.ACD;
import com.sushil.navigationtesting.fragments.CMS;
import com.sushil.navigationtesting.fragments.SIP;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Toolbar is here...
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        setupViewPager(viewPager);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    private void setupViewPager(ViewPager viewPager) {
         adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ACD(),"ACD");
        adapter.addFragment(new CMS(),"CMS");
        adapter.addFragment(new SIP(),"SIP");
        viewPager.setAdapter(adapter);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_live) {
//            LiveHelp help=new LiveHelp();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,
//                    help,
//                    help.getTag()).commit();
            launchNavigationItemActivity("LiveHelp");

        } else if (id == R.id.nav_voice_quality_issue) {



            launchNavigationItemActivity("VoiceQuality");

//            VoiceQuality voiceQuality=new VoiceQuality();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,
//                    voiceQuality,
//                    voiceQuality.getTag()).commit();

        } else if (id == R.id.nav_clan) {

            launchNavigationItemActivity("ClanCard");

//            ClanCard clan=new ClanCard();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,
//                    clan,
//                    clan.getTag()).commit();

        } else if (id == R.id.nav_medpro) {

            launchNavigationItemActivity("MedPro");

//            MedPro media=new MedPro();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,media,media.getTag()).commit();



        } else if (id == R.id.nav_ipsi) {

            launchNavigationItemActivity("IpsiCard");
//            IpsiCard ipsi=new IpsiCard();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,ipsi,ipsi.getTag()).commit();



        } else if (id == R.id.nav_ds_one) {


            launchNavigationItemActivity("DS1");


//            DS1 dsone=new DS1();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,dsone,dsone.getTag()).commit();

        }else if (id==R.id.nav_val)
        {

            launchNavigationItemActivity("ValBoard");

//            ValBoard val=new ValBoard();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,val,val.getTag()).commit();
        }else if(id==R.id.nav_voice_quality_issue){

            launchNavigationItemActivity("VoiceQuality");

//            VoiceQuality voice=new VoiceQuality();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,voice,voice.getTag()).commit();


        }
        else if (id==R.id.nav_outbund)
        {
            launchNavigationItemActivity("OutBoundIssue");

//            OutBoundIssue issue=new OutBoundIssue();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,issue,issue.getTag()).commit();

        }
        else if(id ==R.id.nav_g_six_fifty)
        {
            launchNavigationItemActivity("GsixFifty");

//            GsixFifty gatway=new GsixFifty();
//            FragmentManager manager=getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.fm_content_main,gatway,gatway.getTag()).commit();

        }else if(id==R.id.nav_g_four_fifty)
        {
            launchNavigationItemActivity("GfourFifty");
        }
        else if(id==R.id.nav_interview)
        {
            launchNavigationItemActivity("Interview");
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void launchNavigationItemActivity(String fragment){
        startActivity(new Intent(this,NavigationItemActivity.class)
                .putExtra(getResources().getString(R.string.fragment_name),fragment));
    }
}
