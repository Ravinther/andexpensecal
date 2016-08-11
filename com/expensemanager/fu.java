package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fu extends C0032l {
    int f4661a;
    View f4662b;
    ListView f4663c;
    EditText f4664d;
    private String f4665e;
    private HashMap<String, String> f4666f;

    public fu() {
        this.f4665e = "";
        this.f4666f = null;
    }

    private LinearLayout m4113a(int i, ArrayList<String> arrayList) {
        String[] split = abd.m3786a(m315i(), ExpenseAccountGroup.f2736u, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        LinearLayout linearLayout = new LinearLayout(m315i());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(15, 25, 15, 15);
        this.f4664d = new EditText(m315i());
        this.f4664d.setHint(2131099682);
        this.f4663c = new ListView(m315i());
        this.f4663c.setAdapter(new ArrayAdapter(m315i(), 17367056, split));
        this.f4663c.setItemsCanFocus(false);
        this.f4663c.setChoiceMode(2);
        if (i > -1) {
            this.f4664d.setText((CharSequence) arrayList.get(i));
            String str = (String) arrayList.get(i);
            if (!(str == null || "".equals(str))) {
                str = abd.m3786a(m315i(), ExpenseAccountGroup.f2736u, "ACCOUNT_GROUP_NAME_" + str, "");
                List arrayList2 = new ArrayList(Arrays.asList(split));
                String[] split2 = str.split(",");
                for (Object indexOf : split2) {
                    int indexOf2 = arrayList2.indexOf(indexOf);
                    if (indexOf2 < split.length && indexOf2 != -1) {
                        this.f4663c.setItemChecked(indexOf2, true);
                    }
                }
            }
        }
        linearLayout.addView(this.f4664d, new LayoutParams(-1, -2));
        linearLayout.addView(this.f4663c, new LayoutParams(-1, -1));
        return linearLayout;
    }

    static fu m4114a(int i) {
        fu fuVar = new fu();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        fuVar.m311g(bundle);
        return fuVar;
    }

    private void m4116a() {
        List arrayList = new ArrayList();
        Map hashMap = new HashMap();
        this.f4666f = ExpenseAccountGroup.f2732o;
        abd.m3807a(ExpenseAccountGroup.f2736u, this.f4665e, ExpenseAccountGroup.f2735r, this.f4666f, 0, hashMap);
        abd.m3807a(ExpenseAccountGroup.f2736u, this.f4665e, ExpenseAccountGroup.f2735r, this.f4666f, 1, hashMap);
        abd.m3807a(ExpenseAccountGroup.f2736u, this.f4665e, ExpenseAccountGroup.f2735r, this.f4666f, 2, hashMap);
        abd.m3807a(ExpenseAccountGroup.f2736u, this.f4665e, ExpenseAccountGroup.f2735r, this.f4666f, 3, hashMap);
        arrayList.add(hashMap.get("daily_expense"));
        arrayList.add(hashMap.get("weekly_expense"));
        arrayList.add(hashMap.get("monthly_expense"));
        arrayList.add(hashMap.get("yearly_expense"));
        String[] split = m317j().getString(2131099888).split(",");
        List arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Map hashMap2 = new HashMap();
            hashMap2.put("text", split[i]);
            hashMap2.put("value", arrayList.get(i));
            hashMap2.put("arrow", ">");
            arrayList2.add(hashMap2);
        }
        ListView listView = (ListView) this.f4662b.findViewById(2131558637);
        listView.setAdapter(new SimpleAdapter(m315i(), arrayList2, 2130903121, new String[]{"text", "value", "arrow"}, new int[]{2131558423, 2131558421, 2131558424}));
        listView.setOnItemClickListener(new gb(this));
        TextView textView = (TextView) this.f4662b.findViewById(2131558484);
        Object b = abd.m3813b(ExpenseAccountGroup.f2736u, abd.m3794a("expensed<=" + aib.m3847a(), "All", this.f4665e, "NO"), this.f4666f);
        textView.setText(b);
        if (b.startsWith("(")) {
            textView.setTextColor(co.f4428b);
        } else {
            textView.setTextColor(co.f4429c);
        }
        String str = (String) hashMap.get("monthly_balance");
        TextView textView2 = (TextView) this.f4662b.findViewById(2131558625);
        textView2.setText(str);
        if (str.startsWith("(")) {
            textView2.setTextColor(co.f4428b);
        } else {
            textView2.setTextColor(co.f4429c);
        }
        Calendar instance = Calendar.getInstance();
        int a = abd.m3783a(m315i(), ExpenseAccountGroup.f2736u, "firstDayOfMonth", 1);
        int i2 = a - 1;
        if (i2 < 1) {
            i2 = instance.getActualMaximum(5);
        }
        if (instance.get(5) >= a && a != 1) {
            instance.add(2, 1);
        }
        instance.set(5, i2);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        b = abd.m3813b(ExpenseAccountGroup.f2736u, abd.m3794a("expensed<=" + instance.getTimeInMillis(), "All", this.f4665e, "NO"), this.f4666f);
        textView = (TextView) this.f4662b.findViewById(2131558619);
        textView.setText(b);
        if (b.startsWith("(")) {
            textView.setTextColor(co.f4428b);
        } else {
            textView.setTextColor(co.f4429c);
        }
        str = (String) hashMap.get("weekly_balance");
        textView2 = (TextView) this.f4662b.findViewById(2131558623);
        textView2.setText(str);
        if (str.startsWith("(")) {
            textView2.setTextColor(co.f4428b);
        } else {
            textView2.setTextColor(co.f4429c);
        }
        str = (String) hashMap.get("daily_balance");
        textView2 = (TextView) this.f4662b.findViewById(2131558621);
        textView2.setText(str);
        if (str.startsWith("(")) {
            textView2.setTextColor(co.f4428b);
        } else {
            textView2.setTextColor(co.f4429c);
        }
        str = (String) hashMap.get("yearly_balance");
        textView2 = (TextView) this.f4662b.findViewById(2131558627);
        textView2.setText(str);
        if (str.startsWith("(")) {
            textView2.setTextColor(co.f4428b);
        } else {
            textView2.setTextColor(co.f4429c);
        }
        ((TextView) this.f4662b.findViewById(2131558636)).setText((CharSequence) hashMap.get("yearly_income"));
        ((TextView) this.f4662b.findViewById(2131558634)).setText((CharSequence) hashMap.get("monthly_income"));
        ((TextView) this.f4662b.findViewById(2131558630)).setText((CharSequence) hashMap.get("daily_income"));
        ((TextView) this.f4662b.findViewById(2131558632)).setText((CharSequence) hashMap.get("weekly_income"));
        LinearLayout linearLayout = (LinearLayout) this.f4662b.findViewById(2131558618);
        LinearLayout linearLayout2 = (LinearLayout) this.f4662b.findViewById(2131558624);
        LinearLayout linearLayout3 = (LinearLayout) this.f4662b.findViewById(2131558622);
        LinearLayout linearLayout4 = (LinearLayout) this.f4662b.findViewById(2131558620);
        LinearLayout linearLayout5 = (LinearLayout) this.f4662b.findViewById(2131558626);
        LinearLayout linearLayout6 = (LinearLayout) this.f4662b.findViewById(2131558629);
        LinearLayout linearLayout7 = (LinearLayout) this.f4662b.findViewById(2131558631);
        LinearLayout linearLayout8 = (LinearLayout) this.f4662b.findViewById(2131558633);
        LinearLayout linearLayout9 = (LinearLayout) this.f4662b.findViewById(2131558635);
        ((LinearLayout) this.f4662b.findViewById(2131558617)).setOnClickListener(new gc(this));
        linearLayout.setOnClickListener(new gd(this));
        linearLayout2.setOnClickListener(new ge(this));
        linearLayout3.setOnClickListener(new gf(this));
        linearLayout4.setOnClickListener(new gg(this));
        linearLayout5.setOnClickListener(new gh(this));
        linearLayout9.setOnClickListener(new gi(this));
        linearLayout8.setOnClickListener(new fw(this));
        linearLayout6.setOnClickListener(new fx(this));
        linearLayout7.setOnClickListener(new fy(this));
        linearLayout = (LinearLayout) this.f4662b.findViewById(2131558616);
        linearLayout2 = (LinearLayout) this.f4662b.findViewById(2131558628);
        a = m315i().getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (a == 1 || a > 3) {
            linearLayout.setBackgroundResource(2130837520);
            linearLayout2.setBackgroundResource(2130837520);
            listView.setBackgroundResource(2130837520);
        }
    }

    private void m4118b(int i) {
        String a = abd.m3786a(m315i(), ExpenseAccountGroup.f2736u, "ACCOUNT_GROUP_NAME", "");
        if (!"".equals(a)) {
            ArrayList arrayList = new ArrayList(Arrays.asList(a.split(",")));
            Builder builder = new Builder(m315i());
            builder.setTitle(null);
            builder.setView(m4113a(i, arrayList));
            builder.setPositiveButton(2131099983, new fz(this, i, arrayList));
            builder.setNegativeButton(2131099754, new ga(this));
            builder.show();
        }
    }

    public View m4119a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4662b = layoutInflater.inflate(2130903072, viewGroup, false);
        return this.f4662b;
    }

    public void m4120a(Bundle bundle) {
        super.m283a(bundle);
        this.f4661a = m313h() != null ? m313h().getInt("num") : 1;
    }

    public void m4121d(Bundle bundle) {
        super.m301d(bundle);
        try {
            String str = (String) ExpenseAccountGroup.f2740y.get(this.f4661a);
            this.f4665e = abd.m3786a(m315i(), ExpenseAccountGroup.f2736u, "ACCOUNT_GROUP_NAME_" + str, ExpenseAccountGroup.f2731n);
            TextView textView = (TextView) this.f4662b.findViewById(2131558476);
            if (str.equals("All")) {
                textView.setText(ExpenseAccountGroup.f2731n);
            } else {
                textView.setText(this.f4665e);
            }
            textView.setOnClickListener(new fv(this, str));
            m4116a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void m4122e(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.m306e(bundle);
    }
}
