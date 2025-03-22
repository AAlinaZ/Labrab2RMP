package com.aalinaz.generatecompliment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ComplimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compliment);

        TextView textViewCompliment = findViewById(R.id.textViewCompliment);
        Button buttonBack = findViewById(R.id.buttonBack);

        String[] compliments = {
                "Вы прекрасны!",
                "Вы умны!",
                "Сегодня вы искромётны!",
                "Вы сногшибательны!",
                "Вы волнуете больше, чем дедлайн в 23:58!",
                "Горжусь вами больше, чем своей лабораторной!",
                "Вы просто 20 из 10!",
                "У вас все получится!",
                "Вы сияете!",
                "Вы притягиваете сильнее, чем беляшка у политеха!",
                "Вы восхитительны!",
                "Вы уникальны!",
                "Вы вдохновляете!",
                "Вы просто чудо!",
                "Вы невероятны!",
                "Вы заслуживаете лучшего!",
                "Вы делаете мир лучше!",
                "Вы — пример для подражания!",
                "Вы всегда на высоте!"
        };
        String randomCompliment = compliments[new Random().nextInt(compliments.length)];
        textViewCompliment.setText(randomCompliment);
        buttonBack.setOnClickListener(v -> finish());
    }
}