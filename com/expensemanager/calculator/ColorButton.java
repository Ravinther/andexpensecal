package com.expensemanager.calculator;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

public class ColorButton extends Button implements OnClickListener {
    int f4292a;
    float f4293b;
    float f4294c;
    long f4295d;
    OnClickListener f4296e;
    Paint f4297f;

    public ColorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Calculator calculator = (Calculator) context;
        m3900a(calculator);
        this.f4296e = calculator.f4282a;
        setOnClickListener(this);
    }

    private void m3899a(int i, Canvas canvas) {
        this.f4297f.setColor(((255 - ((i * 255) / 350)) << 24) | this.f4292a);
        canvas.drawRect(1.0f, 1.0f, (float) (getWidth() - 1), (float) (getHeight() - 1), this.f4297f);
    }

    private void m3900a(Calculator calculator) {
        Resources resources = getResources();
        this.f4292a = resources.getColor(2131361828);
        this.f4297f = new Paint();
        this.f4297f.setStyle(Style.STROKE);
        this.f4297f.setStrokeWidth(2.0f);
        getPaint().setColor(resources.getColor(2131361793));
        this.f4295d = -1;
        calculator.m3894a(this);
    }

    private void m3901b() {
        Paint paint = getPaint();
        this.f4293b = (((float) getWidth()) - paint.measureText(getText().toString())) / 2.0f;
        this.f4294c = ((((float) getHeight()) - paint.ascent()) - paint.descent()) / 2.0f;
    }

    public void m3902a() {
        this.f4295d = System.currentTimeMillis();
        invalidate();
    }

    public void onClick(View view) {
        this.f4296e.onClick(this);
    }

    public void onDraw(Canvas canvas) {
        if (this.f4295d != -1) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f4295d);
            if (currentTimeMillis >= 350) {
                this.f4295d = -1;
            } else {
                m3899a(currentTimeMillis, canvas);
                postInvalidateDelayed(10);
            }
        } else if (isPressed()) {
            m3899a(0, canvas);
        }
        CharSequence text = getText();
        canvas.drawText(text, 0, text.length(), this.f4293b, this.f4294c, getPaint());
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m3901b();
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m3901b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        switch (motionEvent.getAction()) {
            case C0607c.AdsAttrs_adSize /*0*/:
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                invalidate();
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m3902a();
                break;
        }
        return onTouchEvent;
    }
}
