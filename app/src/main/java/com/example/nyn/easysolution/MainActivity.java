package com.example.nyn.easysolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView option1;
    private TextView option2;
    private TextView option3;

    Subject mathematics;
    Subject physics;
    Subject chemestry;
    public MainActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathematics = new Subject(getString(R.string.LinearAlgebra), getString(R.string.Calculus1), getString(R.string.Calculus2));
        physics= new Subject(getString(R.string.Thermodynamics), getString(R.string.Optics), getString(R.string.Electricity));
        chemestry= new Subject(getString(R.string.Organic), getString(R.string.Inorganic), getString(R.string.Biochemestry));


        option1= findViewById(R.id.option1);
        option2= findViewById(R.id.option2);
        option3= findViewById(R.id.option3);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSubTopics(mathematics);
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSubTopics(physics);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeSubTopics(chemestry);
            }
        });
    }

    private void changeSubTopics(Subject subject){
        option1.setText(subject.getSubtopic1());
        option2.setText(subject.getSubtopic2());
        option3.setText(subject.getSubtopic3());
    }
}
