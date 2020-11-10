package com.example.avaliao2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView loginSN;
    private EditText editPassword;
    private EditText editUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btlogin = (Button) findViewById(R.id.buttonLogin);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editPassword = findViewById(R.id.editPassword);
                editUsername = findViewById(R.id.editUsername);
                String usuario = editUsername.getText().toString();
                String senha = editPassword.getText().toString();
                if (usuario.equals("Ruan") && senha.equals("1234")){
                    fazLogin("Login efetuado com sucesso!");
                }else{
                    fazLogin("Usuário ou senha inválido");
                }

            }

        });

    }

    private void fazLogin(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
