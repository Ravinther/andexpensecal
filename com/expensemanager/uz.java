package com.expensemanager;

import android.content.SharedPreferences.Editor;
import com.google.android.p033a.p034a.C0462m;

class uz implements C0462m {
    final /* synthetic */ ExpenseManager f5348a;

    private uz(ExpenseManager expenseManager) {
        this.f5348a = expenseManager;
    }

    public void m4234a(int i) {
        if (!this.f5348a.isFinishing()) {
            Editor edit = this.f5348a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
            edit.putString("LICENSE_CHECK", C0445f.m4101a("LICENSED"));
            edit.commit();
            this.f5348a.f3252n = true;
            this.f5348a.f3253o = false;
            this.f5348a.f3254p = true;
        }
    }

    public void m4235b(int i) {
        if (!this.f5348a.isFinishing()) {
            this.f5348a.f3252n = false;
            this.f5348a.f3253o = false;
            this.f5348a.f3254p = true;
            this.f5348a.showDialog(0);
        }
    }

    public void m4236c(int i) {
        if (!this.f5348a.isFinishing()) {
            this.f5348a.f3252n = true;
            this.f5348a.f3253o = false;
            this.f5348a.f3254p = false;
            this.f5348a.showDialog(0);
        }
    }
}
