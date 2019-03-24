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
        Intent i = new Intent(this,Question6.class);
        valueOfText5 = editText5.getText().toString();
        i.putExtra("name_dog1",getIntent().getExtras().getString("name_dog1"));
        i.putExtra("age_cat1",getIntent().getExtras().getInt("age_cat1"));
        i.putExtra("name_cat1", getIntent().getExtras().getString("name_cat1"));
        i.putExtra("age_dog1",getIntent().getExtras().getInt("age_dog1"));
        i.putExtra("name_dog2",valueOfText5);

        startActivity(i);

    }
}
