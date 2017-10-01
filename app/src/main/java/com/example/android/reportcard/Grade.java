package com.example.android.reportcard;

/**
 * Created by marvinramirez on 2017-09-25.
 */


public class Grade {

    private String mDefaultGrade;

    private String mDefaultClass;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Grade(String defaultGrade, String defaultClass){
        mDefaultGrade = defaultGrade;
        mDefaultClass = defaultClass;
    }

    public Grade(String defaultGrade, String defaultClass, int imageResourceId,
                int audioResourceId) {
        mDefaultGrade = defaultGrade;
        mDefaultClass = defaultClass;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultGrade () {
        return mDefaultGrade;
    }

    public String getDefaultClass () {
        return mDefaultClass;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;


    }
}
