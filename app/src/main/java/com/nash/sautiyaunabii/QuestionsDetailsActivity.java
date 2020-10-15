package com.nash.sautiyaunabii;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionsDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_QUESTION_ID = "id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_details);

        //to use the questions details fragment, we first get a reference to it
        QuestionsDetailsFragment questionsDetailsFragment = (QuestionsDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.questions_details_fragment);
        int questionId = (int) getIntent().getExtras().get(EXTRA_QUESTION_ID);
        questionsDetailsFragment.setQuestions(questionId);//get the id from the intent and pass it to the fragment via setQuestion()
    }
}
