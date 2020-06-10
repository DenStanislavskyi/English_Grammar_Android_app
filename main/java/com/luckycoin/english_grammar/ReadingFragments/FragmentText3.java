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


public class FragmentText3 extends Fragment implements View.OnClickListener {
    ImageView readiv3_1, readiv3_2;
    TextView readtv3_1, readtv3_3, readtv3_2;
    Button readbtnyes3_1, readbtno3_1, readbtnyes3_2, readbtno3_2;
    Snackbar snackbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =
                inflater.inflate(R.layout.fragment_text3, container, false);
        readbtno3_1 = (Button) view.findViewById(R.id.readbtno3_1);
        readbtno3_1.setOnClickListener(this);
        readbtno3_2 = (Button) view.findViewById(R.id.readbtno3_2);
        readbtno3_2.setOnClickListener(this);
        readbtnyes3_1 = (Button) view.findViewById(R.id.readbtnyes3_1);
        readbtnyes3_1.setOnClickListener(this);
        readbtnyes3_2 = (Button) view.findViewById(R.id.readbtnyes3_2);
        readbtnyes3_2.setOnClickListener(this);

        readtv3_1 = (TextView) view.findViewById(R.id.readtv3_1);
        readtv3_2 = (TextView) view.findViewById(R.id.readtv3_2);
        readtv3_3 = (TextView) view.findViewById(R.id.readtv3_3);
        readiv3_1 = (ImageView) view.findViewById(R.id.readiv3_1);
        readiv3_2 = (ImageView) view.findViewById(R.id.readiv3_2);


        readiv3_1.setImageResource(R.drawable.texttable);
        readiv3_2.setImageResource(R.drawable.texttable1);
        readtv3_1.setText(R.string.table1);
        readtv3_2.setText(R.string.table2);
        readtv3_3.setText(R.string.readwords);
        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.readbtno3_1) {
            readbtno3_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes3_1) {
            readbtnyes3_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtno3_2) {
            readbtno3_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes3_2) {
            readbtnyes3_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        }
    }
}

