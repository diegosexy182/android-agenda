package br.com.alura.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnNovo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        listView = (ListView) findViewById(R.id.lista_alunos_list);
        btnNovo = (Button) findViewById(R.id.lista_alunos_novo_aluno);

        List<String> alunos = Arrays.asList("Daniel", "Ronaldo", "Jefersson", "Felipe");
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        btnNovo.setOnClickListener(v -> startActivity(new Intent(this, FormularioActivity.class)));

    }
}
