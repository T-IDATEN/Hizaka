package com.example.hizaka;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.navigation_home).setOnClickListener(this);
        findViewById(R.id.navigation_train).setOnClickListener(this);
        findViewById(R.id.navigation_tips).setOnClickListener(this);
        findViewById(R.id.navigation_emergency).setOnClickListener(this);

    }
    public void onClick1()
    {
        Intent intent = new Intent(this, MainActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
    public void onClick2()
    {
        Intent intent = new Intent(this, TipsActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
    public void onClick3()
    {
        Intent intent = new Intent(this, TipsActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
    public void onClick4()
    {
        Intent intent = new Intent(this, TipsActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }

    public void  onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.navigation_home:
                onClick1();
                break;
            case R.id.navigation_train:
                onClick2();
                break;
            case R.id.navigation_tips:
                onClick3();
                break;
            case R.id.navigation_emergency:
                onClick4();
                break;

        }
    }

}
