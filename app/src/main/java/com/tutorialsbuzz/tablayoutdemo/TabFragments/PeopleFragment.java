package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.R;

public class PeopleFragment extends Fragment implements ImageButton.OnClickListener{

    private ImageButton mButton;
    private EditText editTextNro;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.people_fragment, container, false);

        editTextNro = (EditText) view.findViewById(R.id.editText26);
        mButton = (ImageButton) view.findViewById(R.id.bu);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                String nro = editTextNro.getText().toString();
                Intent bu = new Intent(getActivity(), Contratocliente.class);
                bu.putExtra("nro",nro);
                startActivity(bu);

            }


        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}








