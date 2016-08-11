package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class aef implements OnClickListener {
    final /* synthetic */ TextView f3991a;
    final /* synthetic */ SMSAddEdit f3992b;

    aef(SMSAddEdit sMSAddEdit, TextView textView) {
        this.f3992b = sMSAddEdit;
        this.f3991a = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3992b.f3571k = this.f3991a.getText().toString();
    }
}
