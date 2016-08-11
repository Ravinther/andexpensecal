package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ew implements OnClickListener {
    final /* synthetic */ DisplaySettings f4612a;

    ew(DisplaySettings displaySettings) {
        this.f4612a = displaySettings;
    }

    public void onClick(View view) {
        this.f4612a.setResult(0, new Intent());
        this.f4612a.finish();
    }
}
