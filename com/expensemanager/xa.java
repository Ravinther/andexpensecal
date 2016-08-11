package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class xa implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5433a;

    xa(ExpenseNewTransaction expenseNewTransaction) {
        this.f5433a = expenseNewTransaction;
    }

    public void onClick(View view) {
        File file = new File(co.f4430d);
        if (!file.exists()) {
            file.mkdir();
        }
        file = new File(co.f4431e);
        if (!file.exists()) {
            file.mkdir();
        }
        CharSequence[] charSequenceArr = new String[]{r0[1], this.f5433a.f3334a.getResources().getString(2131100024).split(",")[3]};
        if (this.f5433a.f3346m == null) {
            new Builder(this.f5433a.f3334a).setTitle(2131100026).setItems(charSequenceArr, new xb(this)).show();
        } else {
            new Builder(this.f5433a.f3334a).setTitle(2131100026).setItems(r0, new xc(this)).show();
        }
    }
}
