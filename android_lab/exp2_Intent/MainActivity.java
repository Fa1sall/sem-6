package com.example.faisal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNewActivity();
            }
        });
    }

    public void openNewActivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}