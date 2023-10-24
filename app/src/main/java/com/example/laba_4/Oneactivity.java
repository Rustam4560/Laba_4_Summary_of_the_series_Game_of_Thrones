package com.example.laba_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Oneactivity extends AppCompatActivity {
    TextView question1;
    Button next_Activity_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneactivity);
        next_Activity_button = (Button) findViewById(R.id.first_activity_button);
        question1 = (TextView) findViewById(R.id.question1_id);
        question1.setText("Игра престолов - американский фантастический драматический телесериал, созданный Дэвидом Бениоффом и Д. Б. Вайсом для HBO. Это экранизация Песни льда и пламени, серии фантастических романов Джорджа Р. Р. Мартина, первым из которых является Игра престолов. Съемки сериала проходили в Великобритании, Канаде, Хорватии, Исландии, Мальте, Марокко и Испании.");

        next_Activity_button.setOnClickListener(v -> {
            Intent intent = new Intent(Oneactivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}