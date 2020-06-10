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


public class FragmentText4 extends Fragment implements View.OnClickListener {
    ImageView readiv4_1, readiv4_2;
    TextView readtv4_1, readtv4_3, readtv4_2;
    Button readbtnyes4_1, readbtno4_1, readbtnyes4_2, readbtno4_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text4, container, false);
        readbtno4_1 = (Button) view.findViewById(R.id.readbtno4_1);
        readbtno4_1.setOnClickListener(this);
        readbtno4_2 = (Button) view.findViewById(R.id.readbtno4_2);
        readbtno4_2.setOnClickListener(this);
        readbtnyes4_1 = (Button) view.findViewById(R.id.readbtnyes4_1);
        readbtnyes4_1.setOnClickListener(this);
        readbtnyes4_2 = (Button) view.findViewById(R.id.readbtnyes4_2);
        readbtnyes4_2.setOnClickListener(this);

        readtv4_1 = (TextView) view.findViewById(R.id.readtv4_1);
        readtv4_2 = (TextView) view.findViewById(R.id.readtv4_2);
        readtv4_3 = (TextView) view.findViewById(R.id.readtv4_3);
        readiv4_1 = (ImageView) view.findViewById(R.id.readiv4_1);
        readiv4_2 = (ImageView) view.findViewById(R.id.readiv4_2);


        readiv4_1.setImageResource(R.drawable.textesper);
        readiv4_2.setImageResource(R.drawable.textesper1);
        readtv4_1.setText(R.string.esper1);
        readtv4_2.setText(R.string.esper2);
        readtv4_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno4_1) {
            readbtno4_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes4_1) {
            readbtnyes4_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtno4_2) {
            readbtno4_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes4_2) {
            readbtnyes4_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        }
    }
}

