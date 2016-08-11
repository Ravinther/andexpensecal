package com.expensemanager;

import android.content.Context;
import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;

public class hc extends AsyncTask<Context, Integer, String> {
    final /* synthetic */ ExpenseAccountList f4724a;

    protected hc(ExpenseAccountList expenseAccountList) {
        this.f4724a = expenseAccountList;
    }

    protected String m4132a(Context... contextArr) {
        Map hashMap = new HashMap();
        double d = 0.0d;
        int i = 0;
        while (i < this.f4724a.f2761g.length) {
            String str;
            if (this.f4724a.f2767m == null || this.f4724a.f2767m.get(this.f4724a.f2761g[i] + "_balance") == null) {
                this.f4724a.f2767m = ExpenseAccountList.m2664a(this.f4724a.f2766l, this.f4724a.f2761g[i], this.f4724a.f2767m);
            }
            String str2 = (String) this.f4724a.f2767m.get(this.f4724a.f2761g[i] + "_balance");
            if (str2 != null) {
                str2 = str2.replaceAll(",", "");
            }
            if (str2 == null || !str2.trim().startsWith("(")) {
                str = str2;
            } else {
                str = "-" + str2.replace("(", "").replace(")", "");
            }
            String a = aib.m3851a(abd.m3784a((String) this.f4724a.f2755a.get(this.f4724a.f2761g[i] + "_CURRENCY"), -1));
            if (this.f4724a.f2769o == null || "".equals(this.f4724a.f2769o) || this.f4724a.f2769o.equals(a) || "".equals(a)) {
                d = aba.m3743a("" + d, str);
            } else {
                try {
                    str2 = (String) hashMap.get(a + this.f4724a.f2769o);
                    if (str2 == null || "".equals(str2)) {
                        str2 = abd.m3786a(this.f4724a.f2763i, this.f4724a.f2766l, this.f4724a.f2769o + a, "");
                        if ("".equals(str2)) {
                            String a2 = aib.m3856a(a + this.f4724a.f2769o, "CURRENCY", false);
                            if (a2 != null) {
                                HashMap g = aib.m3875g(a2);
                                if (g != null) {
                                    str2 = (String) g.get(a + this.f4724a.f2769o);
                                }
                            }
                        } else {
                            str2 = abd.m3814b(str2);
                        }
                        hashMap.put(a + this.f4724a.f2769o, str2);
                    }
                    d += Double.valueOf(str2).doubleValue() * Double.valueOf(str).doubleValue();
                } catch (Exception e) {
                    return "";
                }
            }
            i++;
        }
        return "" + d;
    }

    protected void m4133a(String str) {
        if (str == null || str.equals("")) {
            this.f4724a.f2768n.setText("");
            return;
        }
        String b = aba.m3767b(str);
        if (b.startsWith("(")) {
            this.f4724a.f2768n.setTextColor(co.f4428b);
        } else {
            this.f4724a.f2768n.setTextColor(-16217592);
        }
        this.f4724a.f2768n.setText(this.f4724a.getResources().getString(2131099684) + " " + b + " " + this.f4724a.f2769o);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4132a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4133a((String) obj);
    }

    protected void onPreExecute() {
        super.onPreExecute();
        this.f4724a.f2768n.setText(2131099946);
    }
}
