package com.example.eathindhar.libro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText logtext, passtext;
    String login, pass;
    Button logbtn, regbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logtext = (EditText)findViewById(R.id.logtext);
        passtext = (EditText)findViewById(R.id.passtext);
        logbtn = (Button)findViewById(R.id.logbtn);
        regbtn = (Button)findViewById(R.id.regbtn);
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login = logtext.getText().toString();
                pass = passtext.getText().toString();
                Intent i = new Intent(MainActivity.this, HomePage.class);
                i.putExtra("login",login);
                startActivity(i);

            }
        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, regActivity.class);
                startActivity(i2);
            }
        });



    }
}
