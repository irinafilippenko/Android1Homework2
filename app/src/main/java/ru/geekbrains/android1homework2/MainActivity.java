package ru.geekbrains.android1homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    public static final String DISPLAYSYMBOLS = "DISPLAYSYMBOLS";
    private String displaySymbols = new String("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton buttonClear = (MaterialButton) this.findViewById(R.id.button_clear);
        MaterialButton buttonParentheses = (MaterialButton) this.findViewById(R.id.button_parentheses);
        MaterialButton buttonPercent = (MaterialButton) this.findViewById(R.id.button_percent);
        MaterialButton buttonDivision = (MaterialButton) this.findViewById(R.id.button_division);
        MaterialButton buttonSeven = (MaterialButton) this.findViewById(R.id.button_seven);
        MaterialButton buttonEight = (MaterialButton) this.findViewById(R.id.button_eight);
        MaterialButton buttonNine = (MaterialButton) this.findViewById(R.id.button_nine);
        MaterialButton buttonMultiplication = (MaterialButton) this.findViewById(R.id.button_multiplication);
        MaterialButton buttonFour = (MaterialButton) this.findViewById(R.id.button_four);
        MaterialButton buttonFive = (MaterialButton) this.findViewById(R.id.button_five);
        MaterialButton buttonSix = (MaterialButton) this.findViewById(R.id.button_six);
        MaterialButton buttonSubtraction = (MaterialButton) this.findViewById(R.id.button_subtraction);
        MaterialButton buttonOne = (MaterialButton) this.findViewById(R.id.button_one);
        MaterialButton buttonTwo = (MaterialButton) this.findViewById(R.id.button_two);
        MaterialButton buttonThree = (MaterialButton) this.findViewById(R.id.button_three);
        MaterialButton buttonAddition = (MaterialButton) this.findViewById(R.id.button_addition);
        MaterialButton buttonZero = (MaterialButton) this.findViewById(R.id.button_zero);
        MaterialButton buttonDot = (MaterialButton) this.findViewById(R.id.button_dot);
        MaterialButton buttonBackspace = (MaterialButton) this.findViewById(R.id.button_backspace);
        MaterialButton buttonEqual = (MaterialButton) this.findViewById(R.id.button_equal);
        TextView displayNumbers = (TextView) this.findViewById(R.id.display_numbers);

        if (savedInstanceState != null && savedInstanceState.containsKey(DISPLAYSYMBOLS)) {
            displaySymbols = savedInstanceState.getString(DISPLAYSYMBOLS);
        }

        displayNumbers.setText(displaySymbols);

        buttonClear.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "C"));

        buttonParentheses.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "()"));

        buttonPercent.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "%"));

        buttonDivision.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "/"));

        buttonSeven.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "7"));

        buttonEight.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "8"));

        buttonNine.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "9"));

        buttonMultiplication.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "X"));

        buttonFour.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "4"));

        buttonFive.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "5"));

        buttonSix.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "6"));

        buttonSubtraction.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "-"));

        buttonOne.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "1"));

        buttonTwo.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "2"));

        buttonThree.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "3"));

        buttonAddition.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "+"));

        buttonZero.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "0"));

        buttonDot.setOnClickListener(v -> displayNumbers.setText(displaySymbols += ","));

        buttonBackspace.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "Bs"));

        buttonEqual.setOnClickListener(v -> displayNumbers.setText(displaySymbols += "="));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(DISPLAYSYMBOLS, displaySymbols);
    }
}