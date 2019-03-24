package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question4 extends AppCompatActivity {
    Button btnQuestion4;
    EditText editText4;
    String valueOfText4;
    int age4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        btnQuestion4 = (Button) findViewById(R.id.button);
        editText4 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest4(View v){
        Intent i = new Intent(this,Question5.class);
        valueOfText4 = editText4.getText().toString();
        age4 =Integer.parseInt(valueOfText4);
        i.putExtra("name_dog1",getIntent().getExtras().getString("name_dog1"));
        i.putExtra("age_cat1",getIntent().getExtras().getInt("age_cat1"));
        i.putExtra("name_cat1", getIntent().getExtras().getString("name_cat1"));
        i.putExtra("age_dog1",age4);

        startActivity(i);
    }
    }

