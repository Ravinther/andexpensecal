package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class aic implements OnClickListener {
    aic() {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
