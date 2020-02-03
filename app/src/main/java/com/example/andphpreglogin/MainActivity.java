package com.example.andphpreglogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button _btnReg, _btnLogin, btnlogin;
    EditText _txtName, _txtAdd, _txtEmail, _txtUser, _txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnReg=(Button)findViewById(R.id.btnReg);
        _txtName=(EditText)findViewById(R.id.txtName);
        _txtAdd=(EditText)findViewById(R.id.txtAdd);
        _txtEmail=(EditText)findViewById(R.id.txtEmail);
        _txtUser=(EditText)findViewById(R.id.txtUser);
        _txtpass=(EditText)findViewById(R.id.txtPass);
        btnlogin = (Button)findViewById(R.id.btnlogin);

        _btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=_txtName.getText().toString();
                String address=_txtAdd.getText().toString();
                String email=_txtEmail.getText().toString();
                String username=_txtUser.getText().toString();
                String password=_txtpass.getText().toString();
                String type="reg";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, name, address, email, username, password);


            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}
