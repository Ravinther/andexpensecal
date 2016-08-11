package com.expensemanager;

import android.support.v4.app.C0032l;
import android.support.v4.app.C0041t;
import android.support.v4.app.ab;
import java.util.HashMap;

public class pu extends ab {
    public pu(C0041t c0041t) {
        super(c0041t);
    }

    public int m4162a(Object obj) {
        return -2;
    }

    public C0032l m4163a(int i) {
        return pv.m4166a(i);
    }

    public int m4164b() {
        return ExpenseChartSummary.f3116o;
    }

    public CharSequence m4165c(int i) {
        return aib.m3865b(((String) ((HashMap) ExpenseChartSummary.f3117r.get(i)).get("fromDate")) + " - " + ((String) ((HashMap) ExpenseChartSummary.f3117r.get(i)).get("toDate")));
    }
}
