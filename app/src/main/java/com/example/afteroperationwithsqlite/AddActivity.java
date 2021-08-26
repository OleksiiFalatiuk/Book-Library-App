package com.example.afteroperationwithsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText etTitle, etAuthor, etPages;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etTitle = findViewById(R.id.etTitle);
        etAuthor = findViewById(R.id.etAuthor);
        etPages = findViewById(R.id.etPages);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper mDBH = new DBHelper(AddActivity.this);
                mDBH.addBook(etTitle.getText().toString().trim(),
                        etAuthor.getText().toString().trim(),
                        Integer.parseInt(etPages.getText().toString().trim()));
                finish();
            }
        });

    }
}