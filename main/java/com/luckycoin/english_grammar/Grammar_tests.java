package com.luckycoin.english_grammar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.luckycoin.english_grammar.GrTests.TestsMain;
public class Grammar_tests extends AppCompatActivity implements View.OnClickListener {
    Button btntestadjectives,btntestarticles,btntestfew;
    Button btntestidioms,btntestirregular,btntestlittle,btntestnouns;
    Button btntestprepositions,btntestpronouns,btntestquestiontags,btntestreportedspeech;
    Button btntestverbs;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_tests);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btntestadjectives = (Button) findViewById(R.id.btntestadjectives);
        btntestadjectives.setOnClickListener(this);
        btntestarticles = (Button) findViewById(R.id.btntestarticles);
        btntestarticles.setOnClickListener(this);
        btntestfew = (Button) findViewById(R.id.btntestfew);
        btntestfew.setOnClickListener(this);
        btntestidioms = (Button) findViewById(R.id.btntestidioms);
        btntestidioms.setOnClickListener(this);
        btntestirregular = (Button) findViewById(R.id.btntestirregular);
        btntestirregular.setOnClickListener(this);
        btntestlittle = (Button) findViewById(R.id.btntestlittle);
        btntestlittle.setOnClickListener(this);
        btntestnouns= (Button) findViewById(R.id.btntestnouns);
        btntestnouns.setOnClickListener(this);
        btntestprepositions= (Button) findViewById(R.id.btntestprepositions);
        btntestprepositions.setOnClickListener(this);
        btntestpronouns= (Button) findViewById(R.id.btntestpronouns);
        btntestpronouns.setOnClickListener(this);
        btntestquestiontags= (Button) findViewById(R.id.btntestquestiontags);
        btntestquestiontags.setOnClickListener(this);
        btntestreportedspeech = (Button) findViewById(R.id.btntestreportedspeech);
        btntestreportedspeech.setOnClickListener(this);
        btntestverbs = (Button) findViewById(R.id.btntestverbs);
        btntestverbs.setOnClickListener(this);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btntestadjectives:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("1", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btntestarticles:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("2", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btntestfew:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("3", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btntestidioms:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("4", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestirregular:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("5", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestlittle:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("6", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestnouns:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("7", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestprepositions:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("8", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestpronouns:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("9", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestquestiontags:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("10", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestreportedspeech:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("11", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
         case R.id.btntestverbs:
                intent = new Intent(this, TestsMain.class);
                intent.putExtra("12", R.string.app_name);
                startActivity(intent);
             overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            default: break;
        }
    }
}
