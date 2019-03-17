package com.example.alimalik.smoothsailing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.sendButton);
        b2 = (Button) findViewById(R.id.luggaeButton);
        t1 = (TextView) findViewById(R.id.IDTEXT);

        BtnClick();

    }

    private void BtnClick(){
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                t1.setText("nice");


            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                t1.setText("nah");
            }
        });
    }


}
