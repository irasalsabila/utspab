package com.college.picodiploma.uts18523066;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
    }

    public void launchSecondActivity(View view){
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        if (usernameKey.equals("carbon") && passwordKey.equals("footprint")) {
            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            MainActivity.this.startActivity(intent);
            //finish();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Username or Password is wrong!")
                    .setNegativeButton("Retry", null).create().show();
        }
    }
}