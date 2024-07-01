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

public class RegActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView regLinkLogin;
    private Button regBtnReg;
    private EditText regEPhone,regEPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        initView();
    }

    private void initView() {

        regLinkLogin= (TextView) findViewById(R.id.regLinkLogin);
        regBtnReg=(Button)findViewById(R.id.regBtnReg);
        regEPhone=(EditText)findViewById(R.id.regEPhone);
        regEPwd= (EditText)findViewById(R.id.regEPwd);
        regBtnReg.setOnClickListener(this);
        regLinkLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.regBtnReg:
                Toast.makeText(RegActivity.this,"注册成功",Toast.LENGTH_LONG).show();
                break;
            case R.id.regLinkLogin:
                Intent intent2=new Intent(RegActivity.this,LoginActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }

}