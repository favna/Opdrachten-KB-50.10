package com.group10.companies;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Stefan on 2015-12-07.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context) {
        super(context, "Company", null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Not implemented
        db.execSQL("DROP TABLE IF EXISTS company");
        db.execSQL("DROP TABLE IF EXISTS company_picture");
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE company (id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), history VARCHAR(255), website VARCHAR(255), telephonenumber VARCHAR(50), city VARCHAR(100), address VARCHAR(100), longitude VARCHAR(50), latitude VARCHAR(50))");
        db.execSQL("CREATE TABLE company_picture (id INTEGER PRIMARY KEY AUTO_INCREMENT, company_id INTEGER, url VARCHAR(100))");
    }
}

