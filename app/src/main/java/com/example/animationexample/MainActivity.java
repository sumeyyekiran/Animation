package com.example.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt1,txt2,txt3,txt4;
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=findViewById(R.id.tvCustomRippleWithBorder);
        txt2=findViewById(R.id.tvCustomRippleWithoutBorder);
        txt3=findViewById(R.id.tvRippleEffectwithBorder);
        txt4=findViewById(R.id.tvRippleEffectwithoutBorder);

        btn1=findViewById(R.id.btnExplodeJava);
        btn2=findViewById(R.id.btnFadeXML);
        btn3=findViewById(R.id.btnSlideXML);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
