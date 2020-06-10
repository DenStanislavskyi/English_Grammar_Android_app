package com.luckycoin.english_grammar.ReadingFragments;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.luckycoin.english_grammar.R;


public class FragmentText2 extends Fragment implements View.OnClickListener {
    ImageView readiv2_1, readiv2_2;
    TextView readtv2_1, readtv2_3, readtv2_2;
    Button readbtnyes2_1, readbtno2_1, readbtnyes2_2, readbtno2_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text2, container, false);
        readbtno2_1 = (Button) view.findViewById(R.id.readbtno2_1);
        readbtno2_1.setOnClickListener(this);
        readbtno2_2 = (Button) view.findViewById(R.id.readbtno2_2);
        readbtno2_2.setOnClickListener(this);
        readbtnyes2_1 = (Button) view.findViewById(R.id.readbtnyes2_1);
        readbtnyes2_1.setOnClickListener(this);
        readbtnyes2_2 = (Button) view.findViewById(R.id.readbtnyes2_2);
        readbtnyes2_2.setOnClickListener(this);

        readtv2_1 = (TextView) view.findViewById(R.id.readtv2_1);
        readtv2_2 = (TextView) view.findViewById(R.id.readtv2_2);
        readtv2_3 = (TextView) view.findViewById(R.id.readtv2_3);
        readiv2_1 = (ImageView) view.findViewById(R.id.readiv2_1);
        readiv2_2 = (ImageView) view.findViewById(R.id.readiv2_2);


        readiv2_1.setImageResource(R.drawable.textparty);
        readiv2_2.setImageResource(R.drawable.textparty1);
        readtv2_1.setText(R.string.party1);
        readtv2_2.setText(R.string.party2);
        readtv2_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno2_1) {
            readbtno2_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes2_1) {
            readbtnyes2_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtno2_2) {
            readbtno2_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes2_2) {
            readbtnyes2_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        }
    }
}

