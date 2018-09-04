package com.example.bijja.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.bijja.helloworld.R.color.Black;
import static com.example.bijja.helloworld.R.color.Orange;
import static com.example.bijja.helloworld.R.color.colorAccent;
import static com.example.bijja.helloworld.R.color.colorPrimary;
import static com.example.bijja.helloworld.R.color.colorPrimaryDark;
import static com.example.bijja.helloworld.R.color.primary_dark_material_dark;
import static com.example.bijja.helloworld.R.color.primary_material_light;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Log.i("Sowmya", "Button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(colorAccent));

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (findViewById(R.id.rootView)).setBackgroundColor(getResources().getColor(R.color.Orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String NewText = ((EditText) findViewById(R.id.EditText)).getText().toString();
              if(TextUtils.isEmpty(NewText))
              {
                  ((TextView) findViewById(R.id.textView)).setText("Hello from Sowmya!");
              }
              else
              ((TextView) findViewById(R.id.textView)).setText(NewText);
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.Black));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Sowmya!");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.White));
            }
        });

    }
}
