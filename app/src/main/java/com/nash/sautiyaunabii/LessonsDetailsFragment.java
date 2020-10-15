package com.nash.sautiyaunabii;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class LessonsDetailsFragment extends Fragment{
    private long lessonID; //this is the id of the lesson the user chooses

    public LessonsDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lessons_details, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView lessonTitle = (TextView) view.findViewById(R.id.lesson_title);
            Lessons lessons = Lessons.lessons[(int) lessonID];
            lessonTitle.setText(lessons.getTitle()); //get the title

            TextView lessonDescription = (TextView) view.findViewById(R.id.lesson_description);
            lessonDescription.setText(lessons.getDescription());//get description

            TextView lessonContent = (TextView) view.findViewById(R.id.lesson_content);
            lessonContent.setText(lessons.getContent()); //get the content.

            //when a button in this case is clicked, start the respective questions section
            /*final Button maswaliButton = (Button) view.findViewById(R.id.maswali_sehemu_ya_);
            maswaliButton.setText(lessons.getMaswali());
            maswaliButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String buttonText = maswaliButton.getText().toString();
                    Toast toast = Toast.makeText(getContext(), buttonText, Toast.LENGTH_LONG);//display the toast for each button text
                    toast.show();

                    //for lesson 1: THE BUTTONS ARE FOR WEEK2
                    *//*switch (buttonText) {
                        case "Maswali ya Somo la 1":
                            questionsDetailsFragment.setQuestions(0);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 2":
                            //code to start maswali sehemu ya 2
                            questionsDetailsFragment.setQuestions(1);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 3":
                            //code to start maswali seheumu ya 3
                            questionsDetailsFragment.setQuestions(2);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 4":
                            //code to start maswali sehemu ya 4
                            questionsDetailsFragment.setQuestions(3);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 5":
                            //code to start maswali sehemu ya 5
                            questionsDetailsFragment.setQuestions(4);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 6":
                            //code to start maswali sehemu ya 6
                            questionsDetailsFragment.setQuestions(5);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 7":
                            //code to start maswali sehemu ya 7
                            questionsDetailsFragment.setQuestions(6);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 8":
                            //code to start maswali sehemu ya 8
                            questionsDetailsFragment.setQuestions(7);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 9":
                            //code to start maswali sehemu ya 9
                            questionsDetailsFragment.setQuestions(8);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 10":
                            //code to start maswali sehemu ya 10
                            questionsDetailsFragment.setQuestions(9);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 11":
                            //code to start maswali sehemu ya 11
                            questionsDetailsFragment.setQuestions(10);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 12":
                            //code to start maswali sehemu ya 12
                            questionsDetailsFragment.setQuestions(11);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 13":
                            //code to start maswali sehemu ya 13
                            questionsDetailsFragment.setQuestions(12);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 14":
                            //code to start maswali sehemu ya 14
                            questionsDetailsFragment.setQuestions(13);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 15":
                            //code to start maswali sehemu ya 15
                            questionsDetailsFragment.setQuestions(14);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 16":
                            //code to start maswali sehemu ya 16
                            questionsDetailsFragment.setQuestions(15);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 17":
                            //code to start maswali sehemu ya 17
                            questionsDetailsFragment.setQuestions(16);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 18":
                            //code to start maswali sehemu ya 18
                            questionsDetailsFragment.setQuestions(17);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 19":
                            //code to start maswali sehemu ya 19
                            questionsDetailsFragment.setQuestions(18);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                        case "Maswali ya Somo la 20":
                            //code to start maswali sehemu ya 20
                            questionsDetailsFragment.setQuestions(19);
                            ft.replace(R.id.lessons_details_fragment, questionsDetailsFragment);
                            ft.commit();//commit the transaction

                    }*//*
                }
            });*/

        }
    }

    public void setLesson(long id) {
        this.lessonID = id;
    }

}
