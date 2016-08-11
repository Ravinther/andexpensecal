package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;

final class py implements OnClickListener {
    final /* synthetic */ boolean[] f5157a;
    final /* synthetic */ String[] f5158b;
    final /* synthetic */ TextView f5159c;

    py(boolean[] zArr, String[] strArr, TextView textView) {
        this.f5157a = zArr;
        this.f5158b = strArr;
        this.f5159c = textView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        CharSequence charSequence = "";
        int i2 = 0;
        while (i2 < this.f5157a.length) {
            if (this.f5157a[i2]) {
                charSequence = "".equals(charSequence) ? this.f5158b[i2] : charSequence + "," + this.f5158b[i2];
            }
            i2++;
        }
        this.f5159c.setText(charSequence);
    }
}
