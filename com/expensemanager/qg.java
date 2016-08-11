package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;
import java.util.ArrayList;

class qg implements OnClickListener {
    final /* synthetic */ ExpenseCustomActivities f5172a;

    qg(ExpenseCustomActivities expenseCustomActivities) {
        this.f5172a = expenseCustomActivities;
    }

    public void onClick(View view) {
        String k = this.f5172a.m3059a();
        String str = this.f5172a.getResources().getString(2131099725) + "-" + aib.m3876h("yyyy-MM-dd-HHmmss") + ".html";
        if (!ExpenseExport.m3164a(co.f4430d, str, ExpenseCustomActivities.m3060a(this.f5172a.f3143d, k, this.f5172a.f3146g.getText().toString(), this.f5172a.f3142c))) {
            return;
        }
        if (ExpenseCustomActivities.m3065a(this.f5172a.f3142c, "receipts.zip")) {
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5172a.getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", this.f5172a.getResources().getString(2131100054));
            ArrayList arrayList = new ArrayList();
            arrayList.add(Uri.fromFile(new File(co.f4430d + "/" + str)));
            arrayList.add(Uri.fromFile(new File(co.f4430d + "/" + "receipts.zip")));
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            this.f5172a.f3143d.startActivity(Intent.createChooser(intent, "Send mail..."));
            return;
        }
        intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
        intent.putExtra("android.intent.extra.SUBJECT", this.f5172a.getResources().getString(2131099725) + ":" + str);
        intent.putExtra("android.intent.extra.TEXT", this.f5172a.getResources().getString(2131100054));
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
        this.f5172a.f3143d.startActivity(Intent.createChooser(intent, "Send mail..."));
    }
}
