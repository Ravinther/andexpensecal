package com.expensemanager.caldroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.expensemanager.abd;
import com.expensemanager.aib;
import com.expensemanager.co;
import com.expensemanager.ro;
import com.p028a.C0341c;
import com.roomorama.caldroid.C0419g;
import java.util.HashMap;
import java.util.Map;
import p000a.p001a.C0000a;

/* renamed from: com.expensemanager.caldroid.i */
public class C0420i extends C0419g {
    double f4396a;
    String f4397b;
    int f4398c;
    double f4399d;
    String f4400e;

    public C0420i(Context context, int i, int i2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        super(context, i, i2, hashMap, hashMap2);
        this.f4396a = 0.0d;
        this.f4397b = "";
        this.f4398c = C0341c.cell_bg;
        this.f4399d = 0.0d;
        this.f4400e = "0,1,2";
        int i3 = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i3 == 1 || i3 > 3) {
            this.f4398c = C0341c.cell_dark_bg;
        } else {
            this.f4398c = C0341c.cell_bg;
        }
        this.f4400e = abd.m3786a(context, new ro(context), "CALENDAR_SETTINGS", "0,1,2");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) this.i.getSystemService("layout_inflater");
        if (view == null) {
            view = layoutInflater.inflate(2130903049, null);
        }
        TextView textView = (TextView) view.findViewById(2131558459);
        TextView textView2 = (TextView) view.findViewById(2131558460);
        TextView textView3 = (TextView) view.findViewById(2131558461);
        TextView textView4 = (TextView) view.findViewById(2131558462);
        TextView textView5 = (TextView) view.findViewById(2131558463);
        TextView textView6 = (TextView) view.findViewById(2131558464);
        C0000a c0000a = (C0000a) this.f.get(i);
        String[] split;
        boolean[] zArr;
        int i2;
        if (c0000a.m27b().intValue() != this.g) {
            textView.setTextColor(-3355444);
            view.setBackgroundResource(this.f4398c);
            textView.setText(null);
            textView2.setText(null);
            textView3.setText(null);
            textView4.setText(null);
            textView5.setText(null);
            textView6.setText(null);
            split = this.f4400e.split(",");
            zArr = new boolean[5];
            for (i2 = 0; i2 < split.length; i2++) {
                if (!"".equals(split[i2])) {
                    zArr[Integer.parseInt(split[i2])] = true;
                }
            }
            if (zArr[0]) {
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            if (zArr[1]) {
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(4);
            }
            if (zArr[2]) {
                textView4.setVisibility(0);
            } else {
                textView4.setVisibility(8);
            }
            if (zArr[3]) {
                textView5.setVisibility(0);
            } else {
                textView5.setVisibility(8);
            }
            if (zArr[4]) {
                textView6.setVisibility(0);
            } else {
                textView6.setVisibility(8);
            }
        } else {
            view.setBackgroundResource(this.f4398c);
            try {
                String a = c0000a.m22a("YYYY-MM-DD");
                String str = (String) ((Map) this.u.get("income")).get(a);
                String str2 = (String) ((Map) this.u.get("expense")).get(a);
                this.f4397b = aib.m3852a(((Map) this.u.get("balance")).get(this.h + "-" + this.g));
                if (c0000a.m31c().intValue() == 1) {
                    this.f4396a = aib.m3877i(this.f4397b);
                    if (this.f4397b.indexOf("(") != -1) {
                        this.f4396a = -this.f4396a;
                    }
                }
                double i3 = aib.m3877i(str);
                double i4 = aib.m3877i(str2);
                this.f4396a = (this.f4396a + i3) - i4;
                textView4.setText(CaldroidActivity.m3952a(Math.abs(this.f4396a)));
                if (this.f4396a > 0.0d) {
                    textView4.setTextColor(co.f4429c);
                }
                if (this.f4396a < 0.0d) {
                    textView4.setTextColor(co.f4428b);
                }
                Integer c = c0000a.m31c();
                textView.setText("" + r18);
                if (c0000a.equals(m3984c())) {
                    textView.setTextColor(-65536);
                    textView.setTypeface(textView.getTypeface(), 1);
                }
                if (!(str == null || "".equals(str))) {
                    textView2.setText(CaldroidActivity.m3952a(i3));
                }
                if (!(str2 == null || "".equals(str2))) {
                    textView3.setText(CaldroidActivity.m3952a(i4));
                }
                double d = i3 - i4;
                textView5.setText(CaldroidActivity.m3952a(Math.abs(d)));
                if (d > 0.0d) {
                    textView5.setTextColor(co.f4429c);
                }
                if (d < 0.0d) {
                    textView5.setTextColor(co.f4428b);
                }
                this.f4399d = (this.f4399d + i3) - i4;
                textView6.setText(CaldroidActivity.m3952a(Math.abs(this.f4399d)));
                if (this.f4399d > 0.0d) {
                    textView6.setTextColor(co.f4429c);
                }
                if (this.f4399d < 0.0d) {
                    textView6.setTextColor(co.f4428b);
                }
                split = this.f4400e.split(",");
                zArr = new boolean[5];
                for (i2 = 0; i2 < split.length; i2++) {
                    if (!"".equals(split[i2])) {
                        zArr[Integer.parseInt(split[i2])] = true;
                    }
                }
                if (zArr[0]) {
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(4);
                }
                if (zArr[1]) {
                    textView3.setVisibility(0);
                } else {
                    textView3.setVisibility(4);
                }
                if (zArr[2]) {
                    textView4.setVisibility(0);
                } else {
                    textView4.setVisibility(8);
                }
                if (zArr[3]) {
                    textView5.setVisibility(0);
                } else {
                    textView5.setVisibility(8);
                }
                if (zArr[4]) {
                    textView6.setVisibility(0);
                } else {
                    textView6.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return view;
    }
}
