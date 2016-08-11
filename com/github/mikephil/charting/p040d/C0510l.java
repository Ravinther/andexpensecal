package com.github.mikephil.charting.p040d;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.mikephil.charting.d.l */
public class C0510l extends C0499f<C0511m> {
    public C0510l(List<String> list, C0511m c0511m) {
        super(list, C0510l.m4552a(c0511m));
    }

    private static List<C0511m> m4552a(C0511m c0511m) {
        List<C0511m> arrayList = new ArrayList();
        arrayList.add(c0511m);
        return arrayList;
    }

    public /* synthetic */ C0502g m4553a(int i) {
        return m4555c(i);
    }

    public C0511m m4554a() {
        return (C0511m) this.h.get(0);
    }

    public C0511m m4555c(int i) {
        return i == 0 ? m4554a() : null;
    }
}
