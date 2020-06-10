package com.luckycoin.english_grammar.MainFragments;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.luckycoin.english_grammar.Grammar_tests;
import com.luckycoin.english_grammar.Main;
import com.luckycoin.english_grammar.R;
import com.luckycoin.english_grammar.Reading;
import com.luckycoin.english_grammar.grammar_topics;
public class grFragment extends Fragment implements View.OnClickListener {
    Button btnallgr;
    Button btngralltests;
    Button btnallreading;
    Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.grfragment, container, false);
        btngralltests = (Button) view.findViewById(R.id.btngralltests);
        btngralltests.setOnClickListener(this);
        btnallreading = (Button) view.findViewById(R.id.btnallreading);
        btnallreading.setOnClickListener(this);
        btnallgr = (Button) view.findViewById(R.id. btnallgr);
        btnallgr.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(view.getId()) {
            case R.id.btnallgr:
            intent = new Intent(getActivity(), grammar_topics.class);
            startActivity(intent);
            getActivity().overridePendingTransition(R.anim.translate2, R.anim.translate1);
                break;
            case R.id.btngralltests:
                        intent = new Intent(getActivity(), Grammar_tests.class);
                        startActivity(intent);
                        getActivity().overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btnallreading:
                        intent = new Intent(getActivity(), Reading.class);
                        startActivity(intent);
                getActivity().overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            default:
                break;
        }
    }


}


