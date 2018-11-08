package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sum(View V)
    {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView ResText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int Result = num1 + num2;
        ResText.setText(Integer.toString(Result));
    }


}
