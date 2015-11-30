package app.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PantallaTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera_pantalla);
    }

    public void btnNext(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void btnBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), PantallaDos.class);
        startActivity(intent);
    }
}
