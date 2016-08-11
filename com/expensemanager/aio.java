package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class aio implements OnClickListener {
    final /* synthetic */ WidgetConfigureSmall f4169a;

    aio(WidgetConfigureSmall widgetConfigureSmall) {
        this.f4169a = widgetConfigureSmall;
    }

    public void onClick(View view) {
        Context context = this.f4169a;
        if (this.f4169a.m3688c() > 4) {
            aib.m3849a(context, null, this.f4169a.getResources().getString(2131099702), 17301543, this.f4169a.getResources().getString(2131100086), this.f4169a.getResources().getString(2131099983), null, null, null).show();
            return;
        }
        String str = ((String) this.f4169a.f3719d.getSelectedItem()) + "," + this.f4169a.f3720e.isChecked() + "," + this.f4169a.f3721f.isChecked() + "," + this.f4169a.f3726k.isChecked() + "," + this.f4169a.f3727l.isChecked() + "," + this.f4169a.f3728m.isChecked() + "," + this.f4169a.f3730o.isChecked() + "," + this.f4169a.f3729n.isChecked() + "," + this.f4169a.f3722g.isChecked() + "," + this.f4169a.f3723h.isChecked() + "," + this.f4169a.f3724i.isChecked() + "," + this.f4169a.f3725j.isChecked() + "," + this.f4169a.f3731p.isChecked() + "," + this.f4169a.f3733r.isChecked() + "," + this.f4169a.f3734s.isChecked() + "," + this.f4169a.f3732q.isChecked();
        WidgetConfigureSmall.m3683a(context, this.f4169a.f3718b, str);
        try {
            WidgetProviderSmall.m3737a(context, AppWidgetManager.getInstance(context), this.f4169a.f3718b, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.f4169a.f3718b);
        this.f4169a.setResult(-1, intent);
        this.f4169a.finish();
    }
}
