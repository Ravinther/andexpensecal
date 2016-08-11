package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class fn implements OnClickListener {
    final /* synthetic */ String f4650a;
    final /* synthetic */ Button f4651b;
    final /* synthetic */ fm f4652c;

    fn(fm fmVar, String str, Button button) {
        this.f4652c = fmVar;
        this.f4650a = str;
        this.f4651b = button;
    }

    public void onClick(View view) {
        if (this.f4652c.f4648d.f2717m.contains(this.f4650a)) {
            this.f4652c.f4648d.f2717m.remove(this.f4650a);
            this.f4651b.setTextColor(this.f4652c.f4647c);
        } else {
            this.f4652c.f4648d.f2717m.add(this.f4650a);
            this.f4651b.setTextColor(co.f4428b);
        }
        if (this.f4652c.f4648d.f2717m.size() > 0) {
            this.f4652c.f4648d.setTitle("" + this.f4652c.f4648d.f2717m.size());
            this.f4652c.f4648d.f2708c.setVisible(true);
            return;
        }
        this.f4652c.f4648d.setTitle(this.f4652c.f4648d.f2707b);
        this.f4652c.f4648d.f2708c.setVisible(false);
    }
}
