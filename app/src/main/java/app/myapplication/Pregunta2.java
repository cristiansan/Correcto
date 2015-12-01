package app.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Pregunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta_2);
    }

    public void btnCorrect(View v)
    {
        ImageView correct = (ImageView)findViewById(R.id.correcto);
        correct.setVisibility(View.VISIBLE);
        ImageView incorrect = (ImageView)findViewById(R.id.incorrecto);
        incorrect.setVisibility(View.INVISIBLE);
    }

    public void btnIncorrect(View v)
    {
        ImageView incorrect = (ImageView)findViewById(R.id.incorrecto);
        incorrect.setVisibility(View.VISIBLE);
        ImageView correct = (ImageView)findViewById(R.id.correcto);
        correct.setVisibility(View.INVISIBLE);
    }

    public void btnNext(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Pregunta3.class);
        startActivity(intent);
    }
    public void btnBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Pregunta1.class);
        startActivity(intent);
    }
}
