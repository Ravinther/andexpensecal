package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.expensemanager.i */
class C0448i implements TextWatcher {
    final /* synthetic */ ChartNewBar f4781a;

    C0448i(ChartNewBar chartNewBar) {
        this.f4781a = chartNewBar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4781a.m2379b();
        ck.m4027a(this.f4781a.f2422d, this.f4781a.f2425g, this.f4781a.f2426h, this.f4781a.f2428j, this.f4781a.f2429k, null);
    }
}
