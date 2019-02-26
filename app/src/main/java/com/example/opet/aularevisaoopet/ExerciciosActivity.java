package com.example.opet.aularevisaoopet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ExerciciosActivity extends AppCompatActivity {

    private EditText editExercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);
        editExercicio = findViewById(R.id.editExercicio);
    }

    public void palindromo(View view) {
        String usuario = editExercicio.getText().toString();
        String reverso = new StringBuilder(usuario).reverse().toString();

        if(reverso.toUpperCase().equals(usuario.toUpperCase())){
            Toast.makeText(this, "Palindromo.", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Não é Palindromo.", Toast.LENGTH_SHORT).show();
        }
    }

    public void contador(View view) {
        String frase = editExercicio.getText().toString().toUpperCase();
        frase = frase.replace(",","").replace("!","");
        String palavras[] = frase.split(" ");

        Toast.makeText(this, String.valueOf(palavras.length), Toast.LENGTH_SHORT).show();
    }
}
