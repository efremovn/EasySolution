package com.example.nyn.easysolution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    private Button loginButton;
    private EditText Username;
    private EditText Password;
    String userName= "Nikolai";
    String userPassword= "1234";


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
        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        String username= Username.getText().toString();
        String password= Password.getText().toString();

        if ((username.equals(userName)) && (password.equals(userPassword))) {
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Wrong password", Toast.LENGTH_LONG).show();
        }


    }



}
