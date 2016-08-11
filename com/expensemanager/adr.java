package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class adr implements OnClickListener {
    final /* synthetic */ PinSetup f3977a;

    adr(PinSetup pinSetup) {
        this.f3977a = pinSetup;
    }

    public void onClick(View view) {
        this.f3977a.setResult(0, new Intent());
        this.f3977a.finish();
    }
}
