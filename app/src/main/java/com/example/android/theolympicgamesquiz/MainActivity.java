package com.example.android.theolympicgamesquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    EditText questionOne;
    RadioButton answerTwo;
    CheckBox answerThree1;
    CheckBox answerThree2;
    RadioGroup questionTwo;
    RadioButton answerFour;
    RadioGroup questionFour;
    RadioButton answerFive;
    RadioGroup questionFive;
    RadioButton answerSix;
    RadioGroup questionSix;
    CheckBox answerSeven1;
    CheckBox answerSeven2;
    EditText answerEight;
    CheckBox falseAnswer3, falseAnswer7;
    RadioButton falseAnswer4One, falseAnswer6One, falseAnswer6Two;
    RadioButton falseAnswer4Two, falseAnswer5Two, falseAnswer5One, answerTwofalse1, answerTwofalse2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionOne = (EditText) findViewById(R.id.question1);
        answerTwo = (RadioButton) findViewById(R.id.radioButtonOne);
        answerThree1 = (CheckBox) findViewById(R.id.answerThreeOne);
        answerThree2 = (CheckBox) findViewById(R.id.answerThreeTwo);
        answerFour = (RadioButton) findViewById(R.id.answerFour);
        answerFive = (RadioButton) findViewById(R.id.answer5);
        answerSix = (RadioButton) findViewById(R.id.answer6);
        answerSeven1 = (CheckBox) findViewById(R.id.question7One);
        answerSeven2 = (CheckBox) findViewById(R.id.question7Two);
        answerEight = (EditText) findViewById(R.id.question8);
        answerTwofalse1=(RadioButton)findViewById(R.id.radioButtonOne2);
        answerTwofalse2=(RadioButton)findViewById(R.id.radioButtonOne3);
        falseAnswer3=(CheckBox)findViewById(R.id.false3);
        falseAnswer4One=(RadioButton)findViewById(R.id.false4One);
        falseAnswer4Two=(RadioButton)findViewById(R.id.false4Two);
        falseAnswer5One=(RadioButton)findViewById(R.id.false5Two);
        falseAnswer5Two=(RadioButton)findViewById(R.id.false5One);
        falseAnswer6One=(RadioButton)findViewById(R.id.false6One);
        falseAnswer6Two=(RadioButton)findViewById(R.id.false6Two);
        falseAnswer7=(CheckBox)findViewById(R.id.false7);

        questionTwo = (RadioGroup) findViewById(R.id.radioGroupOne);
        questionFour = (RadioGroup) findViewById(R.id.radioGroupTwo);
        questionFive = (RadioGroup) findViewById(R.id.radio3);
        questionSix = (RadioGroup) findViewById(R.id.radio4);

    }


    public void done(View view) {
        int score = 0;
        if (answerTwo.isChecked())
            score = score + 1;
        if (questionOne.getText().toString().equalsIgnoreCase("greece"))
            score = score + 1;
        if (answerThree1.isChecked())
            score = score + 1;
        if (answerThree2.isChecked())
            score = score + 1;
        if (answerFour.isChecked())
            score = score + 1;
        if (answerFive.isChecked())
            score = score + 1;
        if (answerSix.isChecked())
            score = score + 1;
        if (answerSeven1.isChecked())
            score = score + 1;
        if (answerSeven2.isChecked())
            score = score + 1;
        if (answerEight.getText().toString().equalsIgnoreCase("Tokyo"))
            score = score + 1;
        if (score >= 9)
            Toast.makeText(this, "Your score: " + score + "\nYou are true Olympian!", Toast.LENGTH_SHORT).show();
        else if (score >= 5 )
            Toast.makeText(this, "Your score " + score + "\n Almost there! Try again.", Toast.LENGTH_SHORT).show();
        else if (score < 5)
            Toast.makeText(this, "Your score: " + score + "\n Too bad. Please try again.", Toast.LENGTH_SHORT).show();



    }
        public void checkAll(){
        answerTwo.setChecked(true);
        questionOne.setText("Greece");
        answerThree1.setChecked(true);
        answerThree2.setChecked(true);
        answerFour.setChecked(true);
        answerFive.setChecked(true);
        answerSix.setChecked(true);
        answerSeven1.setChecked(true);
        answerSeven2.setChecked(true);
        answerEight.setText("Tokyo");
    }
    public void answers (View v){
        checkAll();
    }

    public void reset (View v){
        unCheckAll();
    }
    public void unCheckAll(){
        answerTwo.setChecked(false);
        questionOne.setText("");
        answerThree1.setChecked(false);
        answerThree2.setChecked(false);
        answerFour.setChecked(false);
        answerFive.setChecked(false);
        answerSix.setChecked(false);
        answerSeven1.setChecked(false);
        answerSeven2.setChecked(false);
        answerEight.setText("");
        answerTwofalse2.setChecked(false);
        answerTwofalse1.setChecked(false);
        falseAnswer3.setChecked(false);
        falseAnswer4One.setChecked(false);
        falseAnswer4Two.setChecked(false);
        falseAnswer5One.setChecked(false);
        falseAnswer5Two.setChecked(false);
        falseAnswer6One.setChecked(false);
        falseAnswer6Two.setChecked(false);
        falseAnswer7.setChecked(false);


    }


}
