package com.example.android_user.marvinsoawesome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Num1,Num2;

    private Button Addition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        Num1=findViewById(R.id.Num1);
        Num2=findViewById(R.id.Num2);
        Addition=findViewById(R.id.Addition);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Number1 = Integer.parseInt(Num1.getText().toString());
                int Number2 = Integer.parseInt(Num2.getText().toString());
                int sum = Number1 + Number2;
                Toast.makeText(MainActivity.this,"The Answer is " + String.valueOf(sum).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
