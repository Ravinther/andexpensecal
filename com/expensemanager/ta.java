package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Toast;
import java.io.File;

class ta implements OnClickListener {
    final /* synthetic */ RadioButton f5282a;
    final /* synthetic */ RadioButton f5283b;
    final /* synthetic */ ExpenseExport f5284c;

    ta(ExpenseExport expenseExport, RadioButton radioButton, RadioButton radioButton2) {
        this.f5284c = expenseExport;
        this.f5282a = radioButton;
        this.f5283b = radioButton2;
    }

    public void onClick(View view) {
        if (this.f5282a.isChecked()) {
            this.f5284c.f3217g = "MM/dd/yyyy";
        }
        if (this.f5283b.isChecked()) {
            this.f5284c.f3217g = "dd/MM/yyyy";
        }
        String str = this.f5284c.f3211a + ".qif";
        if (ExpenseExport.m3164a(co.f4430d, str, this.f5284c.m3166b())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", this.f5284c.getResources().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", this.f5284c.getResources().getString(2131099868));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            this.f5284c.startActivity(Intent.createChooser(intent, "Send mail..."));
            Toast.makeText(this.f5284c.f3212b, this.f5284c.getResources().getString(2131099901), 1).show();
            return;
        }
        Toast.makeText(this.f5284c.f3212b, this.f5284c.getResources().getString(2131099897), 1).show();
    }
}
