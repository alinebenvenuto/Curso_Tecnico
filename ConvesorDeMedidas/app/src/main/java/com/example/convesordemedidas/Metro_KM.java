package com.example.convesordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Metro_KM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro__k_m);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final EditText edtMT_Prog = (EditText)findViewById(R.id.edtMT);
        final EditText edtKM2_Prog = (EditText)findViewById(R.id.edtKM2);
        Button btnConverter2_Prog = (Button)findViewById(R.id.btnConverter2);
        Button btnNovo2_Prog = (Button)findViewById(R.id.btnNovo2);
        btnConverter2_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m = Double.parseDouble(edtMT_Prog.getText().toString());
                double km = m/1000;
                edtKM2_Prog.setText(String.valueOf(km));
            }
        });
        btnNovo2_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtKM2_Prog.setText("");
                edtMT_Prog.setText("");
                edtMT_Prog.requestFocus();
            }
        });

    }
}