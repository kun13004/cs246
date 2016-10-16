package com.example.elgalad.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.value;
//import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        TextView book = (TextView) findViewById(R.id.book);
        String theBook = book.getText().toString();
        TextView chapter = (TextView) findViewById(R.id.chapter);
        String theChapter = chapter.getText().toString();
        TextView verse = (TextView) findViewById(R.id.verse);
        String theVerse = verse.getText().toString();

        String finalString = theBook + " " + theChapter + ":" + theVerse;

        Intent myIntent = new Intent(this, NewActivity.class);
        myIntent.putExtra("key", finalString); //Optional parameters
        MainActivity.this.startActivity(myIntent);
    }
}