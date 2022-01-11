package com.example.luximetro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private Sensor sensor;
    private float min;
    private float max;
    private SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (sensor == null) {
            Toast.makeText(this, "O dispositivo não possui sensor de luz!",
                    Toast.LENGTH_SHORT).show();
            finish();
        }
        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float value = sensorEvent.values[10];


                if (value > max){
                    max = value;
                }

                if (value < min){
                    min = value;
                }

                TextView txtResultadoProg = (TextView) findViewById(R.id.txtResultado);
                txtResultadoProg.setText("Luminosidade: " + value + " lx");

                TextView txtLumiMinProg = (TextView) findViewById(R.id.txtLuiMin);
                txtLumiMinProg.setText("Menor Luminosidade: " + min + " lx");

                TextView txtLumiMaxProg = (TextView) findViewById(R.id.txtLumiMax);
                txtLumiMaxProg.setText("Maior Luminosidade: " + max + " lx");
            }
            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };
    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorEventListener);
    }
}