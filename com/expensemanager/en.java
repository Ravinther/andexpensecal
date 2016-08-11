package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

public class en extends ArrayAdapter<Map<String, Object>> {
    int f4590a;
    private List<Map<String, Object>> f4591b;
    private int f4592c;
    private LayoutInflater f4593d;
    private Context f4594e;

    public en(Context context, int i, List<Map<String, Object>> list) {
        super(context, i, list);
        this.f4591b = list;
        this.f4592c = i;
        this.f4593d = LayoutInflater.from(context);
        this.f4594e = context;
        this.f4590a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
    }

    public static int m4099a(String str, String str2) {
        int i = 0;
        if (!("0".equals(str) || "".equals(str) || "0".equals(str2) || "".equals(str2))) {
            try {
                i = Math.round((Float.valueOf(str).floatValue() * 100.0f) / Float.valueOf(str2).floatValue());
            } catch (Exception e) {
            }
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4593d.inflate(this.f4592c, null);
        }
        int[] iArr = new int[]{-1, -1141049649};
        int length = i % iArr.length;
        if (this.f4590a == 1 || this.f4590a > 3) {
            iArr = new int[]{-16777216, -13027015};
        }
        view.setBackgroundColor(iArr[length]);
        try {
            Map map = (Map) this.f4591b.get(i);
            if (map != null) {
                TextView textView = (TextView) view.findViewById(2131558423);
                TextView textView2 = (TextView) view.findViewById(2131558421);
                TextView textView3 = (TextView) view.findViewById(2131558424);
                TextView textView4 = (TextView) view.findViewById(2131558422);
                TextView textView5 = (TextView) view.findViewById(2131558425);
                TextView textView6 = (TextView) view.findViewById(2131558426);
                String str = (String) map.get("amount");
                String str2 = (String) map.get("description");
                String str3 = (String) map.get("property");
                String str4 = (String) map.get("category");
                String string = this.f4594e.getResources().getString(2131099944);
                CharSequence a = aib.m3852a(map.get("tag"));
                if (!a.startsWith(this.f4594e.getResources().getString(2131099856))) {
                    a = this.f4594e.getResources().getString(2131099856) + ":" + a;
                }
                if (!"".equals(str2)) {
                    a = a + ", " + str2;
                }
                CharSequence charSequence = (str4.startsWith("Income") ? this.f4594e.getResources().getString(2131099741) : string) + " " + str3;
                str2 = (String) map.get("paid");
                if (str2 == null) {
                    str2 = "0.00";
                }
                string = str2.replaceAll(",", "");
                CharSequence b = aba.m3762b(aba.m3743a(str, "-" + string));
                String l = aib.m3880l(string);
                String str5 = str5 + "/" + aib.m3880l(str);
                if (str4.startsWith("Income")) {
                    textView2.setTextColor(co.f4429c);
                } else {
                    textView2.setTextColor(co.f4428b);
                }
                str2 = (String) map.get("date");
                textView.setText(charSequence);
                textView2.setText(b);
                textView3.setText(str2);
                textView4.setText(str5);
                textView5.setText(a);
                if (aib.m3877i(aib.m3852a(map.get("paid"))) >= aib.m3877i(aib.m3852a(map.get("amount")))) {
                    textView6.setText(2131099994);
                    textView6.setTextColor(co.f4428b);
                    textView6.setTypeface(null, 1);
                }
                if ("".equals(str2.trim())) {
                    textView5.setVisibility(8);
                }
                length = m4099a(string, str);
                TextProgressBar textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                textProgressBar.setProgress(length);
                textProgressBar.setText(length + "%");
                textProgressBar.setTextColor(-1);
                if (str4.startsWith("Income")) {
                    textProgressBar.setProgressDrawable(this.f4594e.getResources().getDrawable(2130837636));
                } else {
                    textProgressBar.setProgressDrawable(this.f4594e.getResources().getDrawable(2130837635));
                }
                if (length < 0) {
                    textProgressBar.setProgress(100);
                    textProgressBar.setText(">100%");
                }
                if (length >= 100) {
                    textProgressBar.setProgressDrawable(this.f4594e.getResources().getDrawable(2130837515));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
