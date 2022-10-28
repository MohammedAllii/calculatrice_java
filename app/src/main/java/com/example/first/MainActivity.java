package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText ed1;
boolean newOperateur =true;
String nombre1="";
String operateur ="+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
    }


    @Override
    public void onClick(View view) {
        if(newOperateur)
            ed1.setText("");
        newOperateur =false;
        String number = ed1.getText().toString();
        switch (view.getId()){
            case R.id.button_0:
                number += "0";
                break;
            case R.id.button_1:
                number += "1";
                break;
            case R.id.button_2:
                number += "2";
                break;
            case R.id.button_3:
                number += "3";
                break;
            case R.id.button_4:
                number += "4";
                break;
            case R.id.button_5:
                number += "5";
                break;
            case R.id.button_6:
                number += "6";
                break;
            case R.id.button_7:
                number += "7";
                break;
            case R.id.button_8:
                number += "8";
                break;
            case R.id.button_9:
                number += "9";
                break;
            case R.id.button_dot:
                number += ".";
                break;
            case R.id.button_PlusMin:
                number = "-"+number;
                break;
            case R.id.button_c:
                number = "";
                break;
            case R.id.button_ac:
                number = "";
                break;

        }
        ed1.setText(number);
    }
    public void operationEvent(View view){
        newOperateur =true;
        nombre1=ed1.getText().toString();
        switch (view.getId()){
            case R.id.button_divide: operateur = "/";
            break;
            case R.id.button_multiply: operateur = "*";
                break;
            case R.id.button_plus: operateur = "+";
                break;
            case R.id.button_minus: operateur = "-";
                break;
        }

    }
    public void equalEvent(View view){
        String nombre2 = ed1.getText().toString();
        double result = 0.0;
        switch (operateur){
            case "+":
                result =Double.parseDouble(nombre1)+Double.parseDouble(nombre2);
                break;
            case "-":
                result =Double.parseDouble(nombre1)-Double.parseDouble(nombre2);
                break;
            case "*":
                result =Double.parseDouble(nombre1)*Double.parseDouble(nombre2);
                break;
            case "/":
                result =Double.parseDouble(nombre1)/Double.parseDouble(nombre2);
                break;
        }
        ed1.setText(result+"");
    }
    
}