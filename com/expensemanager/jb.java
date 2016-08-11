package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;

public class jb extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseAccountTransfer f4828a;

    protected jb(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4828a = expenseAccountTransfer;
    }

    protected String m4147a(Context... contextArr) {
        return this.f4828a.m2712a(this.f4828a.f2830p);
    }

    protected void m4148a(String str) {
        super.onPostExecute(str);
        this.f4828a.f2828n.setText(str);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4147a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4148a((String) obj);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.f4828a.f2828n.setText(2131099946);
    }
}
