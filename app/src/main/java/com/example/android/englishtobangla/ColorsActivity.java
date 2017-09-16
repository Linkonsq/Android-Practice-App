package com.example.android.englishtobangla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "লাল"));
        words.add(new Word("Green", "সবুজ"));
        words.add(new Word("Blue", "নীল"));
        words.add(new Word("Gray", "ধূসর"));
        words.add(new Word("Black", "কালো"));
        words.add(new Word("White", "সাদা"));
        words.add(new Word("Yellow", "হলুদ"));
        words.add(new Word("Pink", "গোলাপী"));
        words.add(new Word("Brown", "বাদামী"));
        words.add(new Word("Violet", "বেগুনী"));

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
