package com.luckycoin.english_grammar;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.luckycoin.english_grammar.GrTopics.Grtopicstabs;
public class grammar_topics extends AppCompatActivity
        implements View.OnClickListener {
    Button btngradjectives, btngrarticles, btngrfew,
            btngridioms,btngrirregular,btngrlittle,btngrprepositions,
            btngrpronouns, btngrnouns,btngrquestiontags,btngrreportedspeech,btngrverbs ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grammar_topics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         btngradjectives = (Button) findViewById(R.id.btngradjectives);
        btngradjectives.setOnClickListener(this);
        btngrarticles = (Button) findViewById(R.id.btngrarticles);
        btngrarticles.setOnClickListener(this);
        btngrfew = (Button) findViewById(R.id.btngrfew);
        btngrfew.setOnClickListener(this);
        btngridioms = (Button) findViewById(R.id.btngridioms);
        btngridioms.setOnClickListener(this);
        btngrirregular = (Button) findViewById(R.id.btngrirregular);
        btngrirregular.setOnClickListener(this);
        btngrlittle= (Button) findViewById(R.id.btngrlittle);
        btngrlittle.setOnClickListener(this);
        btngrprepositions = (Button) findViewById(R.id.btngrprepositions);
        btngrprepositions.setOnClickListener(this);
        btngrnouns = (Button) findViewById(R.id.btngrnouns);
        btngrnouns.setOnClickListener(this);
        btngrpronouns = (Button) findViewById(R.id.btngrpronouns);
        btngrpronouns.setOnClickListener(this);
        btngrquestiontags = (Button) findViewById(R.id.btngrquestiontags);
        btngrquestiontags.setOnClickListener(this);
        btngrreportedspeech = (Button) findViewById(R.id.btngrreportedspeech);
        btngrreportedspeech.setOnClickListener(this);
        btngrverbs = (Button) findViewById(R.id.btngrverbs);
        btngrverbs.setOnClickListener(this);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btngradjectives:
                                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("1", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrarticles:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("2", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrfew:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("3", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngridioms:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("4", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrirregular:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("5", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrlittle:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("6", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrnouns:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("7", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrprepositions:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("8", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrpronouns:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("9", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrquestiontags:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("10", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrreportedspeech:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("11", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            case R.id.btngrverbs:
                intent = new Intent(this, Grtopicstabs.class);
                intent.putExtra("12", R.string.app_name);
                startActivity(intent);
                overridePendingTransition(R.anim.translate2,R.anim.translate1);
                break;
            default:
                break;
        }
    }
}
