package com.expensemanager.dropbox;

import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import com.dropbox.client2.android.C0359a;

/* renamed from: com.expensemanager.dropbox.a */
class C0425a implements OnClickListener {
    final /* synthetic */ Editor f4508a;
    final /* synthetic */ DBRoulette f4509b;

    C0425a(DBRoulette dBRoulette, Editor editor) {
        this.f4509b = dBRoulette;
        this.f4508a = editor;
    }

    public void onClick(View view) {
        if (this.f4509b.f4494c) {
            this.f4509b.m4052a();
            this.f4508a.putBoolean("AUTO_SYNC", false);
            this.f4508a.commit();
            return;
        }
        ((C0359a) this.f4509b.f4493a.m2283a()).m2326a(this.f4509b);
    }
}
