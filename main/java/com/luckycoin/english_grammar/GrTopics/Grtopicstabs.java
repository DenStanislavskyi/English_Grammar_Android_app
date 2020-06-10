package com.luckycoin.english_grammar.GrTopics;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.luckycoin.english_grammar.R;
public class Grtopicstabs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grtopicstabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().hide();
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Adjectives"));
        tabLayout.addTab(tabLayout.newTab().setText("Articles"));
        tabLayout.addTab(tabLayout.newTab().setText("Few vs a few"));
        tabLayout.addTab(tabLayout.newTab().setText("Idioms"));
        tabLayout.addTab(tabLayout.newTab().setText("Irregular verbs"));
        tabLayout.addTab(tabLayout.newTab().setText("Little vs a little"));
        tabLayout.addTab(tabLayout.newTab().setText("Nouns"));
        tabLayout.addTab(tabLayout.newTab().setText("Prepositions"));
        tabLayout.addTab(tabLayout.newTab().setText("Pronouns"));
        tabLayout.addTab(tabLayout.newTab().setText("Question tags"));
        tabLayout.addTab(tabLayout.newTab().setText("Too and Enough"));
        tabLayout.addTab(tabLayout.newTab().setText("Verbs"));
                tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        if(getIntent().getExtras()!=null)
        {
            if(getIntent().getExtras().containsKey("1"))
            {
                viewPager.setCurrentItem(0);
                            }
            else if(getIntent().getExtras().containsKey("2"))
            {
                viewPager.setCurrentItem(1);
            }
            else if(getIntent().getExtras().containsKey("3"))
            {
                viewPager.setCurrentItem(2);
            }
            else if(getIntent().getExtras().containsKey("4"))
            {
                viewPager.setCurrentItem(3);
            }
            else if(getIntent().getExtras().containsKey("5"))
            {
                viewPager.setCurrentItem(4);
            }
            else if(getIntent().getExtras().containsKey("6"))
            {
                viewPager.setCurrentItem(5);
            }
            else if(getIntent().getExtras().containsKey("7"))
            {
                viewPager.setCurrentItem(6);
            }
            else if(getIntent().getExtras().containsKey("8"))
            {
                viewPager.setCurrentItem(7);
            }
            else if(getIntent().getExtras().containsKey("9"))
            {
                viewPager.setCurrentItem(8);
            }
            else if(getIntent().getExtras().containsKey("10"))
            {
                viewPager.setCurrentItem(9);
            }
            else if(getIntent().getExtras().containsKey("11"))
            {
                viewPager.setCurrentItem(10);
            }
            else if(getIntent().getExtras().containsKey("12"))
            {
                viewPager.setCurrentItem(11);
            }
        }
    }
}
