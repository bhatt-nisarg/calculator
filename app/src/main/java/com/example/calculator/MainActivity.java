package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView result;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,addition,mul,sub,div,clear,dot,equal,mod;
    float one,two;
    boolean booladd,boolsub,boolmul,booldiv,boolmod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 =  findViewById(R.id.calculation);
        result = findViewById(R.id.result);
        btn0 =  findViewById(R.id.zero);
        btn1 =  findViewById(R.id.one);
        btn2 =  findViewById(R.id.two);
        btn3 =  findViewById(R.id.three);
        btn4 =  findViewById(R.id.four);
        btn5 =  findViewById(R.id.five);
        btn6 =  findViewById(R.id.six);
        btn7 =  findViewById(R.id.seven);
        btn8 =  findViewById(R.id.eight);
        btn9 =  findViewById(R.id.nine);
        addition =  findViewById(R.id.add);
        mul =  findViewById(R.id.mul);
        sub =  findViewById(R.id.sub);
        div =  findViewById(R.id.div);
        clear =  findViewById(R.id.clear);
        dot =    findViewById(R.id.dot);
        equal =  findViewById(R.id.equal);
        mod = findViewById(R.id.mod);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+ "9");
            }
        });
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1 ==  null){
                    ed1.setText("");
                }
                else{
                    one = Float.parseFloat(ed1.getText() + "");
                    booladd = true;
                    ed1.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = Float.parseFloat(ed1.getText()+"");
                boolsub = true;
                ed1.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = Float.parseFloat(ed1.getText() + "");
                boolmul =true;
                ed1.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = Float.parseFloat(ed1.getText()+"");
                booldiv = true;
                ed1.setText(null);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    one = Float.parseFloat(ed1.getText() + "");
                    boolmod = true;
                    ed1.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two = Float.parseFloat(ed1.getText() + "");

                if (booladd == true) {
                    result.setText(one + two + "");
                    booladd = false;
                }
                if (boolsub == true) {
                    result.setText(one - two + "");
                    boolsub = false;
                }
                if (boolmul == true) {
                    result.setText(one * two + "");
                    boolmul = false;
                }
                if (booldiv == true) {
                    result.setText(one / two + "");
                }
                if (boolmod == true){
                    result.setText(one % two + "");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
                result.setText("result");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText() + ".");
            }
        });

    }
}