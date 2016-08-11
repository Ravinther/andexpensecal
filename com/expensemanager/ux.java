package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;

public class ux extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseManager f5347a;

    protected ux(ExpenseManager expenseManager) {
        this.f5347a = expenseManager;
    }

    protected String m4225a(Context... contextArr) {
        this.f5347a.m3207m();
        return "";
    }

    protected void m4226a(String str) {
        super.onPostExecute(str);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4225a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4226a((String) obj);
    }
}
