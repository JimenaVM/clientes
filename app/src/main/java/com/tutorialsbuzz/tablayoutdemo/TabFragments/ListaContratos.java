package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.R;


public class ListaContratos extends AppCompatActivity {

    ImageButton ver;

    ImageButton producto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contratos);




        ver=(ImageButton)findViewById(R.id.deuda);
        ver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent ver =new Intent(ListaContratos.this, Deudas.class);
                startActivity(ver);

            }

        });
        producto=(ImageButton)findViewById(R.id.verproducto);
        producto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent ver =new Intent(ListaContratos.this, Productos.class);
                startActivity(ver);

            }

        });



    }
}


