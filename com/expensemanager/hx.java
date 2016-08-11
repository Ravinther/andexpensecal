package com.expensemanager;

import android.support.v4.app.C0032l;
import android.support.v4.app.C0041t;
import android.support.v4.app.ab;
import java.util.HashMap;

public class hx extends ab {
    public hx(C0041t c0041t) {
        super(c0041t);
    }

    public int m4134a(Object obj) {
        return -2;
    }

    public C0032l m4135a(int i) {
        return hy.m4138a(i);
    }

    public int m4136b() {
        return ExpenseAccountSummary.f2773n;
    }

    public CharSequence m4137c(int i) {
        return aib.m3865b(((String) ((HashMap) ExpenseAccountSummary.f2774q.get(i)).get("fromDate")) + " - " + ((String) ((HashMap) ExpenseAccountSummary.f2774q.get(i)).get("toDate")));
    }
}
