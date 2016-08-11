package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class afz implements OnClickListener {
    final /* synthetic */ ShoppingListAddEdit f4073a;

    afz(ShoppingListAddEdit shoppingListAddEdit) {
        this.f4073a = shoppingListAddEdit;
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
        CharSequence[] charSequenceArr = new String[]{r0[1], this.f4073a.f3605a.getResources().getString(2131100024).split(",")[3]};
        if (this.f4073a.f3620p == null) {
            new Builder(this.f4073a.f3605a).setTitle(2131100026).setItems(charSequenceArr, new aga(this)).show();
        } else {
            new Builder(this.f4073a.f3605a).setTitle(2131100026).setItems(r0, new agb(this)).show();
        }
    }
}
