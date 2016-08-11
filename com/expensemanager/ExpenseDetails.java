package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SpinnerAdapter;
import android.widget.TabHost;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseDetails extends TabActivity {
    static String f3172s;
    private int f3173A;
    private int f3174B;
    private Context f3175C;
    private long f3176D;
    private int f3177E;
    private int f3178F;
    private int f3179G;
    private String f3180H;
    private String f3181I;
    private String f3182J;
    private String f3183K;
    private String[] f3184L;
    private OnDateSetListener f3185M;
    ListView f3186a;
    TextView f3187b;
    TextView f3188c;
    ListView f3189d;
    ExpandableListView f3190e;
    ScrollView f3191f;
    TextView f3192g;
    TextView f3193h;
    ListView f3194i;
    ExpandableListView f3195j;
    ScrollView f3196k;
    TextView f3197l;
    TextView f3198m;
    ListView f3199n;
    ExpandableListView f3200o;
    ScrollView f3201p;
    int f3202q;
    String f3203r;
    int f3204t;
    boolean f3205u;
    private TabHost f3206v;
    private ro f3207w;
    private TextView f3208x;
    private TextView f3209y;
    private int f3210z;

    static {
        f3172s = "NO";
    }

    public ExpenseDetails() {
        this.f3175C = this;
        this.f3176D = 0;
        this.f3177E = 0;
        this.f3178F = 0;
        this.f3179G = 0;
        this.f3180H = "DATE_VIEW";
        this.f3181I = "DATE_VIEW";
        this.f3182J = "DATE_VIEW";
        this.f3183K = "Personal Expense";
        this.f3184L = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        this.f3202q = 2;
        this.f3203r = "";
        this.f3204t = 0;
        this.f3205u = false;
        this.f3185M = new sm(this);
    }

    private void m3107a() {
        this.f3208x.setText(aba.m3757a("yyyy-MM-dd", "EEE, " + ExpenseManager.f3244t, this.f3210z + "-" + (this.f3173A + 1) + "-" + this.f3174B));
    }

    private void m3108a(Context context, List<Map<String, Object>> list, String str, String str2, String str3, String str4) {
        String str5 = "";
        String str6 = "";
        int i = 0;
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String a = aba.m3756a((String) map.get("category"));
            String a2 = aba.m3756a((String) map.get("expenseDate"));
            String c = aba.m3773c(aba.m3756a((String) map.get("amount")).replaceAll(",", ""));
            if (this.f3202q == 2) {
                c = c.replace("-", "");
            }
            if (i != 0) {
                a2 = !"CATEGORY_VIEW".equalsIgnoreCase(str2) ? str6 + "," + a2 : str6 + "," + a;
                c = str5 + "," + c;
            } else if ("CATEGORY_VIEW".equalsIgnoreCase(str2)) {
                a2 = a;
            }
            i++;
            str5 = c;
            str6 = a2;
        }
        Intent intent = new Intent(context, ChartNewDetailsChart.class);
        Bundle bundle = new Bundle();
        bundle.putString("xStr", str6);
        bundle.putString("yStr", str5);
        bundle.putString("total", str);
        bundle.putString("title", str3);
        bundle.putString("viewType", str2);
        bundle.putString("account", this.f3183K);
        bundle.putInt("typeId", this.f3202q);
        bundle.putString("whereClause", str4);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void m3109a(ListView listView, String str, String str2, String str3) {
        StringBuffer append = new StringBuffer("<html><head><title>").append(getResources().getString(2131099725) + "</title></head>").append("<body><p><b>" + getResources().getString(2131099678) + ": " + this.f3183K + "</b></p>").append("<p><b>" + str + "</b></p>").append("<p><b>" + str2 + "</b></p>");
        String string = getResources().getString(2131099794);
        if (str3 == "CATEGORY_VIEW") {
            string = getResources().getString(2131099755);
        }
        StringBuffer append2 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append.append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, string, 0, "20%", "BLACK", "left"), true, getResources().getString(2131099723), 0, "20%", "BLACK", "left"), true, "", 0, "40%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str4 = "#FFFFFF";
        int i = 0;
        while (i < listView.getCount()) {
            Map map = (Map) listView.getItemAtPosition(i);
            append2 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append2.append("<tr bgcolor=" + ((i / 2) * 2 == i ? "#FCF6CF" : "#FFFFFF") + " align=center>"), false, ((String) map.get("expenseDate")) == null ? (String) map.get("category") : m3158a((String) map.get("expenseDate")), 0, "20%", "BLACK", "left"), false, aib.m3880l((String) map.get("amount")), 0, "20%", "BLACK", "left"), false, "", 0, "40%", "BLACK", "left").append("</tr>");
            i++;
        }
        append = append2.append("</table></body></html>");
        String str5 = getResources().getString(2131099725) + ".html";
        if (ExpenseExport.m3164a(co.f4430d, str5, append.toString())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str5);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str5)));
            this.f3175C.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }

    private void m3113b() {
        String replace;
        if (this.f3204t == 1 || this.f3204t > 3) {
            ((RelativeLayout) findViewById(2131558778)).setBackgroundColor(-1725816286);
        }
        this.f3208x = (TextView) findViewById(2131558530);
        ImageView imageView = (ImageView) findViewById(2131558529);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837532));
        imageView.setOnClickListener(new sn(this));
        imageView = (ImageView) findViewById(2131558735);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558736);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new so(this));
        imageView2.setOnClickListener(new sp(this));
        m3107a();
        this.f3186a = (ListView) findViewById(2131558737);
        this.f3186a.setOnItemClickListener(new sq(this));
        List arrayList = new ArrayList();
        String a = aba.m3751a(this.f3207w, this.f3183K, aba.m3757a("EEE, " + ExpenseManager.f3244t, ExpenseManager.f3244t, this.f3208x.getText().toString()), arrayList, this.f3202q, f3172s);
        this.f3209y = (TextView) findViewById(2131558456);
        this.f3209y.setText(this.f3203r + ": " + a);
        if (this.f3202q == 1) {
            this.f3209y.setTextColor(co.f4429c);
        }
        if (this.f3202q == 2) {
            this.f3209y.setTextColor(co.f4428b);
            replace = a.startsWith("(") ? a.replace("(", "").replace(")", "") : "-" + a;
            this.f3209y.setText(this.f3203r + ": " + replace);
        } else {
            replace = a;
        }
        if (this.f3202q == 0) {
            if (replace.startsWith("(")) {
                this.f3209y.setTextColor(co.f4428b);
            } else {
                this.f3209y.setTextColor(co.f4429c);
            }
        }
        this.f3186a.setAdapter(new qw(this, 2130903119, arrayList));
        Button button = (Button) findViewById(2131558779);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new sr(this));
    }

    private void m3114b(Context context, List<Map<String, String>> list, String str, String str2, String str3, String str4) {
        String str5 = "";
        String str6 = "";
        int i = 0;
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String a = aba.m3756a((String) map.get("expenseDate"));
            String replaceAll = aba.m3756a((String) map.get("subcategorySubTotal")).replaceAll(",", "");
            String[] split = aba.m3756a((String) map.get("subcategory")).split(":");
            String string = context.getResources().getString(2131100152);
            if (split.length > 1 && !"".equals(split[1])) {
                string = split[1];
            }
            String str7 = (replaceAll == null || "".equals(replaceAll)) ? "0" : replaceAll;
            if (i != 0) {
                string = !"CATEGORY_VIEW".equalsIgnoreCase(str2) ? str6 + "," + a : str6 + "," + string;
                str7 = str5 + "," + str7;
            } else if (!"CATEGORY_VIEW".equalsIgnoreCase(str2)) {
                string = a;
            }
            i++;
            str5 = str7;
            str6 = string;
        }
        Intent intent = new Intent(context, ChartNewDetailsChart.class);
        Bundle bundle = new Bundle();
        bundle.putString("xStr", str6);
        bundle.putString("yStr", str5);
        bundle.putString("total", str);
        bundle.putString("title", str3);
        bundle.putString("viewType", str2);
        bundle.putString("account", this.f3183K);
        bundle.putString("whereClause", str4);
        bundle.putInt("typeId", this.f3202q);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void m3117b(String str) {
        this.f3189d.setVisibility(8);
        this.f3190e.setVisibility(0);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str2 = aba.m3747a(this.f3177E, this.f3183K, this.f3202q) + " and " + "category" + "='" + str + "'";
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
            str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
        }
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        aba.m3754a(this.f3207w, str2, arrayList, arrayList2, this.f3205u);
        this.f3190e.setAdapter(new C0446g(this, arrayList, 2130903099, new String[]{"subcategory", "subcategorySubTotal"}, new int[]{2131558423, 2131558421}, arrayList2, 2130903119, new String[]{"amount", "category", "expenseDate", "description", "property"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425}));
        this.f3190e.setOnChildClickListener(new rw(this, arrayList2));
    }

    private void m3119c() {
        if (this.f3204t == 1 || this.f3204t > 3) {
            ((RelativeLayout) findViewById(2131558780)).setBackgroundColor(-1725816286);
        }
        ImageView imageView = (ImageView) findViewById(2131558739);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558741);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new ss(this));
        imageView2.setOnClickListener(new rr(this));
        ((RadioButton) findViewById(2131558783)).setOnClickListener(new rs(this));
        ((RadioButton) findViewById(2131558784)).setOnClickListener(new rt(this));
        this.f3189d = (ListView) findViewById(2131558742);
        this.f3190e = (ExpandableListView) findViewById(2131558786);
        Drawable drawable = this.f3190e.getResources().getDrawable(17301522);
        this.f3190e.setDivider(drawable);
        this.f3190e.setChildDivider(drawable);
        if ((getResources().getConfiguration().screenLayout & 15) == 4) {
            this.f3190e.setGroupIndicator(getResources().getDrawable(2130837575));
            this.f3190e.setIndicatorBounds(10, 40);
        }
        this.f3189d.setOnItemClickListener(new ru(this));
        m3125d();
    }

    private void m3122c(String str) {
        this.f3194i.setVisibility(8);
        this.f3195j.setVisibility(0);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str2 = aba.m3764b(this.f3178F, this.f3183K, this.f3202q) + " and " + "category" + "='" + str + "'";
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
            str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
        }
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        aba.m3754a(this.f3207w, str2, arrayList, arrayList2, this.f3205u);
        this.f3195j.setAdapter(new C0446g(this, arrayList, 2130903099, new String[]{"subcategory", "subcategorySubTotal"}, new int[]{2131558423, 2131558421}, arrayList2, 2130903119, new String[]{"amount", "category", "expenseDate", "description", "property"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425}));
        this.f3195j.setOnChildClickListener(new sd(this, arrayList2));
    }

    private void m3125d() {
        String a;
        Exception exception;
        Button button;
        if (this.f3191f != null) {
            this.f3191f.setVisibility(8);
        }
        List arrayList = new ArrayList();
        String str = "0";
        String str2;
        try {
            String str3;
            str2 = "expenseDate";
            this.f3189d.setVisibility(0);
            this.f3190e.setVisibility(8);
            str2 = aba.m3747a(this.f3177E, this.f3183K, this.f3202q);
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
                str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
            }
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
                str2 = str2 + " AND " + "category" + "!='Account Transfer'";
            }
            if (this.f3180H.equalsIgnoreCase("DATE_VIEW")) {
                str3 = "expenseDate";
                a = aba.m3752a(this.f3207w, str2, arrayList, this.f3177E, this.f3205u);
            } else {
                str = aba.m3755a(this.f3207w, str2, arrayList, this.f3205u);
                str3 = "category";
                a = str;
            }
            try {
                ListAdapter jpVar = new jp(this, 2130903136, arrayList, str3, this.f3202q);
                this.f3187b = (TextView) findViewById(2131558740);
                this.f3187b.setText(aba.m3763b(this.f3177E));
                this.f3189d.setAdapter(jpVar);
                this.f3188c = (TextView) findViewById(2131558781);
                this.f3188c.setText(this.f3203r + ": " + a);
                if (this.f3202q == 1) {
                    this.f3188c.setTextColor(co.f4429c);
                }
                if (this.f3202q == 2) {
                    this.f3188c.setTextColor(co.f4428b);
                    str = a.startsWith("(") ? a.replace("(", "").replace(")", "") : "-" + a;
                    this.f3188c.setText(this.f3203r + ": " + str);
                    str2 = str;
                } else {
                    str2 = a;
                }
            } catch (Exception e) {
                exception = e;
                str2 = a;
                exception.printStackTrace();
                str = str2;
                button = (Button) findViewById(2131558785);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new rv(this, str, arrayList));
            }
            try {
                if (this.f3202q == 0) {
                    if (str2.startsWith("(")) {
                        this.f3188c.setTextColor(co.f4428b);
                    } else {
                        this.f3188c.setTextColor(co.f4429c);
                    }
                }
                str = str2;
            } catch (Exception e2) {
                exception = e2;
                exception.printStackTrace();
                str = str2;
                button = (Button) findViewById(2131558785);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new rv(this, str, arrayList));
            }
        } catch (Exception e3) {
            Exception exception2 = e3;
            str2 = str;
            exception = exception2;
            exception.printStackTrace();
            str = str2;
            button = (Button) findViewById(2131558785);
            aib.m3858a((Context) this, button, -1);
            button.setOnClickListener(new rv(this, str, arrayList));
        }
        button = (Button) findViewById(2131558785);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new rv(this, str, arrayList));
    }

    private void m3127d(String str) {
        this.f3199n.setVisibility(8);
        this.f3200o.setVisibility(0);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str2 = aba.m3771c(this.f3179G, this.f3183K, this.f3202q) + " and " + "category" + "='" + str + "'";
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
            str2 = str2 + " AND " + "subcategory" + "!='Account Transfer'";
        }
        if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer'";
        }
        aba.m3754a(this.f3207w, str2, arrayList, arrayList2, this.f3205u);
        this.f3200o.setAdapter(new C0446g(this, arrayList, 2130903099, new String[]{"subcategory", "subcategorySubTotal"}, new int[]{2131558423, 2131558421}, arrayList2, 2130903119, new String[]{"amount", "category", "expenseDate", "description", "property"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425}));
        this.f3200o.setOnChildClickListener(new sk(this, arrayList2));
    }

    private void m3128e() {
        if (this.f3204t == 1 || this.f3204t > 3) {
            ((RelativeLayout) findViewById(2131558788)).setBackgroundColor(-1725816286);
        }
        ImageView imageView = (ImageView) findViewById(2131558744);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558746);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new rx(this));
        imageView2.setOnClickListener(new ry(this));
        ((RadioButton) findViewById(2131558791)).setOnClickListener(new rz(this));
        ((RadioButton) findViewById(2131558792)).setOnClickListener(new sa(this));
        this.f3194i = (ListView) findViewById(2131558747);
        this.f3195j = (ExpandableListView) findViewById(2131558794);
        Drawable drawable = this.f3195j.getResources().getDrawable(17301522);
        this.f3195j.setDivider(drawable);
        this.f3195j.setChildDivider(drawable);
        if ((getResources().getConfiguration().screenLayout & 15) == 4) {
            this.f3195j.setGroupIndicator(getResources().getDrawable(2130837575));
            this.f3195j.setIndicatorBounds(10, 40);
        }
        this.f3194i.setOnItemClickListener(new sc(this));
        m3133f();
    }

    private void m3133f() {
        String b;
        String b2;
        Exception exception;
        Button button;
        if (this.f3196k != null) {
            this.f3196k.setVisibility(8);
        }
        List arrayList = new ArrayList();
        String str = "0";
        try {
            String str2;
            b = aba.m3764b(this.f3178F, this.f3183K, this.f3202q);
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
                b = b + " AND " + "subcategory" + "!='Account Transfer'";
            }
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
                b = b + " AND " + "category" + "!='Account Transfer'";
            }
            String str3 = "expenseDate";
            this.f3194i.setVisibility(0);
            this.f3195j.setVisibility(8);
            if (this.f3181I.equalsIgnoreCase("DATE_VIEW")) {
                str2 = "expenseDate";
                b2 = aba.m3766b(this.f3207w, b, arrayList, this.f3178F, this.f3205u);
            } else {
                str = aba.m3755a(this.f3207w, b, arrayList, this.f3205u);
                str2 = "category";
                b2 = str;
            }
            try {
                this.f3194i.setAdapter(new jp(this, 2130903136, arrayList, str2, this.f3202q));
                this.f3192g = (TextView) findViewById(2131558745);
                this.f3192g.setText(aba.m3776d(this.f3178F));
                this.f3193h = (TextView) findViewById(2131558789);
                this.f3193h.setText(this.f3203r + ": " + b2);
                if (this.f3202q == 1) {
                    this.f3193h.setTextColor(co.f4429c);
                }
                if (this.f3202q == 2) {
                    this.f3193h.setTextColor(co.f4428b);
                    str = b2.startsWith("(") ? b2.replace("(", "").replace(")", "") : "-" + b2;
                    this.f3193h.setText(this.f3203r + ": " + str);
                    b = str;
                } else {
                    b = b2;
                }
            } catch (Exception e) {
                exception = e;
                b = b2;
                exception.printStackTrace();
                str = b;
                button = (Button) findViewById(2131558793);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new se(this, str, arrayList));
            }
            try {
                if (this.f3202q == 0) {
                    if (b.startsWith("(")) {
                        this.f3193h.setTextColor(co.f4428b);
                    } else {
                        this.f3193h.setTextColor(co.f4429c);
                    }
                }
                str = b;
            } catch (Exception e2) {
                exception = e2;
                exception.printStackTrace();
                str = b;
                button = (Button) findViewById(2131558793);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new se(this, str, arrayList));
            }
        } catch (Exception e3) {
            Exception exception2 = e3;
            b = str;
            exception = exception2;
            exception.printStackTrace();
            str = b;
            button = (Button) findViewById(2131558793);
            aib.m3858a((Context) this, button, -1);
            button.setOnClickListener(new se(this, str, arrayList));
        }
        button = (Button) findViewById(2131558793);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new se(this, str, arrayList));
    }

    private void m3135g() {
        if (this.f3204t == 1 || this.f3204t > 3) {
            ((RelativeLayout) findViewById(2131558796)).setBackgroundColor(-1725816286);
        }
        ImageView imageView = (ImageView) findViewById(2131558749);
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837641));
        ImageView imageView2 = (ImageView) findViewById(2131558751);
        imageView2.setImageBitmap(BitmapFactory.decodeResource(getResources(), 2130837639));
        imageView.setOnClickListener(new sf(this));
        imageView2.setOnClickListener(new sg(this));
        ((RadioButton) findViewById(2131558799)).setOnClickListener(new sh(this));
        ((RadioButton) findViewById(2131558800)).setOnClickListener(new si(this));
        this.f3199n = (ListView) findViewById(2131558752);
        this.f3199n.setOnItemClickListener(new sj(this));
        this.f3200o = (ExpandableListView) findViewById(2131558802);
        Drawable drawable = this.f3200o.getResources().getDrawable(17301522);
        this.f3200o.setDivider(drawable);
        this.f3200o.setChildDivider(drawable);
        if ((getResources().getConfiguration().screenLayout & 15) == 4) {
            this.f3200o.setGroupIndicator(getResources().getDrawable(2130837575));
            this.f3200o.setIndicatorBounds(10, 40);
        }
        m3138h();
    }

    private void m3138h() {
        String c;
        Exception exception;
        Button button;
        if (this.f3201p != null) {
            this.f3201p.setVisibility(8);
        }
        String str = "0";
        List arrayList = new ArrayList();
        String str2;
        try {
            String str3;
            c = aba.m3771c(this.f3179G, this.f3183K, this.f3202q);
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 1) {
                c = c + " AND " + "subcategory" + "!='Account Transfer'";
            }
            if ("YES".equalsIgnoreCase(f3172s) && this.f3202q == 2) {
                c = c + " AND " + "category" + "!='Account Transfer'";
            }
            str2 = "expenseDate";
            this.f3199n.setVisibility(0);
            this.f3200o.setVisibility(8);
            if (this.f3182J.equalsIgnoreCase("DATE_VIEW")) {
                c = aba.m3753a(this.f3207w, c, arrayList, this.f3179G, this.f3184L, this.f3205u);
                try {
                    str3 = "expenseDate";
                } catch (Exception e) {
                    Exception exception2 = e;
                    str2 = c;
                    exception = exception2;
                    exception.printStackTrace();
                    c = str2;
                    button = (Button) findViewById(2131558801);
                    aib.m3858a((Context) this, button, -1);
                    button.setOnClickListener(new sl(this, c, arrayList));
                }
            }
            c = aba.m3755a(this.f3207w, c, arrayList, this.f3205u);
            str3 = "category";
            this.f3199n.setAdapter(new jp(this, 2130903136, arrayList, str3, this.f3202q));
            this.f3197l = (TextView) findViewById(2131558750);
            this.f3197l.setText(aba.m3779e(this.f3179G));
            this.f3198m = (TextView) findViewById(2131558797);
            this.f3198m.setText(this.f3203r + ": " + c);
            if (this.f3202q == 1) {
                this.f3198m.setTextColor(co.f4429c);
            }
            if (this.f3202q == 2) {
                this.f3198m.setTextColor(co.f4428b);
                c = c.startsWith("(") ? c.replace("(", "").replace(")", "") : "-" + c;
                this.f3198m.setText(this.f3203r + ": " + c);
            }
            str2 = c;
            try {
                if (this.f3202q == 0) {
                    if (str2.startsWith("(")) {
                        this.f3198m.setTextColor(co.f4428b);
                    } else {
                        this.f3198m.setTextColor(co.f4429c);
                    }
                }
                c = str2;
            } catch (Exception e2) {
                exception = e2;
                exception.printStackTrace();
                c = str2;
                button = (Button) findViewById(2131558801);
                aib.m3858a((Context) this, button, -1);
                button.setOnClickListener(new sl(this, c, arrayList));
            }
        } catch (Exception e3) {
            exception = e3;
            str2 = str;
            exception.printStackTrace();
            c = str2;
            button = (Button) findViewById(2131558801);
            aib.m3858a((Context) this, button, -1);
            button.setOnClickListener(new sl(this, c, arrayList));
        }
        button = (Button) findViewById(2131558801);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new sl(this, c, arrayList));
    }

    private void m3140i() {
        String str;
        StringBuffer append = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(new StringBuffer("<html><head><title>").append(getResources().getString(2131099725) + "</title></head>").append("<body><p><b>" + getResources().getString(2131099678) + ": " + this.f3183K + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, getResources().getString(2131099794), 0, "10%", "BLACK", "left"), true, getResources().getString(2131099723), 0, "10%", "BLACK", "left"), true, getResources().getString(2131100007), 0, "12%", "BLACK", "left"), true, getResources().getString(2131100011), 0, "10%", "BLACK", "left"), true, getResources().getString(2131099755), 0, "20%", "BLACK", "left"), true, getResources().getString(2131100039), 0, "12%", "BLACK", "left"), true, getResources().getString(2131100101), 0, "8%", "BLACK", "left"), true, getResources().getString(2131099813), 0, "20%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str2 = "#FFFFFF";
        int i = 0;
        double d = 0.0d;
        StringBuffer stringBuffer = append;
        while (i < this.f3186a.getCount()) {
            Map map = (Map) this.f3186a.getItemAtPosition(i);
            stringBuffer = stringBuffer.append("<tr bgcolor=" + ((i / 2) * 2 == i ? "#FCF6CF" : "#FFFFFF") + " align=center>");
            str = (String) map.get("amount");
            String replace = !((String) map.get("category")).toUpperCase().startsWith("INCOME") ? str.startsWith("(") ? str.replace("(", "").replace(")", "").replace("-", "") : "-" + str : str;
            int i2 = 0;
            i2 = 0;
            stringBuffer = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(stringBuffer, false, this.f3208x.getText().toString(), 0, "10%", "BLACK", "left"), false, replace + "&nbsp;&nbsp;&nbsp;", 0, "10%", ((String) map.get("category")).toUpperCase().startsWith("INCOME") ? "GREEN" : "RED", "right"), false, (String) map.get("property"), 0, "12%", "BLACK", "left"), false, (String) map.get("paymentMethod"), 0, "10%", "BLACK", "left"), false, (String) map.get("category"), 0, "20%", "BLACK", "left"), false, (String) map.get("referenceNumber"), 0, "12%", "BLACK", "left"), false, (String) map.get("status"), i2, "8%", "BLACK", "left"), false, (String) map.get("description"), i2, "20%", "BLACK", "left").append("</tr>");
            i++;
            d = aba.m3742a(d, replace);
        }
        stringBuffer = stringBuffer.append("</table>");
        str = "GREEN";
        String a = aba.m3746a(d);
        append = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(stringBuffer.append("<table bgcolor=#A4D1FF cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, "Total", 0, "10%", "BLACK", "center"), true, a + "&nbsp;&nbsp;&nbsp;", 0, "10%", a.trim().startsWith("(") ? "RED" : str, "right"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "20%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "20%", "BLACK", "center").append("</tr></table></body></html>");
        str2 = getResources().getString(2131099725) + ".html";
        if (ExpenseExport.m3164a(co.f4430d, str2, append.toString())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str2);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str2)));
            this.f3175C.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }

    public String m3158a(String str) {
        Locale locale = Locale.US;
        String displayLanguage = getResources().getConfiguration().locale.getDisplayLanguage(Locale.US);
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
            str = new SimpleDateFormat("EEE, " + ExpenseManager.f3244t, locale).format(new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).parse(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3183K = extras.getString("account");
            }
        }
        setTitle(this.f3183K);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    this.f3206v.setCurrentTab(0);
                    m3113b();
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (-1 == i2) {
                    this.f3206v.setCurrentTab(0);
                    m3113b();
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f3204t = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        this.f3176D = getIntent().getLongExtra("date", 0);
        this.f3202q = getIntent().getIntExtra("typeId", 2);
        this.f3183K = getIntent().getStringExtra("account");
        CharSequence charSequence = "";
        if (this.f3202q == 0) {
            charSequence = getResources().getString(2131099736) + ": " + this.f3183K;
            this.f3203r = getResources().getString(2131099736);
        }
        if (this.f3202q == 1) {
            charSequence = getResources().getString(2131099932) + ": " + this.f3183K;
            this.f3203r = getResources().getString(2131099932);
        }
        if (this.f3202q == 2) {
            charSequence = getResources().getString(2131099882) + ": " + this.f3183K;
            this.f3203r = getResources().getString(2131099882);
        }
        int intExtra = getIntent().getIntExtra("tabId", 0);
        setTitle(charSequence);
        this.f3207w = new ro(this);
        Object arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3175C, this.f3207w, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        if (arrayList.size() > 1) {
            arrayList.add("All");
        }
        int indexOf = arrayList.indexOf(this.f3183K);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener rqVar = new rq(this, arrayList);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, rqVar);
        getActionBar().setSelectedNavigationItem(indexOf);
        String[] split = getResources().getString(2131099964).split(",");
        if (split != null && split.length == 12) {
            this.f3184L = split;
        }
        Calendar instance = Calendar.getInstance();
        if (this.f3176D != 0) {
            instance.setTimeInMillis(this.f3176D);
        }
        this.f3210z = instance.get(1);
        this.f3173A = instance.get(2);
        this.f3174B = instance.get(5);
        this.f3206v = getTabHost();
        LayoutInflater.from(this).inflate(2130903097, this.f3206v.getTabContentView(), true);
        this.f3206v.addTab(this.f3206v.newTabSpec("tab1").setIndicator(getResources().getString(2131099791)).setContent(2131558734));
        this.f3206v.addTab(this.f3206v.newTabSpec("tab2").setIndicator(getResources().getString(2131100165)).setContent(2131558738));
        this.f3206v.addTab(this.f3206v.newTabSpec("tab3").setIndicator(getResources().getString(2131099956)).setContent(2131558743));
        this.f3206v.addTab(this.f3206v.newTabSpec("tab4").setIndicator(getResources().getString(2131100179)).setContent(2131558748));
        this.f3206v.setCurrentTab(intExtra);
        for (intExtra = 0; intExtra < 4; intExtra++) {
            View childTabViewAt = this.f3206v.getTabWidget().getChildTabViewAt(intExtra);
            childTabViewAt.setPadding(0, 0, 0, 0);
            TextView textView = (TextView) childTabViewAt.findViewById(16908310);
            textView.setSingleLine();
            if ((getResources().getConfiguration().screenLayout & 15) == 4 || (getResources().getConfiguration().screenLayout & 15) == 3) {
                textView.setTextSize(18.0f);
            } else {
                textView.setTextSize(14.0f);
            }
        }
        f3172s = abd.m3786a(this.f3175C, this.f3207w, "excludeTransfer", "NO");
        this.f3206v.setOnTabChangedListener(new sb(this));
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                try {
                    return new DatePickerDialog(this, this.f3185M, this.f3210z, this.f3173A, this.f3174B);
                } catch (Exception e) {
                    Calendar instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3185M, instance.get(1), instance.get(2), instance.get(5));
                }
            default:
                return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492872, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3175C, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3183K);
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                dispatchKeyEvent(new KeyEvent(0, 4));
                return true;
            case 2131558484:
                this.f3202q = 0;
                setTitle(getResources().getString(2131099736) + ": " + this.f3183K);
                this.f3203r = getResources().getString(2131099736);
                switch (this.f3206v.getCurrentTab()) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        m3113b();
                        return true;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        m3119c();
                        return true;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        m3128e();
                        return true;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        m3135g();
                        return true;
                    default:
                        return true;
                }
            case 2131558636:
                this.f3202q = 1;
                setTitle(getResources().getString(2131099932) + ": " + this.f3183K);
                this.f3203r = getResources().getString(2131099932);
                switch (this.f3206v.getCurrentTab()) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        m3113b();
                        return true;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        m3119c();
                        return true;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        m3128e();
                        return true;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        m3135g();
                        return true;
                    default:
                        return true;
                }
            case 2131559160:
                this.f3202q = 2;
                setTitle(getResources().getString(2131099882) + ": " + this.f3183K);
                this.f3203r = getResources().getString(2131099882);
                switch (this.f3206v.getCurrentTab()) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        m3113b();
                        return true;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        m3119c();
                        return true;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        m3128e();
                        return true;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        m3135g();
                        return true;
                    default:
                        return true;
                }
            case 2131559161:
                switch (this.f3206v.getCurrentTab()) {
                    case C0607c.AdsAttrs_adSize /*0*/:
                        m3140i();
                        return true;
                    case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                        m3109a(this.f3189d, this.f3187b.getText().toString(), this.f3188c.getText().toString(), this.f3180H);
                        return true;
                    case C0607c.LoadingImageView_circleCrop /*2*/:
                        m3109a(this.f3194i, this.f3192g.getText().toString(), this.f3193h.getText().toString(), this.f3181I);
                        return true;
                    case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                        m3109a(this.f3199n, this.f3197l.getText().toString(), this.f3198m.getText().toString(), this.f3182J);
                        return true;
                    default:
                        return true;
                }
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3210z, this.f3173A, this.f3174B);
            default:
        }
    }
}
