package ru.geekbrains.android1homework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String DISPLAYSYMBOLS = "DISPLAYSYMBOLS";
    public static final String ISDOT = "ISDOT";
    private String displaySymbols = new String("");
    private String lastSymbol;
    private String addDisplayNumbers;
    private boolean isDot;
    private boolean isParenthese;
    private char operation1 = '0';
    private Double number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        if (intent != null) {
            String chooseTheme = intent.getStringExtra(ChooseTheme.NAMEKEY);
            if (chooseTheme.equals("day")) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            if (chooseTheme.equals("night")) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        }
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

        if (savedInstanceState != null && savedInstanceState.containsKey(DISPLAYSYMBOLS) && savedInstanceState.containsKey(ISDOT)) {
            displaySymbols = savedInstanceState.getString(DISPLAYSYMBOLS);
            isDot = savedInstanceState.getBoolean(ISDOT);
        }

        displayNumbers.setText(displaySymbols);

        buttonClear.setOnClickListener(v -> {
            displaySymbols = "";
            displayNumbers.setText(displaySymbols);
            isDot = false;
            isParenthese = false;
        });

//        buttonParentheses.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (displaySymbols.length() > 0) {
//                    lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
//                    if (!isParenthese && !(lastSymbol.equals(")")) && !(lastSymbol.equals(".")) && (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+"))) {
//                        displayNumbers.setText(displaySymbols+="(");
//                        isParenthese = true;
//                    }
//                    if (isParenthese && !(lastSymbol.equals("(")) && !(lastSymbol.equals(".") || lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+"))) {
//                        displayNumbers.setText(displaySymbols+=")");
//                        isParenthese = false;
//                    }
//                }
//                else {
//                    displayNumbers.setText(displaySymbols+="(");
//                    isParenthese = true;
//                }
//            }
//        } );

        buttonPercent.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                    displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                }
                displayNumbers.setText(displaySymbols += "%");
                isDot = false;
            }
        });

        buttonDivision.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                    displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                }
                displayNumbers.setText(displaySymbols += "/");
                isDot = false;
            }
        });

        buttonSeven.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "7");
                }
            } else {
                displayNumbers.setText(displaySymbols += "7");
            }
        });

        buttonEight.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "8");
                }
            } else {
                displayNumbers.setText(displaySymbols += "8");
            }
        });

        buttonNine.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "9");
                }
            } else {
                displayNumbers.setText(displaySymbols += "9");
            }
        });

        buttonMultiplication.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                    displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                }
                displayNumbers.setText(displaySymbols += "X");
                isDot = false;
            }
        });

        buttonFour.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "4");
                }
            } else {
                displayNumbers.setText(displaySymbols += "4");
            }
        });

        buttonFive.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "5");
                }
            } else {
                displayNumbers.setText(displaySymbols += "5");
            }
        });

        buttonSix.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "6");
                }
            } else {
                displayNumbers.setText(displaySymbols += "6");
            }
        });

        buttonSubtraction.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                    displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                }
                displayNumbers.setText(displaySymbols += "-");
                isDot = false;
            }
        });

        buttonOne.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "1");
                }
            } else {
                displayNumbers.setText(displaySymbols += "1");
            }
        });

        buttonTwo.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "2");
                }
            } else {
                displayNumbers.setText(displaySymbols += "2");
            }
        });

        buttonThree.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "3");
                }
            } else {
                displayNumbers.setText(displaySymbols += "3");
            }
        });

        buttonAddition.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                    displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                }
                displayNumbers.setText(displaySymbols += "+");
                isDot = false;
            }
        });

        buttonZero.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!lastSymbol.equals(")")) {
                    displayNumbers.setText(displaySymbols += "0");
                }
            } else {
                displayNumbers.setText(displaySymbols += "0");
            }
        });

        buttonDot.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                lastSymbol = displaySymbols.substring(displaySymbols.length() - 1);
                if (!(lastSymbol.equals(")")) && !(lastSymbol.equals("("))) {
                    if (!isDot) {
                        if (lastSymbol.equals("%") || lastSymbol.equals("/") || lastSymbol.equals("X") || lastSymbol.equals("-") || lastSymbol.equals("+")) {
                            displaySymbols += "0";
                        }
                        displayNumbers.setText(displaySymbols += ".");
                        isDot = true;
                    }
                }
            } else {
                displayNumbers.setText(displaySymbols += "0.");
            }
        });

        buttonBackspace.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                displaySymbols = displaySymbols.substring(0, displaySymbols.length() - 1);
                displayNumbers.setText(displaySymbols);
            }
        });

        buttonEqual.setOnClickListener(v -> {
            if (displaySymbols.length() > 0) {
                int j = 0;
                int isNumber = 1;

                List<String> arrNumbersOperations = new ArrayList();

                arrNumbersOperations.add(displaySymbols.substring(0, 1));

                for (int i = 1; i < displaySymbols.length(); i++) {
                    if (isNumber == 1) {
                        if (Character.isDigit(displaySymbols.charAt(i)) || displaySymbols.charAt(i) == '.') {
                            addDisplayNumbers = arrNumbersOperations.get(j) + displaySymbols.charAt(i);
                            arrNumbersOperations.set(j, addDisplayNumbers);
                        } else {
                            j++;
                            isNumber = 0;
                            arrNumbersOperations.add(displaySymbols.substring(i, i + 1));
                        }
                    } else {
                        j++;
                        isNumber = 1;
                        arrNumbersOperations.add(displaySymbols.substring(i, i + 1));
                    }
                }

                number1 = Double.valueOf(arrNumbersOperations.get(0));
                if (arrNumbersOperations.size() != 1) {
                    for (int i = 1; i < arrNumbersOperations.size(); i++) {
                        if (operation1 == '0') {
                            switch (arrNumbersOperations.get(i)) {
                                case ("+"):
                                    operation1 = '+';
                                    break;
                                case ("-"):
                                    operation1 = '-';
                                    break;
                                case ("X"):
                                    operation1 = 'X';
                                    break;
                                case ("/"):
                                    operation1 = '/';
                                    break;
                                case ("%"):
                                    operation1 = '%';
                                    break;
                            }
                        } else {
                            number2 = Double.valueOf(arrNumbersOperations.get(i));
                            switch (operation1) {
                                case ('+'):
                                    number1 += number2;
                                    break;
                                case ('-'):
                                    number1 -= number2;
                                    break;
                                case ('X'):
                                    number1 *= number2;
                                    break;
                                case ('/'):
                                    if (number2 == 0) {
                                        displayNumbers.setText("Нельзя делить на ноль");
                                        return;
                                    }
                                    number1 /= number2;
                                    break;
                                case ('%'):
                                    number1 %= number2;
                                    break;
                            }
                            operation1 = '0';
                        }
                    }
                }

                displaySymbols = number1.toString();
                displayNumbers.setText(displaySymbols);
            }

        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(DISPLAYSYMBOLS, displaySymbols);
        outState.putBoolean(ISDOT, isDot);
    }
}