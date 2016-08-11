package com.expensemanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class zb extends ArrayAdapter<Map<String, String>> {
    SharedPreferences f5516a;
    private int[] f5517b;
    private List<Map<String, String>> f5518c;
    private int f5519d;
    private LayoutInflater f5520e;
    private Map<String, ArrayList<Map<String, String>>> f5521f;
    private Resources f5522g;

    public zb(Context context, int i, List<Map<String, String>> list, Map<String, ArrayList<Map<String, String>>> map) {
        super(context, i, list);
        this.f5517b = new int[]{822083583, -1141049649};
        this.f5518c = list;
        this.f5519d = i;
        this.f5520e = LayoutInflater.from(context);
        this.f5521f = map;
        this.f5522g = context.getResources();
        this.f5516a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
    }

    private int m4253a(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            Date parse = simpleDateFormat.parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            Date parse2 = simpleDateFormat.parse(str2);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(parse2);
            return (int) ((instance2.getTimeInMillis() - instance.getTimeInMillis()) / 86400000);
        } catch (Exception e) {
            return -1;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5520e.inflate(this.f5519d, null);
        }
        int length = i % this.f5517b.length;
        int i2 = this.f5516a.getInt("THEME_COLOR", 0);
        if (i2 == 1 || i2 > 3) {
            this.f5517b = new int[]{0, -1724303047};
        }
        view.setBackgroundColor(this.f5517b[length]);
        Map map = (Map) this.f5518c.get(i);
        if (map != null) {
            String string;
            int i3;
            String str;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i4;
            CharSequence charSequence3;
            String str2 = (String) map.get("description");
            ArrayList arrayList = (ArrayList) this.f5521f.get((String) map.get("property2"));
            int size = arrayList != null ? arrayList.size() : 0;
            CharSequence charSequence4 = this.f5522g.getString(2131099790) + ": " + size + "/" + ((String) map.get("numberOfPayment"));
            String b = aba.m3768b((String) map.get("firstExpenseDate"), (String) map.get("frequencyValue"), "" + size);
            String str3 = this.f5522g.getString(2131099976) + ": " + b;
            TextView textView = (TextView) view.findViewById(2131558856);
            String format = new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime());
            int a = m4253a(format, b);
            textView.setText("" + a);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(2131558854);
            int i5 = -65536;
            if (a <= 0) {
                i5 = -65536;
            }
            if (a > 0 && a <= 7) {
                i5 = -1784274;
            }
            if (a > 7 && a <= 14) {
                i5 = -5414233;
            }
            a = a > 14 ? -9977996 : i5;
            String str4 = "";
            if (size >= aba.m3780f((String) map.get("numberOfPayment"))) {
                string = this.f5522g.getString(2131099890);
                textView.setText(null);
                i3 = -10902850;
                str = string;
            } else {
                String str5 = str4;
                i3 = a;
                str = str5;
            }
            if (size < aba.m3780f((String) map.get("paidCycleInt"))) {
                string = aba.m3768b((String) map.get("firstExpenseDate"), (String) map.get("frequencyValue"), "" + size);
                size = m4253a(format, string);
                str = this.f5522g.getString(2131099992) + ": " + string;
                textView.setText("" + size);
                i3 = -65536;
                charSequence = str;
                charSequence2 = "";
            } else {
                Object obj = str3;
                Object obj2 = str;
            }
            String str6 = (String) map.get("expenseAmount");
            i5 = co.f4428b;
            if (str6 == null || "".equals(str6)) {
                str6 = (String) map.get("incomeAmount");
                i4 = co.f4429c;
                charSequence3 = str6;
            } else {
                i4 = i5;
                Object obj3 = str6;
            }
            relativeLayout.setBackgroundColor(i3);
            textView = (TextView) view.findViewById(2131558423);
            TextView textView2 = (TextView) view.findViewById(2131558424);
            TextView textView3 = (TextView) view.findViewById(2131558422);
            TextView textView4 = (TextView) view.findViewById(2131558425);
            TextView textView5 = (TextView) view.findViewById(2131558426);
            ((TextView) view.findViewById(2131558421)).setText(str2);
            textView.setText(charSequence3);
            textView.setTextColor(i4);
            textView3.setText((String) map.get("frequency"));
            textView2.setText(charSequence4);
            textView4.setText(charSequence);
            textView5.setText(charSequence2);
        }
        return view;
    }
}
