package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;

class hd extends BaseAdapter {
    Context f4725a;
    final /* synthetic */ ExpenseAccountList f4726b;
    private LayoutInflater f4727c;

    public hd(ExpenseAccountList expenseAccountList, Context context) {
        this.f4726b = expenseAccountList;
        this.f4727c = LayoutInflater.from(context);
        this.f4725a = context;
    }

    public int getCount() {
        return this.f4726b.f2761g.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        hh hhVar;
        hh hhVar2 = new hh(this);
        if (view == null) {
            view = this.f4727c.inflate(2130903157, null);
            hh hhVar3 = new hh(this);
            hhVar3.f4732a = (LinearLayout) view.findViewById(2131558999);
            hhVar3.f4733b = (TextView) view.findViewById(2131558423);
            hhVar3.f4734c = (TextView) view.findViewById(2131558421);
            hhVar3.f4735d = (TextView) view.findViewById(2131558424);
            hhVar3.f4736e = (TextView) view.findViewById(2131558422);
            hhVar3.f4737f = (TextView) view.findViewById(2131558425);
            hhVar3.f4738g = (TextView) view.findViewById(2131558426);
            view.setTag(hhVar3);
            hhVar = hhVar3;
        } else {
            hhVar = (hh) view.getTag();
        }
        view.setBackgroundResource(17301605);
        hhVar.f4732a.setId(i);
        String str = this.f4726b.f2761g[i];
        if (!(str == null || "".equals(str))) {
            hhVar.f4733b.setText(str);
            if (this.f4726b.f2764j == i) {
                hhVar.f4733b.setText(str + " - default");
            }
            hhVar.f4734c.setText(this.f4726b.f2762h[i]);
            String str2 = (String) this.f4726b.f2767m.get(str + "_balance");
            String str3 = (String) this.f4726b.f2767m.get(str + "_income");
            String str4 = (String) this.f4726b.f2767m.get(str + "_expense");
            hhVar.f4735d.setText(str3);
            hhVar.f4736e.setText(str4);
            hhVar.f4737f.setText(str2);
            if (str2.startsWith("(")) {
                hhVar.f4737f.setTextColor(co.f4428b);
            } else {
                hhVar.f4737f.setTextColor(co.f4429c);
            }
            str3 = "";
            int a = abd.m3784a((String) this.f4726b.f2755a.get(str + "_CURRENCY"), -1);
            if (a != -1) {
                str2 = co.f4436j[a];
                str2 = str2.substring(str2.indexOf(":") + 1);
            } else {
                str2 = str3;
            }
            hhVar.f4738g.setText(this.f4726b.getResources().getString(2131099680) + " " + str2);
            hhVar.f4732a.setOnClickListener(new he(this));
            hhVar.f4732a.setOnLongClickListener(new hf(this));
            int i2 = this.f4725a.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
            int[] iArr = new int[]{822083583, -1141049649};
            if (i2 == 1 || i2 > 3) {
                iArr = new int[]{0, -1724303047};
            }
            view.setBackgroundColor(iArr[i % iArr.length]);
            a = -16711681;
            if (co.f4427a.length <= i) {
                try {
                    a = co.f4427a[new Random().nextInt(co.f4427a.length)];
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                a = co.f4427a[i];
            }
            view.findViewById(2131558984).setBackgroundColor(a);
        }
        return view;
    }
}
