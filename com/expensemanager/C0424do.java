package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.expensemanager.do */
class C0424do implements OnClickListener {
    final /* synthetic */ DateSettings f4487a;

    C0424do(DateSettings dateSettings) {
        this.f4487a = dateSettings;
    }

    public void onClick(View view) {
        this.f4487a.setResult(0, new Intent(this.f4487a.f2651a, Settings.class));
        this.f4487a.finish();
    }
}
