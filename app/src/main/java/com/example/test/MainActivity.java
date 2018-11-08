package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText el1;
    EditText el2;
    TextView ResText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Sum(View V)
    {
        el1 =(EditText)findViewById(R.id.Num1);
        el2 = (EditText)findViewById(R.id.Num2);
        ResText =(TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int Res = num1 + num2;
        ResText.setText(Integer.toString(Res));
    }
    public void Umn(View V)
    {
        el1 =(EditText)findViewById(R.id.Num1);
        el2 = (EditText)findViewById(R.id.Num2);
        ResText =(TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int Res = num1 * num2;
        ResText.setText(Integer.toString(Res));
    }
    public void Min(View V)
    {
        el1 =(EditText)findViewById(R.id.Num1);
        el2 = (EditText)findViewById(R.id.Num2);
        ResText =(TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int Res = num1 - num2;
        ResText.setText(Integer.toString(Res));
    }
    public void Del(View V)
    {
        el1 =(EditText)findViewById(R.id.Num1);
        el2 = (EditText)findViewById(R.id.Num2);
        ResText =(TextView)findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        if (num2!=0) {
            float Res = (float) num1 / num2;
            ResText.setText(Float.toString(Res));
        }
        else
        {
            ResText.setText("Error!");
        }

    }
}
