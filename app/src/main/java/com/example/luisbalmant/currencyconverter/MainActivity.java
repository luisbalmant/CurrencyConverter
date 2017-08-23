package com.example.luisbalmant.currencyconverter;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // valor declarado do dollar no formato double.
    double dollar = 0.767014;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextViews inicialmente declaradas
        TextView pounds_TextView = findViewById(R.id.pounds_TextView);
        pounds_TextView.setText("Pounds");

        TextView dollar_TextView = findViewById(R.id.dollar_TextView);
        dollar_TextView.setText("Dollars");
    }

    public void actionConvert_Button(View view) {
//        Log.i("Info", "Button Test!");
        // defini o input aonde irei colocar o valor em pounds
        EditText input_EditText = findViewById(R.id.input_EditText);

        // joguei na text view o falor digitado concatenado com um texto.
        TextView pounds_TextView = findViewById(R.id.pounds_TextView);
        pounds_TextView.setText(input_EditText.getText().toString() + " Pounds");

        // peguei o input e converti abaixo para um double.
        double outEditTex = Double.parseDouble(input_EditText.getText().toString());

        // peguei os valores convertidos e fiz o cálculo.
        double convertion = outEditTex / dollar;

        // Criei um string com a formatação ex: 1.304 (três casas decimais)
        String result = String.format("%.3f", convertion);

        // abaixo joguei o valor de dollar em outra text view. Nesse caso não precisou converter.
        TextView dollar_TextView = findViewById(R.id.dollar_TextView);
        dollar_TextView.setText(result + " Dollars");

        Toast.makeText(this, "In dollar you have: U$" + result, Toast.LENGTH_LONG).show();

    }
}
