package com.expensemanager.caldroid;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.expensemanager.ExpenseAccountExpandableList;
import com.expensemanager.ExpenseAccountTransfer;
import com.expensemanager.ExpenseNewTransaction;
import com.expensemanager.aba;
import com.expensemanager.abd;
import com.expensemanager.aib;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.expensemanager.caldroid.c */
class C0413c implements OnClickListener {
    final /* synthetic */ Date f4369a;
    final /* synthetic */ C0412b f4370b;

    C0413c(C0412b c0412b, Date date) {
        this.f4370b = c0412b;
        this.f4369a = date;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String b;
        if (i == 0) {
            Intent intent = new Intent(this.f4370b.f4368e.f4357p, ExpenseNewTransaction.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f4370b.f4368e.f4358q);
            bundle.putString("date", this.f4370b.f4364a.format(this.f4369a));
            bundle.putString("fromWhere", "DailyViewNew");
            intent.putExtras(bundle);
            this.f4370b.f4368e.startActivityForResult(intent, 0);
        }
        if (i == 1) {
            intent = new Intent(this.f4370b.f4368e.f4357p, ExpenseNewTransaction.class);
            bundle = new Bundle();
            bundle.putString("account", this.f4370b.f4368e.f4358q);
            bundle.putString("category", "Income");
            bundle.putString("date", this.f4370b.f4364a.format(this.f4369a));
            bundle.putString("fromWhere", "DailyViewNew");
            intent.putExtras(bundle);
            this.f4370b.f4368e.startActivityForResult(intent, 0);
        }
        if (i == 2) {
            b = this.f4370b.f4368e.f4358q;
            if ("All".equalsIgnoreCase(this.f4370b.f4368e.f4358q)) {
                b = this.f4370b.f4368e.f4359r;
            }
            if (b != null && !"".equals(b)) {
                try {
                    String str = "account in (" + abd.m3792a(b) + ")";
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(this.f4369a.getTime());
                    instance.set(11, 0);
                    instance.set(12, 0);
                    instance.set(13, 0);
                    instance.set(14, 0);
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTimeInMillis(this.f4369a.getTime());
                    instance2.set(11, 23);
                    instance2.set(12, 59);
                    instance2.set(13, 59);
                    instance2.set(14, 999);
                    str = (str + " AND " + "expensed" + ">=" + instance.getTimeInMillis()) + " AND " + "expensed" + "<=" + instance2.getTimeInMillis();
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = new Intent(this.f4370b.f4368e.f4357p, ExpenseAccountExpandableList.class);
                    bundle2.putString("title", this.f4370b.f4364a.format(this.f4369a));
                    bundle2.putString("account", b);
                    bundle2.putString("whereClause", str);
                    bundle2.putInt("highlightId", 1);
                    intent2.putExtras(bundle2);
                    this.f4370b.f4368e.startActivityForResult(intent2, 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
        if (i == 3) {
            b = this.f4370b.f4368e.f4358q;
            if ("All".equalsIgnoreCase(this.f4370b.f4368e.f4358q)) {
                b = this.f4370b.f4368e.f4359r;
            }
            if (b != null && !"".equals(b)) {
                View editText = new EditText(this.f4370b.f4368e.f4357p);
                b = ("account in (" + abd.m3792a(b) + ")") + " AND " + "expensed" + "<=" + abd.m3820d(this.f4370b.f4364a.format(this.f4369a));
                editText.setInputType(12290);
                String b2 = aba.m3765b(this.f4370b.f4368e.f4356o, b);
                double i2 = aib.m3877i(b2);
                if (b2.startsWith("(")) {
                    i2 = -i2;
                }
                Object obj = "" + i2;
                editText.setHint(obj);
                new Builder(this.f4370b.f4368e.f4357p).setTitle(this.f4370b.f4364a.format(this.f4369a)).setMessage(2131099701).setView(editText).setPositiveButton(2131099983, new C0415e(this, editText, obj)).setNegativeButton(2131099754, new C0414d(this)).show();
            } else {
                return;
            }
        }
        if (i == 4) {
            intent = new Intent(this.f4370b.f4368e.f4357p, ExpenseAccountTransfer.class);
            bundle = new Bundle();
            bundle.putString("account", this.f4370b.f4368e.f4358q);
            bundle.putString("date", this.f4370b.f4364a.format(this.f4369a));
            bundle.putString("fromWhere", "calendar");
            intent.putExtras(bundle);
            this.f4370b.f4368e.startActivityForResult(intent, 0);
        }
    }
}
