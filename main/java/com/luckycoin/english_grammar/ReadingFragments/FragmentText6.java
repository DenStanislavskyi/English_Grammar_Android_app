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


public class FragmentText6 extends Fragment implements View.OnClickListener {
    ImageView readiv6_1, readiv6_2;
    TextView readtv6_1, readtv6_3, readtv6_2;
    Button readbtnyes6_1, readbtno6_1, readbtnyes6_2, readbtno6_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text6, container, false);
        readbtno6_1 = (Button) view.findViewById(R.id.readbtno6_1);
        readbtno6_1.setOnClickListener(this);
        readbtno6_2 = (Button) view.findViewById(R.id.readbtno6_2);
        readbtno6_2.setOnClickListener(this);
        readbtnyes6_1 = (Button) view.findViewById(R.id.readbtnyes6_1);
        readbtnyes6_1.setOnClickListener(this);
        readbtnyes6_2 = (Button) view.findViewById(R.id.readbtnyes6_2);
        readbtnyes6_2.setOnClickListener(this);

        readtv6_1 = (TextView) view.findViewById(R.id.readtv6_1);
        readtv6_2 = (TextView) view.findViewById(R.id.readtv6_2);
        readtv6_3 = (TextView) view.findViewById(R.id.readtv6_3);
        readiv6_1 = (ImageView) view.findViewById(R.id.readiv6_1);
        readiv6_2 = (ImageView) view.findViewById(R.id.readiv6_2);


        readiv6_1.setImageResource(R.drawable.textmemory);
        readiv6_2.setImageResource(R.drawable.textmemory1);
        readtv6_1.setText(R.string.memory1);
        readtv6_2.setText(R.string.memory2);
        readtv6_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno6_1) {
            readbtno6_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes6_1) {
            readbtnyes6_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtno6_2) {
            readbtno6_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes6_2) {
            readbtnyes6_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        }
    }
}

