package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void contadorNum(View view)
    {
        count++;
        TextView campoNome = findViewById(R.id.nome);
        campoNome.setText(""+count);
    }
    public void resetar(View view) {
        count = 0;
        TextView campoNome = findViewById(R.id.nome);
        campoNome.setText("" + count);
    }
    }
