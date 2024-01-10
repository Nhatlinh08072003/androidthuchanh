package com.example.demo11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button btnok;
   TextView txtkq;
   EditText edtname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnok = findViewById(R.id.btnok);
        txtkq =findViewById(R.id.txtkq);
        edtname = findViewById(R.id.edtname);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtkq.setText(" HI " +edtname.getText().toString() );
            }
        });
    }
}