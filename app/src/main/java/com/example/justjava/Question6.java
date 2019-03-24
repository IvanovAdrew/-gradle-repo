package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question6 extends AppCompatActivity {
    Button btnQuestion6;
    EditText editText6;
    String valueOfText6;
    int age6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        btnQuestion6 = (Button) findViewById(R.id.button);
        editText6 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest6(View v){
        Intent a = new Intent(this,MainActivity.class);
        valueOfText6 = editText6.getText().toString();
        age6 =Integer.parseInt(valueOfText6);
        a.putExtra("name_dog1",getIntent().getExtras().getString("name_dog1"));
        a.putExtra("age_cat1",getIntent().getExtras().getInt("age_cat1"));
        a.putExtra("name_cat1", getIntent().getExtras().getString("name_cat1"));
        a.putExtra("age_dog1",getIntent().getExtras().getInt("age_dog1"));
        a.putExtra("name_dog2",getIntent().getExtras().getString("name_dog2"));
        a.putExtra("age_dog2",age6);
        startActivity(a);
        //editText

    }
}
