package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class wi implements OnClickListener {
    final /* synthetic */ ExpenseMileageSearch f5398a;

    wi(ExpenseMileageSearch expenseMileageSearch) {
        this.f5398a = expenseMileageSearch;
    }

    public void onClick(View view) {
        String d = this.f5398a.m3252a();
        String str = this.f5398a.getResources().getString(2131099725) + "-" + aib.m3876h("yyyy-MM-dd-HHmmss") + ".csv";
        List arrayList = new ArrayList();
        if (ExpenseExport.m3164a(co.f4430d, str, ExpenseMileageActivities.m3211a(this.f5398a.f3292c, this.f5398a.f3291b, d + " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')", arrayList, "expensed DESC", true))) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5398a.getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", this.f5398a.getResources().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            this.f5398a.f3292c.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }
}
