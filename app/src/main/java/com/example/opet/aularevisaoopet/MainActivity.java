package com.example.opet.aularevisaoopet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTexto = findViewById(R.id.editTexto);
    }
    public void clique(View view){
        String frase = editTexto.getText().toString();
        frase = frase.toUpperCase();
        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show();
    }
    public void navegar(View view) {
        Intent novatela =
                new Intent(MainActivity.this,
                        ExerciciosActivity.class);
        startActivity(novatela);
    }
}
