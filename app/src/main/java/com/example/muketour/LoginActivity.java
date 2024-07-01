package com.example.muketour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView loginBtnClose;
    private Button loginBtnLogin;
    private EditText loginEUser,loginEPwd;
    private TextView loginLinkPwd,loginLinkReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {

        loginBtnClose= (ImageView)findViewById(R.id.loginBtnClose);
        loginBtnLogin=(Button)findViewById(R.id.loginBtnLogin);
        loginEUser=(EditText)findViewById(R.id.loginEUser);
        loginEPwd= (EditText)findViewById(R.id.loginEPwd);
        loginLinkPwd=(TextView)findViewById(R.id.loginLinkPwd);
        loginLinkReg= (TextView)findViewById(R.id.loginLinkReg);
        loginBtnClose.setOnClickListener(this);
        loginBtnLogin.setOnClickListener(this);
        loginLinkPwd.setOnClickListener(this);
        loginLinkReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.loginBtnClose:
                finish();
                break;
            case R.id.loginBtnLogin:
                Toast.makeText(LoginActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                break;
            case R.id.loginLinkPwd:
                Intent intent=new Intent(LoginActivity.this,FindActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.loginLinkReg:
                Intent intent2=new Intent(LoginActivity.this,RegActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}