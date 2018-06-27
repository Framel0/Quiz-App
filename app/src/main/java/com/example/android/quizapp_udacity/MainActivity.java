package com.example.android.quizapp_udacity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String resultsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);


        Button submit = findViewById(R.id.submit_answers);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getResults();

                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, resultsDisplay, duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });

    }

    /**
     * This method sums up the result.
     */
    private void getResults() {

        int answer1Score;
        int answer2Score;
        int answer3Score;
        int answer4Score;
        int answer5Score;
        int answer6Score;
        int answer7Score;
        int answer8Score;
        int answer9Score;
        int answer10Score;
        int finalScore;

        // Question 1 - Correct Answer is #1 (canines)
        Boolean answer1;

        RadioButton question1Choice1 = findViewById(R.id.question1_choice1);

        answer1 = question1Choice1.isChecked();
        if (answer1) {
            answer1Score = 1;
        } else {
            answer1Score = 0;
        }

        // Question 2 - Correct Answer is "vulcanizing"
        String answer2;

        EditText question2Answer = findViewById(R.id.question2_answer);

        answer2 = question2Answer.getText().toString().toLowerCase();
        if (answer2.equals("vulcanizing")) {
            answer2Score = 1;
        } else {
            answer2Score = 0;
        }

        // Question 3  - Correct Answers are #2 (germanium) and #3 (silicon)
        Boolean answer3Choice1;
        Boolean answer3Choice2;
        Boolean answer3Choice3;
        Boolean answer3Choice4;

        CheckBox question3Choice1 = findViewById(R.id.question3_choice1);
        CheckBox question2Choice2 = findViewById(R.id.question3_choice2);
        CheckBox question3Choice3 = findViewById(R.id.question3_choice3);
        CheckBox question3Choice4 = findViewById(R.id.question3_choice4);

        answer3Choice1 = question3Choice1.isChecked();
        answer3Choice2 = question2Choice2.isChecked();
        answer3Choice3 = question3Choice3.isChecked();
        answer3Choice4 = question3Choice4.isChecked();

        if (!answer3Choice1 && answer3Choice2 && answer3Choice3 && !answer3Choice4) {
            answer3Score = 1;
        } else {
            answer3Score = 0;
        }

        // Question 4 - Correct Answer is "gravity"
        String answer4;

        EditText question4Answer = findViewById(R.id.question4_answer);

        answer4 = question4Answer.getText().toString().toLowerCase();
        if (answer4.equals("gravity")) {
            answer4Score = 1;
        } else {
            answer4Score = 0;
        }

        // Question 5  - Correct Answers is #4 "volume"
        Boolean answer5;

        RadioButton question5Choice4 = findViewById(R.id.question5_choice4);

        answer5 = question5Choice4.isChecked();
        if (answer5) {
            answer5Score = 1;
        } else {
            answer5Score = 0;
        }

        // Question 6 - Correct Answer is "Clouds" or "Cloud"
        String answer6;

        EditText question6Answer = findViewById(R.id.question6_answer);

        answer6 = question6Answer.getText().toString().toLowerCase();
        if (answer6.equals("clouds") || answer6.equals("cloud")) {
            answer6Score = 1;
        } else {
            answer6Score = 0;
        }

        // Question 7  - Correct Answers are #1 (solar) and #3 (wind)
        Boolean answer7Choice1;
        Boolean answer7Choice2;
        Boolean answer7Choice3;

        CheckBox question7Choice1 = findViewById(R.id.question7_choice1);
        CheckBox question7Choice2 = findViewById(R.id.question7_choice2);
        CheckBox question7Choice3 = findViewById(R.id.question7_choice3);

        answer7Choice1 = question7Choice1.isChecked();
        answer7Choice2 = question7Choice2.isChecked();
        answer7Choice3 = question7Choice3.isChecked();

        if (answer7Choice1 && !answer7Choice2 && answer7Choice3) {
            answer7Score = 1;
        } else {
            answer7Score = 0;
        }

        // Question 8 - Correct Answer is "Wrist"
        String answer8;

        EditText question8Answer = findViewById(R.id.question8_answer);

        answer8 = question8Answer.getText().toString().toLowerCase();
        if (answer8.equals("wrist")) {
            answer8Score = 1;
        } else {
            answer8Score = 0;
        }

        // Question 9  - Correct Answers is #4 "water"
        Boolean answer9;

        RadioButton question9Choice4 = findViewById(R.id.question9_choice4);

        answer9 = question9Choice4.isChecked();
        if (answer9) {
            answer9Score = 1;
        } else {
            answer9Score = 0;
        }

        // Question 10 - Correct Answer is "smelting"
        String answer10;

        EditText question10Answer = findViewById(R.id.question10_answer);

        answer10 = question10Answer.getText().toString().toLowerCase();
        if (answer10.equals("smelting")) {
            answer10Score = 1;
        } else {
            answer10Score = 0;
        }

        // Final Score
        finalScore = answer1Score + answer2Score + answer3Score + answer4Score + answer5Score +
                answer6Score + answer7Score + answer8Score + answer9Score + answer10Score;

        if (finalScore == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10 ";
        } else {
            resultsDisplay = "You scored " + finalScore + " out of 10 ";
        }
    }

}
