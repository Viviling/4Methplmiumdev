package com.example.chyesy.nov;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button sl;
    private Button mi;
    private Button de;
    private Button um;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView  = (TextView) findViewById(R.id.textView);
        sl = (Button) findViewById(R.id.sl);
        mi = (Button) findViewById(R.id.mi);
        um= (Button) findViewById(R.id.um);
        de = (Button) findViewById(R.id.de);

        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Объявим числовые переменные
                double a,b,c;

                //Считаем с editText и editText2 текстовые значения
                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();

                //Преобразуем текстовые переменные в числовые значения
                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);

                //Проведем с числовыми переменными нужные действия
                c = a+b;

                //Преобразуем ответ в число
                String S = Double.toString(c);

                //Выведем текст в textView
                textView.setText(S);
            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,c;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();


                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);

                c=a-b;

                String S = Double.toString(c);

                textView.setText(S);
            }
        });
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,c;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();


                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c=a*b;
                String S = Double.toString(c);

                textView.setText(S);
            }
        });
        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a,b,c;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();


                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);

                c=a/b;


                String S = Double.toString(c);

                textView.setText(S);
            }
        });


    }
}
