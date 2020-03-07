package com.example.manybutton2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ((TextView) findViewById(R.id.textView)).setText(R.string.b1);
                    }
                }
        );

        ((Button) findViewById(R.id.button2))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ((TextView) findViewById(R.id.textView)).setText(R.string.b2);
                    }
                }
        );

        ((Button) findViewById(R.id.button3))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ((TextView) findViewById(R.id.textView)).setText(R.string.b3);
                    }
                }
        );
    }
}
