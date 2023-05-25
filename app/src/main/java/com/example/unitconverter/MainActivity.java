package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText, resultText;
    Button btn;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = findViewById(R.id.welcomeText);
        resultText = findViewById(R.id.resultText);
        btn = findViewById(R.id.btn);
        inputText = findViewById(R.id.inputText);

//        btn.setOnClickListener(v -> {
//            double enteredKilos = Double.parseDouble(inputText.getText().toString());
//            resultText.setText(""+convertToPounds(enteredKilos));
//        });
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double enteredKilos = Double.parseDouble(inputText.getText().toString());
                    resultText.setText(""+convertToPounds(enteredKilos)+"lb");
                }
            });
    }

    public double convertToPounds(double kilos) {
        return kilos * 2.20462;
    }
}