package com.example.delivetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userNameText,passwordText;
    private Button signInButton,signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUiProps();
        initClickListners();

    }

    private void initUiProps(){
        userNameText = findViewById(R.id.user_name_text_input);
        passwordText = findViewById(R.id.password_text_input);
        signInButton = findViewById(R.id.sign_in_button);
        signUpButton = findViewById(R.id.sign_up_button);
    }

    private void initClickListners(){
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToHome();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToSignUp();
            }
        });
    }

    //Credentilas validation here
    private void navigateToHome(){
        Intent homeIntent = new Intent(this,HomeActivity.class);
        startActivity(homeIntent);
    }

    private void navigateToSignUp(){
        Intent signUpIntent = new Intent(this,SignUpActivity.class);
        startActivity(signUpIntent);
    }
}