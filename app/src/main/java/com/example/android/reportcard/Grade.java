package com.example.android.reportcard;

/**
 * Created by marvinramirez on 2017-09-25.
 */


public class Grade {

    private String mDefaultGrade;

    private String mDefaultClass;

    public Grade(String defaultGrade, String defaultClass){
        mDefaultGrade = defaultGrade;
        mDefaultClass = defaultClass;
    }

    public String getDefaultGrade () {
        return mDefaultGrade;
    }

    public String getDefaultClass () {
        return mDefaultClass;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "mDefaultGrade='" + mDefaultGrade + '\'' +
                ", mDefaultClass='" + mDefaultClass + '\'' +
                '}';
    }
}
