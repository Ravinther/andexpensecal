package com.expensemanager.caldroid;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.expensemanager.ExpenseNewTransaction;
import com.expensemanager.aba;
import com.expensemanager.aib;

/* renamed from: com.expensemanager.caldroid.e */
class C0415e implements OnClickListener {
    final /* synthetic */ EditText f4372a;
    final /* synthetic */ String f4373b;
    final /* synthetic */ C0413c f4374c;

    C0415e(C0413c c0413c, EditText editText, String str) {
        this.f4374c = c0413c;
        this.f4372a = editText;
        this.f4373b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((InputMethodManager) this.f4374c.f4370b.f4368e.getSystemService("input_method")).hideSoftInputFromWindow(this.f4372a.getApplicationWindowToken(), 0);
        double i2 = aib.m3877i(this.f4372a.getText().toString()) - aib.m3877i(this.f4373b);
        String replaceAll = aba.m3746a(Math.abs(i2)).replaceAll(",", "");
        Intent intent = new Intent(this.f4374c.f4370b.f4368e.f4357p, ExpenseNewTransaction.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4374c.f4370b.f4368e.f4358q);
        if (i2 > 0.0d) {
            bundle.putString("category", "Income");
        }
        bundle.putString("date", this.f4374c.f4370b.f4364a.format(this.f4374c.f4369a));
        bundle.putString("amount", replaceAll);
        bundle.putString("fromWhere", "DailyViewNew");
        bundle.putString("description", this.f4374c.f4370b.f4368e.f4357p.getResources().getString(2131099700));
        intent.putExtras(bundle);
        this.f4374c.f4370b.f4368e.startActivityForResult(intent, 0);
    }
}
