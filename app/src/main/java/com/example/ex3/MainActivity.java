package com.example.ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 =  findViewById(R.id.btn);

        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num>5){
                    btn1.setText("Enough to click. Go to new start!");
                    num = 0;
                }
               else {
                    Toast.makeText(getApplicationContext(), "Etay is not a good student btw", Toast.LENGTH_SHORT)
                            .show();
                    num = num + 1;
                    btn1.setText("This is a click number: " + num);
                }
            }
        }));
    }
}