package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import  android.widget.Button;

import com.tutorialsbuzz.tablayoutdemo.R;


public class Productos extends AppCompatActivity {


    Button ver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);



        ver=(Button)findViewById(R.id.com);
        ver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent ver =new Intent(Productos.this, Componentes.class);
                startActivity(ver);

            }

        });





    }
}


