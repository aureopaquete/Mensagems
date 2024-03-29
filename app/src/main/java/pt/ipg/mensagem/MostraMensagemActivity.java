package pt.ipg.mensagem;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MostraMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_mensagem);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mostraMensagem();
    }

    private void mostraMensagem() {
        Intent intent = getIntent();

        String mensagem = intent.getStringExtra(DefinicoesApp.MENSAGEM);
        Date data = (Date) intent.getSerializableExtra(DefinicoesApp.DATA);

        TextView textViewMensagem = (TextView) findViewById(R.id.textViewMensagem);
        textViewMensagem.setText(mensagem);

        TextView textViewData = (TextView) findViewById(R.id.textViewData);
        textViewData.setText(data.toString());
    }

}
