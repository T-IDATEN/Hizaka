package com.example.hizaka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TipsActivity extends AppCompatActivity
        implements View.OnClickListener
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        // ListViewに表示するリスト項目をArrayListで準備
        ArrayList data = new ArrayList<>();
        data.add("How to use trains");
        data.add("How to use Buses");
        data.add("How to use public phone");
        data.add("Go to hosipital");
        data.add("Something was stolen");
        data.add("Manner of eat");
        // リスト項目とListViewを対応付けるArrayAdapterを用意する
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        // ListViewにArrayAdapterを設定する
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

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

    @Override
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
