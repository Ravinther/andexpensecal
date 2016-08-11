package com.expensemanager;

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
import com.viewpagerindicator.C0394c;
import com.viewpagerindicator.C0794a;

public class MyTabPageIndicator extends HorizontalScrollView implements C0394c {
    private static final CharSequence f3520a;
    private Runnable f3521b;
    private final OnClickListener f3522c;
    private final LinearLayout f3523d;
    private ViewPager f3524e;
    private bi f3525f;
    private int f3526g;
    private int f3527h;
    private acw f3528i;

    static {
        f3520a = "";
    }

    public MyTabPageIndicator(Context context) {
        this(context, null);
    }

    public MyTabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3522c = new acu(this);
        setHorizontalScrollBarEnabled(false);
        this.f3523d = new LinearLayout(context);
        addView(this.f3523d, new LayoutParams(-2, -1));
    }

    private void m3491a(int i, CharSequence charSequence, int i2) {
        View com_expensemanager_acx = new acx(this, getContext());
        com_expensemanager_acx.f3938b = i;
        com_expensemanager_acx.setFocusable(true);
        com_expensemanager_acx.setOnClickListener(this.f3522c);
        com_expensemanager_acx.setText(charSequence);
        if (i2 != 0) {
            com_expensemanager_acx.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.f3523d.addView(com_expensemanager_acx, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private void m3494c(int i) {
        View childAt = this.f3523d.getChildAt(i);
        if (this.f3521b != null) {
            removeCallbacks(this.f3521b);
        }
        this.f3521b = new acv(this, childAt);
        post(this.f3521b);
    }

    public void m3495a() {
        this.f3523d.removeAllViews();
        C0022y adapter = this.f3524e.getAdapter();
        C0794a c0794a = null;
        if (adapter instanceof C0794a) {
            c0794a = (C0794a) adapter;
        }
        int b = adapter.m138b();
        int i = 0;
        while (i < b) {
            CharSequence c = adapter.m144c(i);
            m3491a(i, c == null ? f3520a : c, c0794a != null ? c0794a.m7181a(i) : 0);
            i++;
        }
        if (this.f3527h > b) {
            this.f3527h = b - 1;
        }
        setCurrentItem(this.f3527h);
        requestLayout();
    }

    public void m3496a(int i) {
        setCurrentItem(i);
        if (this.f3525f != null) {
            this.f3525f.m824a(i);
        }
    }

    public void m3497a(int i, float f, int i2) {
        if (this.f3525f != null) {
            this.f3525f.m825a(i, f, i2);
        }
    }

    public void m3498b(int i) {
        if (this.f3525f != null) {
            this.f3525f.m826b(i);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3521b != null) {
            post(this.f3521b);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3521b != null) {
            removeCallbacks(this.f3521b);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f3523d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f3526g = -1;
        } else if (childCount > 2) {
            this.f3526g = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.f3526g = MeasureSpec.getSize(i) / 2;
        }
        this.f3526g = -1;
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        mode = getMeasuredWidth();
        if (z && measuredWidth != mode) {
            setCurrentItem(this.f3527h);
        }
    }

    public void setCurrentItem(int i) {
        if (this.f3524e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f3527h = i;
        this.f3524e.setCurrentItem(i);
        int childCount = this.f3523d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f3523d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m3494c(i);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(bi biVar) {
        this.f3525f = biVar;
    }

    public void setOnTabReselectedListener(acw com_expensemanager_acw) {
        this.f3528i = com_expensemanager_acw;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f3524e != viewPager) {
            if (this.f3524e != null) {
                this.f3524e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f3524e = viewPager;
            viewPager.setOnPageChangeListener(this);
            m3495a();
        }
    }
}
