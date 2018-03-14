package roberth.com.pf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BoasVindasActivity extends AppCompatActivity {
    String nome;
    EditText edNome;
    Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);
        edNome = (EditText) findViewById(R.id.ed_bv_nome);
    }

    public void entrar(View view) {
        nome = edNome.getText().toString();
        Intent intent = new Intent(this,Tela2Activity.class);
        intent.putExtra("nome",nome);
        startActivity(intent);
    }
}
