package com.expensemanager;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import com.expensemanager.dropbox.DBRoulette;

public class ej extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ DebtAddEdit f4584a;

    protected ej(DebtAddEdit debtAddEdit) {
        this.f4584a = debtAddEdit;
    }

    protected String m4097a(Context... contextArr) {
        try {
            if (!"EditActivity".equalsIgnoreCase(this.f4584a.getIntent().getStringExtra("fromWhere"))) {
                aba.m3775c(this.f4584a.f2672s, this.f4584a.f2671r);
            }
            aib.m3861a(this.f4584a.f2654a, co.f4432f, false);
            if (this.f4584a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getBoolean("AUTO_SYNC", false) && aib.m3862a(this.f4584a.f2654a)) {
                DBRoulette.m4063b(this.f4584a.f2654a);
                abd.m3805a(this.f4584a.f2654a, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        return "";
    }

    protected void m4098a(String str) {
        int i;
        int i2 = 0;
        super.onPostExecute(str);
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f4584a.f2654a);
        int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(this.f4584a.f2654a, WidgetProvider.class));
        for (int i3 : appWidgetIds) {
            try {
                WidgetProvider.m3727a(this.f4584a.f2654a, instance, i3, WidgetConfigure.m3642a(this.f4584a.f2654a, i3));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        appWidgetIds = instance.getAppWidgetIds(new ComponentName(this.f4584a.f2654a, WidgetProviderSmall.class));
        for (int i32 : appWidgetIds) {
            try {
                WidgetProviderSmall.m3737a(this.f4584a.f2654a, instance, i32, WidgetConfigureSmall.m3681a(this.f4584a.f2654a, i32));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int[] appWidgetIds2 = instance.getAppWidgetIds(new ComponentName(this.f4584a.f2654a, WidgetProviderSummary.class));
        while (i2 < appWidgetIds2.length) {
            i = appWidgetIds2[i2];
            try {
                WidgetProviderSummary.m3739a(this.f4584a.f2654a, instance, i, WidgetConfigureSummary.m3709a(this.f4584a.f2654a, i));
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            i2++;
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4097a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4098a((String) obj);
    }
}
