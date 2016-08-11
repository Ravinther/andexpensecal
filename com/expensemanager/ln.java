package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class ln implements OnClickListener {
    final /* synthetic */ int f4933a;
    final /* synthetic */ ExpenseBudgetList f4934b;

    ln(ExpenseBudgetList expenseBudgetList, int i) {
        this.f4934b = expenseBudgetList;
        this.f4933a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f4934b.f2939m.m4206d()) {
            this.f4934b.f2939m.m4193a();
        }
        boolean a = this.f4934b.f2939m.m4195a("expense_budget", (long) this.f4933a);
        if (a) {
            abd.m3805a(this.f4934b.f2944r, a);
            Toast.makeText(this.f4934b.f2944r, this.f4934b.getResources().getString(2131099811), 1).show();
        } else {
            Toast.makeText(this.f4934b.f2944r, this.f4934b.getResources().getString(2131099707), 1).show();
        }
        this.f4934b.m2838a(this.f4934b.f2944r, this.f4934b.f2939m);
        switch (this.f4934b.f2950x) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4934b.m2841b();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4934b.m2845c();
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f4934b.m2849e();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f4934b.m2854g();
            default:
        }
    }
}
