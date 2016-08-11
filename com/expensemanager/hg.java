package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class hg implements OnClickListener {
    final /* synthetic */ int f4730a;
    final /* synthetic */ hf f4731b;

    hg(hf hfVar, int i) {
        this.f4731b = hfVar;
        this.f4730a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            String str = this.f4731b.f4729a.f4726b.f2761g[this.f4730a];
            Intent intent = new Intent(this.f4731b.f4729a.f4726b.f2763i, ExpenseNewAccount.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("isNew", false);
            bundle.putString("account", str);
            intent.putExtras(bundle);
            this.f4731b.f4729a.f4726b.startActivityForResult(intent, 0);
        }
    }
}
