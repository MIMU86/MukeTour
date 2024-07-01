package com.example.muketour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.muketour.fragment.FindFragment;
import com.example.muketour.fragment.MainFragment;
import com.example.muketour.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout llMain,llFind,llMe;
    private MeFragment meFragment = new MeFragment();
    private FindFragment findFragment =new FindFragment();
    private MainFragment mainFragment=new MainFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();

        this.getSupportFragmentManager().beginTransaction()
                .add(R.id.mainId,mainFragment)
                .show(meFragment)
                .add(R.id.mainId,findFragment)
                .hide(findFragment)
                .add(R.id.mainId,meFragment)
                .hide(meFragment)
                .commit();
    }

    private void InitView() {
        llMain=(LinearLayout)findViewById(R.id.llMain);
        llFind=(LinearLayout)findViewById(R.id.llFind);
        llMe=(LinearLayout)findViewById(R.id.llMe);
        llMain.setOnClickListener(this);
        llFind.setOnClickListener(this);
        llMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.llMain:
                this.getSupportFragmentManager().beginTransaction()
                        .show(mainFragment)
                        .hide(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
            case R.id.llFind:
                this.getSupportFragmentManager().beginTransaction()
                        .hide(mainFragment)
                        .show(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
            case R.id.llMe:
                this.getSupportFragmentManager().beginTransaction()
                        .hide(mainFragment)
                        .hide(findFragment)
                        .show(meFragment)
                        .commit();
                break;
        }
    }
}