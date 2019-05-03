package com.example.animationexample;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.transition.Explode;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity  {

    TextView name;
    Button cikis;
    ImageView star;
    String tur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        name=findViewById(R.id.name);
        cikis=findViewById(R.id.cikis);
        star=findViewById(R.id.ivStar);

        ozellestir();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        animasyonlar();
        getWindow().setAllowEnterTransitionOverlap(false);

    }

    public void animasyonlar() {
        tur=getIntent().getStringExtra("tur");
        switch (tur){
            case "EXPLODEJAVA":
                if(Build.VERSION.SDK_INT>=21) {
                    Explode enterTransition = new Explode();
                    enterTransition.setDuration(1500);
                    getWindow().setEnterTransition(enterTransition);
                }
                break;

            case "EXPLODEXML":
                if(Build.VERSION.SDK_INT>=21) {
                    Transition enterTransition = TransitionInflater.from(this).inflateTransition(R.transition.explode);
                    getWindow().setEnterTransition(enterTransition);
                }
                break;
        }

    }

    private void ozellestir() {


        Bundle extras = getIntent().getExtras();
        String value = extras.getString("name");
        name.setText(value);
        String baslik = extras.getString("baslik");
        getSupportActionBar().setTitle(baslik);




        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAfterTransition();
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
