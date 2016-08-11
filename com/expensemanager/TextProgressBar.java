package com.expensemanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class TextProgressBar extends ProgressBar {
    private String f3650a;
    private Paint f3651b;

    public TextProgressBar(Context context) {
        super(context);
        this.f3650a = "HP";
        this.f3651b = new Paint();
        this.f3651b.setColor(-16777216);
    }

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3650a = "HP";
        this.f3651b = new Paint();
        this.f3651b.setColor(-16777216);
    }

    public TextProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3650a = "HP";
        this.f3651b = new Paint();
        this.f3651b.setColor(-16777216);
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect();
        this.f3651b.getTextBounds(this.f3650a, 0, this.f3650a.length(), rect);
        canvas.drawText(this.f3650a, (float) ((getWidth() / 2) - rect.centerX()), (float) ((getHeight() / 2) - rect.centerY()), this.f3651b);
    }

    public synchronized void setText(String str) {
        this.f3650a = str;
        drawableStateChanged();
    }

    public void setTextColor(int i) {
        this.f3651b.setColor(i);
        this.f3651b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f3651b.setFlags(1);
        this.f3651b.setTextSize(getResources().getDisplayMetrics().density * 14.0f);
        drawableStateChanged();
    }
}
