package com.expensemanager.dropbox;

import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.aib;

/* renamed from: com.expensemanager.dropbox.b */
class C0426b implements OnClickListener {
    final /* synthetic */ Editor f4510a;
    final /* synthetic */ DBRoulette f4511b;

    C0426b(DBRoulette dBRoulette, Editor editor) {
        this.f4511b = dBRoulette;
        this.f4510a = editor;
    }

    public void onClick(View view) {
        boolean z = false;
        if (this.f4511b.f4504m.isChecked()) {
            aib.m3849a(this.f4511b.f4505n, null, this.f4511b.getResources().getString(2131099702), 17301543, this.f4511b.getResources().getString(2131099847), this.f4511b.getResources().getString(2131099983), null, null, null).show();
            z = true;
        }
        this.f4510a.putBoolean("AUTO_SYNC", z);
        this.f4510a.commit();
    }
}
