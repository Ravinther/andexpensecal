package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class qy implements OnClickListener {
    final /* synthetic */ ExpenseDataBackup f5203a;

    qy(ExpenseDataBackup expenseDataBackup) {
        this.f5203a = expenseDataBackup;
    }

    public void onClick(View view) {
        if (ExpenseExport.m3164a(co.f4430d, "expensemanager.csv", this.f5203a.m3091a())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5203a.getResources().getString(2131099725) + ":" + "expensemanager.csv");
            intent.putExtra("android.intent.extra.TEXT", this.f5203a.getResources().getString(2131099868));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + "expensemanager.csv")));
            this.f5203a.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }
}
