package com.example.eathindhar.libro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regActivity extends AppCompatActivity {
    Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        registerButton =(Button)findViewById(R.id.register_btn);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(regActivity.this, HomePage.class);
                startActivity(i);
            }
        });

    }
}
