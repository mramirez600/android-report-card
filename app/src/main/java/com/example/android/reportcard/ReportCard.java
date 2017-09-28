package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportCard extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //creare array of words
            ArrayList<Grade> grades = new ArrayList<Grade>();

            grades.add(new Grade("A", "Math"));
            grades.add(new Grade("A+", "Science"));
            grades.add(new Grade("B", "English"));
            grades.add(new Grade("B-", "Art"));


            GradeAdapter adapter =
                    new GradeAdapter(this, grades);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

            Log.v("ReportActivity", "Current grade: " + grades);
        }

}
