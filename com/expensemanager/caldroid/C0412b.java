package com.expensemanager.caldroid;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.TextView;
import com.roomorama.caldroid.C0411h;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.expensemanager.caldroid.b */
class C0412b extends C0411h {
    final /* synthetic */ SimpleDateFormat f4364a;
    final /* synthetic */ TextView f4365b;
    final /* synthetic */ TextView f4366c;
    final /* synthetic */ TextView f4367d;
    final /* synthetic */ CaldroidActivity f4368e;

    C0412b(CaldroidActivity caldroidActivity, SimpleDateFormat simpleDateFormat, TextView textView, TextView textView2, TextView textView3) {
        this.f4368e = caldroidActivity;
        this.f4364a = simpleDateFormat;
        this.f4365b = textView;
        this.f4366c = textView2;
        this.f4367d = textView3;
    }

    public void m3972a() {
        if (this.f4368e.f4355n.m3990N() == null) {
        }
    }

    public void m3973a(int i, int i2) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        Map hashMap4 = new HashMap();
        hashMap3.put(i2 + "-" + i, this.f4368e.m3959a(this.f4368e.f4358q, i2, i));
        this.f4368e.m3958a(this.f4368e.f4356o, this.f4368e.m3953a(i, i2, this.f4368e.getIntent().getStringExtra("account")), hashMap, hashMap2, hashMap4);
        HashMap P = this.f4368e.f4355n.m3992P();
        P.put("income", hashMap);
        P.put("expense", hashMap2);
        P.put("balance", hashMap3);
        this.f4365b.setText((CharSequence) hashMap4.get("incomeTotal"));
        this.f4366c.setText((CharSequence) hashMap4.get("expenseTotal"));
        this.f4367d.setText((CharSequence) hashMap4.get("total"));
        if (((String) hashMap4.get("total")).startsWith("-")) {
            this.f4367d.setTextColor(-65536);
        } else {
            this.f4367d.setTextColor(-16217592);
        }
        this.f4368e.f4360s = i2;
        this.f4368e.f4361t = i;
    }

    public void m3974a(Date date, View view) {
        String string = this.f4368e.f4357p.getResources().getString(2131099695);
        String string2 = this.f4368e.f4357p.getResources().getString(2131099696);
        String string3 = this.f4368e.f4357p.getResources().getString(2131100163);
        String string4 = this.f4368e.f4357p.getResources().getString(2131099700);
        String string5 = this.f4368e.f4357p.getResources().getString(2131099687);
        Builder builder = new Builder(this.f4368e.f4357p);
        builder.setTitle(this.f4364a.format(date));
        builder.setItems(new String[]{string, string2, string3, string4, string5}, new C0413c(this, date));
        builder.show();
    }

    public void m3975b(Date date, View view) {
    }
}
