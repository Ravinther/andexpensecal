package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.aib;
import com.expensemanager.co;
import java.io.File;

/* renamed from: com.expensemanager.dropbox.g */
class C0431g implements OnClickListener {
    final /* synthetic */ DBRoulette f4516a;

    C0431g(DBRoulette dBRoulette) {
        this.f4516a = dBRoulette;
    }

    public void onClick(View view) {
        File file = new File(co.f4431e);
        if (file == null || file.list() == null || file.list().length == 0) {
            aib.m3849a(this.f4516a.f4505n, null, this.f4516a.getResources().getString(2131099702), 17301543, this.f4516a.getResources().getString(2131099928), this.f4516a.getResources().getString(2131099983), null, null, null).show();
        } else {
            new C0441q(this.f4516a.f4505n, this.f4516a.f4493a, "/ExpenseManager/Receipt/", file, true).execute(new Void[0]);
        }
    }
}
