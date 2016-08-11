package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class aja implements OnItemSelectedListener {
    final /* synthetic */ WidgetConfigureSummary f4188a;

    aja(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4188a = widgetConfigureSummary;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 0) {
            WidgetConfigureSummary.f3741o = "category";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 1) {
            WidgetConfigureSummary.f3741o = "Income";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 2) {
            WidgetConfigureSummary.f3741o = "property";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 3) {
            WidgetConfigureSummary.f3741o = "payment_method";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 4) {
            WidgetConfigureSummary.f3741o = "status";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 5) {
            WidgetConfigureSummary.f3741o = "expense_tag";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 6) {
            WidgetConfigureSummary.f3741o = "subcategory";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 7) {
            WidgetConfigureSummary.f3741o = "category";
        } else if (WidgetConfigureSummary.f3740j.getSelectedItemPosition() == 8) {
            WidgetConfigureSummary.f3741o = "Income";
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
