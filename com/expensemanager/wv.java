package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Arrays;

class wv implements OnClickListener {
    final /* synthetic */ String f5423a;
    final /* synthetic */ wu f5424b;

    wv(wu wuVar, String str) {
        this.f5424b = wuVar;
        this.f5423a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList j;
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f5423a.split(",")));
        arrayList.remove(this.f5424b.f5421a);
        String a = aib.m3857a(arrayList, ",");
        String[] split = a.split(",");
        String str = split[0];
        if (this.f5424b.f5421a != null && this.f5424b.f5422b.f3320o < split.length && this.f5424b.f5422b.f3320o >= 0) {
            str = split[this.f5424b.f5422b.f3320o];
        }
        this.f5424b.f5422b.f3320o = aib.m3846a(split, str);
        if (this.f5424b.f5422b.f3320o < 0) {
            this.f5424b.f5422b.f3320o = 0;
        }
        Editor edit = this.f5424b.f5422b.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
        edit.remove(this.f5424b.f5421a + "PAYMENT_METHOD_KEY");
        edit.commit();
        abd.m3811a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "expense_preference", "MY_ACCOUNT_NAMES", a);
        abd.m3811a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "expense_preference", "Default_Account_Index", "" + this.f5424b.f5422b.f3320o);
        if (!this.f5424b.f5422b.f3324s.m4206d()) {
            this.f5424b.f5422b.f3324s.m4193a();
        }
        this.f5424b.f5422b.f3324s.m4197a("expense_preference", "name", this.f5424b.f5421a);
        this.f5424b.f5422b.f3324s.m4197a("expense_preference", "name", this.f5424b.f5421a + "_CURRENCY");
        this.f5424b.f5422b.f3324s.m4197a("expense_preference", "name", this.f5424b.f5421a + "_DESCRIPTION");
        this.f5424b.f5422b.f3324s.m4197a("expense_preference", "name", this.f5424b.f5421a + "_rowId");
        this.f5424b.f5422b.f3324s.m4197a("expense_preference", "name", this.f5424b.f5421a + "_" + "AUTO_ACCOUNT");
        try {
            this.f5424b.f5422b.f3324s.m4197a("expense_report", "account", this.f5424b.f5421a);
            this.f5424b.f5422b.f3324s.m4197a("expense_repeating", "account", this.f5424b.f5421a);
            this.f5424b.f5422b.f3324s.m4197a("expense_repeating", "property", this.f5424b.f5421a);
            this.f5424b.f5422b.f3324s.m4197a("expense_report", "property", this.f5424b.f5421a);
            this.f5424b.f5422b.f3324s.m4197a("expense_budget", "account", this.f5424b.f5421a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f5424b.f5422b.getIntent().getBooleanExtra("isHidden", false)) {
            j = aib.m3878j(abd.m3786a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "HIDDEN_ACCOUNT_NAMES", null));
            j.remove(this.f5424b.f5421a);
            abd.m3811a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "expense_preference", "HIDDEN_ACCOUNT_NAMES", aib.m3857a(j, ","));
        }
        j = aib.m3878j(this.f5424b.f5422b.f3322q);
        if (j.contains(this.f5424b.f5421a)) {
            j.remove(this.f5424b.f5421a);
            str = aib.m3857a(j, ",");
            if (str == null || "".equals(str)) {
                abd.m3810a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "CREDIT_CARD_ACCOUNT");
            } else {
                abd.m3811a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, "expense_preference", "CREDIT_CARD_ACCOUNT", str);
            }
            abd.m3810a(this.f5424b.f5422b.f3307b, this.f5424b.f5422b.f3324s, this.f5424b.f5421a + "_" + "CREDIT_CARD_ACCOUNT");
        }
        if (this.f5424b.f5422b.f3324s.m4206d()) {
            this.f5424b.f5422b.f3324s.m4201b();
        }
        this.f5424b.f5422b.setResult(-1, new Intent());
        this.f5424b.f5422b.finish();
    }
}
