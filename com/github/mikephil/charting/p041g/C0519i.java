package com.github.mikephil.charting.p041g;

import com.github.mikephil.charting.p038e.C0490b;
import com.github.mikephil.charting.p039h.C0545l;

/* renamed from: com.github.mikephil.charting.g.i */
public abstract class C0519i {
    protected C0545l f5842n;
    protected int f5843o;
    protected int f5844p;

    public C0519i(C0545l c0545l) {
        this.f5843o = 0;
        this.f5844p = 0;
        this.f5842n = c0545l;
    }

    public void m4587a(C0490b c0490b, int i) {
        int lowestVisibleXIndex = c0490b.getLowestVisibleXIndex();
        int highestVisibleXIndex = c0490b.getHighestVisibleXIndex();
        this.f5843o = Math.max(((lowestVisibleXIndex / i) * i) - (lowestVisibleXIndex % i == 0 ? i : 0), 0);
        this.f5844p = Math.min(((highestVisibleXIndex / i) * i) + i, (int) c0490b.getXChartMax());
    }
}
