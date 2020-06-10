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


public class FragmentText7 extends Fragment implements View.OnClickListener {
    ImageView readiv7_1, readiv7_2;
    TextView readtv7_1, readtv7_3, readtv7_2;
    Button readbtnyes7_1, readbtno7_1, readbtnyes7_2, readbtno7_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text7, container, false);
        readbtno7_1 = (Button) view.findViewById(R.id.readbtno7_1);
        readbtno7_1.setOnClickListener(this);
        readbtno7_2 = (Button) view.findViewById(R.id.readbtno7_2);
        readbtno7_2.setOnClickListener(this);
        readbtnyes7_1 = (Button) view.findViewById(R.id.readbtnyes7_1);
        readbtnyes7_1.setOnClickListener(this);
        readbtnyes7_2 = (Button) view.findViewById(R.id.readbtnyes7_2);
        readbtnyes7_2.setOnClickListener(this);

        readtv7_1 = (TextView) view.findViewById(R.id.readtv7_1);
        readtv7_2 = (TextView) view.findViewById(R.id.readtv7_2);
        readtv7_3 = (TextView) view.findViewById(R.id.readtv7_3);
        readiv7_1 = (ImageView) view.findViewById(R.id.readiv7_1);
        readiv7_2 = (ImageView) view.findViewById(R.id.readiv7_2);


        readiv7_1.setImageResource(R.drawable.textpron);
        readiv7_2.setImageResource(R.drawable.textpron1);
        readtv7_1.setText(R.string.pron1);
        readtv7_2.setText(R.string.pron2);
        readtv7_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno7_1) {
            readbtno7_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes7_1) {
            readbtnyes7_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtno7_2) {
            readbtno7_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes7_2) {
            readbtnyes7_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        }
    }
}

