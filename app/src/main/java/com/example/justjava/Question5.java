package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question5 extends AppCompatActivity {
    Button btnQuestion5;
    EditText editText5;
    String valueOfText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        btnQuestion5 = (Button) findViewById(R.id.button);
        editText5 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest5(View v){
        Intent a = new Intent(this,MainActivity.class);
        Intent i = new Intent(this,Question6.class);
        valueOfText5 = editText5.getText().toString();
        a.putExtra("name_cat2",valueOfText5);
        startActivity(i);

    }
}
