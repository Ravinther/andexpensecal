package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

class aiv implements OnClickListener {
    final /* synthetic */ boolean[] f4176a;
    final /* synthetic */ String[] f4177b;
    final /* synthetic */ TextView f4178c;
    final /* synthetic */ WidgetConfigureSummary f4179d;

    aiv(WidgetConfigureSummary widgetConfigureSummary, boolean[] zArr, String[] strArr, TextView textView) {
        this.f4179d = widgetConfigureSummary;
        this.f4176a = zArr;
        this.f4177b = strArr;
        this.f4178c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f4176a.length) {
            if (this.f4176a[i2]) {
                charSequence = "".equals(charSequence) ? this.f4177b[i2] : charSequence + "," + this.f4177b[i2];
            }
            i2++;
        }
        this.f4178c.setText(charSequence);
    }
}
