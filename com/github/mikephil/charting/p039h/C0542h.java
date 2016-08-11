package com.github.mikephil.charting.p039h;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.p040d.C0501a;
import com.github.mikephil.charting.p040d.C0505h;
import java.util.List;

/* renamed from: com.github.mikephil.charting.h.h */
public class C0542h {
    protected Matrix f5901a;
    protected Matrix f5902b;
    protected C0545l f5903c;

    public C0542h(C0545l c0545l) {
        this.f5901a = new Matrix();
        this.f5902b = new Matrix();
        this.f5903c = c0545l;
    }

    public C0540f m4690a(float f, float f2) {
        float[] fArr = new float[]{f, f2};
        m4699b(fArr);
        return new C0540f((double) fArr[0], (double) fArr[1]);
    }

    public void m4691a(float f, float f2, float f3, float f4) {
        float i = this.f5903c.m4741i() / f2;
        float j = this.f5903c.m4743j() / f3;
        this.f5901a.reset();
        this.f5901a.postTranslate(-f, -f4);
        this.f5901a.postScale(i, -j);
    }

    public void m4692a(Path path) {
        path.transform(this.f5901a);
        path.transform(this.f5903c.m4748o());
        path.transform(this.f5902b);
    }

    public void m4693a(RectF rectF, float f) {
        if (rectF.top > 0.0f) {
            rectF.top *= f;
        } else {
            rectF.bottom *= f;
        }
        this.f5901a.mapRect(rectF);
        this.f5903c.m4748o().mapRect(rectF);
        this.f5902b.mapRect(rectF);
    }

    public void m4694a(boolean z) {
        this.f5902b.reset();
        if (z) {
            this.f5902b.setTranslate(this.f5903c.m4719a(), -this.f5903c.m4729c());
            this.f5902b.postScale(1.0f, -1.0f);
            return;
        }
        this.f5902b.postTranslate(this.f5903c.m4719a(), this.f5903c.m4746m() - this.f5903c.m4731d());
    }

    public void m4695a(float[] fArr) {
        this.f5901a.mapPoints(fArr);
        this.f5903c.m4748o().mapPoints(fArr);
        this.f5902b.mapPoints(fArr);
    }

    public float[] m4696a(List<? extends C0505h> list, float f, float f2, int i, int i2) {
        int ceil = ((int) Math.ceil((double) (((float) (i2 - i)) * f))) * 2;
        float[] fArr = new float[ceil];
        for (int i3 = 0; i3 < ceil; i3 += 2) {
            C0505h c0505h = (C0505h) list.get((i3 / 2) + i);
            if (c0505h != null) {
                fArr[i3] = (float) c0505h.m4529b();
                fArr[i3 + 1] = c0505h.m4530c() * f2;
            }
        }
        m4695a(fArr);
        return fArr;
    }

    public float[] m4697a(List<? extends C0505h> list, int i, C0501a c0501a, float f) {
        float[] fArr = new float[(list.size() * 2)];
        int c = c0501a.m4471c();
        float a = c0501a.m4484a();
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            C0505h c0505h = (C0505h) list.get(i2 / 2);
            float b = (((float) ((c0505h.m4529b() + ((i2 / 2) * (c - 1))) + i)) + (((float) (i2 / 2)) * a)) + (a / 2.0f);
            float c2 = c0505h.m4530c();
            fArr[i2] = b;
            fArr[i2 + 1] = c2 * f;
        }
        m4695a(fArr);
        return fArr;
    }

    public void m4698b(RectF rectF, float f) {
        if (rectF.left > 0.0f) {
            rectF.left *= f;
        } else {
            rectF.right *= f;
        }
        this.f5901a.mapRect(rectF);
        this.f5903c.m4748o().mapRect(rectF);
        this.f5902b.mapRect(rectF);
    }

    public void m4699b(float[] fArr) {
        Matrix matrix = new Matrix();
        this.f5902b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f5903c.m4748o().invert(matrix);
        matrix.mapPoints(fArr);
        this.f5901a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public float[] m4700b(List<? extends C0505h> list, int i, C0501a c0501a, float f) {
        float[] fArr = new float[(list.size() * 2)];
        int c = c0501a.m4471c();
        float a = c0501a.m4484a();
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            C0505h c0505h = (C0505h) list.get(i2 / 2);
            float b = (((float) ((c0505h.m4529b() + ((i2 / 2) * (c - 1))) + i)) + (((float) (i2 / 2)) * a)) + (a / 2.0f);
            fArr[i2] = c0505h.m4530c() * f;
            fArr[i2 + 1] = b;
        }
        m4695a(fArr);
        return fArr;
    }
}
