package com.example.laba_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    // define the global variable
    TextView question3;
    // Add button Move previous activity
    Button previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        previous_button = (Button) findViewById(R.id.third_activity_previous_button);
        question3 = (TextView) findViewById(R.id.question3_id);
        question3.setText("Сериал получил 59 премий \"Эмми прайм-тайм\", больше всего за драматический сериал, включая Выдающийся драматический сериал в 2015, 2016, 2018 и 2019 годах. Ее другие награды и номинации включают три премии Хьюго за лучшую драматическую постановку, премию Пибоди и пять номинаций на премию \"Золотой глобус\" за лучший телесериал – драму.");
        previous_button.setOnClickListener(v -> {
            Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
// start the activity connect to the specified class
            startActivity(intent);
        });
    }
}