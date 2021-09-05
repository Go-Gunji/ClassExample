package com.example.classexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Car redCar = new SafeCar("赤い車");

    Button up;
    Button down;
    TextView speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // アクティビティとビューの接続
        setContentView(R.layout.activity_main);

        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        speed = (TextView) findViewById(R.id.speed);

        up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                redCar.speedUp();
                speed.setText(redCar.getInfo()
                + "の速度は"
                + redCar.getSpeed()
                + "キロメートル毎時");
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                redCar.speedDown();
                speed.setText(redCar.getInfo()
                        + "の速度は"
                        + redCar.getSpeed()
                        + "キロメートル毎時");
            }
        });
    }
}