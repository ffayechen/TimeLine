package com.clover.njust.utils;

import android.content.Context;

/**
 * Created by lenovo-p on 2017/6/8.
 */

public class DbManager {

    private static MySQLiteHelper helper;
    public static MySQLiteHelper getInstance(Context context){
        if (helper == null){
            helper = new MySQLiteHelper(context);
        }
        return helper;
    }
}
