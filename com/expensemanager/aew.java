package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class aew implements OnClickListener {
    final /* synthetic */ SMSList f4020a;

    aew(SMSList sMSList) {
        this.f4020a = sMSList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Toast.makeText(this.f4020a.f3574b, SMSMain.m3540a(this.f4020a.f3574b, this.f4020a.f3578f, this.f4020a.f3575c.replace("_1", "").replace("_2", ""), true) + " messages are saved successfully.", 1).show();
        this.f4020a.onCreate(null);
    }
}
