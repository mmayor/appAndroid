package com.example.appnewfk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util. *;
import java.util.Date;


class HolaFecha {
    public  static String fechaNEw() {
        // System.out.println ("Hola, hoy es: ");
        String fecha = "Hola, hoy es: ";
        fecha = fecha + new Date();
        // System. out .println (new Date( ) ) ;
        return(fecha);

    }
}


public class MainActivity extends AppCompatActivity {




    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s= new String("Pepe esta en casa" ) ;
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        HolaFecha fechaTemp = new HolaFecha();
        // Toast.makeText(this, fechaTemp.fechaNEw(), Toast.LENGTH_LONG).show();

        et1 = (EditText)findViewById(R.id.login);
        et2 = (EditText)findViewById(R.id.password);

        tv1 = (TextView)findViewById(R.id.data);
        tv2 = (TextView)findViewById(R.id.result);
        tv2 = (TextView)findViewById(R.id.result);
        // tv1.setText(fechaTemp.fechaNEw());
        String temp = "User: " + " " +  et1.getText().toString() + "Pass: " +  ' ' + et2.getText().toString();
        tv2.setText(temp);






    }

    public void Obtener(View view){

        String temp = "User: " + " " +  et1.getText().toString() + "Pass: " +  ' ' + et2.getText().toString();
        tv2.setText(temp);
        et1.setText("");
        et2.setText("");

    }



}

// HolaFecha . j ava

