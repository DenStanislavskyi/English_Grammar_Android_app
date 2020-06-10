package com.luckycoin.english_grammar.GrTests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.luckycoin.english_grammar.R;
    public class result extends AppCompatActivity {
        RatingBar bar;
        float a;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);
            TextView textResult = (TextView) findViewById(R.id.textResult);
            Bundle b = getIntent().getExtras();
            int score = b.getInt("score");
            textResult.setGravity(Gravity.CENTER);
            textResult.setText("Your score is " + " " + score + " out of 10 " + ".");

            bar=(RatingBar)findViewById(R.id.ratingBar);

            bar.setRating(score/2);// Put your score to your next
        }
        public void all(View o) {
            finish();
            finish();
        }
    }
