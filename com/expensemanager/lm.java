package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class lm implements OnClickListener {
    final /* synthetic */ ExpenseBudgetList f4932a;

    lm(ExpenseBudgetList expenseBudgetList) {
        this.f4932a = expenseBudgetList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "DELETE from expense_budget";
        if (!this.f4932a.f2939m.m4206d()) {
            this.f4932a.f2939m.m4193a();
        }
        if (this.f4932a.f2939m.m4202b("DELETE from expense_budget")) {
            abd.m3805a(this.f4932a.f2944r, true);
            Toast.makeText(this.f4932a.f2944r, 2131099811, 1).show();
        } else {
            Toast.makeText(this.f4932a.f2944r, 2131099806, 1).show();
        }
        this.f4932a.m2838a(this.f4932a.f2944r, this.f4932a.f2939m);
        switch (this.f4932a.f2950x) {
            case C0607c.AdsAttrs_adSize /*0*/:
                r0.m2841b();
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4932a.m2845c();
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f4932a.m2849e();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f4932a.m2854g();
            default:
        }
    }
}
