package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmull,bdiv,bequal,bclear,bper;
EditText  t1;
float result1,result2;
boolean Add , Sub,Mull,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // map upper taken variables with xml button
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b0 = (Button)findViewById(R.id.b0);
        badd = (Button)findViewById(R.id.badd);
        bsub = (Button)findViewById(R.id.bsub);
        bmull = (Button)findViewById(R.id.bmull);
        bdiv = (Button)findViewById(R.id.bdiv);
        bequal = (Button)findViewById(R.id.bequal);
        bdot = (Button)findViewById(R.id.bdot);
        bclear = (Button)findViewById(R.id.bclear);
        t1 = (EditText)findViewById(R.id.t1);

        // know we want what ever key we press is shown in text editor

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText()+".");
            }
        });

        // when we click a operation after any operand

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1==null){
                    t1.setText("");
                }else{
                    result1 = Float.parseFloat(t1.getText()+"");
                    Add = true;
                    t1.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1==null){
                    t1.setText("");
                }else{
                    result1 = Float.parseFloat(t1.getText()+"");
                    Sub = true;
                    t1.setText(null);
                }
            }
        });
        bmull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1==null){
                    t1.setText("");
                }else{
                    result1 = Float.parseFloat(t1.getText()+"");
                    Mull = true;
                    t1.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1==null){
                    t1.setText("");
                }else{
                    result1 = Float.parseFloat(t1.getText()+"");
                    Div = true;
                    t1.setText(null);
                }
            }
        });

        // make btn on equal to get result

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2 = Float.parseFloat(t1.getText()+"");
                if(Add==true){
                    t1.setText(result1+result2+"");
                    Add = false;
                }
                if(Sub==true){
                    t1.setText(result2-result1+"");
                    Sub = false;
                }
                if(Mull==true){
                    t1.setText(result1*result2+"");
                    Mull = false;
                }
                if(Div==true){
                    t1.setText(result1/result2+"");
                    Div = false;
                }
            }
        });

        // clear button

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
            }
        });



    }

}