package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class wu implements OnClickListener {
    final /* synthetic */ String f5421a;
    final /* synthetic */ ExpenseNewAccount f5422b;

    wu(ExpenseNewAccount expenseNewAccount, String str) {
        this.f5422b = expenseNewAccount;
        this.f5421a = str;
    }

    public void onClick(View view) {
        String a = abd.m3786a(this.f5422b.f3307b, this.f5422b.f3324s, "MY_ACCOUNT_NAMES", "Personal Expense");
        if (a.split(",").length > 1 || this.f5422b.getIntent().getBooleanExtra("isHidden", false)) {
            aib.m3849a(this.f5422b.f3307b, null, this.f5422b.getResources().getString(2131099805), 17301543, this.f5422b.getResources().getString(2131099808) + " " + this.f5421a, this.f5422b.getResources().getString(2131099983), new wv(this, a), this.f5422b.getResources().getString(2131099754), null).show();
            return;
        }
        aib.m3849a(this.f5422b.f3307b, null, this.f5422b.getResources().getString(2131099805), 17301543, this.f5422b.getResources().getString(2131099987), this.f5422b.getResources().getString(2131099983), null, null, null).show();
    }
}
