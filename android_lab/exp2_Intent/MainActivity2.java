package com.example.faisal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}