package com.nash.sautiyaunabii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LessonsDetailsActivity extends AppCompatActivity {
    public static final String EXTRA_LESSON_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_details);

        //get a reference to the LessonsDetailsFragment
        LessonsDetailsFragment lessonsDetailsFragment = (LessonsDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.lessons_details_fragment);
        int lessonId = (int) getIntent().getExtras().get(EXTRA_LESSON_ID);
        lessonsDetailsFragment.setLesson(lessonId);

    }
}
