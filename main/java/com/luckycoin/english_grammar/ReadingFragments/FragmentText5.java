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


public class FragmentText5 extends Fragment implements View.OnClickListener {
    ImageView readiv5_1, readiv5_2;
    TextView readtv5_1, readtv5_3, readtv5_2;
    Button readbtnyes5_1, readbtno5_1, readbtnyes5_2, readbtno5_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text5, container, false);
        readbtno5_1 = (Button) view.findViewById(R.id.readbtno5_1);
        readbtno5_1.setOnClickListener(this);
        readbtno5_2 = (Button) view.findViewById(R.id.readbtno5_2);
        readbtno5_2.setOnClickListener(this);
        readbtnyes5_1 = (Button) view.findViewById(R.id.readbtnyes5_1);
        readbtnyes5_1.setOnClickListener(this);
        readbtnyes5_2 = (Button) view.findViewById(R.id.readbtnyes5_2);
        readbtnyes5_2.setOnClickListener(this);

        readtv5_1 = (TextView) view.findViewById(R.id.readtv5_1);
        readtv5_2 = (TextView) view.findViewById(R.id.readtv5_2);
        readtv5_3 = (TextView) view.findViewById(R.id.readtv5_3);
        readiv5_1 = (ImageView) view.findViewById(R.id.readiv5_1);
        readiv5_2 = (ImageView) view.findViewById(R.id.readiv5_2);


        readiv5_1.setImageResource(R.drawable.textfriends1);
        readiv5_2.setImageResource(R.drawable.textfriends);
        readtv5_1.setText(R.string.textfriends1);
        readtv5_2.setText(R.string.textfriends2);
        readtv5_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno5_1) {
            readbtno5_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes5_1) {
            readbtnyes5_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtno5_2) {
            readbtno5_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes5_2) {
            readbtnyes5_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        }
    }
}

