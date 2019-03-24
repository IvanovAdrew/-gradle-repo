package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question1 extends AppCompatActivity {
    Button btnQuestion1;
    EditText editText1;
    String valueOfText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        btnQuestion1 = (Button) findViewById(R.id.button);
        editText1 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest1(View v){
        Intent i = new Intent(this,Question2.class);
        valueOfText1 = editText1.getText().toString();
        i.putExtra("name_cat1",valueOfText1);

        startActivity(i);


    }
}
