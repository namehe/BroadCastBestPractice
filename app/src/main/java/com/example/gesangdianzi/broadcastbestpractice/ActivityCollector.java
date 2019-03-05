package com.example.gesangdianzi.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

class ActivityCollector {
    static List<Activity>  list = new ArrayList<>();

    static void addActivity(Activity activity){
        list.add(activity);
    }

    static void removeActivity(Activity activity){
        list.remove(activity);
    }

    static void finishAll(){
        for (Activity activity:list){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
