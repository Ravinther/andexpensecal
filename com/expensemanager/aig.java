package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class aig implements OnCancelListener {
    final /* synthetic */ WidgetConfigure f4161a;

    aig(WidgetConfigure widgetConfigure) {
        this.f4161a = widgetConfigure;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f4161a.m3646b();
    }
}
