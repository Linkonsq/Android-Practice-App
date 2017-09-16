package com.example.android.englishtobangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "পিতা"));
        words.add(new Word("Mother", "মা"));
        words.add(new Word("Son", "পুত্র"));
        words.add(new Word("Daughter", "কন্যা"));
        words.add(new Word("Elder Brother", "বড় ভাই"));
        words.add(new Word("Younger Brother", "ছোট ভাই"));
        words.add(new Word("Elder Sister", "বড় বোন"));
        words.add(new Word("Younger Sister", "ছোট বোন"));
        words.add(new Word("Grandmother", "নানী"));
        words.add(new Word("Grandfather", "পিতামহ"));

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
