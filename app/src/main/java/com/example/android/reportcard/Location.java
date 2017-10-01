package com.example.android.reportcard;

/**
 * Created by marvinramirez on 2017-09-25.
 */


public class Location {

    private String mDefaultAddress;

    private String mDefaultName;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String defaultAddress, String defaultName){
        mDefaultAddress = defaultAddress;
        mDefaultName = defaultName;
    }

    public Location(String defaultAddress, String defaultName, int imageResourceId) {
        mDefaultAddress = defaultAddress;
        mDefaultName = defaultName;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultAddress() {
        return mDefaultAddress;
    }

    public String getDefaultName() {
        return mDefaultName;
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
