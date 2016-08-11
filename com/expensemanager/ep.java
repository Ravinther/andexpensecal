package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import java.util.Map;

public class ep extends ArrayAdapter<Map<String, Object>> {
    int f4598a;
    private List<Map<String, Object>> f4599b;
    private int f4600c;
    private LayoutInflater f4601d;
    private Context f4602e;

    public ep(Context context, int i, List<Map<String, Object>> list) {
        super(context, i, list);
        this.f4599b = list;
        this.f4600c = i;
        this.f4601d = LayoutInflater.from(context);
        this.f4602e = context;
        this.f4598a = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
    }

    public static int m4100a(String str, String str2) {
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
            view = this.f4601d.inflate(this.f4600c, null);
        }
        int[] iArr = new int[]{-1, -1141049649};
        int length = i % iArr.length;
        if (this.f4598a == 1 || this.f4598a > 3) {
            iArr = new int[]{-16777216, -13027015};
        }
        view.setBackgroundColor(iArr[length]);
        try {
            Map map = (Map) this.f4599b.get(i);
            if (map != null) {
                String replaceAll;
                String string;
                CharSequence charSequence;
                Object obj;
                StringBuilder stringBuilder;
                Object stringBuilder2;
                TextProgressBar textProgressBar;
                TextView textView = (TextView) view.findViewById(2131558423);
                TextView textView2 = (TextView) view.findViewById(2131558421);
                TextView textView3 = (TextView) view.findViewById(2131558424);
                TextView textView4 = (TextView) view.findViewById(2131558422);
                TextView textView5 = (TextView) view.findViewById(2131558425);
                TextView textView6 = (TextView) view.findViewById(2131558426);
                String str = (String) map.get("amount");
                String str2 = (String) map.get("totalDebt");
                String str3 = (String) map.get("description");
                String str4 = (String) map.get("property");
                String str5 = (String) map.get("category");
                String string2 = this.f4602e.getResources().getString(2131099944);
                if (str5.startsWith("Income")) {
                    string2 = this.f4602e.getResources().getString(2131099741);
                }
                String str6 = (String) ((Map) this.f4599b.get(0)).get("category");
                if (i > 0) {
                    if (str5.startsWith("Income")) {
                        string2 = this.f4602e.getResources().getString(2131100038);
                        if (str6.startsWith("Income")) {
                            str6 = this.f4602e.getResources().getString(2131099741);
                            string2 = str6 + " " + str4;
                            str4 = (String) map.get("paid");
                            if (str4 == null) {
                                str4 = "0.00";
                            }
                            replaceAll = str4.replaceAll(",", "");
                            str4 = (String) map.get("remaining");
                            if (str4 != null) {
                                string = this.f4602e.getResources().getString(2131100040);
                                charSequence = r17 + ": " + str4;
                            } else {
                                obj = str4;
                            }
                            if (str5.startsWith("Income")) {
                                textView2.setTextColor(co.f4429c);
                            } else {
                                textView2.setTextColor(co.f4428b);
                            }
                            str4 = aib.m3852a(map.get("tag"));
                            if (str4.startsWith(this.f4602e.getResources().getString(2131099856))) {
                                str5 = str4;
                            } else {
                                string = this.f4602e.getResources().getString(2131099856);
                                str5 = r17 + ":" + str4;
                            }
                            stringBuilder = new StringBuilder();
                            string = "|";
                            stringBuilder2 = r17.append((String) map.get("date")).append(r17).append(str5).toString();
                            if (i > 0) {
                                stringBuilder2 = (String) map.get("date");
                            }
                            textView.setText(string2);
                            textView2.setText(aib.m3880l(str));
                            textView3.setText(stringBuilder2);
                            textView4.setText(charSequence);
                            textView5.setText(str3);
                            textView4.setTypeface(null, 1);
                            if (aib.m3877i(aib.m3852a(map.get("paid"))) >= aib.m3877i(aib.m3852a(map.get("totalDebt"))) && i > 0) {
                                textView6.setText(2131099994);
                                textView6.setTextColor(co.f4428b);
                                textView6.setTypeface(null, 1);
                            }
                            if ("".equals(stringBuilder2.trim())) {
                                textView5.setVisibility(8);
                            }
                            length = m4100a(replaceAll, str2);
                            textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                            if (i == 0) {
                                textProgressBar.setVisibility(8);
                            }
                            textProgressBar.setProgress(length);
                            textProgressBar.setText(length + "%");
                            textProgressBar.setTextColor(-1);
                            if (!string2.startsWith(this.f4602e.getResources().getString(2131099944)) || string2.startsWith(this.f4602e.getResources().getString(2131100038))) {
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837635));
                            } else {
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837636));
                            }
                            if (length < 0) {
                                textProgressBar.setProgress(100);
                                textProgressBar.setText(">100%");
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                            }
                            if (length >= 100) {
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                            }
                        }
                    } else {
                        string2 = this.f4602e.getResources().getString(2131100003);
                        if (!str6.startsWith("Income")) {
                            str6 = this.f4602e.getResources().getString(2131099944);
                            string2 = str6 + " " + str4;
                            str4 = (String) map.get("paid");
                            if (str4 == null) {
                                str4 = "0.00";
                            }
                            replaceAll = str4.replaceAll(",", "");
                            str4 = (String) map.get("remaining");
                            if (str4 != null) {
                                obj = str4;
                            } else {
                                string = this.f4602e.getResources().getString(2131100040);
                                charSequence = r17 + ": " + str4;
                            }
                            if (str5.startsWith("Income")) {
                                textView2.setTextColor(co.f4429c);
                            } else {
                                textView2.setTextColor(co.f4428b);
                            }
                            str4 = aib.m3852a(map.get("tag"));
                            if (str4.startsWith(this.f4602e.getResources().getString(2131099856))) {
                                str5 = str4;
                            } else {
                                string = this.f4602e.getResources().getString(2131099856);
                                str5 = r17 + ":" + str4;
                            }
                            stringBuilder = new StringBuilder();
                            string = "|";
                            stringBuilder2 = r17.append((String) map.get("date")).append(r17).append(str5).toString();
                            if (i > 0) {
                                stringBuilder2 = (String) map.get("date");
                            }
                            textView.setText(string2);
                            textView2.setText(aib.m3880l(str));
                            textView3.setText(stringBuilder2);
                            textView4.setText(charSequence);
                            textView5.setText(str3);
                            textView4.setTypeface(null, 1);
                            textView6.setText(2131099994);
                            textView6.setTextColor(co.f4428b);
                            textView6.setTypeface(null, 1);
                            if ("".equals(stringBuilder2.trim())) {
                                textView5.setVisibility(8);
                            }
                            length = m4100a(replaceAll, str2);
                            textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                            if (i == 0) {
                                textProgressBar.setVisibility(8);
                            }
                            textProgressBar.setProgress(length);
                            textProgressBar.setText(length + "%");
                            textProgressBar.setTextColor(-1);
                            if (string2.startsWith(this.f4602e.getResources().getString(2131099944))) {
                            }
                            textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837635));
                            if (length < 0) {
                                textProgressBar.setProgress(100);
                                textProgressBar.setText(">100%");
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                            }
                            if (length >= 100) {
                                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                            }
                        }
                    }
                }
                str6 = string2;
                string2 = str6 + " " + str4;
                str4 = (String) map.get("paid");
                if (str4 == null) {
                    str4 = "0.00";
                }
                replaceAll = str4.replaceAll(",", "");
                str4 = (String) map.get("remaining");
                if (str4 != null) {
                    string = this.f4602e.getResources().getString(2131100040);
                    charSequence = r17 + ": " + str4;
                } else {
                    obj = str4;
                }
                if (str5.startsWith("Income")) {
                    textView2.setTextColor(co.f4428b);
                } else {
                    textView2.setTextColor(co.f4429c);
                }
                str4 = aib.m3852a(map.get("tag"));
                if (str4.startsWith(this.f4602e.getResources().getString(2131099856))) {
                    string = this.f4602e.getResources().getString(2131099856);
                    str5 = r17 + ":" + str4;
                } else {
                    str5 = str4;
                }
                stringBuilder = new StringBuilder();
                string = "|";
                stringBuilder2 = r17.append((String) map.get("date")).append(r17).append(str5).toString();
                if (i > 0) {
                    stringBuilder2 = (String) map.get("date");
                }
                textView.setText(string2);
                textView2.setText(aib.m3880l(str));
                textView3.setText(stringBuilder2);
                textView4.setText(charSequence);
                textView5.setText(str3);
                textView4.setTypeface(null, 1);
                textView6.setText(2131099994);
                textView6.setTextColor(co.f4428b);
                textView6.setTypeface(null, 1);
                if ("".equals(stringBuilder2.trim())) {
                    textView5.setVisibility(8);
                }
                length = m4100a(replaceAll, str2);
                textProgressBar = (TextProgressBar) view.findViewById(2131558427);
                if (i == 0) {
                    textProgressBar.setVisibility(8);
                }
                textProgressBar.setProgress(length);
                textProgressBar.setText(length + "%");
                textProgressBar.setTextColor(-1);
                if (string2.startsWith(this.f4602e.getResources().getString(2131099944))) {
                }
                textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837635));
                if (length < 0) {
                    textProgressBar.setProgress(100);
                    textProgressBar.setText(">100%");
                    textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                }
                if (length >= 100) {
                    textProgressBar.setProgressDrawable(this.f4602e.getResources().getDrawable(2130837515));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
