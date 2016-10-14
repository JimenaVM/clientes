package com.tutorialsbuzz.tablayoutdemo.TabFragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.tutorialsbuzz.tablayoutdemo.MainActivity;
import com.tutorialsbuzz.tablayoutdemo.R;

import static com.tutorialsbuzz.tablayoutdemo.R.id.vercliente;

public class Contratocliente extends AppCompatActivity {

    ImageButton ver;

    ImageButton contrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contratocliente);


        ver=(ImageButton)findViewById(R.id.vercliente);
        ver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent ver =new Intent(Contratocliente.this, DatosClientes.class);
                startActivity(ver);

            }

        });
        contrato=(ImageButton)findViewById(R.id.vercontrato);
        contrato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent contrato =new Intent(Contratocliente.this, ListaContratos.class);
                startActivity(contrato);

            }

        });

}
}


