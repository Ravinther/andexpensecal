package com.expensemanager.dropbox;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.expensemanager.dropbox.s */
class C0443s implements OnClickListener {
    final /* synthetic */ C0441q f4559a;

    C0443s(C0441q c0441q) {
        this.f4559a = c0441q;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f4559a.f4553e != null) {
            this.f4559a.f4553e.m2334a();
        }
        if (this.f4559a.f4555g != null) {
            this.f4559a.f4555g.dismiss();
        }
        this.f4559a.m4091a("Upload cancelled");
    }
}
