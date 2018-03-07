package com.example.nithin.digitalgrama;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button login= findViewById(R.id.login);
        final EditText user= findViewById(R.id.uname);
        final EditText pwd= findViewById(R.id.pwd);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = pwd.getText().toString();
                String username = user.getText().toString();
                if (username.equals("admin") && pass.equals("12345")){

                    Toast.makeText(LoginActivity.this, "Log-in Successful", Toast.LENGTH_SHORT).show();

                    Intent home=new Intent(LoginActivity.this,HomeActivity.class);
                    LoginActivity.this.startActivity(home);
                    LoginActivity.this.finish();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Please enter valid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
