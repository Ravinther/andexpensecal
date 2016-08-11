package com.expensemanager;

import android.support.v4.app.C0032l;
import android.support.v4.app.C0041t;
import android.support.v4.app.ab;
import java.util.HashMap;

public class og extends ab {
    public og(C0041t c0041t) {
        super(c0041t);
    }

    public int m4152a(Object obj) {
        return -2;
    }

    public C0032l m4153a(int i) {
        return oh.m4156a(i);
    }

    public int m4154b() {
        return ExpenseChartDate.f3049o;
    }

    public CharSequence m4155c(int i) {
        return aib.m3865b(((String) ((HashMap) ExpenseChartDate.f3050r.get(i)).get("fromDate")) + " - " + ((String) ((HashMap) ExpenseChartDate.f3050r.get(i)).get("toDate")));
    }
}
