package com.example.justjava;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TypeWriter extends android.support.v7.widget.AppCompatTextView {
    private CharSequence mText;
    private int mIndex;
    private int mTextIndex;
    private long mDelay = 150;
    private List mListText;
    private long mLongDelay = 2000; // in ms

    public TypeWriter(Context context) {
        super(context);
    }

    public TypeWriter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private Handler mHandler = new Handler();
    private Runnable characterAdder = new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0, mIndex++));
            if (mIndex <= mText.length()) {
                mHandler.postDelayed(characterAdder, mDelay);
            }
        }
    };
    private Runnable textAdder = new Runnable() {
        @Override
        public void run() {

            if (mTextIndex <=mListText.size()) {
                mText = (CharSequence) mListText.get(mTextIndex);
                mTextIndex++;
                mHandler.postDelayed(symbolAdder, mLongDelay);
            } else{
                mTextIndex=0;
            }
            /*for (int j = 0; j < mListText.size(); j++) {
                mText = (CharSequence) mListText.get(j);
                for(int h = 0;h <= mText.length();h++) {
                    setText(mText.subSequence(0, h++));
                    mHandler.postDelayed(textAdder, mDelay);
                }
            }*/
        }
    };
    private Runnable symbolAdder = new Runnable() {
        @Override
        public void run() {
            setText(mText.subSequence(0, mIndex++));
            if (mIndex <= mText.length()) {
                mHandler.postDelayed(symbolAdder, mDelay);
            } else {
                mIndex = 0;
                mHandler.postDelayed(textAdder,mDelay);
            }
        }
    };

    public void animateText(CharSequence txt) {
            mText = txt;
            mIndex = 0;

            setText("");
            mHandler.removeCallbacks(characterAdder);
            mHandler.postDelayed(characterAdder, mDelay);
    }

    public void animateListOfText(List<String> bigText) {
        /*setText("");
        mHandler.removeCallbacks(characterAdder);
       */
            mListText = bigText;
            //mText = bigText.get(j);
            mTextIndex = 0;
            mIndex = 0;
            mHandler.postDelayed(textAdder, mDelay);

    }

        public void setCharacterDelay(long m) {
            mDelay = m;
        }
}



