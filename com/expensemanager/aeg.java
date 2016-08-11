package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class aeg implements OnClickListener {
    final /* synthetic */ TextView f3993a;
    final /* synthetic */ SMSAddEdit f3994b;

    aeg(SMSAddEdit sMSAddEdit, TextView textView) {
        this.f3994b = sMSAddEdit;
        this.f3993a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3993a.setText(this.f3994b.f3571k);
    }
}
