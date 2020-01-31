package com.example.andphpreglogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button _btnReg, _btnLogin;
    EditText _txtName, _txtAdd, _txtEmail, _txtUser, _txtass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btnLogin=(Button)findViewById(R.id.btnLogin);
        _btnReg=(Button)findViewById(R.id.btnReg);
        _txtName=(EditText)findViewById(R.id.txtName);
        _txtAdd=(EditText)findViewById(R.id.txtAdd);

    }
}
