package com.example.testlawencon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername,etPassword;
    private Button btnLogin;
    private String usr,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initDb(){
        Db.getInstance().init(this);
    }

    private void initViews(){
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

    }

    private void initListener(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    usr = etUsername.getText().toString();
                    pwd = etPassword.getText().toString();
                    if(usr.equals("admin")&&pwd.equals("admin")){
                        Toast.makeText(getApplicationContext(),"LOGIN SUCCES",Toast.LENGTH_SHORT);
                    }else{
                        Toast.makeText(getApplicationContext(),"Incorect username or password",Toast.LENGTH_SHORT);
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Username or password cannot be blank",Toast.LENGTH_SHORT);
                }


            }
        });
    }

    private boolean validate(){
        if(!etUsername.getText().toString().equalsIgnoreCase("")&&!etPassword.getText().toString().equalsIgnoreCase("")){
            return true;
        }else{
            return false;
        }
    }
}
