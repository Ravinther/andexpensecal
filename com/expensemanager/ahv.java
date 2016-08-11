package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ahv implements OnClickListener {
    final /* synthetic */ TipCalculator f4139a;

    ahv(TipCalculator tipCalculator) {
        this.f4139a = tipCalculator;
    }

    public void onClick(View view) {
        this.f4139a.setResult(0, new Intent());
        this.f4139a.finish();
    }
}
