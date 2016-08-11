package com.expensemanager;

import android.content.Intent;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;

class aap implements OnClickListener {
    final /* synthetic */ ExpenseReport f3816a;

    aap(ExpenseReport expenseReport) {
        this.f3816a = expenseReport;
    }

    public void onClick(View view) {
        this.f3816a.startActivityForResult(new Intent("android.intent.action.PICK", Contacts.CONTENT_URI), 1);
    }
}
