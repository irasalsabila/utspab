package com.college.picodiploma.uts18523066;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void launchThirdActivity(View view) {
        Toast.makeText(getApplicationContext(), "Redirecting you to the Definition", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        SecondActivity.this.startActivity(intent);
    }

    public void launchFourthActivity(View view) {
        Toast.makeText(getApplicationContext(), "Redirecting you to Calculator", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
        SecondActivity.this.startActivity(intent);
    }

    public void launchFifthActivity(View view) {
        Toast.makeText(getApplicationContext(), "Redirecting you to About Creator", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SecondActivity.this, FifthActivity.class);
        SecondActivity.this.startActivity(intent);
    }

    public void launchSixthActivity(View view) {
        Toast.makeText(getApplicationContext(), "Redirecting you to News Portal", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SecondActivity.this, SixthActivity.class);
        SecondActivity.this.startActivity(intent);
    }
}