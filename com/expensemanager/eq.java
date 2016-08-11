package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class eq implements OnClickListener {
    final /* synthetic */ DisplaySettings f4603a;

    eq(DisplaySettings displaySettings) {
        this.f4603a = displaySettings;
    }

    public void onClick(View view) {
        this.f4603a.setResult(0, new Intent());
        this.f4603a.finish();
    }
}
