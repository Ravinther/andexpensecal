package com.expensemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.util.HashMap;

public class va extends AsyncTask<Context, Integer, String> {
    HashMap<String, String> f5350a;
    HashMap<String, String> f5351b;
    String[] f5352c;
    String f5353d;
    final /* synthetic */ ExpenseManager f5354e;

    va(ExpenseManager expenseManager, String str, String[] strArr, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        this.f5354e = expenseManager;
        this.f5350a = hashMap;
        this.f5351b = hashMap2;
        this.f5352c = strArr;
        this.f5353d = str;
    }

    protected String m4237a(Context... contextArr) {
        ExpenseManager.f3246v = abd.m3795a(this.f5354e.f3250B, this.f5353d, this.f5352c, this.f5350a, ExpenseManager.f3246v);
        return "";
    }

    protected void m4238a(String str) {
        super.onPostExecute(str);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4237a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4238a((String) obj);
    }

    protected void onPreExecute() {
        int i = 0;
        SharedPreferences sharedPreferences = this.f5354e.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        while (i < this.f5352c.length) {
            String str = this.f5352c[i];
            if (this.f5351b.containsKey(str)) {
                ExpenseManager.f3246v.put(str, this.f5351b.get(str));
            } else if (!ExpenseManager.f3246v.containsKey(str)) {
                String string = sharedPreferences.getString(str + "_currencyRate", null);
                if (!(string == null || "".equals(string))) {
                    ExpenseManager.f3246v.put(str, string);
                }
            }
            i++;
        }
    }
}
