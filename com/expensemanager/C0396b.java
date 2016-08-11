package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

/* renamed from: com.expensemanager.b */
class C0396b implements OnClickListener {
    final /* synthetic */ AttachPicture f4233a;

    C0396b(AttachPicture attachPicture) {
        this.f4233a = attachPicture;
    }

    public void onClick(View view) {
        try {
            aib.m3863a(new File(co.f4431e + this.f4233a.f2414a[this.f4233a.f2416c]), new File(co.f4431e + "tmp.jpg"));
            this.f4233a.setResult(-1, new Intent());
            this.f4233a.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
