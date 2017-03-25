package com.github.alexpfx.app.android.samples.multitouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

/**
 * Created by alexandre on 25/03/2017.
 */

public class MultiTouchCustomView extends View {
    private static final String TAG = "MultiTouchCustomView";
    private static final int MAX = 5;
    private Random mRandom = new Random();
    private int mPointerId;

    public MultiTouchCustomView(Context context,
                                @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    private Paint[] mFingerPaints = new Paint[MAX];
    private Path[] mFingerPaths = new Path[MAX];

    private void init() {
        for (int i = 0; i < MAX; i++) {
            mFingerPaints[i] = createPaint(i);
            mFingerPaths[i] = createPath(i);
        }
    }

    private Path createPath(int i) {
        Path p = new Path();
        return p;
    }

    private Paint createPaint(int i) {
        Paint p = new Paint();
        p.setColor(Color.argb(255, i * 5, 100, 100));
        p.setStrokeWidth((i + 1) * 4f);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeCap(Paint.Cap.BUTT);
        return p;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int actionIndex = MotionEventCompat.getActionIndex(event);
        int actionMasked = MotionEventCompat.getActionMasked(event);
        mPointerId = event.getPointerId(actionIndex);

        int pointerIndex = event.findPointerIndex(mPointerId);

        Log.d(TAG, "onTouchEvent: action " + actionMasked);
        invalidate();
        switch (actionMasked) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
                moveTo(event, pointerIndex, mPointerId);
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "moveTo: " + mPointerId);
                lineTo(event, pointerIndex, mPointerId);
                break;
            case MotionEvent.ACTION_POINTER_UP:
                Log.d(TAG, "onTouchEvent: PointerUp");
                break;
            case MotionEvent.ACTION_UP:
                resetPaths ();
                break;
        }


        if (mPointerId == 1) {
            Log.d(TAG, "onTouchEvent: " + String.format("index: %2d x: %2.2f", actionIndex, event.getX(actionIndex)));
        }

        float x = event.getX();
        float y = event.getY();

//        mFingerPaths[0].lineTo(x, y);
//        invalidate();

        return true;

    }

    private void resetPaths() {
        for (int i = 0; i < MAX; i++) {
            mFingerPaths[i].reset();
        }
    }

    private void lineTo(MotionEvent event, int pointerIndex, int pointerId) {
        mFingerPaths[mPointerId].lineTo(event.getX(pointerIndex), event.getY(pointerIndex));
    }

    private void moveTo(MotionEvent event, int pointerIndex, int pointerId) {
        mFingerPaths[pointerId].moveTo(event.getX(pointerIndex), event.getY(pointerIndex));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < MAX; i++) {
            canvas.drawPath(mFingerPaths[i], mFingerPaints[i]);
            invalidate();
        }

    }


}
