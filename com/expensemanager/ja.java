package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Locale;

class ja implements OnClickListener {
    final /* synthetic */ ExpenseAccountTransfer f4827a;

    ja(ExpenseAccountTransfer expenseAccountTransfer) {
        this.f4827a = expenseAccountTransfer;
    }

    public void onClick(View view) {
        this.f4827a.f2818d = true;
        String obj = this.f4827a.f2825k.getText().toString();
        long a = aba.m3744a(obj, ExpenseManager.f3244t + " " + "HH:mm:ss", Locale.US);
        if (a == 0) {
            String[] split = obj.split(" ");
            if (split.length > 1) {
                a = aba.m3744a(split[1], "HH:mm:ss", Locale.US);
            }
        }
        String f = aib.m3874f(ExpenseManager.f3244t + " " + "HH:mm:ss");
        if (a > 0) {
            this.f4827a.f2825k.setText(f);
        } else if (obj.equals(this.f4827a.f2817c)) {
            if (obj.indexOf(" - ") == -1) {
                this.f4827a.f2825k.setText(obj + " - " + f);
            } else {
                String[] split2 = obj.split(" - ");
                if (aba.m3744a(split2[1], ExpenseManager.f3244t + " " + "HH:mm:ss", Locale.US) > 0) {
                    this.f4827a.f2825k.setText(split2[0] + " - " + f);
                } else {
                    this.f4827a.f2825k.setText(obj + " - " + f);
                }
            }
        }
        this.f4827a.f2831q.performClick();
    }
}
