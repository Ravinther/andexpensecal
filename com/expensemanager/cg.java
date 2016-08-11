package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class cg implements OnItemSelectedListener {
    final /* synthetic */ ChartNewSummary f4414a;

    cg(ChartNewSummary chartNewSummary) {
        this.f4414a = chartNewSummary;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (ChartNewSummary.f2577J.getSelectedItemPosition() == 0) {
            ChartNewSummary.f2579P = "category";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 1) {
            ChartNewSummary.f2579P = "Income";
            ChartNewSummary.f2575D = co.f4429c;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 2) {
            ChartNewSummary.f2579P = "property";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 3) {
            ChartNewSummary.f2579P = "payment_method";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 4) {
            ChartNewSummary.f2579P = "status";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 5) {
            ChartNewSummary.f2579P = "expense_tag";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 6) {
            ChartNewSummary.f2579P = "subcategory";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 7) {
            ChartNewSummary.f2579P = "category";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 8) {
            ChartNewSummary.f2579P = "Income";
            ChartNewSummary.f2575D = co.f4429c;
        } else if (ChartNewSummary.f2577J.getSelectedItemPosition() == 9) {
            ChartNewSummary.f2579P = "subcategory";
            ChartNewSummary.f2575D = co.f4428b;
        }
        this.f4414a.f2601p.m145c();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
