package com.example.Milyutina_app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText mNumber1EditText;
    private EditText mNumber2EditText;
    private TextView mResultTextView;
    private TextView time;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mNumber1EditText = findViewById(R.id.eTNumber1);
        mNumber2EditText = findViewById(R.id.eTNumber2);
        mResultTextView = findViewById(R.id.tVResult);
    }

    public void add(View view) {
        try {
            Integer N1 = 0;
            Integer N2 = 0;
            N1 = Integer.parseInt(mNumber1EditText.getText().toString());
            N2 = Integer.parseInt(mNumber2EditText.getText().toString());
            mResultTextView.setText(getString(R.string.result, N1 + N2));
        }
        catch (NumberFormatException e) {
            mResultTextView.setText(R.string.input_error);
        }
    }
    public void subtract(View view) {
        try {
            Integer N1 = 0;
            Integer N2 = 0;
            N1 = Integer.parseInt(mNumber1EditText.getText().toString());
            N2 = Integer.parseInt(mNumber2EditText.getText().toString());
            mResultTextView.setText(getString(R.string.result, N1 - N2));
        }
        catch (NumberFormatException e) {
            mResultTextView.setText(R.string.input_error);
        }
    }
}
