package com.expensemanager;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

public class TouchListView extends ListView {
    private ImageView f3663a;
    private WindowManager f3664b;
    private LayoutParams f3665c;
    private int f3666d;
    private int f3667e;
    private int f3668f;
    private int f3669g;
    private ahy f3670h;
    private ahz f3671i;
    private aia f3672j;
    private int f3673k;
    private int f3674l;
    private int f3675m;
    private GestureDetector f3676n;
    private int f3677o;
    private Rect f3678p;
    private Bitmap f3679q;
    private final int f3680r;
    private int f3681s;
    private int f3682t;
    private int f3683u;
    private int f3684v;

    public TouchListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3677o = -1;
        this.f3678p = new Rect();
        this.f3681s = -1;
        this.f3682t = -1;
        this.f3683u = -1;
        this.f3684v = 0;
        this.f3680r = ViewConfiguration.get(context).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, adv.TouchListView, 0, 0);
            this.f3681s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f3682t = obtainStyledAttributes.getDimensionPixelSize(1, this.f3681s);
            this.f3683u = obtainStyledAttributes.getResourceId(2, -1);
            this.f3684v = obtainStyledAttributes.getColor(3, 0);
            this.f3677o = obtainStyledAttributes.getInt(4, -1);
            obtainStyledAttributes.recycle();
        }
    }

    private int m3628a(int i) {
        int i2 = (i - this.f3668f) - 32;
        int a = m3629a(0, i2);
        return a >= 0 ? a <= this.f3667e ? a + 1 : a : i2 < 0 ? 0 : a;
    }

    private int m3629a(int i, int i2) {
        Rect rect = this.f3678p;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).getHitRect(rect);
            if (rect.contains(i, i2)) {
                return childCount + getFirstVisiblePosition();
            }
        }
        return -1;
    }

    private void m3631a() {
        int firstVisiblePosition = this.f3666d - getFirstVisiblePosition();
        if (this.f3666d > this.f3667e) {
            firstVisiblePosition++;
        }
        View childAt = getChildAt(this.f3667e - getFirstVisiblePosition());
        int i = 0;
        while (true) {
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                int i2;
                int i3 = this.f3681s;
                if (childAt2.equals(childAt)) {
                    if (this.f3666d == this.f3667e) {
                        i2 = 4;
                    } else {
                        i3 = 1;
                        i2 = 0;
                    }
                } else if (i != firstVisiblePosition || this.f3666d >= getCount() - 1) {
                    i2 = 0;
                } else {
                    i3 = this.f3682t;
                    i2 = 0;
                }
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.height = i3;
                childAt2.setLayoutParams(layoutParams);
                childAt2.setVisibility(i2);
                i++;
            } else {
                return;
            }
        }
    }

    private void m3632a(Bitmap bitmap, int i) {
        m3636b();
        this.f3665c = new LayoutParams();
        this.f3665c.gravity = 48;
        this.f3665c.x = 0;
        this.f3665c.y = (i - this.f3668f) + this.f3669g;
        this.f3665c.height = -2;
        this.f3665c.width = -2;
        this.f3665c.flags = 408;
        this.f3665c.format = -3;
        this.f3665c.windowAnimations = 0;
        View imageView = new ImageView(getContext());
        imageView.setBackgroundColor(this.f3684v);
        imageView.setImageBitmap(bitmap);
        this.f3679q = bitmap;
        this.f3664b = (WindowManager) getContext().getSystemService("window");
        this.f3664b.addView(imageView, this.f3665c);
        this.f3663a = imageView;
    }

    private void m3634a(boolean z) {
        int i = 0;
        while (true) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                if (z) {
                    int firstVisiblePosition = getFirstVisiblePosition();
                    int top = getChildAt(0).getTop();
                    setAdapter(getAdapter());
                    setSelectionFromTop(firstVisiblePosition, top);
                }
                layoutChildren();
                childAt = getChildAt(i);
                if (childAt == null) {
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = this.f3681s;
            childAt.setLayoutParams(layoutParams);
            childAt.setVisibility(0);
            i++;
        }
    }

    private void m3636b() {
        if (this.f3663a != null) {
            ((WindowManager) getContext().getSystemService("window")).removeView(this.f3663a);
            this.f3663a.setImageDrawable(null);
            this.f3663a = null;
        }
        if (this.f3679q != null) {
            this.f3679q.recycle();
            this.f3679q = null;
        }
    }

    private void m3637b(int i) {
        if (i >= this.f3675m / 3) {
            this.f3673k = this.f3675m / 3;
        }
        if (i <= (this.f3675m * 2) / 3) {
            this.f3674l = (this.f3675m * 2) / 3;
        }
    }

    private void m3638b(int i, int i2) {
        float f = 1.0f;
        int width = this.f3663a.getWidth();
        if (this.f3677o == 1) {
            if (i > width / 2) {
                f = ((float) (width - i)) / ((float) (width / 2));
            }
            this.f3665c.alpha = f;
        } else if (this.f3677o == 2) {
            if (i < width / 2) {
                f = ((float) i) / ((float) (width / 2));
            }
            this.f3665c.alpha = f;
        }
        this.f3665c.y = (i2 - this.f3668f) + this.f3669g;
        this.f3664b.updateViewLayout(this.f3663a, this.f3665c);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3672j != null && this.f3676n == null && this.f3677o == 0) {
            this.f3676n = new GestureDetector(getContext(), new ahx(this));
        }
        if (!(this.f3670h == null && this.f3671i == null)) {
            switch (motionEvent.getAction()) {
                case C0607c.AdsAttrs_adSize /*0*/:
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int pointToPosition = pointToPosition(x, y);
                    if (pointToPosition != -1) {
                        ViewGroup viewGroup = (ViewGroup) getChildAt(pointToPosition - getFirstVisiblePosition());
                        this.f3668f = y - viewGroup.getTop();
                        this.f3669g = ((int) motionEvent.getRawY()) - y;
                        View findViewById = viewGroup.findViewById(this.f3683u);
                        Rect rect = this.f3678p;
                        rect.left = findViewById.getLeft();
                        rect.right = findViewById.getRight();
                        rect.top = findViewById.getTop();
                        rect.bottom = findViewById.getBottom();
                        if (rect.left >= x || x >= rect.right) {
                            this.f3663a = null;
                            break;
                        }
                        viewGroup.setDrawingCacheEnabled(true);
                        m3632a(Bitmap.createBitmap(viewGroup.getDrawingCache()), y);
                        this.f3666d = pointToPosition;
                        this.f3667e = this.f3666d;
                        this.f3675m = getHeight();
                        int i = this.f3680r;
                        this.f3673k = Math.min(y - i, this.f3675m / 3);
                        this.f3674l = Math.max(i + y, (this.f3675m * 2) / 3);
                        return false;
                    }
                    break;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3676n != null) {
            this.f3676n.onTouchEvent(motionEvent);
        }
        if ((this.f3670h == null && this.f3671i == null) || this.f3663a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        switch (action) {
            case C0607c.AdsAttrs_adSize /*0*/:
            case C0607c.LoadingImageView_circleCrop /*2*/:
                int y = (int) motionEvent.getY();
                m3638b((int) motionEvent.getX(), y);
                int a = m3628a(y);
                if (a >= 0) {
                    if (action == 0 || a != this.f3666d) {
                        if (this.f3670h != null) {
                            this.f3670h.m3844a(this.f3666d, a);
                        }
                        this.f3666d = a;
                        m3631a();
                    }
                    m3637b(y);
                    if (y > this.f3674l) {
                        a = y > (this.f3675m + this.f3674l) / 2 ? 16 : 4;
                    } else if (y < this.f3673k) {
                        a = y < this.f3673k / 2 ? -16 : -4;
                    } else {
                        a = 0;
                    }
                    if (a != 0) {
                        action = pointToPosition(0, this.f3675m / 2);
                        if (action == -1) {
                            action = pointToPosition(0, ((this.f3675m / 2) + getDividerHeight()) + 64);
                        }
                        View childAt = getChildAt(action - getFirstVisiblePosition());
                        if (childAt != null) {
                            setSelectionFromTop(action, childAt.getTop() - a);
                            break;
                        }
                    }
                }
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                Rect rect = this.f3678p;
                this.f3663a.getDrawingRect(rect);
                m3636b();
                if (this.f3677o == 1 && motionEvent.getX() > ((float) (rect.left + ((rect.width() * 3) / 4)))) {
                    if (this.f3672j != null) {
                        this.f3672j.m3835a(this.f3667e);
                    }
                    m3634a(true);
                    break;
                }
                if (this.f3677o == 2) {
                    if (motionEvent.getX() < ((float) ((rect.width() / 4) + rect.left))) {
                        if (this.f3672j != null) {
                            this.f3672j.m3835a(this.f3667e);
                        }
                        m3634a(true);
                        break;
                    }
                }
                if (this.f3671i != null && this.f3666d >= 0 && this.f3666d < getCount()) {
                    this.f3671i.m3833a(this.f3667e, this.f3666d);
                }
                m3634a(false);
                break;
                break;
        }
        return true;
    }

    public void setDragListener(ahy com_expensemanager_ahy) {
        this.f3670h = com_expensemanager_ahy;
    }

    public void setDropListener(ahz com_expensemanager_ahz) {
        this.f3671i = com_expensemanager_ahz;
    }

    public void setRemoveListener(aia com_expensemanager_aia) {
        this.f3672j = com_expensemanager_aia;
    }
}
