package com.luckycoin.english_grammar.GrTopics;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                grfragment1 grfragment1 = new grfragment1();
                return grfragment1;
            case 1:
                grfragment2 grfragment2 = new grfragment2();
                return grfragment2 ;
            case 2:
                grfragment3 grfragment3 = new grfragment3();
                return grfragment3;
            case 3:
                grfragment4 grfragment4 = new grfragment4();
                return grfragment4;
            case 4:
                grfragment5 grfragment5 = new grfragment5();
                return grfragment5 ;
            case 5:
                grfragment6 grfragment6 = new grfragment6();
                return grfragment6;
            case 6:
                grfragment7 grfragment7 = new grfragment7();
                return grfragment7;
            case 7:
                grfragment8 grfragment8 = new grfragment8();
                return grfragment8 ;
            case 8:
                grfragment9 grfragment9 = new grfragment9();
                return grfragment9;
            case 9:
                grfragment10 grfragment10 = new grfragment10();
                return grfragment10;
            case 10:
                grfragment11 grfragment11 = new grfragment11();
                return grfragment11 ;
            case 11:
                grfragment12 grfragment12 = new grfragment12();
                return grfragment12 ;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}