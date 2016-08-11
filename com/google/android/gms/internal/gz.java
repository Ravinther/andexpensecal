package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class gz extends SQLiteOpenHelper {
    final /* synthetic */ gy f6702a;

    public gz(gy gyVar, Context context, String str) {
        this.f6702a = gyVar;
        super(context, str, null, 4);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(gy.f6698a);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ly.m6070c("Database updated from version " + i + " to version " + i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sQLiteDatabase);
    }
}
