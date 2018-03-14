package roberth.com.pf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tela3Activity extends AppCompatActivity {
    EditText edPeso1;
    EditText edPeso2;
    String nome;
    Double resultado;
    double nota1,nota2;
    int peso1,peso2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        edPeso1 = (EditText) findViewById(R.id.ed_t3_nota1);
        edPeso2 = (EditText) findViewById(R.id.ed_t3_nota2);

        Bundle notas = getIntent().getExtras();
        nota1 = Double.parseDouble(notas.getString("nota1"));
        nota2 = Double.parseDouble(notas.getString("nota2"));
        nome = notas.getString("nome");

    }

    public void calculoMedia(View view) {
        peso1 = Integer.valueOf(edPeso1.getText().toString());
        peso2 = Integer.valueOf(edPeso2.getText().toString());
        resultado = ((nota1*peso1)+(nota2*peso2))/(peso1+peso2);
        Intent intent = new Intent(this,Tela2Activity.class);
        intent.putExtra("resultado",resultado);
        intent.putExtra("nome",nome);
        startActivity(intent);
        finish();
    }
}
