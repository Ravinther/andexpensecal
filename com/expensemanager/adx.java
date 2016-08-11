package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;

class adx implements OnClickListener {
    final /* synthetic */ SMSAddEdit f3982a;

    adx(SMSAddEdit sMSAddEdit) {
        this.f3982a = sMSAddEdit;
    }

    public void onClick(View view) {
        new Builder(this.f3982a.f3572l).setTitle(2131099916).setMessage(2131100089).setPositiveButton(2131099983, new ady(this)).show();
    }
}
