package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.expensemanager.dropbox.DBRoulette;

public class vb extends AsyncTask<Context, Integer, Boolean> {
    boolean f5355a;
    boolean f5356b;
    final /* synthetic */ ExpenseManager f5357c;
    private ProgressDialog f5358d;

    vb(ExpenseManager expenseManager, boolean z) {
        this.f5357c = expenseManager;
        this.f5356b = true;
        this.f5355a = z;
        this.f5356b = aib.m3862a(expenseManager.f3250B);
    }

    protected Boolean m4239a(Context... contextArr) {
        return this.f5356b ? Boolean.valueOf(DBRoulette.m4058a(DBRoulette.m4050a(this.f5357c.f3250B), this.f5357c.f3250B, "/ExpenseManager/Database/", "personal_finance.db")) : Boolean.valueOf(false);
    }

    protected void m4240a(Boolean bool) {
        try {
            if (this.f5355a) {
                this.f5357c.m3206l();
            }
            if (this.f5358d != null && this.f5358d.isShowing()) {
                this.f5358d.dismiss();
            }
        } catch (Exception e) {
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4239a((Context[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4240a((Boolean) obj);
    }

    protected void onPreExecute() {
        this.f5358d = ProgressDialog.show(this.f5357c.f3250B, null, this.f5357c.f3250B.getResources().getString(2131099946), true, true);
        if (!this.f5356b) {
            Builder builder = new Builder(this.f5357c.f3250B);
            builder.setTitle(2131099702);
            builder.setMessage(2131099846).setCancelable(false).setPositiveButton(2131099983, new vd(this)).setNegativeButton(2131099754, new vc(this)).show();
        }
    }
}
