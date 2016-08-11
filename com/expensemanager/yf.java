package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;

public class yf extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseNewTransaction f5479a;

    protected yf(ExpenseNewTransaction expenseNewTransaction) {
        this.f5479a = expenseNewTransaction;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String m4243a(android.content.Context... r8) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r3 = android.appwidget.AppWidgetManager.getInstance(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = new android.content.ComponentName;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r2.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = com.expensemanager.WidgetProvider.class;
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = r3.getAppWidgetIds(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r1;
    L_0x001d:
        r0 = r4.length;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r2 >= r0) goto L_0x0045;
    L_0x0020:
        r0 = r4[r2];	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r5 = r7.f5479a;	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
        r5 = r5.f3334a;	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
        r5 = com.expensemanager.WidgetConfigure.m3642a(r5, r0);	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
        r6 = r7.f5479a;	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
        r6 = r6.f3334a;	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
        com.expensemanager.WidgetProvider.m3727a(r6, r3, r0, r5);	 Catch:{ Exception -> 0x0039, OutOfMemoryError -> 0x0078 }
    L_0x0035:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x001d;
    L_0x0039:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        goto L_0x0035;
    L_0x003e:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x0042:
        r0 = "";
    L_0x0044:
        return r0;
    L_0x0045:
        r0 = new android.content.ComponentName;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r2.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = com.expensemanager.WidgetProviderSmall.class;
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = r3.getAppWidgetIds(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r1;
    L_0x0057:
        r0 = r4.length;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r2 >= r0) goto L_0x007d;
    L_0x005a:
        r0 = r4[r2];	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r5 = r7.f5479a;	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
        r5 = r5.f3334a;	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
        r5 = com.expensemanager.WidgetConfigureSmall.m3681a(r5, r0);	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
        r6 = r7.f5479a;	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
        r6 = r6.f3334a;	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
        com.expensemanager.WidgetProviderSmall.m3737a(r6, r3, r0, r5);	 Catch:{ Exception -> 0x0073, OutOfMemoryError -> 0x0078 }
    L_0x006f:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0057;
    L_0x0073:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        goto L_0x006f;
    L_0x0078:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0042;
    L_0x007d:
        r0 = new android.content.ComponentName;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r2.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = com.expensemanager.WidgetProviderSummary.class;
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = r3.getAppWidgetIds(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r1;
    L_0x008f:
        r0 = r4.length;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r2 >= r0) goto L_0x00b0;
    L_0x0092:
        r0 = r4[r2];	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r5 = r7.f5479a;	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
        r5 = r5.f3334a;	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
        r5 = com.expensemanager.WidgetConfigureSummary.m3709a(r5, r0);	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
        r6 = r7.f5479a;	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
        r6 = r6.f3334a;	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
        com.expensemanager.WidgetProviderSummary.m3739a(r6, r3, r0, r5);	 Catch:{ Exception -> 0x00ab, OutOfMemoryError -> 0x0078 }
    L_0x00a7:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x008f;
    L_0x00ab:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        goto L_0x00a7;
    L_0x00b0:
        r0 = new android.content.ComponentName;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r2.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = com.expensemanager.WidgetProviderBudget.class;
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = r3.getAppWidgetIds(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
    L_0x00c1:
        r0 = r2.length;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r1 >= r0) goto L_0x00e2;
    L_0x00c4:
        r0 = r2[r1];	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r4 = r7.f5479a;	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
        r4 = r4.f3334a;	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
        r4 = com.expensemanager.WidgetConfigureBudget.m3667a(r4, r0);	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
        r5 = r7.f5479a;	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
        r5 = r5.f3334a;	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
        com.expensemanager.WidgetProviderBudget.m3733a(r5, r3, r0, r4);	 Catch:{ Exception -> 0x00dd, OutOfMemoryError -> 0x0078 }
    L_0x00d9:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00c1;
    L_0x00dd:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        goto L_0x00d9;
    L_0x00e2:
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = "MY_PORTFOLIO_TITLES";
        r2 = 4;
        r0 = r0.getSharedPreferences(r1, r2);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = "SYNC_FLAG";
        r2 = 0;
        r0 = r0.getBoolean(r1, r2);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r0 != 0) goto L_0x00fc;
    L_0x00f8:
        r0 = "";
        goto L_0x0044;
    L_0x00fc:
        r0 = "EditActivity";
        r1 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = r1.getIntent();	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = "fromWhere";
        r1 = r1.getStringExtra(r2);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r0 != 0) goto L_0x011f;
    L_0x0110:
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3358y;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = r1.f3357x;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        com.expensemanager.aba.m3775c(r0, r1);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
    L_0x011f:
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r1 = com.expensemanager.co.f4432f;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r2 = 0;
        com.expensemanager.aib.m3861a(r0, r1, r2);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = com.expensemanager.aib.m3862a(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        if (r0 == 0) goto L_0x0042;
    L_0x0137:
        r0 = r7.f5479a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        r0 = r0.f3334a;	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        com.expensemanager.dropbox.DBRoulette.m4063b(r0);	 Catch:{ Exception -> 0x003e, OutOfMemoryError -> 0x0078 }
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.yf.a(android.content.Context[]):java.lang.String");
    }

    protected void m4244a(String str) {
        super.onPostExecute(str);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4243a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4244a((String) obj);
    }
}
