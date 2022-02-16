package com.example.profundus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Username, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.LoginBtn);
        Button cancel = findViewById(R.id.CancelBtn);
        Username = findViewById(R.id.EdTxtName);
        Password = findViewById(R.id.editTxtPassword);

        login.setOnClickListener(view -> {
            String reg = Username.getText().toString();
            String pass = Password.getText().toString();
            if(reg.equals("Shah") && pass.equals("12345678")){
                Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
            if(pass.equals("")){
//                    Toast.makeText(MainActivity.this, "Incorrect Login Details Entered!", Toast.LENGTH_SHORT).show();
                Password.setError("Password can't be empty");
            }
            if(reg.equals("")){
//                    Toast.makeText(MainActivity.this, "Incorrect Login Details Entered!", Toast.LENGTH_SHORT).show();
                Username.setError("Username can't be empty");
            }
        });
        cancel.setOnClickListener(view -> finish());
    }
}