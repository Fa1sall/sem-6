package com.example.exp6_spinnerdatepicker;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exp6_spinnerdatepicker.R;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TextView selectedItemTextView;

    private String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        selectedItemTextView = findViewById(R.id.selectedItemTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = items[position];
                selectedItemTextView.setText("Selected Item: " + selectedItem);
            }
        });
    }
} 
