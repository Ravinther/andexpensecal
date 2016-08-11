package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ait implements OnClickListener {
    final /* synthetic */ WidgetConfigureSummary f4174a;

    ait(WidgetConfigureSummary widgetConfigureSummary) {
        this.f4174a = widgetConfigureSummary;
    }

    public void onClick(View view) {
        Context context = this.f4174a;
        String str = "NO";
        if (!("".equals(this.f4174a.f3749k.getText().toString()) || "".equals(this.f4174a.f3750l.getText().toString()))) {
            str = this.f4174a.f3749k.getText().toString() + "," + this.f4174a.f3750l.getText().toString();
        }
        str = WidgetConfigureSummary.f3739e.getText().toString() + ";" + WidgetConfigureSummary.f3740j.getSelectedItemPosition() + ";" + this.f4174a.f3751m + ";" + str + ";" + this.f4174a.f3752n.getSelectedItemPosition();
        WidgetConfigureSummary.m3712a(context, this.f4174a.f3744c, str);
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        try {
            WidgetProviderSummary.f3789c = 0;
            WidgetProviderSummary.f3788b = 0;
            WidgetProviderSummary.m3739a(context, instance, this.f4174a.f3744c, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.f4174a.f3744c);
        this.f4174a.setResult(-1, intent);
        this.f4174a.finish();
    }
}
