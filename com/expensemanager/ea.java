package com.expensemanager;

import android.content.Intent;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;

class ea implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4574a;

    ea(DebtAddEdit debtAddEdit) {
        this.f4574a = debtAddEdit;
    }

    public void onClick(View view) {
        this.f4574a.startActivityForResult(new Intent("android.intent.action.PICK", Contacts.CONTENT_URI), 3);
    }
}
