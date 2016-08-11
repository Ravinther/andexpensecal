package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class abb implements OnClickListener {
    abb() {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
