package com.example.justjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Question3 extends AppCompatActivity {
    Button btnQuestion3;
    EditText editText3;
    String valueOfText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        btnQuestion3 = (Button) findViewById(R.id.button);
        editText3 = (EditText) findViewById(R.id.editText);
    }
    public void btnClickQuest3(View v){
        Intent a = new Intent(this,MainActivity.class);
        Intent i = new Intent(this,Question4.class);
        valueOfText3 = editText3.getText().toString();
        a.putExtra("name_dog1",valueOfText3);
        startActivity(i);

    }
}
