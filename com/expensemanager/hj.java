package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;

class hj implements OnNavigationListener {
    final /* synthetic */ ExpenseAccountSummary f4742a;

    hj(ExpenseAccountSummary expenseAccountSummary) {
        this.f4742a = expenseAccountSummary;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        ExpenseAccountSummary.f2778v = i;
        if (i == 0) {
            ExpenseAccountSummary.f2771G = "category";
        } else if (i == 1) {
            ExpenseAccountSummary.f2771G = "Income";
        } else if (i == 2) {
            ExpenseAccountSummary.f2771G = "property";
        } else if (i == 3) {
            ExpenseAccountSummary.f2771G = "payment_method";
        } else if (i == 4) {
            ExpenseAccountSummary.f2771G = "status";
        } else if (i == 5) {
            ExpenseAccountSummary.f2771G = "expense_tag";
        } else if (i == 6) {
            ExpenseAccountSummary.f2771G = "subcategory";
        } else if (i == 7) {
            ExpenseAccountSummary.f2771G = "category";
        } else if (i == 8) {
            ExpenseAccountSummary.f2771G = "Income";
        } else if (i == 9) {
            ExpenseAccountSummary.f2771G = "expense_tag";
        } else if (i == 10) {
            ExpenseAccountSummary.f2771G = "property";
        }
        this.f4742a.f2788o.m145c();
        return true;
    }
}
