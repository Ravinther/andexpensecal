package com.github.mikephil.charting.p039h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.p037c.C0486m;
import java.util.List;

/* renamed from: com.github.mikephil.charting.h.j */
public abstract class C0544j {
    private static DisplayMetrics f5904a;
    private static int f5905b;
    private static int f5906c;
    private static final int[] f5907d;

    static {
        f5905b = 50;
        f5906c = 8000;
        f5907d = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    }

    public static float m4702a(double d) {
        float pow = (float) Math.pow(10.0d, (double) (1 - ((int) ((float) Math.ceil((double) ((float) Math.log10(d < 0.0d ? -d : d)))))));
        return ((float) Math.round(((double) pow) * d)) / pow;
    }

    public static float m4703a(float f) {
        if (f5904a != null) {
            return f * (((float) f5904a.densityDpi) / 160.0f);
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f;
    }

    public static int m4704a() {
        return f5905b;
    }

    public static int m4705a(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static int m4706a(List<C0541g> list, float f, C0486m c0486m) {
        int i = -1;
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0541g c0541g = (C0541g) list.get(i2);
            if (c0486m == null || c0541g.f5900c.m4508r() == c0486m) {
                float abs = Math.abs(c0541g.f5898a - f);
                if (abs < f2) {
                    i = ((C0541g) list.get(i2)).f5899b;
                    f2 = abs;
                }
            }
        }
        return i;
    }

    public static PointF m4707a(PointF pointF, float f, float f2) {
        return new PointF((float) (((double) pointF.x) + (((double) f) * Math.cos(Math.toRadians((double) f2)))), (float) (((double) pointF.y) + (((double) f) * Math.sin(Math.toRadians((double) f2)))));
    }

    public static void m4708a(Context context) {
        if (context == null) {
            f5905b = ViewConfiguration.getMinimumFlingVelocity();
            f5906c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            f5905b = viewConfiguration.getScaledMinimumFlingVelocity();
            f5906c = viewConfiguration.getScaledMaximumFlingVelocity();
        }
        f5904a = context.getResources().getDisplayMetrics();
    }

    public static void m4709a(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, (float) f5906c);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (pointerId = 0; pointerId < pointerCount; pointerId++) {
            if (pointerId != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(pointerId);
                if ((velocityTracker.getYVelocity(pointerId2) * yVelocity) + (velocityTracker.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void m4710a(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidateDelayed(10);
        }
    }

    public static int[] m4711a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public static double m4712b(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            return d;
        }
        double d2 = d + 0.0d;
        return Double.longBitsToDouble((d2 >= 0.0d ? 1 : -1) + Double.doubleToRawLongBits(d2));
    }

    public static float m4713b(List<C0541g> list, float f, C0486m c0486m) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            C0541g c0541g = (C0541g) list.get(i);
            if (c0541g.f5900c.m4508r() == c0486m) {
                float abs = Math.abs(c0541g.f5898a - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    public static int m4714b() {
        return f5906c;
    }

    public static int m4715b(float f) {
        return ((int) Math.ceil(-Math.log10((double) C0544j.m4702a((double) f)))) + 2;
    }

    public static int m4716b(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static String[] m4717b(List<String> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (String) list.get(i);
        }
        return strArr;
    }

    public static float m4718c(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }
}
