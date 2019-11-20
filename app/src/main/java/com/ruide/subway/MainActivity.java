package com.ruide.subway;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://www.cnblogs.com/dongweiq/p/10487511.html
        // 最小宽度适配 计算方法，得出最小宽度值
        Configuration config = getResources().getConfiguration();
        int a = config.smallestScreenWidthDp;
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }



}
