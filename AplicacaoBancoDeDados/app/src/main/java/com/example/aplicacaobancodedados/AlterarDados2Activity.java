package com.example.aplicacaobancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AlterarDados2Activity extends AppCompatActivity {

    EditText txtnome, txttelefone, txtemail;

    TextView txtstatus_registro;

        SQLiteDatabase db;

        ImageView imgprimeiro,imganterior, imgproximo, imgultimo;

        Button btalterardados;

        int indice;

        int numreg;

        Cursor c;

        DialogInterface.OnClickListener diAlterarInformacoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_dados2);

        txtnome = (EditText) findViewById(R.id.txtnome);
        txttelefone = (EditText) findViewById(R.id.txttelefone);
        txtemail = (EditText) findViewById(R.id.txtemail);
        txtstatus_registro = (TextView) findViewById(R.id.txtstatus_registro);

        imgprimeiro = (ImageView) findViewById(R.id.imgprimeiro);
        imganterior = (ImageView) findViewById(R.id.imganterior);
        imgproximo = (ImageView) findViewById(R.id.imgproximo);
        imgultimo = (ImageView) findViewById(R.id.imgultimo);

        btalterardados = (Button) findViewById(R.id.btalterardados);

        try {
            db = openOrCreateDatabase()
            ("banco_dados", Context.MODE_PRIVATE, null);

            c = db.query("usuarios", new String []
                    {"numreg","nome","telefone", "email"},
                    null,null,null,null,null);
            if (c.getCount() > 0){
                c.moveToFirst();
                indice = 1;
                numreg = c.getInt(0);
                txtnome.setText(c.getString(1));

                txttelefone.setText(c.getString(2));

                txtemail.setText(c.getString(3));

                txtstatus_registro.setText(indice +" / " +
                        c.getCount());
            }
            else {
                txtstatus_registro.setText("Nenhum Registro");
            }
        }
        catch (Exception e)
        {

        }

        imgprimeiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c.getCount() >0)
                {
                    c.moveToFirst();
                    indice = 1;

                    pagina 43
                }
            }
        });
    }
}