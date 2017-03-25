package com.github.alexpfx.app.android.samples.multitouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

/**
 * Created by alexandre on 25/03/2017.
 */

public class MultiTouchCustomView extends View {

    private static final int MAX = 5;
    private Random mRandom = new Random();

    public MultiTouchCustomView(Context context,
            @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private Paint[] mFingerPaints = new Paint[MAX];

    private void initPaints() {
        for (int i = 0; i < MAX; i++) {
            mFingerPaints[i] = createPaint(i);
        }
    }

    private Paint createPaint(int i) {
        Paint p = new Paint();
        p.setColor(Color.argb(200, i * 5, 100, 100));
        p.setStrokeWidth(i * 1.4f);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeCap(Paint.Cap.BUTT);
        return p;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;

    }

    @Override
    protected void onDraw(Canvas canvas) {


    }


}
