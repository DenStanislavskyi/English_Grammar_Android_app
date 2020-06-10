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
public class FragmentText1 extends Fragment implements View.OnClickListener {
    ImageView readiv1_1, readiv1_2;
    TextView readtv1_1, readtv1_3, readtv1_2;
    Button readbtnyes1_1, readbtno1_1, readbtnyes1_2, readbtno1_2;
    Snackbar snackbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.fragment_text1, container, false);
        readbtno1_1 = (Button) view.findViewById(R.id.readbtno1_1);
        readbtno1_1.setOnClickListener(this);
        readbtno1_2 = (Button) view.findViewById(R.id.readbtno1_2);
        readbtno1_2.setOnClickListener(this);
        readbtnyes1_1 = (Button) view.findViewById(R.id.readbtnyes1_1);
        readbtnyes1_1.setOnClickListener(this);
        readbtnyes1_2 = (Button) view.findViewById(R.id.readbtnyes1_2);
        readbtnyes1_2.setOnClickListener(this);
        readtv1_1 = (TextView) view.findViewById(R.id.readtv1_1);
        readtv1_2 = (TextView) view.findViewById(R.id.readtv1_2);
        readtv1_3 = (TextView) view.findViewById(R.id.readtv1_3);
        readiv1_1 = (ImageView) view.findViewById(R.id.readiv1_1);
        readiv1_2 = (ImageView) view.findViewById(R.id.readiv1_2);
        readiv1_1.setImageResource(R.drawable.textdate);
        readiv1_2.setImageResource(R.drawable.textdate2);
        readtv1_1.setText(R.string.date1);
        readtv1_2.setText(R.string.date2);
        readtv1_3.setText(R.string.readwords);
        return view;
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.readbtno1_1) {
            readbtno1_1.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        } else if (id == R.id.readbtnyes1_1) {
            readbtnyes1_1.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtno1_2) {
            readbtno1_2.setBackgroundColor(Color.GREEN);
            snackbar = Snackbar.make(view, R.string.correct,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.GREEN);
            snackbar.show();
        } else if (id == R.id.readbtnyes1_2) {
            readbtnyes1_2.setBackgroundColor(Color.RED);
            snackbar = Snackbar.make(view, R.string.wrong,
                    Snackbar.LENGTH_SHORT);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.RED);
            snackbar.show();
        }
    }
}

