package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText degreea;
    private EditText degreeb;
    private TextView answer;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.degreea = this.findViewById(R.id.degreea);
        this.degreeb = this.findViewById(R.id.degreeb);
        this.answer = this.findViewById(R.id.answer);
    }
    public void Calcbutton(View v)
    {


        if(v == calculate)
        {
            this.answer.setText("");
            Integer valuea = Integer.valueOf(this.degreea.getText().toString());
            Integer valueb = Integer.valueOf(this.degreeb.getText().toString());

            Integer prt1 = (valuea*valuea) + (valueb*valueb);
            double solution = Math.sqrt(prt1);
            this.answer.setText((int) solution);
        }

    }



}