package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class wj implements OnClickListener {
    final /* synthetic */ ExpenseMileageSearch f5399a;

    wj(ExpenseMileageSearch expenseMileageSearch) {
        this.f5399a = expenseMileageSearch;
    }

    public void onClick(View view) {
        String str = this.f5399a.m3252a() + " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')";
        String str2 = this.f5399a.getResources().getString(2131099725) + "-" + aib.m3876h("yyyy-MM-dd-HHmmss") + ".html";
        if (ExpenseExport.m3164a(co.f4430d, str2, this.f5399a.m3255a(str))) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5399a.getResources().getString(2131099725) + ":" + str2);
            intent.putExtra("android.intent.extra.TEXT", this.f5399a.getResources().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str2)));
            this.f5399a.f3292c.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }
}
