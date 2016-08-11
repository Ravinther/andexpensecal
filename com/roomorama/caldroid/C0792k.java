package com.roomorama.caldroid;

import android.support.v4.app.C0032l;
import android.support.v4.app.C0041t;
import android.support.v4.app.ab;
import java.util.ArrayList;

/* renamed from: com.roomorama.caldroid.k */
public class C0792k extends ab {
    private ArrayList<C0791j> f7774a;

    public C0792k(C0041t c0041t) {
        super(c0041t);
    }

    public C0032l m7168a(int i) {
        return (C0791j) m7170d().get(i);
    }

    public int m7169b() {
        return 4;
    }

    public ArrayList<C0791j> m7170d() {
        if (this.f7774a == null) {
            this.f7774a = new ArrayList();
            for (int i = 0; i < m7169b(); i++) {
                this.f7774a.add(new C0791j());
            }
        }
        return this.f7774a;
    }
}
