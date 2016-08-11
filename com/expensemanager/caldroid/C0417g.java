package com.expensemanager.caldroid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.expensemanager.abd;

/* renamed from: com.expensemanager.caldroid.g */
class C0417g implements OnClickListener {
    final /* synthetic */ boolean[] f4376a;
    final /* synthetic */ CaldroidActivity f4377b;

    C0417g(CaldroidActivity caldroidActivity, boolean[] zArr) {
        this.f4377b = caldroidActivity;
        this.f4376a = zArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = "";
        for (int i2 = 0; i2 < this.f4376a.length; i2++) {
            if (this.f4376a[i2]) {
                str = "".equals(str) ? "" + i2 : str + "," + i2;
            }
        }
        abd.m3811a(this.f4377b.f4357p, this.f4377b.f4356o, "expense_preference", "CALENDAR_SETTINGS", str);
        this.f4377b.m3960a(null);
    }
}
