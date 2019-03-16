package com.example.alimalik.smoothsailing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.sendButton);
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
    }
}
