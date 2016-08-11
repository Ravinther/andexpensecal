package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class sw implements OnClickListener {
    final /* synthetic */ String f5274a;
    final /* synthetic */ ExpenseExport f5275b;

    sw(ExpenseExport expenseExport, String str) {
        this.f5275b = expenseExport;
        this.f5274a = str;
    }

    public void onClick(View view) {
        if (ExpenseExport.m3164a(co.f4430d, this.f5274a, this.f5275b.m3160a())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5275b.getResources().getString(2131099725) + ":" + this.f5274a);
            intent.putExtra("android.intent.extra.TEXT", this.f5275b.getResources().getString(2131099868));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + this.f5274a)));
            this.f5275b.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }
}
