package com.example.estruch18.actionbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
    //Atributos de la clase
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaración de atributos de la clase
        layout = (RelativeLayout)findViewById(R.id.RelativeLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //Gestión de selección de opciones en la Action bar
        switch (id){
            case R.id.action_ajustes:
                Toast.makeText(getApplicationContext(), "AJUSTES", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_whatssap:
                Toast.makeText(getApplicationContext(), "WHATSSAP", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_fondoAzul:
                layout.setBackgroundColor(Color.BLUE);
                break;

            case R.id.action_fondoRojo:
                layout.setBackgroundColor(Color.RED);
                break;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
