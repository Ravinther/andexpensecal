package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class dm extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ CurrencySettings f4481a;

    protected dm(CurrencySettings currencySettings) {
        this.f4481a = currencySettings;
    }

    protected String m4047a(Context... contextArr) {
        if (aib.m3862a(this.f4481a.f2645f)) {
            this.f4481a.f2640a = abd.m3816b(this.f4481a.f2645f, this.f4481a.f2646g);
        }
        return null;
    }

    protected void m4048a(String str) {
        super.onPostExecute(str);
        for (int i = 0; i < this.f4481a.f2647h.size(); i++) {
            LinearLayout linearLayout = (LinearLayout) this.f4481a.f2642c.getChildAt(i + 1);
            int childCount = linearLayout.getChildCount();
            String str2 = (String) this.f4481a.f2640a.get(((String) this.f4481a.f2647h.get(i)).replace("/", ""));
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                if ("android.widget.TextView".equalsIgnoreCase(childAt.getClass().getName())) {
                    TextView textView = (TextView) childAt;
                    if (str2 != null && this.f4481a.getResources().getString(2131099946).equalsIgnoreCase(textView.getText().toString())) {
                        textView.setText(str2);
                    }
                }
            }
        }
    }

    protected void m4049a(Integer... numArr) {
        super.onProgressUpdate(numArr);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4047a((Context[]) objArr);
    }

    protected void onCancelled() {
        super.onCancelled();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4048a((String) obj);
    }

    protected void onPreExecute() {
        super.onPreExecute();
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        m4049a((Integer[]) objArr);
    }
}
