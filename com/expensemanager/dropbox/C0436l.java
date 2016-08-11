package com.expensemanager.dropbox;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.expensemanager.co;

/* renamed from: com.expensemanager.dropbox.l */
public class C0436l extends AsyncTask<Context, Integer, Boolean> {
    String f4530a;
    final /* synthetic */ DropboxDownloadList f4531b;
    private ProgressDialog f4532c;

    C0436l(DropboxDownloadList dropboxDownloadList, String str) {
        this.f4531b = dropboxDownloadList;
        this.f4530a = str;
    }

    protected Boolean m4076a(Context... contextArr) {
        boolean z = false;
        C0356a a = DBRoulette.m4050a(this.f4531b);
        int i = 0;
        while (i < this.f4531b.f4507b.size()) {
            boolean a2 = DBRoulette.m4059a(a, this.f4531b.f4506a, this.f4530a, co.f4431e, (String) this.f4531b.f4507b.get(i));
            i++;
            z = a2;
        }
        return Boolean.valueOf(z);
    }

    protected void m4077a(Boolean bool) {
        if (bool.booleanValue()) {
            Toast.makeText(this.f4531b, 2131099842, 1).show();
            this.f4531b.setResult(-1, new Intent(this.f4531b, DBRoulette.class));
            this.f4531b.finish();
            if (this.f4532c != null) {
                this.f4532c.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(this.f4531b.f4506a, this.f4531b.getResources().getString(2131099925), 1).show();
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4076a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4077a((Boolean) obj);
    }

    protected void onPreExecute() {
        this.f4532c = ProgressDialog.show(this.f4531b.f4506a, null, this.f4531b.f4506a.getResources().getString(2131099946), true, true);
    }
}
