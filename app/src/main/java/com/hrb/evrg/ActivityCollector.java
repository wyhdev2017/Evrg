package com.hrb.evrg;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyh on 2018/11/13.
 */

public class ActivityCollector {

    public static List<Activity> activities=new ArrayList<>();

    /**
     * 添加活动
     * @param activity
     */
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void  removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finshAll(){
        for(Activity activity :activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
