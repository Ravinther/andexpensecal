package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0037o;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.viewpagerindicator.TabPageIndicator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CreditCardList extends C0037o {
    public static String f2614n;
    static TabPageIndicator f2615o;
    static String f2616p;
    private static ro f2617s;
    private static int f2618t;
    private static ViewPager f2619u;
    private static cw f2620v;
    private static ArrayList<String> f2621w;
    private Context f2622q;
    private String f2623r;

    static {
        f2614n = null;
        f2618t = 1;
        f2621w = new ArrayList();
        f2616p = "NO";
    }

    public CreditCardList() {
        this.f2622q = this;
        this.f2623r = "";
    }

    public static void m2532a(ro roVar, String str, List<Map<String, Object>> list, String str2, String str3) {
        int intValue;
        int i;
        Object obj;
        Cursor a;
        Map hashMap;
        Map hashMap2;
        List arrayList;
        Object string;
        String format;
        Exception e;
        int i2;
        HashMap hashMap3;
        String a2;
        String a3;
        String str4;
        int i3 = 1;
        String str5 = "";
        if (!(str3 == null || "".equals(str3))) {
            String[] split = str3.split(",");
            if (split.length > 0) {
                str5 = split[0];
            }
            if (split.length > 1) {
                i3 = Integer.valueOf(split[1]).intValue();
            }
            if (split.length > 2) {
                intValue = Integer.valueOf(split[2]).intValue();
                i = i3;
                obj = str5;
                roVar.m4193a();
                a = roVar.m4192a(str, str2);
                hashMap = new HashMap();
                hashMap2 = new HashMap();
                arrayList = new ArrayList();
                str5 = "";
                if (a == null && a.moveToFirst()) {
                    int columnIndex = a.getColumnIndex("account");
                    int columnIndex2 = a.getColumnIndex("amount");
                    int columnIndex3 = a.getColumnIndex("expensed");
                    int columnIndex4 = a.getColumnIndex("category");
                    do {
                        string = a.getString(columnIndex);
                        String string2 = a.getString(columnIndex2);
                        long j = a.getLong(columnIndex3);
                        String string3 = a.getString(columnIndex4);
                        Calendar instance = Calendar.getInstance();
                        if (j != 0) {
                            instance.setTimeInMillis(j);
                        }
                        i3 = instance.get(2);
                        int i4 = instance.get(1);
                        if (instance.get(5) < i) {
                            i3--;
                            if (i3 < 0) {
                                i3 += 12;
                                i4--;
                            }
                        }
                        String str6 = i4 + "-" + (i3 + 2) + "-" + i;
                        str5 = i4 + "-" + (i3 + 1) + "-" + i;
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                            Date parse = simpleDateFormat.parse(str6);
                            Calendar instance2 = Calendar.getInstance();
                            instance2.setTime(parse);
                            instance2.add(5, -1);
                            format = simpleDateFormat.format(instance2.getTime());
                            try {
                                str5 = simpleDateFormat.format(simpleDateFormat.parse(str5));
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                                format = str5 + " - " + format;
                                if (!arrayList.contains(format)) {
                                    arrayList.add(format);
                                }
                                if ("Income".equalsIgnoreCase(string3)) {
                                    if (hashMap2.get(format) == null) {
                                        hashMap2.put(format, aib.m3865b(string2));
                                    } else {
                                        hashMap2.put(format, "" + aba.m3743a((String) hashMap2.get(format), string2));
                                    }
                                } else if (hashMap.get(format) == null) {
                                    hashMap.put(format, aib.m3865b(string2));
                                } else {
                                    hashMap.put(format, "" + aba.m3743a((String) hashMap.get(format), string2));
                                }
                                if (!a.moveToNext()) {
                                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                                        hashMap3 = new HashMap();
                                        str5 = (String) arrayList.get(i2);
                                        a2 = aba.m3756a((String) hashMap.get(str5));
                                        a3 = aba.m3756a((String) hashMap2.get(str5));
                                        format = "".equals(a2) ? a2 : "0";
                                        a2 = "".equals(a3) ? a3 : "0";
                                        hashMap3.put("date", str5);
                                        hashMap3.put("account", string);
                                        hashMap3.put("expense", aba.m3767b(format));
                                        hashMap3.put("income", aba.m3767b(a2));
                                        hashMap3.put("subTotal", aba.m3746a(aba.m3742a(aib.m3877i(a2), "-" + format)));
                                        hashMap3.put("startingDateOfMonth", Integer.valueOf(i));
                                        hashMap3.put("paymentDueDate", "" + intValue);
                                        hashMap3.put("creditLimit", obj);
                                        list.add(hashMap3);
                                    }
                                    if (a != null) {
                                        a.close();
                                    }
                                    roVar.m4201b();
                                }
                            }
                        } catch (Exception e3) {
                            Exception exception = e3;
                            format = str6;
                            e = exception;
                            e.printStackTrace();
                            format = str5 + " - " + format;
                            if (arrayList.contains(format)) {
                                arrayList.add(format);
                            }
                            if ("Income".equalsIgnoreCase(string3)) {
                                if (hashMap.get(format) == null) {
                                    hashMap.put(format, "" + aba.m3743a((String) hashMap.get(format), string2));
                                } else {
                                    hashMap.put(format, aib.m3865b(string2));
                                }
                            } else if (hashMap2.get(format) == null) {
                                hashMap2.put(format, "" + aba.m3743a((String) hashMap2.get(format), string2));
                            } else {
                                hashMap2.put(format, aib.m3865b(string2));
                            }
                            if (a.moveToNext()) {
                                for (i2 = 0; i2 < arrayList.size(); i2++) {
                                    hashMap3 = new HashMap();
                                    str5 = (String) arrayList.get(i2);
                                    a2 = aba.m3756a((String) hashMap.get(str5));
                                    a3 = aba.m3756a((String) hashMap2.get(str5));
                                    if ("".equals(a2)) {
                                    }
                                    if ("".equals(a3)) {
                                    }
                                    hashMap3.put("date", str5);
                                    hashMap3.put("account", string);
                                    hashMap3.put("expense", aba.m3767b(format));
                                    hashMap3.put("income", aba.m3767b(a2));
                                    hashMap3.put("subTotal", aba.m3746a(aba.m3742a(aib.m3877i(a2), "-" + format)));
                                    hashMap3.put("startingDateOfMonth", Integer.valueOf(i));
                                    hashMap3.put("paymentDueDate", "" + intValue);
                                    hashMap3.put("creditLimit", obj);
                                    list.add(hashMap3);
                                }
                                if (a != null) {
                                    a.close();
                                }
                                roVar.m4201b();
                            }
                        }
                        format = str5 + " - " + format;
                        if (arrayList.contains(format)) {
                            arrayList.add(format);
                        }
                        if ("Income".equalsIgnoreCase(string3)) {
                            if (hashMap2.get(format) == null) {
                                hashMap2.put(format, aib.m3865b(string2));
                            } else {
                                hashMap2.put(format, "" + aba.m3743a((String) hashMap2.get(format), string2));
                            }
                        } else if (hashMap.get(format) == null) {
                            hashMap.put(format, aib.m3865b(string2));
                        } else {
                            hashMap.put(format, "" + aba.m3743a((String) hashMap.get(format), string2));
                        }
                    } while (a.moveToNext());
                } else {
                    str4 = str5;
                }
                for (i2 = 0; i2 < arrayList.size(); i2++) {
                    hashMap3 = new HashMap();
                    str5 = (String) arrayList.get(i2);
                    a2 = aba.m3756a((String) hashMap.get(str5));
                    a3 = aba.m3756a((String) hashMap2.get(str5));
                    if ("".equals(a2)) {
                    }
                    if ("".equals(a3)) {
                    }
                    hashMap3.put("date", str5);
                    hashMap3.put("account", string);
                    hashMap3.put("expense", aba.m3767b(format));
                    hashMap3.put("income", aba.m3767b(a2));
                    hashMap3.put("subTotal", aba.m3746a(aba.m3742a(aib.m3877i(a2), "-" + format)));
                    hashMap3.put("startingDateOfMonth", Integer.valueOf(i));
                    hashMap3.put("paymentDueDate", "" + intValue);
                    hashMap3.put("creditLimit", obj);
                    list.add(hashMap3);
                }
                if (a != null) {
                    a.close();
                }
                roVar.m4201b();
            }
        }
        intValue = 28;
        i = i3;
        String str7 = str5;
        roVar.m4193a();
        a = roVar.m4192a(str, str2);
        hashMap = new HashMap();
        hashMap2 = new HashMap();
        arrayList = new ArrayList();
        str5 = "";
        if (a == null) {
        }
        str4 = str5;
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            hashMap3 = new HashMap();
            str5 = (String) arrayList.get(i2);
            a2 = aba.m3756a((String) hashMap.get(str5));
            a3 = aba.m3756a((String) hashMap2.get(str5));
            if ("".equals(a2)) {
            }
            if ("".equals(a3)) {
            }
            hashMap3.put("date", str5);
            hashMap3.put("account", string);
            hashMap3.put("expense", aba.m3767b(format));
            hashMap3.put("income", aba.m3767b(a2));
            hashMap3.put("subTotal", aba.m3746a(aba.m3742a(aib.m3877i(a2), "-" + format)));
            hashMap3.put("startingDateOfMonth", Integer.valueOf(i));
            hashMap3.put("paymentDueDate", "" + intValue);
            hashMap3.put("creditLimit", obj);
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    private void m2536j() {
        f2614n = abd.m3786a(this.f2622q, f2617s, "CREDIT_CARD_ACCOUNT", null);
        if (f2614n == null || "".equals(f2614n)) {
            Toast.makeText(this, 2131099978, 1).show();
            return;
        }
        String a = abd.m3786a(this.f2622q, f2617s, "MY_ACCOUNT_NAMES", null);
        if (a != null && !"".equals(a)) {
            ArrayList j = aib.m3878j(a);
            ArrayList j2 = aib.m3878j(f2614n);
            f2621w = new ArrayList();
            for (int i = 0; i < j.size(); i++) {
                if (j2.contains(j.get(i))) {
                    f2621w.add(j.get(i));
                }
            }
            setContentView(2130903123);
            f2618t = f2621w.size();
            f2620v = new cw(m366f());
            f2619u = (ViewPager) findViewById(2131558656);
            f2619u.setAdapter(f2620v);
            f2615o = (TabPageIndicator) findViewById(2131558655);
            f2615o.setViewPager(f2619u);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2623r = extras.getString("account");
                if (extras.getString("toAccount") != null) {
                    this.f2623r = extras.getString("toAccount");
                }
            }
        }
        if (i == 0) {
            try {
                finish();
                startActivity(new Intent(this, CreditCardList.class));
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        f2614n = abd.m3786a(this.f2622q, f2617s, "CREDIT_CARD_ACCOUNT", null);
        String a = abd.m3786a(this.f2622q, f2617s, "MY_ACCOUNT_NAMES", null);
        if (a != null && !"".equals(a)) {
            ArrayList j = aib.m3878j(a);
            ArrayList j2 = aib.m3878j(f2614n);
            if (j2 == null || j2.size() == 0) {
                f2621w = new ArrayList();
            } else {
                f2621w = new ArrayList();
                for (int i3 = 0; i3 < j.size(); i3++) {
                    if (j2.contains(j.get(i3))) {
                        f2621w.add(j.get(i3));
                    }
                }
            }
            f2618t = f2621w.size();
            f2620v.m145c();
            f2615o.m7177a();
            if (this.f2623r == null) {
                f2615o.setCurrentItem(0);
            } else {
                f2615o.setCurrentItem(f2621w.indexOf(this.f2623r));
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            setTheme(2131230730);
        }
        abd.m3802a((Activity) this, true);
        setTitle(2131099777);
        f2617s = new ro(this);
        m2536j();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131099860).setIcon(2130837596).setShowAsAction(2);
        menu.add(0, 1, 0, 2131100161).setIcon(2130837611).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        Intent intent;
        if (itemId == 0) {
            Bundle bundle = new Bundle();
            intent = new Intent();
            if (f2621w.size() > 0) {
                bundle.putString("account", (String) f2621w.get(f2619u.getCurrentItem()));
            }
            intent.putExtras(bundle);
            intent.setClass(this.f2622q, CreditCardAccountEditList.class);
            startActivityForResult(intent, 0);
        } else if (itemId == 1) {
            if (f2621w.size() == 0 || f2619u == null || f2619u.getChildCount() == 0) {
                Toast.makeText(this, 2131099978, 1).show();
                return false;
            }
            Bundle bundle2 = new Bundle();
            intent = new Intent();
            if (f2621w.size() > 0) {
                bundle2.putString("account", (String) f2621w.get(f2619u.getCurrentItem()));
            }
            intent.putExtras(bundle2);
            intent.setClass(this.f2622q, ExpenseAccountActivities.class);
            startActivityForResult(intent, 1);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
