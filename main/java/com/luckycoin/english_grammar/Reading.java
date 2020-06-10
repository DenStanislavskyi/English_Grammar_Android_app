package com.luckycoin.english_grammar;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.luckycoin.english_grammar.ReadingFragments.FragmentText1;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText2;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText3;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText4;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText5;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText6;
import com.luckycoin.english_grammar.ReadingFragments.FragmentText7;
public class Reading extends AppCompatActivity implements View.OnClickListener{
    Button rt1,rt2,rt3,rt4,rt5,rt6,rt7;

    FragmentTransaction fTrans;
    FrameLayout fragtext;
    FragmentText1 frag1;
    FragmentText2 frag2;
    FragmentText3 frag3;
    FragmentText4 frag4;
    FragmentText5 frag5;
    FragmentText6 frag6;
    FragmentText7 frag7;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rt1 = (Button) findViewById(R.id.rt1);
        rt1.setOnClickListener(this);
        rt2 = (Button) findViewById(R.id.rt2);
        rt2.setOnClickListener(this);
        rt3 = (Button) findViewById(R.id.rt3);
        rt3.setOnClickListener(this);
        rt4 = (Button) findViewById(R.id.rt4);
        rt4.setOnClickListener(this);
        rt5 = (Button) findViewById(R.id.rt5);
        rt5.setOnClickListener(this);
        rt6 = (Button) findViewById(R.id.rt6);
        rt6.setOnClickListener(this);
        rt7 = (Button) findViewById(R.id.rt7);
        rt7.setOnClickListener(this);
        fragtext = (FrameLayout) findViewById(R.id.fragtext);
frag1= new FragmentText1();
frag2= new FragmentText2();
frag3= new FragmentText3();
frag4= new FragmentText4();
frag5= new FragmentText5();
frag6= new FragmentText6();
        frag7= new FragmentText7();
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
         fTrans=getFragmentManager().beginTransaction();
                switch(view.getId()) {
                    case R.id.rt1:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag1);
                        }else
                            fTrans.replace(R.id.fragtext, frag1);
                        break;
                    case R.id.rt2:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag2);
                        }else
                            fTrans.replace(R.id.fragtext, frag2);
                        break;
                    case R.id.rt3:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag3);
                        }else
                            fTrans.replace(R.id.fragtext, frag3);
                        break;
                    case R.id.rt4:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag4);
                        }else
                            fTrans.replace(R.id.fragtext, frag4);
                        break;
                    case R.id.rt5:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag5);
                        }else
                            fTrans.replace(R.id.fragtext, frag5);
                        break;
                    case R.id.rt6:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag6);
                        }else
                            fTrans.replace(R.id.fragtext, frag6);
                        break;
                    case R.id.rt7:
                        if (fragtext==null){
                            fTrans.add(R.id.fragtext, frag7);
                        }else
                            fTrans.replace(R.id.fragtext, frag7);
                        break;
                default:
                    break;}
fTrans.commit();
            }
   @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
