package com.github.mikephil.charting.p032f;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import com.expensemanager.adv;
import com.github.mikephil.charting.charts.C0491a;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.github.mikephil.charting.p039h.C0545l;
import com.github.mikephil.charting.p040d.C0500d;
import com.github.mikephil.charting.p040d.C0502g;
import com.github.mikephil.charting.p040d.C0503e;
import com.github.mikephil.charting.p040d.C0505h;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

/* renamed from: com.github.mikephil.charting.f.a */
public class C0514a<T extends C0491a<? extends C0500d<? extends C0503e<? extends C0505h>>>> extends SimpleOnGestureListener implements OnTouchListener {
    private Matrix f5814a;
    private Matrix f5815b;
    private PointF f5816c;
    private PointF f5817d;
    private int f5818e;
    private float f5819f;
    private float f5820g;
    private float f5821h;
    private C0538d f5822i;
    private C0502g<?> f5823j;
    private T f5824k;
    private GestureDetector f5825l;
    private VelocityTracker f5826m;
    private long f5827n;
    private PointF f5828o;
    private PointF f5829p;

    public C0514a(T t, Matrix matrix) {
        this.f5814a = new Matrix();
        this.f5815b = new Matrix();
        this.f5816c = new PointF();
        this.f5817d = new PointF();
        this.f5818e = 0;
        this.f5819f = 1.0f;
        this.f5820g = 1.0f;
        this.f5821h = 1.0f;
        this.f5827n = 0;
        this.f5828o = new PointF();
        this.f5829p = new PointF();
        this.f5824k = t;
        this.f5814a = matrix;
        this.f5825l = new GestureDetector(t.getContext(), this);
    }

    private static float m4560a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    private static void m4561a(PointF pointF, MotionEvent motionEvent) {
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
    }

    private void m4562a(MotionEvent motionEvent) {
        this.f5815b.set(this.f5814a);
        this.f5816c.set(motionEvent.getX(), motionEvent.getY());
        this.f5823j = this.f5824k.m4392b(motionEvent.getX(), motionEvent.getY());
    }

    private void m4563b(MotionEvent motionEvent) {
        float x;
        float y;
        this.f5814a.set(this.f5815b);
        C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
        if (!this.f5824k.m4408t() || this.f5823j == null || !this.f5824k.m4391b(this.f5823j.m4508r()).m4362w()) {
            x = motionEvent.getX() - this.f5816c.x;
            y = motionEvent.getY() - this.f5816c.y;
        } else if (this.f5824k instanceof HorizontalBarChart) {
            x = -(motionEvent.getX() - this.f5816c.x);
            y = motionEvent.getY() - this.f5816c.y;
        } else {
            x = motionEvent.getX() - this.f5816c.x;
            y = -(motionEvent.getY() - this.f5816c.y);
        }
        this.f5814a.postTranslate(x, y);
        if (onChartGestureListener != null) {
            onChartGestureListener.m4577b(motionEvent, x, y);
        }
    }

    private void m4564c(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
            float f = C0514a.m4567f(motionEvent);
            if (f > 10.0f) {
                PointF a = m4570a(this.f5817d.x, this.f5817d.y);
                if (this.f5818e == 4) {
                    float f2 = f / this.f5821h;
                    f = this.f5824k.m4402n() ? f2 : 1.0f;
                    if (!this.f5824k.m4403o()) {
                        f2 = 1.0f;
                    }
                    this.f5814a.set(this.f5815b);
                    this.f5814a.postScale(f, f2, a.x, a.y);
                    if (onChartGestureListener != null) {
                        onChartGestureListener.m4574a(motionEvent, f, f2);
                    }
                } else if (this.f5818e == 2 && this.f5824k.m4402n()) {
                    f = C0514a.m4568g(motionEvent) / this.f5819f;
                    this.f5814a.set(this.f5815b);
                    this.f5814a.postScale(f, 1.0f, a.x, a.y);
                    if (onChartGestureListener != null) {
                        onChartGestureListener.m4574a(motionEvent, f, 1.0f);
                    }
                } else if (this.f5818e == 3 && this.f5824k.m4403o()) {
                    f = C0514a.m4569h(motionEvent) / this.f5820g;
                    this.f5814a.set(this.f5815b);
                    this.f5814a.postScale(1.0f, f, a.x, a.y);
                    if (onChartGestureListener != null) {
                        onChartGestureListener.m4574a(motionEvent, 1.0f, f);
                    }
                }
            }
        }
    }

    private void m4565d(MotionEvent motionEvent) {
        C0538d a = this.f5824k.m4384a(motionEvent.getX(), motionEvent.getY());
        if (a == null || a.m4686a(this.f5822i)) {
            this.f5824k.m4367a(null);
            this.f5822i = null;
            return;
        }
        this.f5822i = a;
        this.f5824k.m4367a(a);
    }

    private void m4566e(MotionEvent motionEvent) {
        C0538d a = this.f5824k.m4384a(motionEvent.getX(), motionEvent.getY());
        if (a != null && !a.m4686a(this.f5822i)) {
            this.f5822i = a;
            this.f5824k.m4367a(a);
        }
    }

    private static float m4567f(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    private static float m4568g(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float m4569h(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    public PointF m4570a(float f, float f2) {
        C0545l viewPortHandler = this.f5824k.getViewPortHandler();
        float a = f - viewPortHandler.m4719a();
        float f3 = (this.f5824k.m4408t() && this.f5823j != null && this.f5824k.m4394c(this.f5823j.m4508r())) ? -(f2 - viewPortHandler.m4729c()) : -((((float) this.f5824k.getMeasuredHeight()) - f2) - viewPortHandler.m4731d());
        return new PointF(a, f3);
    }

    public void m4571a() {
        this.f5829p = new PointF(0.0f, 0.0f);
    }

    public void m4572b() {
        if (this.f5829p.x != 0.0f || this.f5829p.y != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            PointF pointF = this.f5829p;
            pointF.x *= this.f5824k.getDragDecelerationFrictionCoef();
            pointF = this.f5829p;
            pointF.y *= this.f5824k.getDragDecelerationFrictionCoef();
            float f = ((float) (currentAnimationTimeMillis - this.f5827n)) / 1000.0f;
            float f2 = this.f5829p.x * f;
            f *= this.f5829p.y;
            PointF pointF2 = this.f5828o;
            pointF2.x = f2 + pointF2.x;
            PointF pointF3 = this.f5828o;
            pointF3.y = f + pointF3.y;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, this.f5828o.x, this.f5828o.y, 0);
            m4563b(obtain);
            obtain.recycle();
            this.f5814a = this.f5824k.getViewPortHandler().m4720a(this.f5814a, this.f5824k, false);
            this.f5827n = currentAnimationTimeMillis;
            if (((double) Math.abs(this.f5829p.x)) >= 0.001d || ((double) Math.abs(this.f5829p.y)) >= 0.001d) {
                C0544j.m4710a(this.f5824k);
            } else {
                m4571a();
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4576b(motionEvent);
            return super.onDoubleTap(motionEvent);
        }
        if (this.f5824k.m4404p()) {
            PointF a = m4570a(motionEvent.getX(), motionEvent.getY());
            this.f5824k.m4388a(1.4f, 1.4f, a.x, a.y);
            if (this.f5824k.m4379w()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + a.x + ", y: " + a.y);
            }
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4575a(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4573a(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5824k.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4578c(motionEvent);
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        m4565d(motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f5826m == null) {
            this.f5826m = VelocityTracker.obtain();
        }
        this.f5826m.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && this.f5826m != null) {
            this.f5826m.recycle();
            this.f5826m = null;
        }
        if (this.f5818e == 0) {
            this.f5825l.onTouchEvent(motionEvent);
        }
        if (this.f5824k.m4401m() || this.f5824k.m4402n() || this.f5824k.m4403o()) {
            switch (motionEvent.getAction() & 255) {
                case C0607c.AdsAttrs_adSize /*0*/:
                    m4571a();
                    m4562a(motionEvent);
                    break;
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    VelocityTracker velocityTracker = this.f5826m;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, (float) C0544j.m4714b());
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if ((Math.abs(xVelocity) > ((float) C0544j.m4704a()) || Math.abs(yVelocity) > ((float) C0544j.m4704a())) && this.f5818e == 1 && this.f5824k.m4378v()) {
                        m4571a();
                        this.f5827n = AnimationUtils.currentAnimationTimeMillis();
                        this.f5828o = new PointF(motionEvent.getX(), motionEvent.getY());
                        this.f5829p = new PointF(xVelocity, yVelocity);
                        C0544j.m4710a(this.f5824k);
                    }
                    this.f5818e = 0;
                    this.f5824k.m4381y();
                    if (this.f5826m != null) {
                        this.f5826m.recycle();
                        this.f5826m = null;
                        break;
                    }
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    if (this.f5818e != 1) {
                        if (this.f5818e != 2 && this.f5818e != 3 && this.f5818e != 4) {
                            if (this.f5818e == 0 && Math.abs(C0514a.m4560a(motionEvent.getX(), this.f5816c.x, motionEvent.getY(), this.f5816c.y)) > 5.0f) {
                                if (!this.f5824k.m4407s()) {
                                    if (this.f5824k.m4401m()) {
                                        this.f5818e = 1;
                                        break;
                                    }
                                } else if (this.f5824k.m4405q() || !this.f5824k.m4401m()) {
                                    if (this.f5824k.m4400l()) {
                                        m4566e(motionEvent);
                                        break;
                                    }
                                } else {
                                    this.f5818e = 1;
                                    break;
                                }
                            }
                        }
                        this.f5824k.m4380x();
                        if (this.f5824k.m4402n() || this.f5824k.m4403o()) {
                            m4564c(motionEvent);
                            break;
                        }
                    }
                    this.f5824k.m4380x();
                    m4563b(motionEvent);
                    break;
                    break;
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    this.f5818e = 0;
                    break;
                case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                    if (motionEvent.getPointerCount() >= 2) {
                        this.f5824k.m4380x();
                        m4562a(motionEvent);
                        this.f5819f = C0514a.m4568g(motionEvent);
                        this.f5820g = C0514a.m4569h(motionEvent);
                        this.f5821h = C0514a.m4567f(motionEvent);
                        if (this.f5821h > 10.0f) {
                            if (this.f5824k.m4406r()) {
                                this.f5818e = 4;
                            } else if (this.f5819f > this.f5820g) {
                                this.f5818e = 2;
                            } else {
                                this.f5818e = 3;
                            }
                        }
                        C0514a.m4561a(this.f5817d, motionEvent);
                        break;
                    }
                    break;
                case adv.TitlePageIndicator_footerLineHeight /*6*/:
                    C0544j.m4709a(motionEvent, this.f5826m);
                    this.f5818e = 5;
                    break;
            }
            this.f5814a = this.f5824k.getViewPortHandler().m4720a(this.f5814a, this.f5824k, true);
        }
        return true;
    }
}
