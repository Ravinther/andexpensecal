package com.github.mikephil.charting.p039h;

/* renamed from: com.github.mikephil.charting.h.i */
public class C0543i extends C0542h {
    public C0543i(C0545l c0545l) {
        super(c0545l);
    }

    public void m4701a(boolean z) {
        this.b.reset();
        if (z) {
            this.b.setTranslate(-(this.c.m4747n() - this.c.m4725b()), this.c.m4746m() - this.c.m4731d());
            this.b.postScale(-1.0f, 1.0f);
            return;
        }
        this.b.postTranslate(this.c.m4719a(), this.c.m4746m() - this.c.m4731d());
    }
}
