package com.example.android.englishtobangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "আপনি কোথায় যাচ্ছেন?"));
        words.add(new Word("What is your name?", "আপনার নাম কি?"));
        words.add(new Word("My name is Linkon", "আমার নাম লিংকন"));
        words.add(new Word("How are you feeling?", "আপনি কেমন অনুভব করছেন?"));
        words.add(new Word("I'm feeling good.", "আমি ভাল অনুভব করছি"));
        words.add(new Word("Are you coming?", "তুমি কি আসছ?"));
        words.add(new Word("Yes, I'm coming.", "হ্যাঁ, আমি আসছি"));
        words.add(new Word("I'm coming.", "আমি আসছি"));
        words.add(new Word("Let's go.", "চলো যাই"));
        words.add(new Word("Come here.", "এখানে আসো"));

        /*for(int i=0;i<words.size();i++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }*/

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
