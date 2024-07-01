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

public class FindActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView findBtnClose;
    private Button findBtnFind;
    private EditText findEPhone,findEOldPwd,findEPwd,findEPwds;
    private TextView findLinkReg,findLinkLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        initView();
    }

    private void initView() {

        findBtnClose= (ImageView)findViewById(R.id.findBtnClose);
        findBtnFind=(Button)findViewById(R.id.findBtnFind);
        findEPhone=(EditText)findViewById(R.id.findEPhone);
        findEOldPwd=(EditText)findViewById(R.id.findEOldPwd);
        findEPwd= (EditText)findViewById(R.id.findEPwd);
        findEPwds= (EditText)findViewById(R.id.findEPwds);
        findLinkReg=(TextView)findViewById(R.id.findLinkReg);
        findLinkLogin= (TextView)findViewById(R.id.findLinkLogin);

        findBtnClose.setOnClickListener(this);
        findBtnFind.setOnClickListener(this);
        findLinkReg.setOnClickListener(this);
        findLinkLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.findBtnClose:
                finish();
                break;
            case R.id.findBtnFind:
                Toast.makeText(FindActivity.this,"修改成功",Toast.LENGTH_LONG).show();
                break;
            case R.id.findLinkReg:
                Intent intent=new Intent(FindActivity.this,RegActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.findLinkLogin:
                Intent intent2=new Intent(FindActivity.this,LoginActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }

}