package ru.geekbrains.android1homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClear = (Button) this.findViewById(R.id.button_clear);
        Button buttonParentheses = (Button) this.findViewById(R.id.button_parentheses);
        Button buttonPercent = (Button) this.findViewById(R.id.button_percent);
        Button buttonDivision = (Button) this.findViewById(R.id.button_division);
        Button buttonSeven = (Button) this.findViewById(R.id.button_seven);
        Button buttonEight = (Button) this.findViewById(R.id.button_eight);
        Button buttonNine = (Button) this.findViewById(R.id.button_nine);
        Button buttonMultiplication = (Button) this.findViewById(R.id.button_multiplication);
        Button buttonFour = (Button) this.findViewById(R.id.button_four);
        Button buttonFive = (Button) this.findViewById(R.id.button_five);
        Button buttonSix = (Button) this.findViewById(R.id.button_six);
        Button buttonSubtraction = (Button) this.findViewById(R.id.button_subtraction);
        Button buttonOne = (Button) this.findViewById(R.id.button_one);
        Button buttonTwo = (Button) this.findViewById(R.id.button_two);
        Button buttonThree = (Button) this.findViewById(R.id.button_three);
        Button buttonAddition = (Button) this.findViewById(R.id.button_addition);
        Button buttonZero = (Button) this.findViewById(R.id.button_zero);
        Button buttonDot = (Button) this.findViewById(R.id.button_dot);
        Button buttonBackspace = (Button) this.findViewById(R.id.button_backspace);
        Button buttonEqual = (Button) this.findViewById(R.id.button_equal);
    }
}