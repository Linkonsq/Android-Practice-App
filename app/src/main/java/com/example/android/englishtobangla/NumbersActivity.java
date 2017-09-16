package com.example.android.englishtobangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "এক"));
        words.add(new Word("Two", "দুই"));
        words.add(new Word("Three", "তিন"));
        words.add(new Word("Four", "চার"));
        words.add(new Word("Five", "পাঁচ"));
        words.add(new Word("Six", "ছয়"));
        words.add(new Word("Seven", "সাত"));
        words.add(new Word("Eight", "আট"));
        words.add(new Word("Nine", "নয়"));
        words.add(new Word("Ten", "দশ"));

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
