package com.github.mikephil.charting.p036b;

import com.github.mikephil.charting.p040d.C0505h;
import java.util.List;

/* renamed from: com.github.mikephil.charting.b.e */
public class C0473e extends C0469a<C0505h> {
    public C0473e(int i) {
        if (i < 4) {
            i = 4;
        }
        super(i);
    }

    public void m4269a(List<C0505h> list) {
        m4270b((float) ((C0505h) list.get(this.e)).m4529b(), ((C0505h) list.get(this.e)).m4530c() * this.d);
        int ceil = (int) Math.ceil((double) ((((float) (this.f - this.e)) * this.c) + ((float) this.e)));
        for (int i = this.e + 1; i < ceil; i++) {
            C0505h c0505h = (C0505h) list.get(i);
            m4271c((float) c0505h.m4529b(), c0505h.m4530c() * this.d);
        }
        m4256a();
    }

    public void m4270b(float f, float f2) {
        if (this.a == 0) {
            float[] fArr = this.b;
            int i = this.a;
            this.a = i + 1;
            fArr[i] = f;
            fArr = this.b;
            i = this.a;
            this.a = i + 1;
            fArr[i] = f2;
            this.b[this.a] = f;
            this.b[this.a + 1] = f2;
        }
    }

    public void m4271c(float f, float f2) {
        if (this.a == 2) {
            float[] fArr = this.b;
            int i = this.a;
            this.a = i + 1;
            fArr[i] = f;
            fArr = this.b;
            i = this.a;
            this.a = i + 1;
            fArr[i] = f2;
            return;
        }
        float f3 = this.b[this.a - 2];
        float f4 = this.b[this.a - 1];
        float[] fArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        fArr2[i2] = f3;
        fArr = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        fArr[i3] = f4;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f2;
    }
}
