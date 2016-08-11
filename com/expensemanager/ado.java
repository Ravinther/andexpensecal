package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ado implements OnClickListener {
    final /* synthetic */ PinReset f3974a;

    ado(PinReset pinReset) {
        this.f3974a = pinReset;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"pfinanceapp@gmail.com, expensem@yahoo.com"});
        intent.putExtra("android.intent.extra.SUBJECT", this.f3974a.getResources().getString(2131099725) + ":Forgot PIN");
        intent.putExtra("android.intent.extra.TEXT", "Forgot PIN. Please Help!");
        this.f3974a.f3554e.startActivity(Intent.createChooser(intent, "Send mail..."));
        dialogInterface.dismiss();
    }
}
