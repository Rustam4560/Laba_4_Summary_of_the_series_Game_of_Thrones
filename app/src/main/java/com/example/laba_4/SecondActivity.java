package com.example.laba_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView question2;
    Button next_button, previous_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        next_button = (Button) findViewById(R.id.second_activity_next_button);
        previous_button = (Button) findViewById(R.id.second_activity_previous_button);
        question2 = (TextView) findViewById(R.id.question2_id);

        question2.setText("Сериал следует нескольким сюжетным линиям одновременно.Первая сюжетная арка повествует о войне за престолонаследие между конкурирующими претендентами на контроль над Железным троном Семи королевств, в то время как другие знатные семьи борются за независимость от трона. Вторая касается действий изгнанного отпрыска по возвращению трона; третья повествует об угрозе надвигающейся зимы, а также свирепых народах Севера.");

        next_button.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

        previous_button.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, Oneactivity.class);
            startActivity(intent);
        });
    }
}