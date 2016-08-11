package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Button;

class wl implements OnClickListener {
    final /* synthetic */ Button f5401a;
    final /* synthetic */ ExpenseMileageSearch f5402b;

    wl(ExpenseMileageSearch expenseMileageSearch, Button button) {
        this.f5402b = expenseMileageSearch;
        this.f5401a = button;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5401a.setText(null);
    }
}
