package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class hw implements OnItemSelectedListener {
    final /* synthetic */ ExpenseAccountSummary f4772a;

    hw(ExpenseAccountSummary expenseAccountSummary) {
        this.f4772a = expenseAccountSummary;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 0) {
            ExpenseAccountSummary.f2771G = "category";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 1) {
            ExpenseAccountSummary.f2771G = "Income";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 2) {
            ExpenseAccountSummary.f2771G = "property";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 3) {
            ExpenseAccountSummary.f2771G = "payment_method";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 4) {
            ExpenseAccountSummary.f2771G = "status";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 5) {
            ExpenseAccountSummary.f2771G = "expense_tag";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 6) {
            ExpenseAccountSummary.f2771G = "subcategory";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 7) {
            ExpenseAccountSummary.f2771G = "category";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 8) {
            ExpenseAccountSummary.f2771G = "Income";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 9) {
            ExpenseAccountSummary.f2771G = "expense_tag";
        } else if (ExpenseAccountSummary.f2770D.getSelectedItemPosition() == 10) {
            ExpenseAccountSummary.f2771G = "property";
        }
        this.f4772a.f2788o.m145c();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
