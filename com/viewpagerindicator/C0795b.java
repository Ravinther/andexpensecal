package com.viewpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.viewpagerindicator.b */
class C0795b extends LinearLayout {
    private static final int[] f7785a;
    private Drawable f7786b;
    private int f7787c;
    private int f7788d;
    private int f7789e;
    private int f7790f;

    static {
        f7785a = new int[]{16843049, 16843561, 16843562};
    }

    public C0795b(Context context, int i) {
        super(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f7785a, i, 0);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.f7790f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f7789e = obtainStyledAttributes.getInteger(1, 0);
        obtainStyledAttributes.recycle();
    }

    private void m7182a(Canvas canvas) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m7184a(i))) {
                m7183a(canvas, childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin);
            }
            i++;
        }
        if (m7184a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            m7183a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f7788d : childAt2.getBottom());
        }
    }

    private void m7183a(Canvas canvas, int i) {
        this.f7786b.setBounds(getPaddingLeft() + this.f7790f, i, (getWidth() - getPaddingRight()) - this.f7790f, this.f7788d + i);
        this.f7786b.draw(canvas);
    }

    private boolean m7184a(int i) {
        if (i == 0 || i == getChildCount() || (this.f7789e & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    private void m7185b(Canvas canvas) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m7184a(i))) {
                m7186b(canvas, childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
            i++;
        }
        if (m7184a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            m7186b(canvas, childAt2 == null ? (getWidth() - getPaddingRight()) - this.f7787c : childAt2.getRight());
        }
    }

    private void m7186b(Canvas canvas, int i) {
        this.f7786b.setBounds(i, getPaddingTop() + this.f7790f, this.f7787c + i, (getHeight() - getPaddingBottom()) - this.f7790f);
        this.f7786b.draw(canvas);
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (m7184a(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f7788d;
            } else {
                layoutParams.leftMargin = this.f7787c;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && m7184a(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f7788d;
            } else {
                layoutParams.rightMargin = this.f7787c;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f7786b != null) {
            if (getOrientation() == 1) {
                m7182a(canvas);
            } else {
                m7185b(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f7786b) {
            this.f7786b = drawable;
            if (drawable != null) {
                this.f7787c = drawable.getIntrinsicWidth();
                this.f7788d = drawable.getIntrinsicHeight();
            } else {
                this.f7787c = 0;
                this.f7788d = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }
}
