package com.example.gesangdianzi.broadcastbestpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;

class MyBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, final Intent intent) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("警告：");
        dialog.setMessage("您的账号已经在其他的房登录");
        dialog.setCancelable(false);
        dialog.setNegativeButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent1 = new Intent(context,LoginActivity.class);
                context.startActivity(intent1);
            }
        });
        dialog.show();

    }
}
