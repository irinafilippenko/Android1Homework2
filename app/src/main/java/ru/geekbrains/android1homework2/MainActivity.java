package ru.geekbrains.android1homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String displaySymbols = new String("");

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
        TextView displayNumbers = (TextView) this.findViewById(R.id.display_numbers);

        buttonClear.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="C"));

        buttonParentheses.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="()"));

        buttonPercent.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="%"));

        buttonDivision.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="/"));

        buttonSeven.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="7"));

        buttonEight.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="8"));

        buttonNine.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="9"));

        buttonMultiplication.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="X"));

        buttonFour.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="4"));

        buttonFive.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="5"));

        buttonSix.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="6"));

        buttonSubtraction.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="-"));

        buttonOne.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="1"));

        buttonTwo.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="2"));

        buttonThree.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="3"));

        buttonAddition.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="+"));

        buttonZero.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="0"));

        buttonDot.setOnClickListener(v -> displayNumbers.setText(displaySymbols+=","));

        buttonBackspace.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="Bs"));

        buttonEqual.setOnClickListener(v -> displayNumbers.setText(displaySymbols+="="));
    }
}