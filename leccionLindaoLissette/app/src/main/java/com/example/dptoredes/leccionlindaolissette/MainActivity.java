package com.example.dptoredes.leccionlindaolissette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText username;
    public final static String EXTRA_MESSAGE = "dpt.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
    }

    public void enviarNombre(View view) {
        Intent intent = new Intent(this, home.class );
        String usuario =username.getText().toString();
        intent.putExtra("username",usuario);
        startActivity(intent);
    }
}
