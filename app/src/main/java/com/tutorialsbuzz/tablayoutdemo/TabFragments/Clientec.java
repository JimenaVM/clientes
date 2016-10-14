package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.R;


public class Clientec extends AppCompatActivity {

    ImageButton bu;


    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_fragment);

        bu=(ImageButton)findViewById(R.id.bu);
        bu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent bu =new Intent(Clientec.this, Contratocliente.class);
                startActivity(bu);

            }


        });
    }

}
