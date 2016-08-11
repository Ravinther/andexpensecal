package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class adq implements OnClickListener {
    final /* synthetic */ PinSetup f3976a;

    adq(PinSetup pinSetup) {
        this.f3976a = pinSetup;
    }

    public void onClick(View view) {
        if (((CheckBox) view).isChecked()) {
            this.f3976a.f3555a.setEnabled(true);
            this.f3976a.f3556b.setEnabled(true);
            this.f3976a.f3557c.setEnabled(true);
            this.f3976a.f3558d.setEnabled(true);
            return;
        }
        this.f3976a.f3555a.setEnabled(false);
        this.f3976a.f3556b.setEnabled(false);
        this.f3976a.f3557c.setEnabled(false);
        this.f3976a.f3558d.setEnabled(false);
    }
}
