package com.example.delivetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText userNameText,passwordText,confirmPasswordText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initUiProps();
        initClickListners();
    }

    private void initUiProps(){
        userNameText = findViewById(R.id.user_name_sign_up_text_input);
        passwordText = findViewById(R.id.password_sign_up_text_input);
        confirmPasswordText = findViewById(R.id.password_confirm_sign_up_text_input);
        registerButton = findViewById(R.id.register_user_button);
    }

    private void initClickListners(){
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToHome();
            }
        });
    }

    private void navigateToHome(){
        Intent homeIntent = new Intent(this,HomeActivity.class);
        startActivity(homeIntent);
    }
}