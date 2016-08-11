package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aii implements OnClickListener {
    final /* synthetic */ WidgetConfigure f4163a;

    aii(WidgetConfigure widgetConfigure) {
        this.f4163a = widgetConfigure;
    }

    public void onClick(View view) {
        Context context = this.f4163a;
        String str = ((String) this.f4163a.f3688d.getSelectedItem()) + "," + this.f4163a.f3689e.isChecked() + "," + this.f4163a.f3690f.isChecked() + "," + this.f4163a.f3696l.isChecked() + "," + this.f4163a.f3697m.isChecked() + "," + this.f4163a.f3698n.isChecked() + "," + this.f4163a.f3700p.isChecked() + "," + this.f4163a.f3699o.isChecked() + "," + this.f4163a.f3691g.isChecked() + "," + this.f4163a.f3692h.isChecked() + "," + this.f4163a.f3693i.isChecked() + "," + this.f4163a.f3694j.isChecked() + "," + this.f4163a.f3695k.isChecked() + "," + this.f4163a.f3701q.isChecked() + "," + this.f4163a.f3702r.isChecked() + "," + this.f4163a.f3703s.isChecked();
        WidgetConfigure.m3644a(context, this.f4163a.f3687b, str);
        try {
            WidgetProvider.m3727a(context, AppWidgetManager.getInstance(context), this.f4163a.f3687b, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.f4163a.f3687b);
        this.f4163a.setResult(-1, intent);
        this.f4163a.finish();
    }
}
