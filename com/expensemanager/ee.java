package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class ee implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4578a;

    ee(DebtAddEdit debtAddEdit) {
        this.f4578a = debtAddEdit;
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
        CharSequence[] charSequenceArr = new String[]{r0[1], this.f4578a.f2654a.getResources().getString(2131100024).split(",")[3]};
        if (this.f4578a.f2666m == null) {
            new Builder(this.f4578a.f2654a).setTitle(2131100026).setItems(charSequenceArr, new ef(this)).show();
        } else {
            new Builder(this.f4578a.f2654a).setTitle(2131100026).setItems(r0, new eg(this)).show();
        }
    }
}
