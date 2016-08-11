package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;

public class dh extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ CurrencyConverter f4476a;

    protected dh(CurrencyConverter currencyConverter) {
        this.f4476a = currencyConverter;
    }

    protected String m4044a(Context... contextArr) {
        return this.f4476a.m2547b();
    }

    protected void m4045a(String str) {
        super.onPostExecute(str);
        this.f4476a.f2629c.setText(str);
        if (this.f4476a.f2632f != null) {
            this.f4476a.f2632f.setText(this.f4476a.f2636j);
        }
        this.f4476a.f2627a.setOnItemSelectedListener(new di(this));
        this.f4476a.f2628b.setOnItemSelectedListener(new dj(this));
        if (this.f4476a.f2634h != 0.0d) {
            this.f4476a.f2631e.setHint(CurrencyConverter.m2541a(this.f4476a.f2634h));
        }
    }

    protected void m4046a(Integer... numArr) {
        super.onProgressUpdate(numArr);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4044a((Context[]) objArr);
    }

    protected void onCancelled() {
        super.onCancelled();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4045a((String) obj);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.f4476a.f2629c.setText(2131099946);
        if (this.f4476a.f2632f != null) {
            this.f4476a.f2632f.setText(null);
        }
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        m4046a((Integer[]) objArr);
    }
}
