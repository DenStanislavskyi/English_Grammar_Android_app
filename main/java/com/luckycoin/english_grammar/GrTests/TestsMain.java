package com.luckycoin.english_grammar.GrTests;
import com.luckycoin.english_grammar.R;
        import android.annotation.SuppressLint;
        import android.annotation.TargetApi;
        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import java.util.List;

public class TestsMain extends AppCompatActivity {
    List<Question> quesList;
    int score = 0;
    int qid = 0;
    Question currentQ;
    TextView txtQuestion, scored;
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_main);
        QuizHelper db = new QuizHelper(this);  // my question bank class
        quesList = db.getAllQuestions();  // this will fetch all quetonall questions

        if(getIntent().getExtras()!=null)
        {
            if(getIntent().getExtras().containsKey("1"))
            {
                qid=0;
            }
            else  if(getIntent().getExtras().containsKey("2"))
            {
                qid=10;
            }
        else  if(getIntent().getExtras().containsKey("3"))
            {
                qid=20;
            }
        else  if(getIntent().getExtras().containsKey("4"))
            {
                qid=30;
            }
        else  if(getIntent().getExtras().containsKey("5"))
            {
                qid=40;
            }
        else  if(getIntent().getExtras().containsKey("6"))
            {
                qid=50;
            }
        else  if(getIntent().getExtras().containsKey("7"))
            {
                qid=60;
            }
        else  if(getIntent().getExtras().containsKey("8"))
            {
                qid=70;
            }
        else  if(getIntent().getExtras().containsKey("9"))
            {
                qid=80;
            }
      else  if(getIntent().getExtras().containsKey("10"))
            {
                qid=90;
            }
      else  if(getIntent().getExtras().containsKey("11"))
            {
                qid=100;
            }
      else  if(getIntent().getExtras().containsKey("12"))
            {
                qid=110;
            }
        }
        currentQ = quesList.get(qid); // the current question
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        // the textview in which the question will be displayed
        // the three buttons,
        // the idea is to set the text of three buttons with the options from question bank
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        // the textview in which score will be displayed
        scored = (TextView) findViewById(R.id.score);
        // method which will set the things up
        setQuestionView();
                  // button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // passing the button text to other method
                // to check whether the anser is correct or not
                // same for all three buttons
                getAnswer(button1.getText().toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button2.getText().toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });


    }
    public void getAnswer(String AnswerString) {
        if (currentQ.getANSWER().equals(AnswerString)) {
            // if conditions matches increase the int (score) by 1
            // and set the text of the score view
            score++;
            scored.setText("Score : " + score);
        }
        if(getIntent().getExtras()!=null)
        {
            if(getIntent().getExtras().containsKey("1"))
            {

                if (qid < 10) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b);

                    startActivity(intent);
                    finish();
                }
            }
            else if(getIntent().getExtras().containsKey("2"))
            {


                if (qid < 20) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("3"))
            {


                if (qid < 30) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("4"))
            {


                if (qid < 40) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("5"))
            {


                if (qid < 50) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("6"))
            {


                if (qid < 60) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("7"))
            {


                if (qid < 70) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("8"))
            {


                if (qid < 80) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("9"))
            {


                if (qid < 90) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("10"))
            {


                if (qid < 100) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("11"))
            {


                if (qid < 110) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        else if(getIntent().getExtras().containsKey("12"))
            {


                if (qid < 120) {
                    // if questions are not over then do this
                    currentQ = quesList.get(qid);
                    setQuestionView();
                } else {
                    // if over do this
                    Intent intent = new Intent(this,result.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); // Your score
                    intent.putExtras(b); // Put your score to your next
                    startActivity(intent);
                    finish();
                }
            }
        }
    }
    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    private void setQuestionView() {
        // the method which will put all things together
        txtQuestion.setText(currentQ.getQUESTION());
        button1.setText(currentQ.getOPTA());
        button2.setText(currentQ.getOPTB());
        button3.setText(currentQ.getOPTC());

        qid++;

    }
}