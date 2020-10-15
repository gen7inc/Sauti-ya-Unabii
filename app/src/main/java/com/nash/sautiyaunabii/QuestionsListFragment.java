package com.nash.sautiyaunabii;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionsListFragment extends ListFragment {

    //define the lister to listen for item clicks
    static interface Listener {
        void onItemClicked(long id);
    }

    //register the listener
    private Listener questionsListener;

    //the constructor for the list fragment
    public QuestionsListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] questionsTitles = new String[Questions.questions.length];
        for (int i = 0; i < questionsTitles.length; i++) {
            questionsTitles[i] = Questions.questions[i].getMaswali_ya_somo_la(); //create array of titles

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, questionsTitles);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        //this method is called when list fragment gets attached to the activity
        super.onAttach(context);
        this.questionsListener = (Listener) context;
    }

    //respond to item clicks


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (questionsListener != null) {
            questionsListener.onItemClicked(id);
        }
    }
}
