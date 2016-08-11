package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class pt implements OnItemSelectedListener {
    final /* synthetic */ ExpenseChartSummary f5151a;

    pt(ExpenseChartSummary expenseChartSummary) {
        this.f5151a = expenseChartSummary;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 0) {
            ExpenseChartSummary.f3113I = "category";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 1) {
            ExpenseChartSummary.f3113I = "Income";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 2) {
            ExpenseChartSummary.f3113I = "property";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 3) {
            ExpenseChartSummary.f3113I = "payment_method";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 4) {
            ExpenseChartSummary.f3113I = "status";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 5) {
            ExpenseChartSummary.f3113I = "expense_tag";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 6) {
            ExpenseChartSummary.f3113I = "subcategory";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 7) {
            ExpenseChartSummary.f3113I = "category";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 8) {
            ExpenseChartSummary.f3113I = "Income";
        } else if (ExpenseChartSummary.f3112D.getSelectedItemPosition() == 9) {
            ExpenseChartSummary.f3113I = "subcategory";
        }
        this.f5151a.f3133p.m145c();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
