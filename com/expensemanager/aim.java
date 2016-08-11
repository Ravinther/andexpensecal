package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class aim implements OnCancelListener {
    final /* synthetic */ WidgetConfigureSmall f4167a;

    aim(WidgetConfigureSmall widgetConfigureSmall) {
        this.f4167a = widgetConfigureSmall;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f4167a.m3685b();
    }
}
