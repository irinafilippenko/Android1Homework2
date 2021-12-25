package ru.geekbrains.android1homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ChooseTheme extends AppCompatActivity {

    public static final String NAMEKEY = "NAMEKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_theme);

        MaterialButton buttonLight = (MaterialButton) this.findViewById(R.id.button_light);
        MaterialButton buttonNight = (MaterialButton) this.findViewById(R.id.button_night);

        buttonLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent themeIntent = new Intent(ChooseTheme.this, MainActivity.class);
                themeIntent.putExtra(NAMEKEY, "day");
                startActivity(themeIntent);
            }
        });

        buttonNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent themeIntent = new Intent(ChooseTheme.this, MainActivity.class);
                themeIntent.putExtra(NAMEKEY, "night");
                startActivity(themeIntent);
            }
        });
    }
}