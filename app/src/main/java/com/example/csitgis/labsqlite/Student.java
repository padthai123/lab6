package com.example.csitgis.labsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Student extends AppCompatActivity {

    public static final String TABLE_NAME = ;

    @Override
    public class Student {
        public final String TABLE_NAME = "student";
        public final String COLUMN_ID = "std_id";
        public static final String COLUMN_NAME = "std_name";

        private String id;
        private String name;


        public final String CREATE_TABLE = "CREATE TABLE "
                + TABLE_NAME + "("
                + COLUMN_ID + "TEXT,"
                + COLUMN_NAME + "TEXT" + ")";

        public Student(String id, String name){
            this.id = id;
            this.name = name;
        }

        public Student() {}
        public String getId() { return id; }
        public void setId(String id){ this.id = id;}

        public String getName(){ return name;}
        public void setName(String name){this.name = name;}
    }

    public class CREATE_TABLE {
    }
}