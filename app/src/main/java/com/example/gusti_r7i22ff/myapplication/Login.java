package com.example.gusti_r7i22ff.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by gusti_r7i22ff on 25/02/2018.
 */

public class Login extends AppCompatActivity {
    public EditText a, b;
    public Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        a = (EditText) findViewById(R.id.editText1);
        b = (EditText) findViewById(R.id.editText2);
        c = (Button) findViewById(R.id.button);
    }

    public void Log(View view) {
        String usernameKey = a.getText().toString();
        String passwordKey = b.getText().toString();

        if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")) {
            Toast.makeText(getApplicationContext(), "Login Sukses...!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this, MainActivity.class);
            Login.this.startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Login Gagal...!", Toast.LENGTH_SHORT).show();
        }
        a.setText("");
        b.setText("");
    }
}

