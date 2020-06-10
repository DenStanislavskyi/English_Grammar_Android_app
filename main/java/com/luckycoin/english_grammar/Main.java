package com.luckycoin.english_grammar;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.luckycoin.english_grammar.MainFragments.grFragment;
import com.luckycoin.english_grammar.MainFragments.howFragment;
import com.luckycoin.english_grammar.MainFragments.toolsFragment;

public class Main extends AppCompatActivity
        implements  NavigationView.OnNavigationItemSelectedListener {

    howFragment fhow;
    toolsFragment ft;
    grFragment fgr;

    Animation fadeanim;
    Animation rotateanim;
    Animation translateanim;
    FragmentTransaction ftrans;
    FrameLayout container1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fgr= new grFragment();
        ft= new toolsFragment();
        fhow= new howFragment();
        container1 = (FrameLayout) findViewById(R.id.container1);
         ftrans = getFragmentManager().beginTransaction();
        ftrans.add(R.id.container1, fgr);
        ftrans.commit();
        fadeanim = AnimationUtils.loadAnimation(Main.this,R.anim.fade_in);
        rotateanim = AnimationUtils.loadAnimation(Main.this,R.anim.rotate);
        translateanim = AnimationUtils.loadAnimation(Main.this,R.anim.translate);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.getMenu().getItem(1).setChecked(true);
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


        if (id == R.id.action_about) {
             About about=new About();
            about.show(getSupportFragmentManager(),"About");
        } else  if (id == R.id.action_exit) {
            finish();
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        FragmentTransaction ftrans = getFragmentManager().beginTransaction();
       // container1.removeAllViews();
        int id = item.getItemId();

        if (id == R.id.menu_how) {
            android.support.v7.app.ActionBar ab = getSupportActionBar();
            ab.setTitle(R.string.app_name);
            ab.setSubtitle(R.string.how_item);
            if (container1==null){
                ftrans.add(R.id.container1, fhow);
            }else
                ftrans.replace(R.id.container1, fhow);
        } else if (id == R.id.menu_gr) {
            android.support.v7.app.ActionBar ab = getSupportActionBar();
            ab.setTitle(R.string.app_name);
            ab.setSubtitle(R.string.grammar_item);
            if (container1==null){
            ftrans.add(R.id.container1, fgr);
        }else
            ftrans.replace(R.id.container1, fgr);
        }
        else if (id == R.id.nav_tools) {
            android.support.v7.app.ActionBar ab = getSupportActionBar();
            ab.setTitle(R.string.app_name);
            ab.setSubtitle(R.string.settings_item);
            if (container1==null){
            ftrans.add(R.id.container1, ft);
        }else
            ftrans.replace(R.id.container1, ft);
        }
        ftrans.commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
