package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import java.util.List;

class bq implements OnNavigationListener {
    final /* synthetic */ ChartNewSummary f4260a;

    bq(ChartNewSummary chartNewSummary) {
        this.f4260a = chartNewSummary;
    }

    public boolean onNavigationItemSelected(int i, long j) {
        ChartNewSummary.f2588y = i;
        if (i == 0) {
            ChartNewSummary.f2579P = "category";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 1) {
            ChartNewSummary.f2579P = "Income";
            ChartNewSummary.f2575D = co.f4429c;
        } else if (i == 2) {
            ChartNewSummary.f2579P = "property";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 3) {
            ChartNewSummary.f2579P = "payment_method";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 4) {
            ChartNewSummary.f2579P = "status";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 5) {
            ChartNewSummary.f2579P = "expense_tag";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 6) {
            ChartNewSummary.f2579P = "subcategory";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 7) {
            ChartNewSummary.f2579P = "category";
            ChartNewSummary.f2575D = co.f4428b;
        } else if (i == 8) {
            ChartNewSummary.f2579P = "Income";
            ChartNewSummary.f2575D = co.f4429c;
        } else if (i == 9) {
            ChartNewSummary.f2579P = "subcategory";
            ChartNewSummary.f2575D = co.f4428b;
            List a = abd.m3798a(ChartNewSummary.f2583s, null, "category");
            this.f4260a.m2506a((String[]) a.toArray(new String[a.size()]));
            return true;
        }
        this.f4260a.f2601p.m145c();
        return true;
    }
}
