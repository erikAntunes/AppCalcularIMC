package br.com.digitalhouse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado(View view){

        System.out.println("Botão foi apertado");
        TextView respostaTextView = findViewById(R.id.text_resposta_id);
        EditText pesoDigitado = findViewById(R.id.peso_digitado_id);
        EditText alturaDigitada = findViewById(R.id.altura_digitada_id);

        Float peso = Float.parseFloat(pesoDigitado.getText().toString());
        Float altura = Float.parseFloat(alturaDigitada.getText().toString());

        Float resultado = peso / (altura * altura);

        String imc = "new imc";


        if(resultado < 18.5){
            imc = "VISH! você está ABAIXO DO PESO IDEAL";
        }
        if (resultado > 18.5 && resultado < 24.99){

            imc = "PARABÉNS! você está no seu PESO IDEAL";
        }
        if (resultado > 25 && resultado < 29.99){

            imc = "VISH! você está ACIMA DO PESO IDEAL";

        }
        if (resultado > 30 && resultado < 34.99){

            imc = "CUIDADO! OBESIDADE NIVEL 1";

        }

        if (resultado > 35 && resultado < 39.99){

            imc = "CUIDADO! OBESIDADE NIVEL 2";

        }


        respostaTextView.setText("Seu IMC é: "+resultado);

        Toast.makeText(this,imc,Toast.LENGTH_LONG).show();

    }
}
