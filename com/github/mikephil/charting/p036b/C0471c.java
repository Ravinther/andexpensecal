package com.github.mikephil.charting.p036b;

import com.github.mikephil.charting.p040d.C0505h;
import java.util.List;

/* renamed from: com.github.mikephil.charting.b.c */
public class C0471c extends C0469a<C0505h> {
    public C0471c(int i) {
        super(i);
    }

    public void m4266a(List<C0505h> list) {
        int ceil = (int) Math.ceil((double) ((((float) (this.f - this.e)) * this.c) + ((float) this.e)));
        for (int i = this.e; i < ceil; i++) {
            C0505h c0505h = (C0505h) list.get(i);
            m4267b((float) c0505h.m4529b(), c0505h.m4530c() * this.d);
        }
        m4256a();
    }

    protected void m4267b(float f, float f2) {
        float[] fArr = this.b;
        int i = this.a;
        this.a = i + 1;
        fArr[i] = f;
        fArr = this.b;
        i = this.a;
        this.a = i + 1;
        fArr[i] = f2;
    }
}
