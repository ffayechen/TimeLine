package com.clover.njust.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;

/**
 * Created by lenovo-p on 2017/6/8.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    public MySQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public MySQLiteHelper(Context context) {
        super(context, Constant.DATABASE_NAME, null, Constant.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table "+Constant.TABLE_NAME+"(id Integer primary key, " +
                "title varchar(30), " +
                "createTimeStack varchar(30), " +
                "startDate varchar(10), " +
                "endDate varchar(10), " +
                "startTime varchar(10), " +
                "endTime varchar(10), " +
                "classifier varchar(10), " +
                "priority Integer, " +
                "isClock Integer, " +
                "isRepeat Integer, " +
                "isTop Integer, " +
                "repeatType varchar(10), " +
                "address varchar(10), " +
                "pictureURI varchar(30), " +
                "remarks varchar(100) " +
                ")";
        db.execSQL(sql);
        Log.i("1","创建数据库成功！");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
