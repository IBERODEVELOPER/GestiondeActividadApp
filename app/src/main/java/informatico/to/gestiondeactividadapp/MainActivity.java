package informatico.to.gestiondeactividadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //para el icono en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //llamamo a la imagen por su nombre que tiene que estar en drawable
        getSupportActionBar().setIcon(R.drawable.ic_action_name);
    }
}