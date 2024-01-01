package com.example.ex52;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;

    TextView tView;

    int clickNumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = findViewById(R.id.tView);
        btn = findViewById(R.id.btn);
    }


    public void clicked(View view) {
        clickNumber++;
        tView.setText("this is click number: "+clickNumber);
    }
}