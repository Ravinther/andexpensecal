package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

public class lw extends ArrayAdapter<Map<String, String>> {
    int f4943a;
    private List<Map<String, String>> f4944b;
    private int f4945c;
    private LayoutInflater f4946d;
    private List<String> f4947e;
    private Context f4948f;

    public lw(Context context, int i, List<Map<String, String>> list, List<String> list2) {
        super(context, i, list);
        this.f4944b = list;
        this.f4945c = i;
        this.f4946d = LayoutInflater.from(context);
        this.f4947e = list2;
        this.f4948f = context;
        this.f4943a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
    }

    public static int m4151a(String str, String str2) {
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
            view = this.f4946d.inflate(this.f4945c, null);
        }
        int[] iArr = new int[]{822083583, -1141049649};
        int length = i % iArr.length;
        if (this.f4943a == 1 || this.f4943a > 3) {
            iArr = new int[]{0, -1724303047};
        }
        view.setBackgroundColor(iArr[length]);
        try {
            Map map = (Map) this.f4944b.get(i);
            if (map != null) {
                CharSequence string;
                String str;
                Object a;
                CharSequence charSequence;
                TextProgressBar textProgressBar;
                TextView textView = (TextView) view.findViewById(2131558423);
                TextView textView2 = (TextView) view.findViewById(2131558421);
                TextView textView3 = (TextView) view.findViewById(2131558424);
                TextView textView4 = (TextView) view.findViewById(2131558422);
                TextView textView5 = (TextView) view.findViewById(2131558425);
                TextView textView6 = (TextView) view.findViewById(2131558426);
                String str2 = (String) map.get("category");
                String string2 = ("All".equalsIgnoreCase(str2) || "All-1".equalsIgnoreCase(str2)) ? this.f4948f.getResources().getString(2131099720) : str2;
                str2 = (String) map.get("subcategory");
                String string3 = "All".equalsIgnoreCase(str2) ? this.f4948f.getResources().getString(2131099721) : str2;
                str2 = (String) map.get("account");
                if ("All".equalsIgnoreCase(str2)) {
                    string = this.f4948f.getResources().getString(2131099719);
                } else {
                    Object obj = str2;
                }
                str2 = (String) map.get("amount");
                String[] split = ((String) map.get("property")).replace(";NO", "").split(";");
                String str3 = "";
                if (split.length > 0 && !"".equals(split[0])) {
                    str3 = aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[0]) + " - ";
                }
                if (split.length > 1 && !"".equals(split[1])) {
                    str3 = str3 + aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[1]);
                }
                String str4 = (String) map.get("property2");
                String str5 = (String) map.get("property3");
                Object obj2 = (String) map.get("description");
                CharSequence charSequence2 = string2 + ":" + string3;
                if ("".equals(string2)) {
                    charSequence2 = this.f4948f.getResources().getString(2131099720);
                }
                if (str4 != null) {
                    if (!"".equals(str4)) {
                        if (!"".equals(str3)) {
                            str4 = str3 + ";" + str4;
                        }
                        if (!(str5 == null || "".equals(str5))) {
                            str4 = "".equals(str4) ? str5 : str4 + ";" + str5;
                        }
                        if (obj2 != null || "".equals(obj2)) {
                            str = str4;
                        } else if (!"".equals(str4)) {
                            obj2 = str4 + ";" + obj2;
                        }
                        str4 = (String) this.f4947e.get(i);
                        if (str4 == null) {
                            str4 = "0.00";
                        }
                        str4 = str4.replaceAll(",", "");
                        a = aba.m3746a(aba.m3743a(str2, "-" + str4));
                        charSequence = aba.m3767b(str4) + "/" + aba.m3767b(str2);
                        if (a != null) {
                            if (a.startsWith("(")) {
                                textView2.setTextColor(co.f4428b);
                                textView.setText(string);
                                textView2.setText(a);
                                textView3.setText(charSequence2);
                                textView4.setText(charSequence);
                                textView5.setText(obj2);
                                textView6.setText(aib.m3865b((String) map.get("expired")));
                                textView6.setTextColor(co.f4428b);
                                textView6.setTypeface(null, 1);
                                if ("".equals(obj2.trim())) {
                                    textView5.setVisibility(8);
                                }
                                length = m4151a(str4, str2);
                                textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                                textProgressBar.setProgress(length);
                                textProgressBar.setText(length + "%");
                                textProgressBar.setTextColor(-1);
                                textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837634));
                                if (a != null && a.startsWith("(")) {
                                    textProgressBar.setProgress(100);
                                    textProgressBar.setText(">100%");
                                    textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                                }
                                if (length >= 100) {
                                    textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                                }
                            }
                        }
                        textView2.setTextColor(co.f4429c);
                        textView.setText(string);
                        textView2.setText(a);
                        textView3.setText(charSequence2);
                        textView4.setText(charSequence);
                        textView5.setText(obj2);
                        textView6.setText(aib.m3865b((String) map.get("expired")));
                        textView6.setTextColor(co.f4428b);
                        textView6.setTypeface(null, 1);
                        if ("".equals(obj2.trim())) {
                            textView5.setVisibility(8);
                        }
                        length = m4151a(str4, str2);
                        textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                        textProgressBar.setProgress(length);
                        textProgressBar.setText(length + "%");
                        textProgressBar.setTextColor(-1);
                        textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837634));
                        textProgressBar.setProgress(100);
                        textProgressBar.setText(">100%");
                        textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                        if (length >= 100) {
                            textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                        }
                    }
                }
                str4 = str3;
                if ("".equals(str4)) {
                }
                if (obj2 != null) {
                }
                str = str4;
                str4 = (String) this.f4947e.get(i);
                if (str4 == null) {
                    str4 = "0.00";
                }
                str4 = str4.replaceAll(",", "");
                a = aba.m3746a(aba.m3743a(str2, "-" + str4));
                charSequence = aba.m3767b(str4) + "/" + aba.m3767b(str2);
                if (a != null) {
                    if (a.startsWith("(")) {
                        textView2.setTextColor(co.f4428b);
                        textView.setText(string);
                        textView2.setText(a);
                        textView3.setText(charSequence2);
                        textView4.setText(charSequence);
                        textView5.setText(obj2);
                        textView6.setText(aib.m3865b((String) map.get("expired")));
                        textView6.setTextColor(co.f4428b);
                        textView6.setTypeface(null, 1);
                        if ("".equals(obj2.trim())) {
                            textView5.setVisibility(8);
                        }
                        length = m4151a(str4, str2);
                        textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                        textProgressBar.setProgress(length);
                        textProgressBar.setText(length + "%");
                        textProgressBar.setTextColor(-1);
                        textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837634));
                        textProgressBar.setProgress(100);
                        textProgressBar.setText(">100%");
                        textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                        if (length >= 100) {
                            textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                        }
                    }
                }
                textView2.setTextColor(co.f4429c);
                textView.setText(string);
                textView2.setText(a);
                textView3.setText(charSequence2);
                textView4.setText(charSequence);
                textView5.setText(obj2);
                textView6.setText(aib.m3865b((String) map.get("expired")));
                textView6.setTextColor(co.f4428b);
                textView6.setTypeface(null, 1);
                if ("".equals(obj2.trim())) {
                    textView5.setVisibility(8);
                }
                length = m4151a(str4, str2);
                textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                textProgressBar.setProgress(length);
                textProgressBar.setText(length + "%");
                textProgressBar.setTextColor(-1);
                textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837634));
                textProgressBar.setProgress(100);
                textProgressBar.setText(">100%");
                textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                if (length >= 100) {
                    textProgressBar.setProgressDrawable(this.f4948f.getResources().getDrawable(2130837519));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
