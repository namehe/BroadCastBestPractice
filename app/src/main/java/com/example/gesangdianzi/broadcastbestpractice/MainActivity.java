package com.example.gesangdianzi.broadcastbestpractice;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    private Button forced_offline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forced_offline = findViewById(R.id.forced_offline);
        forced_offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.gesangdianzi.broadcastbestpractice");
                sendBroadcast(intent);
            }
        });
    }
}
