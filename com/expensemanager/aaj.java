package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;

public class aaj extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseRepeatingTransaction f3804a;

    protected aaj(ExpenseRepeatingTransaction expenseRepeatingTransaction) {
        this.f3804a = expenseRepeatingTransaction;
    }

    protected String m3740a(Context... contextArr) {
        return this.f3804a.m3393c(this.f3804a.f3405D);
    }

    protected void m3741a(String str) {
        super.onPostExecute(str);
        this.f3804a.f3404C.setText(str);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3740a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m3741a((String) obj);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.f3804a.f3404C.setText(2131099946);
    }
}
