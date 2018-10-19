package com.example.csitgis.labsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.SQLClientInfoException;

public class DatabaseHelper extends AppCompatActivity {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "student_db";
    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME, factory:null ,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Student.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int il){
        db.execSQL("DROP TABLE IF EXISTS " + Student.TABLE_NAME);
        onCreate(db);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_helper);
    }
}
