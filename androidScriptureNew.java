package com.example.elgalad.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key");
        String endString = "Your favorite scripture is:\n" + message;
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        textView.setText(endString);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_new);
        layout.addView(textView);

    }
}