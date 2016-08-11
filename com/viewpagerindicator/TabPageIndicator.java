package com.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.C0022y;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bi;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class TabPageIndicator extends HorizontalScrollView implements C0394c {
    private static final CharSequence f7776a;
    private Runnable f7777b;
    private final OnClickListener f7778c;
    private final C0795b f7779d;
    private ViewPager f7780e;
    private bi f7781f;
    private int f7782g;
    private int f7783h;
    private C0800h f7784i;

    static {
        f7776a = "";
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7778c = new C0798f(this);
        setHorizontalScrollBarEnabled(false);
        this.f7779d = new C0795b(context, C0797e.vpiTabPageIndicatorStyle);
        addView(this.f7779d, new LayoutParams(-2, -1));
    }

    private void m7173a(int i, CharSequence charSequence, int i2) {
        View c0801i = new C0801i(this, getContext());
        c0801i.f7795b = i;
        c0801i.setFocusable(true);
        c0801i.setOnClickListener(this.f7778c);
        c0801i.setText(charSequence);
        if (i2 != 0) {
            c0801i.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.f7779d.addView(c0801i, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private void m7176c(int i) {
        View childAt = this.f7779d.getChildAt(i);
        if (this.f7777b != null) {
            removeCallbacks(this.f7777b);
        }
        this.f7777b = new C0799g(this, childAt);
        post(this.f7777b);
    }

    public void m7177a() {
        this.f7779d.removeAllViews();
        C0022y adapter = this.f7780e.getAdapter();
        C0794a c0794a = null;
        if (adapter instanceof C0794a) {
            c0794a = (C0794a) adapter;
        }
        int b = adapter.m138b();
        int i = 0;
        while (i < b) {
            CharSequence c = adapter.m144c(i);
            m7173a(i, c == null ? f7776a : c, c0794a != null ? c0794a.m7181a(i) : 0);
            i++;
        }
        if (this.f7783h > b) {
            this.f7783h = b - 1;
        }
        setCurrentItem(this.f7783h);
        requestLayout();
    }

    public void m7178a(int i) {
        setCurrentItem(i);
        if (this.f7781f != null) {
            this.f7781f.m824a(i);
        }
    }

    public void m7179a(int i, float f, int i2) {
        if (this.f7781f != null) {
            this.f7781f.m825a(i, f, i2);
        }
    }

    public void m7180b(int i) {
        if (this.f7781f != null) {
            this.f7781f.m826b(i);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7777b != null) {
            post(this.f7777b);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7777b != null) {
            removeCallbacks(this.f7777b);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f7779d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f7782g = -1;
        } else if (childCount > 2) {
            this.f7782g = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.f7782g = MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        mode = getMeasuredWidth();
        if (z && measuredWidth != mode) {
            setCurrentItem(this.f7783h);
        }
    }

    public void setCurrentItem(int i) {
        if (this.f7780e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f7783h = i;
        this.f7780e.setCurrentItem(i);
        int childCount = this.f7779d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f7779d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m7176c(i);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(bi biVar) {
        this.f7781f = biVar;
    }

    public void setOnTabReselectedListener(C0800h c0800h) {
        this.f7784i = c0800h;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f7780e != viewPager) {
            if (this.f7780e != null) {
                this.f7780e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f7780e = viewPager;
            viewPager.setOnPageChangeListener(this);
            m7177a();
        }
    }
}
