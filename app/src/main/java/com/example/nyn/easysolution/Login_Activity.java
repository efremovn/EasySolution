package com.example.nyn.easysolution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity {
    private Button loginButton;

    protected void onCreate (Bundle saveInstanceState) {
         super.onCreate(saveInstanceState);
         setContentView(R.layout.login);
         loginButton= findViewById(R.id.Login);
         loginButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startUp();
             }
         });

    }
    private void startUp () {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);


    }



}
