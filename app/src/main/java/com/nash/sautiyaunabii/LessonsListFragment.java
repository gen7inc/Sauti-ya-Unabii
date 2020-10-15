package com.nash.sautiyaunabii;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

public class LessonsListFragment extends ListFragment {

    //add the listener to the list fragment
    static interface Listener {
        void itemClicked(long id);
    }

    private Listener listener;

    //the list fragment
    public LessonsListFragment() {
        //requires empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //the string array
        String[] lessonTitles = new String[Lessons.lessons.length];
        for (int i = 0; i < lessonTitles.length; i++) {
            lessonTitles[i] = Lessons.lessons[i].getTitle(); //create array of titles
        }
        // Attach data to the list view
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1, lessonTitles
                /*getResources().getStringArray(R.array.masomo)*/
        );
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context; //attach the listener to the activity when it gets attached to activity
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);

        }
    }
}
