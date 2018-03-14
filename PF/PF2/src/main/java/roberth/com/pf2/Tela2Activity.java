package roberth.com.pf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {
    EditText edNota1;
    EditText edNota2;
    TextView resultado;
    String nome;
    double media;
    String nota1;
    String nota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        edNota1 = (EditText) findViewById(R.id.ed_t2_nota1);
        edNota2 = (EditText) findViewById(R.id.ed_t2_nota2);
        resultado = (TextView) findViewById(R.id.tv_t2_resultado);



        Bundle calculo = getIntent().getExtras();

        nome = calculo.getString("nome");

        media = calculo.getDouble("resultado");

        try {
            if (media >= 7) {
                resultado.setText("Parabéns " + nome + " você passou com média " + media + "!");
            }
            if (media < 7 && media >= 4) {
                resultado.setText(nome + " você ficou de prova final com média " + media + "!");
            }
            if (media < 4) {
                resultado.setText(nome + " você reprovou com média " + media + "!");
            }
            if (media == 0) {
                resultado.setText("");
            }
        }catch (Exception e){
            resultado.setText("");

        }

    }

    public void calcularMedia(View view) {
        nota1 = edNota1.getText().toString();
        nota2 = edNota2.getText().toString();
        Intent intent = new Intent(this,Tela3Activity.class);
        intent.putExtra("nota1",nota1);
        intent.putExtra("nota2",nota2);
        intent.putExtra("nome",nome);
        startActivity(intent);
    }
}
