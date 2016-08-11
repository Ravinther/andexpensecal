package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.io.File;

/* renamed from: com.expensemanager.c */
class C0397c implements OnClickListener {
    final /* synthetic */ AttachPicture f4279a;

    C0397c(AttachPicture attachPicture) {
        this.f4279a = attachPicture;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        new File(co.f4431e + this.f4279a.f2414a[this.f4279a.f2416c]).delete();
        this.f4279a.f2416c = 0;
        this.f4279a.onCreate(null);
    }
}
