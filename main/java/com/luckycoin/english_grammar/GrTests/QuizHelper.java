package com.luckycoin.english_grammar.GrTests;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // DB Name
    private static final String DATABASE_NAME = "english";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private SQLiteDatabase dbase;
    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        db.execSQL(sql);
        addQuestion();
        // db.close();
    }
    private void addQuestion() {
        Question q1 = new Question("My car is ____ than yours.", "faster", "fast", "the fastest", "faster");
        this.addQuestion(q1);
        Question q2 = new Question("It is the ____ book of all six of them.", "interesting", "more interesting", "most interesting", "most interesting");
        this.addQuestion(q2);
        Question q3 = new Question("Denys is ____ than Mary", "tall", "taller", "the tallest", "taller");
        this.addQuestion(q3);
        Question q4 = new Question("Anton is ____ of all.", "smarter", "smart", "the smartest", "the smartest");
        this.addQuestion(q4);
        Question q5 = new Question("She has a ____ dog.", "the biggest", "bigger", "big", "big");
        this.addQuestion(q5);
        Question q6 = new Question("Sam is ____ than his brother.", "shorter", "short", "the shortest", "shorter");
        this.addQuestion(q6);
        Question q7 = new Question("Ann is ____ girl in the school.", "the most beautiful", "beautiful", "more beautiful", "the most beautiful");
        this.addQuestion(q7);
        Question q8 = new Question("He is the ____ boy in the school.", "intelligent", "most intelligent", "more intelligent", "most intelligent");
        this.addQuestion(q8);
        Question q9 = new Question("Jane is ____ .", "the most popular", "popular", "more popular", "popular");
        this.addQuestion(q9);
        Question q10 = new Question("The green dress is ____ of all.", "expensive", "more expensive", "the most expensive", "the most expensive");
        this.addQuestion(q10);
        Question q11 = new Question("This is ____ orange.", "a", "an", "the", "an");
        this.addQuestion(q11);
        Question q12 = new Question("He is ____ doctor.", "an", "a", "the", "a");
        this.addQuestion(q12);
        Question q13 = new Question("____ sun shines brightly.", "The", "A", "An", "The");
        this.addQuestion(q13);
        Question q14 = new Question("It was an old house, but ____ house was big.", "an", "the", "a", "the");
        this.addQuestion(q14);
        Question q15 = new Question("I have seven ____ books.", "a", "the", "no article", "no article");
        this.addQuestion(q15);
        Question q16 = new Question("____ small black cat is his.", "The", "A", "An", "The");
        this.addQuestion(q16);
        Question q17 = new Question("____ man in the blue T-shirt is Bob.", "A", "The", "An", "The");
        this.addQuestion(q17);
        Question q18 = new Question("____ his eyes are green.", "The", "An", "no article", "no article");
        this.addQuestion(q18);
        Question q19 = new Question("____ sharks are dangerous.", "An", "no article", "The", "no article");
        this.addQuestion(q19);
        Question q20 = new Question("____ moon is in ____ sky.", "the, the", "a, the", "the, a", "the, the");
        this.addQuestion(q20);
        Question q21 = new Question("Can you please buy ____ oranges.", "few", "a few", "a little", "a few");
        this.addQuestion(q21);
        Question q22 = new Question("She had ____ pints of beer there.", "few", "a few", "a little", "a few");
        this.addQuestion(q22);
        Question q23 = new Question("Only ____ people can afford to pay such taxes.", "few", "a few", "little", "few");
        this.addQuestion(q23);
        Question q24 = new Question("They know ____ places that they could recommend to you.", "a few", "a little", "few", "few");
        this.addQuestion(q24);
        Question q25 = new Question("They need to get ____ things in the city.", "a few", "a little", "few", "a few");
        this.addQuestion(q25);
        Question q26 = new Question("All I wanted was ____ moments on her own.", "few", "a few", "little", "a few");
        this.addQuestion(q26);
        Question q27 = new Question("I had ____ moments on my own.", "a few", "few", "a little", "few");
        this.addQuestion(q27);
        Question q28 = new Question("He stayed ____ days in the USA.", "few", "a few", "little", "a few");
        this.addQuestion(q28);
        Question q29 = new Question("____ would be in favour of police officers carrying weapons.", "A little", "A few", "Few", "Few");
        this.addQuestion(q29);
        Question q30 = new Question("Just have ____ apples.", "few", "a few", "little", "a few");
        this.addQuestion(q30);
        Question q31 = new Question("A roof over your head means:", "very different from", "the roof of your house", "a place to live", "a place to live");
        this.addQuestion(q31);
        Question q32 = new Question("Against time means:", "an attempt to finish something quickly within a time limit", "to get out of a bad situation", "an annoyance", "an attempt to finish something quickly within a time limit");
        this.addQuestion(q32);
        Question q33 = new Question("Pain in the neck means:", "to memorize something", "an annoyance", "to get out of a bad situation", "an annoyance");
        this.addQuestion(q33);
        Question q34 = new Question("Keep an eye on means:", "safe and without injury or damage", "to watch or look after something or someone", "to memorize something", "to watch or look after something or someone.");
        this.addQuestion(q34);
        Question q35 = new Question("Learn by heart means:", "to memorize something", "get out of a bad situation", "safe and without injury or damage", "to memorize something");
        this.addQuestion(q35);
        Question q36 = new Question("Safe and sound means:", "to watch or look after something or someone.", "safe and without injury or damage", "get out of a bad situation", "safe and without injury or damage");
        this.addQuestion(q36);
        Question q37 = new Question("Get out of a jam means:", "get out of a bad situation", "someone who is able to do many things", "get out of a bad situation", "get out of a bad situation");
        this.addQuestion(q37);
        Question q38 = new Question("A man of action means:", "someone who is able to do many things", " a man who is inclined to act first rather than think about things", "to watch or look after something or someone", " a man who is inclined to act first rather than think about things");
        this.addQuestion(q38);
        Question q39 = new Question("Far cry from means:", "a place to live", "very different from", "to watch or look after something or someone", "very different from");
        this.addQuestion(q39);
        Question q40 = new Question("Jack-of-all-trades means:", "to watch or look after something or someone", "an annoyance", "someone who is able to do many things", "someone who is able to do many things");
        this.addQuestion(q40);
        Question q41 = new Question("be was/were ____", "been", "be", "was", "been");
        this.addQuestion(q41);
        Question q42 = new Question("bite ____ bitten", "bitten", "bite", "bit", "bit");
        this.addQuestion(q42);
        Question q43 = new Question("____ drank drunk", "drunk", "drink", "drank", "drink");
        this.addQuestion(q43);
        Question q44 = new Question("awake ____ awoken", "awake", "awoken", "awoke", "awoke");
        this.addQuestion(q44);
        Question q45 = new Question("break broke ____", "broken", "broke", "break", "broken");
        this.addQuestion(q45);
        Question q46 = new Question("do ____ done", "did", "do", "done", "did");
        this.addQuestion(q46);
        Question q47 = new Question("____ ate eaten", "ate", "eaten", "eat", "eat");
        this.addQuestion(q47);
        Question q48 = new Question("____ went gone", "went", "gone", "go", "go");
        this.addQuestion(q48);
        Question q49 = new Question("give gave ____", "gave", "given", "give", "given");
        this.addQuestion(q49);
        Question q50 = new Question("fly ____ flown", "flew", "fly", "flown", "flew");
        this.addQuestion(q50);
        Question q51 = new Question("They have very ____ money.(not enough)", "little", "a little", "few", "little");
        this.addQuestion(q51);
        Question q52 = new Question("With ____ training Den could get stronger.", "a little", "little", "a few", "a little");
        this.addQuestion(q52);
        Question q53 = new Question("He saves ____ money every day.", "little", "a little", "few", "a little");
        this.addQuestion(q53);
        Question q54 = new Question("There seems ____ hope. (not enough)", "little", "a little", "few", "little");
        this.addQuestion(q54);
        Question q55 = new Question("There is ____ time left. (enough)", "few", "a little", "little", "a little");
        this.addQuestion(q55);
        Question q56 = new Question("We had ____ money. (not much)", "a little", "a few", "little", "little");
        this.addQuestion(q56);
        Question q57 = new Question("We have very ____ time.", "little", "a little", "few", "little");
        this.addQuestion(q57);
        Question q58 = new Question("There is very ____ salt left. at home", "a little", "a few", "little", "little");
        this.addQuestion(q58);
        Question q59 = new Question("If I had ____ money, I would get this book. ", "few", "little", "a little", "a little");
        this.addQuestion(q59);
        Question q60 = new Question("I have so ____ money", "little", "a little", "a few", "little");
        this.addQuestion(q60);
        Question q61 = new Question("There is some ____ in the bottle.", "milk", "milks", "waters", "");
        this.addQuestion(q61);
        Question q62 = new Question("I have a ____", "dog", "dogs", "cats", "dog");
        this.addQuestion(q62);
        Question q63 = new Question("He is a good ____.", "teacher", "waiters", "teachers", "teacher");
        this.addQuestion(q63);
        Question q64 = new Question("That is a ____", "book", "bags", "pens", "book");
        this.addQuestion(q64);
        Question q65 = new Question("These are ____", "bags", "book", "pen", "bags");
        this.addQuestion(q65);
        Question q66 = new Question("Love is a wonderful ____.", "emotion", "words", "emotions", "emotion");
        this.addQuestion(q66);
        Question q67 = new Question("My ____ are tall.", "mother", "brother", "sisters", "sisters");
        this.addQuestion(q67);
        Question q68 = new Question("There are two ____ in the room.", "chairs", "table", "sofa", "chairs");
        this.addQuestion(q68);
        Question q69 = new Question("I wrote six ____", "letter", "song", "letters", "letter");
        this.addQuestion(q69);
        Question q70 = new Question("She is a ____", "maid", "maids", "doctors", "maid");
        this.addQuestion(q70);
        Question q71 = new Question("I will go there ____ lunch.", "since", "after", "above", "after");
        this.addQuestion(q71);
        Question q72 = new Question("They are interested _____ buying a new car now.", "on", "by", "in", "in");
        this.addQuestion(q72);
        Question q73 = new Question("My fingers were injured so my brother had to write the note _____ me. ", "for", "to", "at", "for");
        this.addQuestion(q73);
        Question q74 = new Question("My parents have been married ______ sixty years.", "at", "for", "since", "for");
        this.addQuestion(q74);
        Question q75 = new Question("He never seems to be ______ home.", "in", "on", "at", "at");
        this.addQuestion(q75);
        Question q76 = new Question("I will be ready to leave ____ about ten minutes. ", "in", "at", "on", "in");
        this.addQuestion(q76);
        Question q77 = new Question("She came ____ train.", "by", "at", "on", "by");
        this.addQuestion(q77);
        Question q78 = new Question("The pen is ____ the drawer. ", "by", "in", "at", "in");
        this.addQuestion(q78);
        Question q79 = new Question("I bought this book ____ you.", "on", "for", "in", "for");
        this.addQuestion(q79);
        Question q80 = new Question("The plate is ____ the table.", "on", "after", "since", "on");
        this.addQuestion(q80);
        Question q81 = new Question("____ is dreaming.", "They", "He", "We", "He");
        this.addQuestion(q81);
        Question q82 = new Question("____ are on the wall.", "They", "He", "It", "They");
        this.addQuestion(q82);
        Question q83 = new Question("____ is from Ukraine.", "We", "She", "They", "She");
        this.addQuestion(q83);
        Question q84 = new Question("Where are ____ from?", "she", "he", "you", "you");
        this.addQuestion(q84);
        Question q85 = new Question("This is a new house. is red.", "She", " It", "They", " It");
        this.addQuestion(q85);
        Question q86 = new Question("____ is not at school", "He", "They", "We", "He");
        this.addQuestion(q86);
        Question q87 = new Question("Jack is ____ friend.", "us", "my", "he", "my");
        this.addQuestion(q87);
        Question q88 = new Question("____ name is John.", "Hers", "He", "His", "His");
        this.addQuestion(q88);
        Question q89 = new Question("I like ____ smartphone.", "you", "my", "we", "my");
        this.addQuestion(q89);
        Question q90 = new Question("Is that ____ book? ", "your", "me", "they", "your");
        this.addQuestion(q90);
        Question q91 = new Question("We are working on the project, ____ we?", "won't", "aren't", "isn't", "aren't");
        this.addQuestion(q91);
        Question q92 = new Question("It was my fault, ____ it?", "weren't", "wasn't", "was", "wasn't");
        this.addQuestion(q92);
        Question q93 = new Question("He doesn't like her, ____ he?", "does", "doesn't", "do", "does");
        this.addQuestion(q93);
        Question q94 = new Question("He got what he wanted, ____ he?", "does", "didn't", "did", "didn't");
        this.addQuestion(q94);
        Question q95 = new Question("He is strong, ____ he?", "isn't", "is", "does", "isn't");
        this.addQuestion(q95);
        Question q96 = new Question("We can leave her alone, ____ we?", "can't", "can", "do", "can't");
        this.addQuestion(q96);
        Question q97 = new Question("She was there, ____ she?", "if", "was", "wasn't", "wasn't");
        this.addQuestion(q97);
        Question q98 = new Question("It won't be hard to convince them, _____ it?", "will", "is", "won't", "will");
        this.addQuestion(q98);
        Question q99 = new Question("We didn't start at ten o'clock, ____ we?", "do", "didn't", "did", "did");
        this.addQuestion(q99);
        Question q100 = new Question("We've done our job, ____ we?", "do", "haven't", "have", "haven't");
        this.addQuestion(q100);
        Question q101 = new Question("I don't have ____ time. ", "-", "enough", "too", "enough");
        this.addQuestion(q101);
        Question q102 = new Question("He has ____ many cars.", "enough", "-", "too", "too");
        this.addQuestion(q102);
        Question q103 = new Question("I have ____ much patience.", "-", "too", "enough", "too");
        this.addQuestion(q103);
        Question q104 = new Question("You are working fast ____.", "-", "enough", "too", "enough");
        this.addQuestion(q104);
        Question q105 = new Question("Danys is intelligent ____ work here.", "enough", "too", "-", "enough");
        this.addQuestion(q105);
        Question q106 = new Question("He is ____ old to play PC-games.", "-", "too", "enough", "too");
        this.addQuestion(q106);
        Question q107 = new Question("He isn old ____ to watch this program. ", "too", "enough", "-", "enough");
        this.addQuestion(q107);
        Question q108 = new Question("We are walking quickly ____.", "-", "enough", "too", "enough");
        this.addQuestion(q108);
        Question q109 = new Question("I was running ____ fast.", "-", "too", "enough", "too");
        this.addQuestion(q109);
        Question q110 = new Question("They have ____ money.", "enough", "too", "-", "enough");
        this.addQuestion(q110);
        Question q111 = new Question("I ____ a doctor.", "am", "is", "are", "am");
        this.addQuestion(q111);
        Question q112 = new Question("He ____ a boy.", "am", "is", "are", "is");
        this.addQuestion(q112);
        Question q113 = new Question("We ____ students.", "are", "am", "is", "are");
        this.addQuestion(q113);
        Question q114 = new Question("She ____ books every day.", "write", "writes", "is", "writes");
        this.addQuestion(q114);
        Question q115 = new Question("We ____ English fluently.", "speaks", "are", "speak", "speak");
        this.addQuestion(q115);
        Question q116 = new Question("I ____ a cat.", "have", "has", "is", "have");
        this.addQuestion(q116);
        Question q117 = new Question("They ____ two cars.", "have", "has", "are", "have");
        this.addQuestion(q117);
        Question q118 = new Question("She ____ long legs.", "is", "has", "have", "has");
        this.addQuestion(q118);
        Question q119 = new Question("He ____ football once a week.", "is", "plays", "play", "plays");
        this.addQuestion(q119);
        Question q120 = new Question("We ____ a big house.", "are", "has", "have", "have");
        this.addQuestion(q120);

        // END
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }





    // Adding new question
    public void addQuestion(Question quest) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }
    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));

                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }
}
