package com.example.convesordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Km extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km);
        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();
        //TELA CHEIA
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final EditText edtKm_Prog = (EditText)findViewById(R.id.edtKM);
        final EditText edtM_Prog = (EditText)findViewById(R.id.edtM);
        Button btnConverter_Prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);
        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double km = Double.parseDouble(edtKm_Prog.getText().toString());
                double m = km*1000;
                edtM_Prog.setText(String.valueOf(m));
            }
        });
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM_Prog.setText("");
                edtKm_Prog.setText("");
                edtKm_Prog.requestFocus();
            }
        });



    }
}