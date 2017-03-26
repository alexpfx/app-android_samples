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

    Random random = new Random();

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
        p.setColor(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
        p.setStrokeWidth((i + 1) * 40f);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeCap(Paint.Cap.ROUND);
        return p;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int actionIndex = event.getActionIndex();
        int pointerId = event.getPointerId(actionIndex);

        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
                moveTo(event, pointerId);
                break;
            case MotionEvent.ACTION_MOVE:
                for (int i = 0; i < event.getPointerCount(); i++) {
                    lineTo(event, event.getPointerId(i));
                }
                break;
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_UP:
                resetPath(pointerId);
                return true;

        }
        invalidate();
        return true;

    }

    private void resetPath(int index) {
        mFingerPaths[index].reset();
    }

    private void lineTo(MotionEvent event, int arrayIndex) {
        if (arrayIndex > MAX){
            return;
        }
        int pointerIndex = event.findPointerIndex(arrayIndex);
        mFingerPaths[arrayIndex].lineTo(event.getX(pointerIndex), event.getY(pointerIndex));
    }

    private void moveTo(MotionEvent event, int arrayIndex) {
        if (arrayIndex > MAX){
            return;
        }
        int pointerIndex = event.findPointerIndex(arrayIndex);
        mFingerPaths[arrayIndex].moveTo(event.getX(pointerIndex), event.getY(pointerIndex));
    }

    void out(String m, Object... s) {
        Log.d(TAG, String.format(m, s));
    }

    void out(Object... s) {
        StringBuilder sb = new StringBuilder();
        for (Object o : s) {
            sb.append(o).append(" ");
        }
        sb.append("\n");
        Log.d(TAG, "out: " + sb.toString());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < MAX; i++) {
            canvas.drawPath(mFingerPaths[i], mFingerPaints[i]);
        }

    }


}
