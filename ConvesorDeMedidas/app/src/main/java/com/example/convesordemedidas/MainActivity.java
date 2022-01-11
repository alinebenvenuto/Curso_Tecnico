package com.example.convesordemedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();
        //TELA CHEIA
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button btnKmM_Prog = (Button) findViewById(R.id.btnKmM);

        btnKmM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Km.class);
                startActivity(it);
            }
        });

        Button btnMKm_Prog = (Button) findViewById(R.id.btnMKm);

        btnMKm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Metro_KM.class);
                startActivity(it);
            }
        });

        Button btnMCm_Prog = (Button) findViewById(R.id.btnMCM);

        btnMCm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,Metro_CM.class);
                startActivity(it);
            }
        });

        Button btnCmM_Prog = (Button) findViewById(R.id.btnCmM);

        btnCmM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,CM_Metro.class);
                startActivity(it);
            }
        });
    }
}