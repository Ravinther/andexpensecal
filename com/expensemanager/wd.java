package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;

public class wd extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseMileageNewEdit f5392a;

    protected wd(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5392a = expenseMileageNewEdit;
    }

    protected String m4241a(Context... contextArr) {
        try {
            aba.m3775c(this.f5392a.f3288u, this.f5392a.f3287t);
            aib.m3861a(this.f5392a.f3268a, co.f4432f, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    protected void m4242a(String str) {
        int i;
        int i2 = 0;
        super.onPostExecute(str);
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f5392a.f3268a);
        int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(this.f5392a.f3268a, WidgetProvider.class));
        for (int i3 : appWidgetIds) {
            try {
                WidgetProvider.m3727a(this.f5392a.f3268a, instance, i3, WidgetConfigure.m3642a(this.f5392a.f3268a, i3));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int[] appWidgetIds2 = instance.getAppWidgetIds(new ComponentName(this.f5392a.f3268a, WidgetProviderSmall.class));
        while (i2 < appWidgetIds2.length) {
            i = appWidgetIds2[i2];
            try {
                WidgetProviderSmall.m3737a(this.f5392a.f3268a, instance, i, WidgetConfigureSmall.m3681a(this.f5392a.f3268a, i));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            i2++;
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4241a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4242a((String) obj);
    }
}
