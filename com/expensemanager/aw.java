package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class aw implements TextWatcher {
    final /* synthetic */ ChartNewMonthly f4227a;

    aw(ChartNewMonthly chartNewMonthly) {
        this.f4227a = chartNewMonthly;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f4227a.f2529m.getSelectedItemPosition() >= 4) {
            this.f4227a.m2458e();
        } else if (this.f4227a.f2529m.getSelectedItemPosition() == 0) {
            this.f4227a.m2456d();
        } else {
            this.f4227a.m2455c();
        }
    }
}
