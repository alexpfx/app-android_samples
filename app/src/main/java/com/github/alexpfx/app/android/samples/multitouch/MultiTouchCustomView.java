package com.github.alexpfx.app.android.samples.multitouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
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
        p.setColor(Color.argb(56, i * 5, 100, 100));
        p.setStrokeWidth(i * 1.5f);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeCap(Paint.Cap.BUTT);
        return p;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "onTouchEvent: ");
        float x = event.getX();
        float y = event.getY();

        mFingerPaths[0].lineTo(x, y);
        invalidate();
        Log.d(TAG, "onTouchEvent: ");
        return true;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < MAX; i++) {
            canvas.drawPath(mFingerPaths[i], mFingerPaints[i]);
        }

    }


}
