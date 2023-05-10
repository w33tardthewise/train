package com.msaggik.exampleserializable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // определение полей
    private EditText nameIn; // поле имени
    private EditText cityIn; // поле адреса
    private EditText costIn; // поле электронного адреса
    private Button button; // поле кнопки

    private String name; // поле хранения имени
    private String city; // поле хранения адреса
    private String cost; // поле хранения электронного адреса

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка id к полям
        nameIn = findViewById(R.id.nameIn);
        cityIn = findViewById(R.id.cityIn);
        costIn = findViewById(R.id.costIn);
        button = findViewById(R.id.button);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // переключение на другой экран и передача данных

            // считывание данных с экрана
            name = nameIn.getText().toString();
            city = cityIn.getText().toString();
            cost = costIn.getText().toString();

            // создадим объект нашей сущности и через конструктор инициализируем его
            User user = new User(name, city, cost);

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            // запаковка данных в контейнер намерения
            intent.putExtra(User.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер

            // старт переключения активити и передачи данных
            startActivity(intent);
        }
    };
}