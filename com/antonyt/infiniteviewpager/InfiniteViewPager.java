package com.antonyt.infiniteviewpager;

import android.content.Context;
import android.support.v4.view.C0022y;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import p000a.p001a.C0000a;

public class InfiniteViewPager extends ViewPager {
    private ArrayList<C0000a> f2322a;
    private boolean f2323b;
    private boolean f2324c;
    private int f2325d;

    public InfiniteViewPager(Context context) {
        super(context);
        this.f2323b = true;
        this.f2324c = false;
        this.f2325d = 0;
    }

    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2323b = true;
        this.f2324c = false;
        this.f2325d = 0;
    }

    public ArrayList<C0000a> getDatesInMonth() {
        return this.f2322a;
    }

    public boolean isEnabled() {
        return this.f2323b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2323b ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = this.f2322a.size() / 7;
        int i3 = MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? 1 : 0;
        int measuredHeight = getMeasuredHeight();
        if (i3 != 0 && this.f2325d == 0) {
            i = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
                this.f2325d = childAt.getMeasuredHeight() / size;
            }
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec((this.f2324c ? this.f2325d * 6 : this.f2325d * size) + 3, 1073741824));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f2323b ? super.onTouchEvent(motionEvent) : false;
    }

    public void setAdapter(C0022y c0022y) {
        super.setAdapter(c0022y);
        setCurrentItem(1000);
    }

    public void setDatesInMonth(ArrayList<C0000a> arrayList) {
        this.f2322a = arrayList;
    }

    public void setEnabled(boolean z) {
        this.f2323b = z;
    }

    public void setSixWeeksInCalendar(boolean z) {
        this.f2324c = z;
        this.f2325d = 0;
    }
}
