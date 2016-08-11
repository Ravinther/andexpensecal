package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class bj implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4251a;

    bj(ChartNewPeriod chartNewPeriod) {
        this.f4251a = chartNewPeriod;
    }

    public void onClick(View view) {
        if (this.f4251a.f2546m.getSelectedItemPosition() == 0 || this.f4251a.f2546m.getSelectedItemPosition() == 1) {
            String str = "";
            List a = abd.m3798a(this.f4251a.f2536c, "account in (" + abd.m3792a(this.f4251a.f2542i.getText().toString()) + ")", "category");
            this.f4251a.m2469a((String[]) a.toArray(new String[a.size()]), this.f4251a.f2549p);
        }
        if (this.f4251a.f2546m.getSelectedItemPosition() == 2) {
            str = "";
            a = abd.m3798a(this.f4251a.f2536c, "account in (" + abd.m3792a(this.f4251a.f2542i.getText().toString()) + ")" + " and " + "property" + "!=''" + " and " + "category" + "!='Income'", "property");
            this.f4251a.m2469a((String[]) a.toArray(new String[a.size()]), this.f4251a.f2549p);
        }
        if (this.f4251a.f2546m.getSelectedItemPosition() == 3) {
            str = "";
            a = abd.m3798a(this.f4251a.f2536c, "account in (" + abd.m3792a(this.f4251a.f2542i.getText().toString()) + ")" + " and " + "payment_method" + "!=''" + " and " + "category" + "!='Income'", "payment_method");
            this.f4251a.m2469a((String[]) a.toArray(new String[a.size()]), this.f4251a.f2549p);
        }
    }
}
