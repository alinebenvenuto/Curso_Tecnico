package com.example.convesordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Metro_CM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro__c_m);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final EditText edtMT2_Prog = (EditText)findViewById(R.id.edtMT2);
        final EditText edtCM_Prog = (EditText)findViewById(R.id.edtCM);
        Button btnConverter3_Prog = (Button)findViewById(R.id.btnConverter3);
        Button btnNovo4_Prog = (Button)findViewById(R.id.btnNovo4);
        btnConverter3_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtMT2_Prog.getText().toString());
                double cm = m*100;
                edtCM_Prog.setText(String.valueOf(cm));
            }
        });
        btnNovo4_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCM_Prog.setText("");
                edtMT2_Prog.setText("");
                edtMT2_Prog.requestFocus();
            }
        });

    }
}