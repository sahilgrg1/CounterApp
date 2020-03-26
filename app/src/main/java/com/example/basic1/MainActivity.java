package com.example.basic1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String Tag = getClass().getSimpleName();
    int count = 0;
   private Button btn1, btn2 , btn3;
   private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.incree);
        btn2 = findViewById(R.id.decree);
        btn3 = findViewById(R.id.reset);
        txt = findViewById(R.id.textee);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txt.setText(count+"");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count == 0)
                count = 0 ;
                else
                    count -- ;

                txt.setText(count+"");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0 ;
                txt.setText(count+"");
            }
        });

    }

}
