package com.example.bing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 10;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            //{"Pertanyaan", "Jawaban benar", "Choice1", "Choice2", "Choice3", "Choice4"}
            {"I and my friends … in the library. We read some books", "are", "am", "is", "have", "are"},
            {"She … not work because she has the flu.", "does", "is", "does", "do", "be"},
            {"My brother rides a bike to school …", "everyday", "everyday","last day", "next week","next time"},
            {"Alina … song every night.", "sings", "sings", "sing", "is", "does"},
            {"My father … tea every morning.", "drinks", "drink", "drinks", "drinking", "does"},
            {"They … a test every week.", "have", "does", "as", "are", "have"},
            {"Tomy, Jane, Mark, Sarah ………. smart students.", "are", "are", "does", "not", "am not"},
            {"She is a student. She … at school.", "studies", "is", "are", "studies", "is not"},
            {"We … soccer match.", "watch", "doing", "watching", "watches", "watch"},
            {"Gina have got ma medal. It … amazing.", "is", "does", "do", "are", "is"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        countLabel = (TextView)findViewById(R.id.countLabel);
        questionLabel = (TextView)findViewById(R.id.questionLabel);
        answerBtn1 = (Button)findViewById(R.id.answerBtn1);
        answerBtn2 = (Button)findViewById(R.id.answerBtn2);
        answerBtn3 = (Button)findViewById(R.id.answerBtn3);
        answerBtn4 = (Button)findViewById(R.id.answerBtn4);

        //quiz array dari quizData

        for (int i = 0; i < quizData.length; i++) {

            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //pertanyaan
            tmpArray.add(quizData[i][1]); //jawaban benar
            tmpArray.add(quizData[i][2]); //pilihan1
            tmpArray.add(quizData[i][3]); //pilihan2
            tmpArray.add(quizData[i][4]); //pilihan3

            quizArray.add(tmpArray);
        }
        showNextQuiz();
    }

    public void  showNextQuiz(){

        countLabel.setText(quizCount + "/10");

        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        ArrayList<String> quiz = quizArray.get(randomNum);

        questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);

        quiz.remove(0);
        Collections.shuffle(quiz);

        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        quizArray.remove(randomNum);
    }

    public void checkAnswer(View view) {

        Button answerBtn = (Button) findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if (btnText.equals(rightAnswer)) {
            // benar!!
            alertTitle = "Benar !!!";
            rightAnswerCount++;
        } else {
            //salah
            alertTitle = "Salah...";
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Jawaban : " + rightAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (quizCount == QUIZ_COUNT) {
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);

                } else {
                    quizCount++;
                    showNextQuiz();
                }

            }
        });

        builder.setCancelable(false);
        builder.show();

    }




}

