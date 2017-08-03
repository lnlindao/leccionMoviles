package com.example.dptoredes.leccionlindaolissette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class home extends AppCompatActivity implements View.OnClickListener{

    TextView parametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

        parametro = (TextView) findViewById( R.id.parametro);
        Intent intent=getIntent();
        String message = intent.getStringExtra("username");
        parametro.setText(message);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Incorrecto", Toast.LENGTH_SHORT);

                toast1.show();
                break;
            case R.id.button2:
                Toast toast2 =
                        Toast.makeText(getApplicationContext(),
                                "2!! Correcto", Toast.LENGTH_SHORT);

                toast2.show();
                break;
            case R.id.button3:
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),
                                "Incorrecto", Toast.LENGTH_SHORT);

                toast3.show();
                break;
            case R.id.button4:
                Toast toast4 =
                        Toast.makeText(getApplicationContext(),
                                "Incorrecto", Toast.LENGTH_SHORT);

                toast4.show();
                break;
        }
    };


}
