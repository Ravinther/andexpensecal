package com.expensemanager.dropbox;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.expensemanager.ExpenseExport;
import com.expensemanager.co;

/* renamed from: com.expensemanager.dropbox.m */
public class C0437m extends AsyncTask<Context, Integer, Boolean> {
    int f4533a;
    String f4534b;
    final /* synthetic */ DropboxDownloadList f4535c;
    private ProgressDialog f4536d;

    C0437m(DropboxDownloadList dropboxDownloadList, int i, String str) {
        this.f4535c = dropboxDownloadList;
        this.f4533a = i;
        this.f4534b = str;
    }

    protected Boolean m4078a(Context... contextArr) {
        C0356a a = DBRoulette.m4050a(this.f4535c);
        boolean a2 = "/ExpenseManager/Database/".equals(this.f4534b) ? DBRoulette.m4058a(a, this.f4535c.f4506a, this.f4534b, (String) this.f4535c.f4507b.get(this.f4533a)) : "/ExpenseManager/Receipt/".equals(this.f4534b) ? DBRoulette.m4059a(a, this.f4535c.f4506a, this.f4534b, co.f4431e, (String) this.f4535c.f4507b.get(this.f4533a)) : DBRoulette.m4059a(a, this.f4535c.f4506a, this.f4534b, co.f4430d, (String) this.f4535c.f4507b.get(this.f4533a));
        return Boolean.valueOf(a2);
    }

    protected void m4079a(Boolean bool) {
        if (bool.booleanValue()) {
            if ("/ExpenseManager/Database/".equals(this.f4534b) || "/ExpenseManager/Receipt/".equals(this.f4534b)) {
                if (bool.booleanValue()) {
                    Toast.makeText(this.f4535c, 2131099842, 1).show();
                }
                this.f4535c.setResult(-1, new Intent(this.f4535c, DBRoulette.class));
                this.f4535c.finish();
            } else if (bool.booleanValue()) {
                String str = (String) this.f4535c.f4507b.get(this.f4533a);
                str.substring(str.indexOf("_") + 1, str.lastIndexOf("."));
                if (Boolean.valueOf(ExpenseExport.m3163a(this.f4535c.f4506a, co.f4430d + "/" + ((String) this.f4535c.f4507b.get(this.f4533a)), null)).booleanValue()) {
                    Toast.makeText(this.f4535c.f4506a, this.f4535c.getResources().getString(2131099842), 1).show();
                    this.f4535c.setResult(-1, new Intent(this.f4535c, DBRoulette.class));
                    this.f4535c.finish();
                } else {
                    Toast.makeText(this.f4535c.f4506a, this.f4535c.getResources().getString(2131099925), 1).show();
                }
            }
            if (this.f4536d != null) {
                this.f4536d.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(this.f4535c.f4506a, this.f4535c.getResources().getString(2131099925), 1).show();
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4078a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4079a((Boolean) obj);
    }

    protected void onPreExecute() {
        this.f4536d = ProgressDialog.show(this.f4535c.f4506a, null, this.f4535c.f4506a.getResources().getString(2131099946), true, true);
    }
}
