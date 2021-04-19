package com.kghome.kghomecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    TextView textView, ansTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInsert_0(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();

        str = str + "0";
        textView.setText(str);
        setAns();
    }

    public void onInsert_1(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);

        str = str + "1";
        textView.setText(str);
        setAns();
    }

    public void onInsert_2(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "2";
        textView.setText(str);
        setAns();
    }

    public void onInsert_3(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "3";
        textView.setText(str);
        setAns();
    }

    public void onInsert_4(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "4";
        textView.setText(str);
        setAns();
    }

    public void onInsert_5(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "5";
        textView.setText(str);
        setAns();
    }

    public void onInsert_6(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "6";
        textView.setText(str);
        setAns();
    }

    public void onInsert_7(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "7";
        textView.setText(str);
        setAns();
    }

    public void onInsert_8(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "8";
        textView.setText(str);
        setAns();
    }

    public void onInsert_9(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (str.equals("0"))
            str = str.substring(0, str.length() - 1);
        str = str + "9";
        textView.setText(str);
        setAns();
    }

    public void onInsert_dot(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        str = str + ".";
        textView.setText(str);
        setAns();
    }

    @SuppressLint("SetTextI18n")
    public void onAddition(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "+");
    }

    @SuppressLint("SetTextI18n")
    public void onSubsection(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "-");
    }

    @SuppressLint("SetTextI18n")
    public void onMultiplication(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "x");
    }

    @SuppressLint("SetTextI18n")
    public void onDivision(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "÷");
    }

    @SuppressLint("SetTextI18n")
    public void onMode(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "%");
    }

    @SuppressLint("SetTextI18n")
    public void onPower(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0"))
            textView.setText(str + "^");
    }

    public void onClear(View view) {
        textView = findViewById(R.id.textView);
        ansTextView = findViewById(R.id.ansTextView);
        textView.setText("0");
        ansTextView.setText("");
    }

    public void onCut(View view) {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        if (!str.equals("0")) try {
            str = str.substring(0, str.length() - 1);
            textView.setText(str);
            if (str.length() == 0)
                textView.setText("0");
        } catch (Exception e) {
            textView.setText("0");
        }
    }

    public void onEqual(View view) {
        textView = findViewById(R.id.textView);
        ansTextView = findViewById(R.id.ansTextView);
        String ansStr = ansTextView.getText().toString();
        textView.setText(ansStr);
    }

    public void setAns() {
        textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        ansTextView = findViewById(R.id.ansTextView);
        try {
            float ans = giveAns(str);
            str = String.valueOf(ans);
            ansTextView.setText(str);
        } catch (Exception e) {
            ansTextView.setText("Error!!!\n Some thing wrong");
        }

    }

    public float giveAns(String str) {
        char[] ch = str.toCharArray();
        int i;
        for (i = 0; i < ch.length; i++) {
            if (ch[i] == '÷')
                ch[i] = '/';
            if (ch[i] == 'x')
                ch[i] = '*';
        }
        StringBuilder tempString = new StringBuilder();
        ArrayList<String> arrayString = new ArrayList<>();
        for (i = 0; i < ch.length; i++) {
            if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/' || ch[i] == '%' || ch[i] == '(' || ch[i] == ')' || ch[i] == '^') {
                arrayString.add(tempString.toString());
                tempString = new StringBuilder("" + ch[i]);
                arrayString.add(tempString.toString());
                tempString = new StringBuilder();

            } else tempString.append(ch[i]);
        }
        arrayString.add(tempString.toString());
        for (i = 0; i < ch.length; i++)
            arrayString.remove("");


        int arrayLast = arrayString.size() - 1;
        for (i = 0; i < ch.length; i++) {
            if ((arrayString.get(arrayLast).equals("*") || arrayString.get(arrayLast).equals("/") || arrayString.get(arrayLast).equals("%") || arrayString.get(arrayLast).equals("^") || arrayString.get(arrayLast).equals("+") || arrayString.get(arrayLast).equals("-") || arrayString.get(arrayLast).equals(")") || arrayString.get(arrayLast).equals("("))) {
                arrayString.remove(arrayLast);
                arrayLast = arrayString.size() - 1;
            } else break;
        }
        if (arrayString.get(0).equals("-"))
            arrayString.remove(0);

        ArrayList<String> arrayStack = new ArrayList<>();
        ArrayList<String> arrayAnswer = new ArrayList<>();
        int sizeStack;
        boolean chick;
        for (i = 0; i < arrayString.size(); i++)
            if (arrayString.get(i).equals("^") || arrayString.get(i).equals("(")) {
                arrayStack.add(arrayString.get(i));
            } else if (arrayString.get(i).equals(")")) {
                chick = true;
                sizeStack = arrayStack.size() - 1;
                while (chick)
                    if (arrayStack.get(sizeStack).equals("(")) {
                        arrayStack.remove(sizeStack);
                        chick = false;
                    } else {
                        arrayAnswer.add(arrayStack.get(sizeStack));
                        arrayStack.remove(sizeStack);
                        sizeStack--;
                    }
            } else if ((arrayString.get(i).equals("*") || arrayString.get(i).equals("/") || arrayString.get(i).equals("%")) && i != 0) {
                sizeStack = arrayStack.size() - 1;
                if (sizeStack >= 0)
                    if ((arrayString.get(i).equals("*"))) {
                        if (arrayStack.get(sizeStack).equals("^") || arrayStack.get(sizeStack).equals("/")) {
                            chick = true;
                            while (chick) {
                                arrayAnswer.add(arrayStack.get(sizeStack));
                                arrayStack.remove(sizeStack);
                                sizeStack--;
                                if (sizeStack >= 0) chick = arrayStack.get(sizeStack).equals("^");
                                else
                                    chick = false;
                            }
                        } else {
                            if (arrayStack.get(sizeStack).equals("^")) {
                                chick = true;
                                while (chick) {
                                    arrayAnswer.add(arrayStack.get(sizeStack));
                                    arrayStack.remove(sizeStack);
                                    sizeStack--;
                                    if (sizeStack >= 0)
                                        chick = arrayStack.get(sizeStack).equals("^");
                                    else
                                        chick = false;
                                }

                            }
                        }
                    }
                arrayStack.add(arrayString.get(i));
            } else if ((arrayString.get(i).equals("+") || arrayString.get(i).equals("-")) && i != 0) {
                sizeStack = arrayStack.size() - 1;
                if (sizeStack >= 0)
                    if (arrayStack.get(sizeStack).equals("*") || arrayStack.get(sizeStack).equals("/") || arrayStack.get(sizeStack).equals("%") || arrayStack.get(sizeStack).equals("^")) {
                        chick = true;
                        while (chick) {
                            arrayAnswer.add(arrayStack.get(sizeStack));
                            arrayStack.remove(sizeStack);
                            sizeStack--;
                            if (sizeStack >= 0)
                                chick = arrayStack.get(sizeStack).equals("*") || arrayStack.get(sizeStack).equals("%") || arrayStack.get(sizeStack).equals("/") || arrayStack.get(sizeStack).equals("^");
                            else
                                chick = false;
                        }
                    }
                arrayStack.add(arrayString.get(i));
            } else {
                arrayAnswer.add(arrayString.get(i));
            }
        sizeStack = arrayStack.size() - 1;
        for (i = sizeStack; i >= 0; i--) {
            arrayAnswer.add(arrayStack.get(i));
        }

        while (!arrayStack.isEmpty())
            arrayStack.remove(0);

        float floatAns = 0, op1, op2;
        int pow, storePow;
        String storeString;
        for (i = 0; i < arrayAnswer.size(); i++) {
            if (arrayAnswer.get(i).equals("+") || arrayAnswer.get(i).equals("-") || arrayAnswer.get(i).equals("*") || arrayAnswer.get(i).equals("/") || arrayAnswer.get(i).equals("%") || arrayAnswer.get(i).equals("^")) {
                sizeStack = arrayStack.size() - 1;
                if (sizeStack >= 1) {
                    storeString = arrayStack.get(sizeStack);
                    arrayStack.remove(sizeStack);
                    sizeStack--;
                    storeString = storeString + "F";
                    op2 = Float.parseFloat(storeString);
                    storeString = arrayStack.get(sizeStack);
                    arrayStack.remove(sizeStack);
                    storeString = storeString + "F";
                    op1 = Float.parseFloat(storeString);
                    if (arrayAnswer.get(i).equals("+"))
                        floatAns = op1 + op2;
                    if (arrayAnswer.get(i).equals("-"))
                        floatAns = op1 - op2;
                    if (arrayAnswer.get(i).equals("*"))
                        floatAns = op1 * op2;
                    if (arrayAnswer.get(i).equals("/"))
                        floatAns = op1 / op2;
                    if (arrayAnswer.get(i).equals("%"))
                        floatAns = op1 % op2;
                    if (arrayAnswer.get(i).equals("^")) {

                        storePow = (int) op1;
                        for (pow = 1; pow < (int) op2; pow++)
                            op1 = op1 * storePow;
                        floatAns = op1;
                    }
                    storeString = String.valueOf(floatAns);
                    arrayStack.add(storeString);
                }
            } else
                arrayStack.add(arrayAnswer.get(i));
        }
        floatAns = Float.parseFloat(arrayStack.get(0));
        System.out.println(floatAns);
        return floatAns;
    }
}