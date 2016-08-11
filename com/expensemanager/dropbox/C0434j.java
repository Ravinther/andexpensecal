package com.expensemanager.dropbox;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.IOException;

/* renamed from: com.expensemanager.dropbox.j */
class C0434j implements OnClickListener {
    final /* synthetic */ C0433i f4527a;

    C0434j(C0433i c0433i) {
        this.f4527a = c0433i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4527a.f4524g = true;
        this.f4527a.f4526i = "Canceled";
        if (this.f4527a.f4523f != null) {
            try {
                this.f4527a.f4523f.close();
            } catch (IOException e) {
            }
        }
    }
}
