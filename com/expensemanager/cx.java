package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class cx extends ArrayAdapter<Map<String, Object>> {
    int f4451a;
    private List<Map<String, Object>> f4452b;
    private int f4453c;
    private LayoutInflater f4454d;
    private Context f4455e;
    private ro f4456f;

    public cx(Context context, int i, List<Map<String, Object>> list) {
        super(context, i, list);
        this.f4452b = list;
        this.f4453c = i;
        this.f4454d = LayoutInflater.from(context);
        this.f4455e = context;
        this.f4451a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        this.f4456f = new ro(context);
    }

    public static int m4043a(String str, String str2) {
        int i = 0;
        if ("0".equals(str) || "".equals(str) || "0".equals(str2) || "".equals(str2)) {
            return i;
        }
        String replaceAll = str.replaceAll(",", "");
        try {
            return (int) Math.round((Double.valueOf(replaceAll).doubleValue() * 100.0d) / Double.valueOf(str2.replaceAll(",", "")).doubleValue());
        } catch (Exception e) {
            return i;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4454d.inflate(this.f4453c, null);
        }
        int[] iArr = new int[]{822083583, -1141049649};
        int length = i % iArr.length;
        if (this.f4451a == 1 || this.f4451a > 3) {
            iArr = new int[]{0, -1724303047};
        }
        view.setBackgroundColor(iArr[length]);
        try {
            Map map = (Map) this.f4452b.get(i);
            if (map != null) {
                CharSequence charSequence;
                TextView textView = (TextView) view.findViewById(2131558423);
                TextView textView2 = (TextView) view.findViewById(2131558421);
                TextView textView3 = (TextView) view.findViewById(2131558424);
                TextView textView4 = (TextView) view.findViewById(2131558422);
                TextView textView5 = (TextView) view.findViewById(2131558425);
                TextView textView6 = (TextView) view.findViewById(2131558426);
                String str = (String) map.get("expense");
                String str2 = (String) map.get("income");
                str2 = (String) map.get("subTotal");
                str2 = (String) map.get("date");
                String str3 = (String) map.get("creditLimit");
                String a = aib.m3850a(aba.m3743a(str3, "-" + str));
                textView2.setTextColor(co.f4428b);
                textView.setText(str2);
                textView2.setText(str);
                textView3.setText(this.f4455e.getResources().getString(2131099779) + ": " + aib.m3850a(aib.m3877i(str3)));
                textView4.setText(this.f4455e.getResources().getString(2131099728) + ": " + a);
                String str4 = "";
                String[] split = str2.split(" - ");
                String str5 = (String) map.get("paymentDueDate");
                if (split.length > 1) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(simpleDateFormat.parse(split[1]));
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    instance.set(14, 999);
                    length = Integer.parseInt(str5);
                    Calendar instance2 = Calendar.getInstance();
                    instance2.setTimeInMillis(instance.getTimeInMillis());
                    if (instance.get(5) + 1 < length) {
                        instance2.set(5, length);
                    } else {
                        instance2.set(5, length);
                        instance2.add(2, 1);
                    }
                    str4 = this.f4455e.getResources().getString(2131099856) + ": " + simpleDateFormat.format(instance2.getTime());
                    str5 = "account='" + ((String) map.get("account")) + "'";
                    String a2 = aba.m3750a(this.f4456f, str5 + " AND " + "category" + "!='Income'" + " AND " + "expensed" + "<=" + instance.getTimeInMillis());
                    String a3 = aba.m3750a(this.f4456f, str5 + " AND " + "category" + "='Income'" + " AND " + "expensed" + "<=" + instance2.getTimeInMillis());
                    str5 = aib.m3877i(a3) >= aib.m3877i(a2) ? str4 + ", " + this.f4455e.getResources().getString(2131099994) : str4;
                    str4 = aba.m3762b(aba.m3743a("-" + a2, a3));
                    textView6.setText(this.f4455e.getResources().getString(2131099680) + " " + str4);
                    textView6.setVisibility(0);
                    map.put("balance", str4);
                    charSequence = str5;
                } else {
                    Object obj = str4;
                }
                textView5.setText(charSequence);
                textView5.setTypeface(null, 1);
                textView5.setVisibility(0);
                length = m4043a(str, str3);
                TextProgressBar textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                textProgressBar.setProgress(length);
                str4 = this.f4455e.getResources().getString(2131099882) + "/" + this.f4455e.getResources().getString(2131099779);
                textProgressBar.setText(length + "%");
                if (i == 0) {
                    textProgressBar.setText(str4 + ": " + length + "%");
                }
                textProgressBar.setTextColor(-1);
                textProgressBar.setProgressDrawable(this.f4455e.getResources().getDrawable(2130837634));
                if (length < 0) {
                    textProgressBar.setProgress(100);
                    textProgressBar.setText(">100%");
                    textProgressBar.setProgressDrawable(this.f4455e.getResources().getDrawable(2130837519));
                }
                if (length >= 100) {
                    textProgressBar.setProgressDrawable(this.f4455e.getResources().getDrawable(2130837519));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
