package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ail implements OnClickListener {
    final /* synthetic */ WidgetConfigureBudget f4166a;

    ail(WidgetConfigureBudget widgetConfigureBudget) {
        this.f4166a = widgetConfigureBudget;
    }

    public void onClick(View view) {
        Context context = this.f4166a;
        if (this.f4166a.f3709c.isChecked()) {
            this.f4166a.f3714h = 0;
        }
        if (this.f4166a.f3710d.isChecked()) {
            this.f4166a.f3714h = 1;
        }
        if (this.f4166a.f3711e.isChecked()) {
            this.f4166a.f3714h = 2;
        }
        if (this.f4166a.f3712f.isChecked()) {
            this.f4166a.f3714h = 3;
        }
        if (this.f4166a.f3713g.isChecked()) {
            this.f4166a.f3714h = 4;
        }
        String str = this.f4166a.f3714h + ";" + this.f4166a.f3715i.isChecked();
        WidgetConfigureBudget.m3669a(context, this.f4166a.f3708b, str);
        try {
            WidgetProviderBudget.m3733a(context, AppWidgetManager.getInstance(context), this.f4166a.f3708b, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.f4166a.f3708b);
        this.f4166a.setResult(-1, intent);
        this.f4166a.finish();
    }
}
