package com.example.gesangdianzi.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {
    private EditText et_number;
    private EditText et_password;
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_number = findViewById(R.id.et_number);
        et_password = findViewById(R.id.et_password);
        button = findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = et_number.getText().toString().trim();
                String password = et_password.getText().toString().trim();
                if (number.equals("admin") && (password.equals("123456"))){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this, "账号或者密码输入错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
