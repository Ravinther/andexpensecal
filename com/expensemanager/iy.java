package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class iy implements OnClickListener {
    final /* synthetic */ ix f4823a;

    iy(ix ixVar) {
        this.f4823a = ixVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            Double valueOf = Double.valueOf(this.f4823a.f4822b.f2824j.getText().toString());
            String obj = this.f4823a.f4822b.f2828n.getText().toString();
            if ("".equals(obj)) {
                obj = "1";
            }
            Double valueOf2 = Double.valueOf(obj);
            obj = CurrencyConverter.m2541a(valueOf2.doubleValue() * valueOf.doubleValue());
            if (obj.indexOf(",") != -1) {
                obj = obj.replaceAll(",", "");
            }
            this.f4823a.f4822b.m2717a(obj, this.f4823a.f4821a);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this.f4823a.f4822b.f2819e, "You entered an invalid exchange rate.", 1).show();
        }
    }
}
