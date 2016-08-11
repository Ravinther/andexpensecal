package com.expensemanager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uc extends C0032l {
    int f5321a;
    View f5322b;
    private String f5323c;
    private HashMap<String, String> f5324d;

    public uc() {
        this.f5323c = "";
        this.f5324d = null;
    }

    static uc m4218a(int i) {
        uc ucVar = new uc();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        ucVar.m311g(bundle);
        return ucVar;
    }

    private void m4220a() {
        TextView textView;
        int i;
        List arrayList = new ArrayList();
        Map hashMap = new HashMap();
        if ("All".equalsIgnoreCase(this.f5323c)) {
            this.f5324d = ExpenseManager.f3246v;
        } else {
            this.f5324d = null;
        }
        abd.m3807a(ExpenseManager.f3236D, this.f5323c, ExpenseManager.f3247x, this.f5324d, 0, hashMap);
        abd.m3807a(ExpenseManager.f3236D, this.f5323c, ExpenseManager.f3247x, this.f5324d, 1, hashMap);
        abd.m3807a(ExpenseManager.f3236D, this.f5323c, ExpenseManager.f3247x, this.f5324d, 2, hashMap);
        abd.m3807a(ExpenseManager.f3236D, this.f5323c, ExpenseManager.f3247x, this.f5324d, 3, hashMap);
        arrayList.add(hashMap.get("daily_expense"));
        arrayList.add(hashMap.get("weekly_expense"));
        arrayList.add(hashMap.get("monthly_expense"));
        arrayList.add(hashMap.get("yearly_expense"));
        String[] split = m317j().getString(2131099888).split(",");
        List arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Map hashMap2 = new HashMap();
            hashMap2.put("text", split[i2]);
            hashMap2.put("value", arrayList.get(i2));
            hashMap2.put("arrow", ">");
            arrayList2.add(hashMap2);
        }
        ListView listView = (ListView) this.f5322b.findViewById(2131558637);
        listView.setAdapter(new SimpleAdapter(m315i(), arrayList2, 2130903121, new String[]{"text", "value", "arrow"}, new int[]{2131558423, 2131558421, 2131558424}));
        listView.setOnItemClickListener(new ud(this));
        String a = abd.m3786a(m315i(), ExpenseManager.f3236D, this.f5323c + "_" + "AUTO_ACCOUNT", null);
        Button button = (Button) this.f5322b.findViewById(2131558818);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new uo(this));
        TextView textView2 = (TextView) this.f5322b.findViewById(2131558484);
        Object b = abd.m3813b(ExpenseManager.f3236D, abd.m3794a("expensed<=" + aib.m3847a(), this.f5323c, ExpenseManager.f3245u, "NO"), this.f5324d);
        textView2.setText(b);
        if (b.startsWith("(")) {
            textView2.setTextColor(co.f4428b);
        } else {
            textView2.setTextColor(co.f4429c);
        }
        SharedPreferences sharedPreferences = m315i().getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        LinearLayout linearLayout = (LinearLayout) this.f5322b.findViewById(2131558624);
        if (sharedPreferences.getBoolean("DISPLAY_THIS_MONTH_BALANCE", true)) {
            String str = (String) hashMap.get("monthly_balance");
            textView = (TextView) this.f5322b.findViewById(2131558625);
            textView.setText(str);
            if (str.startsWith("(")) {
                textView.setTextColor(co.f4428b);
            } else {
                textView.setTextColor(co.f4429c);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f5322b.findViewById(2131558618);
        if (sharedPreferences.getBoolean("DISPLAY_MONTH_END_BALANCE", false)) {
            Calendar instance = Calendar.getInstance();
            int a2 = abd.m3783a(m315i(), ExpenseManager.f3236D, "firstDayOfMonth", 1);
            i = a2 - 1;
            if (i < 1) {
                i = instance.getActualMaximum(5);
            }
            if (instance.get(5) >= a2 && a2 != 1) {
                instance.add(2, 1);
            }
            instance.set(5, i);
            instance.set(11, 23);
            instance.set(12, 59);
            instance.set(12, 59);
            instance.set(13, 59);
            instance.set(14, 999);
            Object b2 = abd.m3813b(ExpenseManager.f3236D, abd.m3794a("expensed<=" + instance.getTimeInMillis(), this.f5323c, ExpenseManager.f3245u, "NO"), this.f5324d);
            textView = (TextView) this.f5322b.findViewById(2131558619);
            textView.setText(b2);
            if (b2.startsWith("(")) {
                textView.setTextColor(co.f4428b);
            } else {
                textView.setTextColor(co.f4429c);
            }
        } else {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = (LinearLayout) this.f5322b.findViewById(2131558622);
        if (sharedPreferences.getBoolean("DISPLAY_THIS_WEEK_BALANCE", false)) {
            String str2 = (String) hashMap.get("weekly_balance");
            TextView textView3 = (TextView) this.f5322b.findViewById(2131558623);
            textView3.setText(str2);
            if (str2.startsWith("(")) {
                textView3.setTextColor(co.f4428b);
            } else {
                textView3.setTextColor(co.f4429c);
            }
        } else {
            linearLayout3.setVisibility(8);
        }
        LinearLayout linearLayout4 = (LinearLayout) this.f5322b.findViewById(2131558620);
        if (sharedPreferences.getBoolean("DISPLAY_TODAY_BALANCE", false)) {
            String str3 = (String) hashMap.get("daily_balance");
            TextView textView4 = (TextView) this.f5322b.findViewById(2131558621);
            textView4.setText(str3);
            if (str3.startsWith("(")) {
                textView4.setTextColor(co.f4428b);
            } else {
                textView4.setTextColor(co.f4429c);
            }
        } else {
            linearLayout4.setVisibility(8);
        }
        LinearLayout linearLayout5 = (LinearLayout) this.f5322b.findViewById(2131558626);
        if (sharedPreferences.getBoolean("DISPLAY_YEAR_TO_DATE_BALANCE", false)) {
            String str4 = (String) hashMap.get("yearly_balance");
            TextView textView5 = (TextView) this.f5322b.findViewById(2131558627);
            textView5.setText(str4);
            if (str4.startsWith("(")) {
                textView5.setTextColor(co.f4428b);
            } else {
                textView5.setTextColor(co.f4429c);
            }
        } else {
            linearLayout5.setVisibility(8);
        }
        ((TextView) this.f5322b.findViewById(2131558636)).setText((CharSequence) hashMap.get("yearly_income"));
        Button button2 = (Button) this.f5322b.findViewById(2131558817);
        aib.m3869b(m315i(), button2, -1);
        button2.setOnClickListener(new uq(this, a));
        ((TextView) this.f5322b.findViewById(2131558634)).setText((CharSequence) hashMap.get("monthly_income"));
        LinearLayout linearLayout6 = (LinearLayout) this.f5322b.findViewById(2131558629);
        LinearLayout linearLayout7 = (LinearLayout) this.f5322b.findViewById(2131558631);
        boolean z = sharedPreferences.getBoolean("DISPLAY_TODAY_INCOME", false);
        boolean z2 = sharedPreferences.getBoolean("DISPLAY_WEEK_INCOME", true);
        if (z) {
            ((TextView) this.f5322b.findViewById(2131558630)).setText((CharSequence) hashMap.get("daily_income"));
        } else {
            linearLayout6.setVisibility(8);
        }
        if (z2) {
            ((TextView) this.f5322b.findViewById(2131558632)).setText((CharSequence) hashMap.get("weekly_income"));
        } else {
            linearLayout7.setVisibility(8);
        }
        LinearLayout linearLayout8 = (LinearLayout) this.f5322b.findViewById(2131558633);
        LinearLayout linearLayout9 = (LinearLayout) this.f5322b.findViewById(2131558635);
        ((LinearLayout) this.f5322b.findViewById(2131558617)).setOnClickListener(new ur(this));
        linearLayout2.setOnClickListener(new us(this));
        linearLayout.setOnClickListener(new ut(this));
        linearLayout3.setOnClickListener(new uu(this));
        linearLayout4.setOnClickListener(new uv(this));
        linearLayout5.setOnClickListener(new uw(this));
        linearLayout9.setOnClickListener(new ue(this));
        linearLayout8.setOnClickListener(new uf(this));
        linearLayout6.setOnClickListener(new ug(this));
        linearLayout7.setOnClickListener(new uh(this));
        button = (Button) this.f5322b.findViewById(2131558815);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new ui(this));
        button = (Button) this.f5322b.findViewById(2131558813);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new uj(this));
        button = (Button) this.f5322b.findViewById(2131558816);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new uk(this, a));
        if ("mi".equals(a) || "km".equals(a)) {
            button.setText(2131099950);
            button2.setText(2131099694);
        }
        button = (Button) this.f5322b.findViewById(2131558814);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new ul(this));
        button = (Button) this.f5322b.findViewById(2131558821);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new um(this));
        button = (Button) this.f5322b.findViewById(2131558820);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new un(this));
        button = (Button) this.f5322b.findViewById(2131558819);
        aib.m3869b(m315i(), button, -1);
        button.setOnClickListener(new up(this));
        linearLayout = (LinearLayout) this.f5322b.findViewById(2131558616);
        linearLayout2 = (LinearLayout) this.f5322b.findViewById(2131558628);
        i = sharedPreferences.getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            linearLayout.setBackgroundResource(2130837520);
            linearLayout2.setBackgroundResource(2130837520);
            listView.setBackgroundResource(2130837520);
        }
    }

    public View m4221a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5322b = layoutInflater.inflate(2130903103, viewGroup, false);
        return this.f5322b;
    }

    public void m4222a(Bundle bundle) {
        super.m283a(bundle);
        this.f5321a = m313h() != null ? m313h().getInt("num") : 1;
    }

    public void m4223d(Bundle bundle) {
        super.m301d(bundle);
        try {
            this.f5323c = (String) ExpenseManager.f3240H.get(this.f5321a);
            m4220a();
            abf.m3821a(m315i());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m4224e(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.m306e(bundle);
    }
}
