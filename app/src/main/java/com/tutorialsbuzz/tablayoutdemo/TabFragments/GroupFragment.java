package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.R;

/**
 * Created by iFocus on 27-10-2015.
 */
public class GroupFragment extends Fragment implements ImageButton.OnClickListener {

    private ImageButton mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.group_fragment, container, false);
        mButton = (ImageButton) view.findViewById(R.id.buscarcontrato);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent b = new Intent(getActivity(), Contratocliente.class);
                startActivity(b);

            }


        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}