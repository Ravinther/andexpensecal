package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class jp extends ArrayAdapter<Map<String, Object>> {
    private List<Map<String, Object>> f4848a;
    private int f4849b;
    private LayoutInflater f4850c;
    private String f4851d;
    private int f4852e;
    private Context f4853f;

    public jp(Context context, int i, List<Map<String, Object>> list, String str, int i2) {
        super(context, i, list);
        this.f4853f = context;
        this.f4848a = list;
        this.f4849b = i;
        this.f4850c = LayoutInflater.from(context);
        this.f4851d = str;
        this.f4852e = i2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4850c.inflate(this.f4849b, null);
        }
        Map map = (Map) this.f4848a.get(i);
        if (map != null) {
            TextView textView = (TextView) view.findViewById(2131558423);
            TextView textView2 = (TextView) view.findViewById(2131558421);
            String str = (String) map.get("amount");
            String trim = str != null ? str.trim() : str;
            if (trim == null || !trim.startsWith("-")) {
                textView2.setTextColor(co.f4429c);
            } else {
                textView2.setTextColor(co.f4428b);
            }
            if (this.f4852e == 1) {
                textView2.setTextColor(co.f4429c);
            }
            if (this.f4852e == 2 && (trim.startsWith("-") || "0".equals(trim))) {
                textView2.setTextColor(co.f4428b);
            }
            CharSequence charSequence = (String) map.get(this.f4851d);
            if ("expenseDate".equals(this.f4851d) && (this.f4848a.size() == 7 || this.f4848a.size() > 27)) {
                Locale locale = Locale.US;
                String displayLanguage = this.f4853f.getResources().getConfiguration().locale.getDisplayLanguage(Locale.US);
                if ("CHINESE".equalsIgnoreCase(displayLanguage)) {
                    locale = Locale.CHINESE;
                }
                if ("FRENCH".equalsIgnoreCase(displayLanguage)) {
                    locale = Locale.FRENCH;
                }
                if ("GERMAN".equalsIgnoreCase(displayLanguage)) {
                    locale = Locale.GERMAN;
                }
                try {
                    charSequence = new SimpleDateFormat("EEE, " + ExpenseManager.f3244t, locale).format(new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).parse(charSequence));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            textView.setText(charSequence);
            textView2.setText(": " + aba.m3767b(trim.replace("-", "")));
        }
        return view;
    }
}
