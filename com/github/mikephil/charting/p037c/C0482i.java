package com.github.mikephil.charting.p037c;

import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.github.mikephil.charting.p040d.C0505h;

/* renamed from: com.github.mikephil.charting.c.i */
public abstract class C0482i extends RelativeLayout {
    private void setupLayoutResource(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this);
        inflate.setLayoutParams(new LayoutParams(-2, -2));
        inflate.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
    }

    public void m4334a(Canvas canvas, float f, float f2) {
        float xOffset = ((float) getXOffset()) + f;
        float yOffset = ((float) getYOffset()) + f2;
        canvas.translate(xOffset, yOffset);
        draw(canvas);
        canvas.translate(-xOffset, -yOffset);
    }

    public abstract void m4335a(C0505h c0505h, int i);

    public abstract int getXOffset();

    public abstract int getYOffset();
}
