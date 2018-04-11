package com.example.android.bodysystemsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreQuestionOne = 0;
    int scoreQuestionTwo = 0;
    int scoreQuestionThree = 0;
    int scoreQuestionFour = 0;
    int scoreQuestionFive = 0;
    double totalScore;
    int resetTotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getSore (View view){

        //find user's name
        EditText nameField = findViewById(R.id.name);
        String name = nameField.getText().toString();

        //gives letter grade and toast message
        double grade = calculateScore();
        if(grade >= 100) {
            Toast.makeText(this,"Congratulations! " + name + ", You scored 100%.  Perfect!",Toast.LENGTH_LONG).show();
        } else if (grade >= 90) {
            Toast.makeText(this, "Awesome! " + name + ", You got an A.",Toast.LENGTH_LONG).show();
        } else if (grade >= 80) {
            Toast.makeText(this, "Great job! " + name  + ", You got a B.", Toast.LENGTH_LONG).show();
        } else if (grade >= 70) {
            Toast.makeText(this, "Good job! " + name + ", You got a C.",Toast.LENGTH_LONG).show();
        } else if (grade >= 60) {
            Toast.makeText(this, "You need a little practice, " + name + ". You got a D.",Toast.LENGTH_LONG).show();
        } else if (grade < 60) {
            Toast.makeText(this, "Sorry, " + name  +  ". You didn't pass. Try again.",Toast.LENGTH_LONG).show();
        }

    }


    //displays the score for question one
    public void displayForQuestionOne(int score) {
        TextView scoreView = findViewById(R.id.question_one_score);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the score for question one when integumentary radio button is selected
    public void integumentaryChecked(View v) {
        scoreQuestionOne = (int) 20.00;
        displayForQuestionOne(scoreQuestionOne);
    }

    //calculates the score for question one when lymphatic radio button is selected
    public void lymphaticChecked(View v) {
        scoreQuestionOne = (int) 0.00;
        displayForQuestionOne(scoreQuestionOne);
    }

    //calculates the score for question one when respiratory radio button is selected
    public void respiratoryChecked(View v) {
        scoreQuestionOne = (int) 0.00;
        displayForQuestionOne(scoreQuestionOne);
    }

    //displays the score for question two
    public void displayForQuestionTwo(int score) {
        TextView scoreView = findViewById(R.id.question_two_score);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the score for question two when skeletal checkbox is checked
    public void skeletalChecked(View v) {
        scoreQuestionTwo = (int) 0.00;
        displayForQuestionTwo(scoreQuestionTwo);
    }

    //calculates the score for question two when cardiac checkbox is checked
    public void cardiacChecked(View v) {
        scoreQuestionTwo = (int) 0.00;
        displayForQuestionTwo(scoreQuestionTwo);
    }

    //calculates the score for question two when voluminoid and femular checkbox is checked
    public void onCheckboxClicked(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {

            case R.id.voluminoid_checkbox:
                if (checked)
                    scoreQuestionTwo = scoreQuestionTwo + 10;
                else
                    scoreQuestionTwo = 0;
                break;
            case R.id.femular_checkbox:
                if (checked)
                    scoreQuestionTwo = scoreQuestionTwo + 10;
                else
                    scoreQuestionTwo = 0;
                break;
        }
        displayForQuestionTwo(scoreQuestionTwo);

    }

    //displays the score for question three
    public void displayForQuestionThree(int score) {
        TextView scoreView = findViewById(R.id.question_three_score);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the score for question three when true radio button is selected
    public void trueChecked (View v) {
        scoreQuestionThree = (int) 0.00;
        displayForQuestionThree(scoreQuestionThree);
    }

    //calculates the score for question three when false radio button is selected
    public void falseChecked (View v) {
        scoreQuestionThree = (int) 20.00;
        displayForQuestionThree(scoreQuestionThree);
    }

    //displays the score for question four
    public void displayForQuestionFour(int score) {
        TextView scoreView = findViewById(R.id.question_four_score);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the score for question four when uvula and testes checkbox is checked
    public void onCheckboxClicked2(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {

            case R.id.uvula_checkbox:
                if (checked)
                    scoreQuestionFour = scoreQuestionFour + 10;
                else
                    scoreQuestionFour = 0;
                break;
            case R.id.testes_checkbox:
                if (checked)
                    scoreQuestionFour = scoreQuestionFour + 10;
                else
                    scoreQuestionFour = 0;
                break;
        }
        displayForQuestionFour(scoreQuestionFour);

    }

    //calculates the score for question four when vagina checkbox is checked
    public void vaginaChecked(View v) {
        scoreQuestionFour = (int) 0.00;
        displayForQuestionFour(scoreQuestionFour);
    }

    //calculates the score for question four when ovaries checkbox is checked
    public void ovariesChecked(View v) {
        scoreQuestionFour = (int) 0.00;
        displayForQuestionFour(scoreQuestionFour);
    }

    //displays the score for question five
    public void displayForQuestionFive(int score) {
        TextView scoreView = findViewById(R.id.question_five_score);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the score for question five when eight radio button is selected
    public void eightChecked(View v) {
        scoreQuestionFive = (int) 20.00;
        displayForQuestionFive(scoreQuestionFive);
    }

    //calculates the score for question five when six radio button is selected
    public void sixChecked(View v) {
        scoreQuestionFive = (int) 0.00;
        displayForQuestionFive(scoreQuestionFive);
    }

    //calculates the score for question five when ten radio button is selected
    public void tenChecked(View v) {
        scoreQuestionFive = (int) 0.00;
        displayForQuestionFive(scoreQuestionFive);
    }

    //calculates the score for question five when fifteen radio button is selected
    public void fifteenChecked(View v) {
        scoreQuestionFive = (int) 0.00;
        displayForQuestionFive(scoreQuestionFive);
    }

    //displays the totalScore
    public void displayForTotalScore(int score) {
        TextView scoreView = findViewById(R.id.totalScore);
        scoreView.setText(String.valueOf(score));
    }

    //calculates the totalScore
    public double calculateScore () {
        totalScore = 0;
        totalScore = totalScore + scoreQuestionOne + scoreQuestionTwo + scoreQuestionThree + scoreQuestionFour + scoreQuestionFive;
        displayForTotalScore((int) totalScore);
        return totalScore;
    }

    //sets the score of each question and the total score to 0
    public void resetScore(View v) {

        scoreQuestionOne = 0;
        scoreQuestionTwo = 0;
        scoreQuestionThree = 0;
        scoreQuestionFour = 0;
        scoreQuestionFive = 0;
        resetTotalScore = 0;
        displayForQuestionOne(scoreQuestionOne);
        displayForQuestionTwo(scoreQuestionTwo);
        displayForQuestionThree(scoreQuestionThree);
        displayForQuestionFour(scoreQuestionFour);
        displayForQuestionFive(scoreQuestionFive);
        displayForTotalScore(resetTotalScore);

    }

}
