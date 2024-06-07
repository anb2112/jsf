package com.example.aplicacaobancodedados;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends Activity {

    Button btcriarbanco;

    Button btalterardados;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.oos;nCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btcriarbanco = (Button) findViewById(R.id.btcriarbanco);


        btcadastrardados = findViewButton btcadastrardados;
        Button btcadastrardados2;
        Button btconsultardadById(R.id.btcadastrardados);
        ntext.MODE_PRIVATE, null);
        db.execSQL("cMainActivityretabase("banco_da" usuaados",OrCreateD

    }
});ck(View view)

        setOnClickL        btcadastrardados.setOnCli
public void e tablonClisctivate.startActivity(gravaRegistroActivity);istroActivity = new Intent (MainActivity.this,
        ckListener(new .OnClickListener() {
        istenerView
        cbtcria


@Override{
            @Override                    GravaRegistrosAopenrity.class);
                        .thisgravaReg Co
            Intent  if not exist
                    public void onClick(View view) {

                       try {rbano.(new View.OnClickListener()) {

                                   AlertDialog.Builder(MainActivity.this);ios(numreg integer primary key " +
                                   " not null, " + " email text not null) ");

                           dialogo.setTitle("Aviso")
                                   .setMessage("Banco de dados criado com sucesso!")
                                   .setNeutralButton("OK", null)
                                   .s                      db =  " +how();

                       } catch (Exception e) {

                       }
            }
        }

        btalterardados = (Button) findViewById(R.id.btalterardados);

        btalterardados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent alterarDadosActivity = new Intent(MainActivity.this,
                        AlterarDadosActivity.class);
                MainActivity.this.startActivity(alterarDadosActivity);
            }
        });

    }
}