package com.example.gesangdianzi.broadcastbestpractice;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    private MyBroadCast broadCast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
        Log.d("BaseActivity:",getClass().getSimpleName());
    }

    /**
     * 在onResume和onPause 方法中操作广播视为了只需要处于栈顶的activity注册和接收广播就可以了
     */
    @Override
    protected void onResume() {
        super.onResume();

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.gesangdianzi.broadcastbestpractice");
        broadCast = new MyBroadCast();
        registerReceiver(broadCast,intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(broadCast);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);

    }
}
