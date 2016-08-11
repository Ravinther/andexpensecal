package com.expensemanager;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Date;

class ly implements OnClickListener {
    final /* synthetic */ boolean f4951a;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4952b;

    ly(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, boolean z) {
        this.f4952b = expenseBudgetOnetimeAdd;
        this.f4951a = z;
    }

    public void onClick(View view) {
        try {
            String charSequence = this.f4952b.f2957d.getText().toString();
            String charSequence2 = this.f4952b.f2958e.getText().toString();
            if (this.f4952b.getResources().getText(2131099720).equals(charSequence2)) {
                charSequence2 = "All";
                if (this.f4952b.f2963j.isChecked()) {
                    charSequence2 = "All-1";
                }
            }
            String charSequence3 = this.f4952b.f2959f.getText().toString();
            String trim = this.f4952b.f2962i.getText().toString().trim();
            try {
                Double.valueOf(trim);
                if ("".equals(aib.m3865b(this.f4952b.f2969q.getText().toString())) || "".equals(aib.m3865b(this.f4952b.f2970r.getText().toString()))) {
                    aib.m3849a(this.f4952b.f2956c, null, this.f4952b.getResources().getString(2131099702), 17301543, this.f4952b.getResources().getString(2131099711), this.f4952b.getResources().getString(2131099983), null, null, null).show();
                    return;
                }
                boolean z = true;
                try {
                    if (!this.f4952b.f2968p.m4206d()) {
                        this.f4952b.f2968p.m4193a();
                    }
                    long time = new Date().getTime();
                    String obj = this.f4952b.f2965l.getText().toString();
                    String str = "";
                    String b = aib.m3865b(this.f4952b.f2970r.getText().toString());
                    String b2 = aib.m3865b(this.f4952b.f2969q.getText().toString());
                    if (!("".equals(b) && "".equals(b2))) {
                        str = aib.m3867b(b, ExpenseManager.f3244t, "yyyy-MM-dd") + ";" + aib.m3867b(b2, ExpenseManager.f3244t, "yyyy-MM-dd") + ";NO";
                    }
                    ContentValues a = this.f4952b.f2968p.m4187a(charSequence, charSequence2, charSequence3, "4", trim, obj, this.f4952b.f2964k.getText().toString().trim(), str, this.f4952b.f2960g.getText().toString(), this.f4952b.f2961h.getText().toString(), time);
                    if (this.f4951a) {
                        this.f4952b.f2954a = this.f4952b.f2968p.m4185a("expense_budget", a);
                        if (this.f4952b.f2954a == -1) {
                            z = false;
                        }
                    } else {
                        z = this.f4952b.f2968p.m4196a("expense_budget", this.f4952b.f2954a, a);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                this.f4952b.f2968p.m4201b();
                if (z) {
                    abd.m3805a(this.f4952b.f2956c, z);
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putString("account", this.f4952b.f2967n);
                    bundle.putInt("tabId", 4);
                    intent.putExtras(bundle);
                    this.f4952b.setResult(-1, intent);
                    this.f4952b.finish();
                    return;
                }
                Toast.makeText(this.f4952b.f2956c, this.f4952b.getResources().getString(2131099715), 1).show();
            } catch (Exception e2) {
                aib.m3849a(this.f4952b.f2956c, null, this.f4952b.getResources().getString(2131099702), 17301543, this.f4952b.getResources().getString(2131099718), this.f4952b.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
