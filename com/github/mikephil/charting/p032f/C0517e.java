package com.github.mikephil.charting.p032f;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.C0494e;
import com.github.mikephil.charting.charts.C0498f;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.p039h.C0538d;
import com.github.mikephil.charting.p039h.C0544j;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.f.e */
public class C0517e extends SimpleOnGestureListener implements OnTouchListener {
    private PointF f5830a;
    private C0494e<?> f5831b;
    private float f5832c;
    private int f5833d;
    private GestureDetector f5834e;
    private ArrayList<C0518f> f5835f;
    private long f5836g;
    private float f5837h;
    private C0538d f5838i;

    public C0517e(C0494e<?> c0494e) {
        this.f5830a = new PointF();
        this.f5832c = 0.0f;
        this.f5833d = 0;
        this.f5835f = new ArrayList();
        this.f5836g = 0;
        this.f5837h = 0.0f;
        this.f5838i = null;
        this.f5831b = c0494e;
        this.f5834e = new GestureDetector(c0494e.getContext(), this);
    }

    private static float m4579a(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    private void m4580c() {
        this.f5835f.clear();
    }

    private void m4581c(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f5835f.add(new C0518f(this, currentAnimationTimeMillis, this.f5831b.m4429a(f, f2)));
        for (int size = this.f5835f.size(); size - 2 > 0 && currentAnimationTimeMillis - ((C0518f) this.f5835f.get(0)).f5839a > 1000; size--) {
            this.f5835f.remove(0);
        }
    }

    private float m4582d() {
        if (this.f5835f.isEmpty()) {
            return 0.0f;
        }
        C0518f c0518f = (C0518f) this.f5835f.get(0);
        C0518f c0518f2 = (C0518f) this.f5835f.get(this.f5835f.size() - 1);
        C0518f c0518f3 = c0518f;
        for (int size = this.f5835f.size() - 1; size >= 0; size--) {
            c0518f3 = (C0518f) this.f5835f.get(size);
            if (c0518f3.f5840b != c0518f2.f5840b) {
                break;
            }
        }
        float f = ((float) (c0518f2.f5839a - c0518f.f5839a)) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        Object obj = c0518f2.f5840b >= c0518f3.f5840b ? 1 : null;
        Object obj2 = ((double) Math.abs(c0518f2.f5840b - c0518f3.f5840b)) > 270.0d ? obj != null ? null : 1 : obj;
        if (((double) (c0518f2.f5840b - c0518f.f5840b)) > 180.0d) {
            c0518f.f5840b = (float) (((double) c0518f.f5840b) + 360.0d);
        } else if (((double) (c0518f.f5840b - c0518f2.f5840b)) > 180.0d) {
            c0518f2.f5840b = (float) (((double) c0518f2.f5840b) + 360.0d);
        }
        float abs = Math.abs((c0518f2.f5840b - c0518f.f5840b) / f);
        return obj2 == null ? -abs : abs;
    }

    public void m4583a() {
        this.f5837h = 0.0f;
    }

    public void m4584a(float f, float f2) {
        this.f5832c = this.f5831b.m4429a(f, f2) - this.f5831b.getRawRotationAngle();
    }

    public void m4585b() {
        if (this.f5837h != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f5837h *= this.f5831b.getDragDecelerationFrictionCoef();
            float f = ((float) (currentAnimationTimeMillis - this.f5836g)) / 1000.0f;
            this.f5831b.setRotationAngle((f * this.f5837h) + this.f5831b.getRotationAngle());
            this.f5836g = currentAnimationTimeMillis;
            if (((double) Math.abs(this.f5837h)) >= 0.001d) {
                C0544j.m4710a(this.f5831b);
            } else {
                m4583a();
            }
        }
    }

    public void m4586b(float f, float f2) {
        this.f5831b.setRotationAngle(this.f5831b.m4429a(f, f2) - this.f5832c);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5831b.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4576b(motionEvent);
        }
        return super.onDoubleTap(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5831b.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4573a(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C0515b onChartGestureListener = this.f5831b.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.m4578c(motionEvent);
        }
        float b = this.f5831b.m4434b(motionEvent.getX(), motionEvent.getY());
        if (b > this.f5831b.getRadius()) {
            this.f5831b.m4368a(null);
            this.f5838i = null;
        } else {
            float a = this.f5831b.m4429a(motionEvent.getX(), motionEvent.getY());
            if (this.f5831b instanceof PieChart) {
                a /= this.f5831b.getAnimator().m4254a();
            }
            int a2 = this.f5831b.m4430a(a);
            if (a2 < 0) {
                this.f5831b.m4368a(null);
                this.f5838i = null;
            } else {
                List a3 = this.f5831b.m4432a(a2);
                int i = 0;
                if (this.f5831b instanceof C0498f) {
                    i = C0544j.m4706a(a3, b / ((C0498f) this.f5831b).getFactor(), null);
                }
                C0538d c0538d = new C0538d(a2, i);
                if (c0538d.m4686a(this.f5838i)) {
                    this.f5831b.m4367a(null);
                    this.f5838i = null;
                } else {
                    this.f5831b.m4367a(c0538d);
                    this.f5838i = c0538d;
                }
            }
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f5834e.onTouchEvent(motionEvent) && this.f5831b.m4436g()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction()) {
                case C0607c.AdsAttrs_adSize /*0*/:
                    m4583a();
                    m4580c();
                    if (this.f5831b.m4378v()) {
                        m4581c(x, y);
                    }
                    m4584a(x, y);
                    this.f5830a.x = x;
                    this.f5830a.y = y;
                    break;
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    if (this.f5831b.m4378v()) {
                        m4583a();
                        m4581c(x, y);
                        this.f5837h = m4582d();
                        if (this.f5837h != 0.0f) {
                            this.f5836g = AnimationUtils.currentAnimationTimeMillis();
                            C0544j.m4710a(this.f5831b);
                        }
                    }
                    this.f5831b.m4381y();
                    this.f5833d = 0;
                    break;
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    if (this.f5831b.m4378v()) {
                        m4581c(x, y);
                    }
                    if (this.f5833d != 0 || C0517e.m4579a(x, this.f5830a.x, y, this.f5830a.y) <= C0544j.m4703a(8.0f)) {
                        if (this.f5833d == 1) {
                            m4586b(x, y);
                            this.f5831b.invalidate();
                            break;
                        }
                    }
                    this.f5833d = 1;
                    this.f5831b.m4380x();
                    break;
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
