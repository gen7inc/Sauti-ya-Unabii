package com.nash.sautiyaunabii;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionsDetailsFragment extends Fragment {
    private long questionsID; //this is the id of the lesson the user chooses

    public QuestionsDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questions_details, container, false);
    }

    //gets called when this fragment gets created
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {

            //get the muhimu text
            TextView muhimuText = (TextView) view.findViewById(R.id.muhimu);
            Questions questions = Questions.questions[(int) questionsID];
            muhimuText.setText(questions.getMuhimu());

            //get the maswali heading text
            TextView maswaliTitle = (TextView) view.findViewById(R.id.maswali_ya_somo_la_);
            maswaliTitle.setText(questions.getMaswali_ya_somo_la());

            //GET QUESTION 1 RADIOGROUP
            TextView swaliKwanza = (TextView) view.findViewById(R.id.swali_la_kwanza);
            swaliKwanza.setText(questions.getKwanza());

            RadioButton swaliKwanza_A = (RadioButton) view.findViewById(R.id.swali_la_kwanza_A);
            swaliKwanza_A.setText(questions.getKwanza_A());

            RadioButton swaliKwanza_B = (RadioButton) view.findViewById(R.id.swali_la_kwanza_B);
            String swaliTitle = maswaliTitle.getText().toString(); //get the title for the questions as a String
            //we want to set somo la 1, swali la kwanza B to be checked.
            if (swaliTitle.equals("MASWALI YA SOMO LA 1")) {
                swaliKwanza_B.setChecked(true);
                swaliKwanza_B.setText(questions.getKwanza_B());
            } else {
                swaliKwanza_B.setText(questions.getKwanza_B());
            }

            RadioButton swaliKwanza_C = (RadioButton) view.findViewById(R.id.swali_la_kwanza_C);
            swaliKwanza_C.setText(questions.getKwanza_C());

            //GET QUESTION 2 RADIOGROUP
            TextView swaliPili = (TextView) view.findViewById(R.id.swali_la_pili);
            swaliPili.setText(questions.getPili());

            RadioButton swaliPili_A = (RadioButton) view.findViewById(R.id.swali_la_pili_A);
            swaliPili_A.setText(questions.getPili_A());

            RadioButton swaliPili_B = (RadioButton) view.findViewById(R.id.swali_la_pili_B);
            swaliPili_B.setText(questions.getPili_B());

            RadioButton swaliPili_C = (RadioButton) view.findViewById(R.id.swali_la_pili_C);
            swaliPili_C.setText(questions.getPili_C());

            //GET QUESTION 3 RADIOGROUP
            TextView swaliTatu = (TextView) view.findViewById(R.id.swali_la_tatu);
            swaliTatu.setText(questions.getTatu());

            RadioButton swaliTatu_A = (RadioButton) view.findViewById(R.id.swali_la_tatu_A);
            swaliTatu_A.setText(questions.getTatu_A());

            RadioButton swaliTatu_B = (RadioButton) view.findViewById(R.id.swali_la_tatu_B);
            swaliTatu_B.setText(questions.getTatu_B());

            RadioButton swaliTatu_C = (RadioButton) view.findViewById(R.id.swali_la_tatu_C);
            swaliTatu_C.setText(questions.getTatu_C());

            //GET QUESTION 4 RADIOGROUP
            TextView swaliNne = (TextView) view.findViewById(R.id.swali_la_nne);
            swaliNne.setText(questions.getNne());

            RadioButton swaliNne_A = (RadioButton) view.findViewById(R.id.swali_la_nne_A);
            swaliNne_A.setText(questions.getNne_A());

            RadioButton swaliNne_B = (RadioButton) view.findViewById(R.id.swali_la_nne_B);
            swaliNne_B.setText(questions.getNne_B());

            RadioButton swaliNne_C = (RadioButton) view.findViewById(R.id.swali_la_nne_C);
            swaliNne_C.setText(questions.getNne_C());

            //GET QUESTION 5 RADIOGROUP
            TextView swaliTano = (TextView) view.findViewById(R.id.swali_la_tano);
            swaliTano.setText(questions.getTano());

            RadioButton swaliTano_A = (RadioButton) view.findViewById(R.id.swali_la_tano_A);
            swaliTano_A.setText(questions.getTano_A());

            RadioButton swaliTano_B = (RadioButton) view.findViewById(R.id.swali_la_tano_B);
            swaliTano_B.setText(questions.getTano_B());

            RadioButton swaliTano_C = (RadioButton) view.findViewById(R.id.swali_la_tano_C);
            swaliTano_C.setText(questions.getTano_C());

            //get the ahadi text
            TextView ahadiText = (TextView) view.findViewById(R.id.ahadi_text);
            ahadiText.setText(questions.getAhadi_Text()); //get the content.

            //get the jina text label
            TextView jinaText = (TextView) view.findViewById(R.id.jina_label);
            jinaText.setText(questions.getJina_Label()); //get the name label content.

            //the jina edit text field
            final EditText jinaEditTextField = (EditText) view.findViewById(R.id.jina_field);
            jinaEditTextField.setHint(questions.getJina_TextField()); //NEED TO CHECK HERE.(EDIT TEXT HINT AGREE??)

            //get the kumbuka text
            TextView kumbukaText = (TextView) view.findViewById(R.id.kumbuka);
            kumbukaText.setText(questions.getKumbuka_Text()); //get the content.

            //get the kusanya button, and add the dialog box
            Button kusanyaMaswaliButton = (Button) view.findViewById(R.id.kusanya);
            kusanyaMaswaliButton.setText(questions.getKusanya()); //set the text of the button
            //listener for the button
            kusanyaMaswaliButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String jinaField = jinaEditTextField.getText().toString();
                    if (TextUtils.isEmpty(jinaField)) {
                        jinaEditTextField.setError(getString(R.string.tafadhali_jaza_jina));
                    } else if (!(TextUtils.isEmpty(jinaField))) {
                        //create the alert dialog
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext()); //CHECK HERE
                        //create the message for the builder
                        builder.setMessage(getString(R.string.una_uhakika_na_majibu_yako))
                                .setCancelable(false)
                                .setNegativeButton(getString(R.string.hapana_nirudishe_kwenye_maswali), new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                })
                                .setPositiveButton(getString(R.string.ndiyo_nioneshe_majibu), new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        //when a positive answer is selected, start the answers activity
                                        Intent intent = new Intent(getContext(), MajibuActivity.class);
                                        startActivity(intent);
                                        //dialog.dismiss();//dismiss dialog
                                    }
                                });
                        AlertDialog alertDialog = builder.create();//create the builder
                        alertDialog.setTitle(getString(R.string.hakiki_majibu_yako)); //set the title for the dialog
                        alertDialog.show(); //show the dialog
                    }
                }
            });
        }
    }
    //set the id to pass to the calling class
    public void setQuestions(long id) {
        this.questionsID = id;
    }

}
