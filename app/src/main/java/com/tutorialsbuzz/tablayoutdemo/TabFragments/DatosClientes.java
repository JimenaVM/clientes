package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.MainActivity;
import com.tutorialsbuzz.tablayoutdemo.R;

import static com.tutorialsbuzz.tablayoutdemo.R.id.vercliente;

public class DatosClientes extends AppCompatActivity {


    ImageButton atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_clientes);


        atras=(ImageButton)findViewById(R.id.atras);
        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent atras =new Intent(DatosClientes.this, Contratocliente.class);
                startActivity(atras);

            }

        });


    }
}
