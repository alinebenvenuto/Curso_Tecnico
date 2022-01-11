package com.example.convesordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class CM_Metro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_m__metro);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final EditText edtCM3_Prog = (EditText)findViewById(R.id.edtCM3);
        final EditText edtMT4_Prog = (EditText)findViewById(R.id.edtMT4);
        Button btnConverter4_Prog = (Button)findViewById(R.id.btnConverter4);
        Button btnNovo3_Prog = (Button)findViewById(R.id.btnNovo3);
        btnConverter4_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cm = Double.parseDouble(edtCM3_Prog.getText().toString());
                double mt = cm/100;
                edtMT4_Prog.setText(String.valueOf(mt));
            }
        });
        btnNovo3_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMT4_Prog.setText("");
                edtCM3_Prog.setText("");
                edtCM3_Prog.requestFocus();
            }
        });

    }
}