package com.example.spanish;

public class Word {


    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mspanishTranslation;
    /**
     * Image resource ID for the word
     */
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String spanishTranslation,  int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mspanishTranslation = spanishTranslation;
        mAudioResourceId = audioResourceId;
    }


    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId,  int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mspanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getspanishTranslation() {
        return mspanishTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}