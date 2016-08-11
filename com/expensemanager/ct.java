package com.expensemanager;

import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ct extends C0032l {
    int f4443a;
    View f4444b;
    int f4445c;
    List<Map<String, Object>> f4446d;
    private String f4447e;

    public ct() {
        this.f4447e = "";
        this.f4445c = 1;
    }

    static ct m4032a(int i) {
        ct ctVar = new ct();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        ctVar.m311g(bundle);
        return ctVar;
    }

    private void m4034a() {
        String a = abd.m3786a(m315i(), CreditCardList.f2617s, this.f4447e + "_" + "CREDIT_CARD_ACCOUNT", null);
        if (!(a == null || "".equals(a))) {
            String[] split = a.split(",");
            if (split.length > 0) {
                this.f4445c = Integer.valueOf(split[0]).intValue();
            }
        }
        this.f4446d = new ArrayList();
        CreditCardList.m2532a(CreditCardList.f2617s, "account='" + this.f4447e + "'", this.f4446d, "expensed DESC", a);
        ListAdapter cxVar = new cx(m315i(), 2130903046, this.f4446d);
        ListView listView = (ListView) this.f4444b.findViewById(2131558561);
        m286a((View) listView);
        listView.setAdapter(cxVar);
        listView.setOnItemClickListener(new cu(this));
        CreditCardList.f2617s.m4201b();
    }

    public View m4035a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4444b = layoutInflater.inflate(2130903131, viewGroup, false);
        return this.f4444b;
    }

    public void m4036a(Bundle bundle) {
        super.m283a(bundle);
        this.f4443a = m313h() != null ? m313h().getInt("num") : 1;
    }

    public void m4037d(Bundle bundle) {
        super.m301d(bundle);
        try {
            this.f4447e = (String) CreditCardList.f2621w.get(this.f4443a);
            m4034a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m4038e(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.m306e(bundle);
    }
}
