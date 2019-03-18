package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSubmitButton;

    EditText answer1;
    EditText answer2;
    EditText answer3;
    EditText answer4;

    String a1;
    String a2;
    String a3;
    String a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = (EditText) findViewById(R.id.answer1);
        answer2 = (EditText) findViewById(R.id.answer2);
        answer3 = (EditText) findViewById(R.id.answer3);
        answer4 = (EditText) findViewById(R.id.answer4);

        mSubmitButton = findViewById(R.id.submitBotton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1 = answer1.getText().toString().toUpperCase();
                a2 = answer2.getText().toString().toUpperCase();
                a3 = answer3.getText().toString().toUpperCase();
                a4 = answer4.getText().toString().toUpperCase();
                
                if (checkAnswer(a1, a2, a3, a4)) {
                    showToast("OK ALLES GOED");
                } else
                    showToast("FOUT");
            }
        });
    }

    private void showToast(String answer) {
        Toast.makeText(MainActivity.this, answer, Toast.LENGTH_SHORT).show();
    }

    private boolean checkAnswer(String answer1, String answer2, String answer3, String answer4) {
        String correctAnswer1 = "T";
        String correctAnswer2 = "F";
        String correctAnswer3 = "F";
        String correctAnswer4 = "F";

        return answer1.equals(correctAnswer1) && answer2.equals(correctAnswer2)
                && answer3.equals(correctAnswer3) && answer4.equals(correctAnswer4);
    }
}


