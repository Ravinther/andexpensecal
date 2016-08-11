package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMSMain extends Activity {
    Context f3579a;
    ArrayList<String> f3580b;
    private ro f3581c;

    public SMSMain() {
        this.f3579a = this;
        this.f3580b = new ArrayList();
    }

    public static int m3540a(Context context, ro roVar, String str, boolean z) {
        int i = 0;
        Map a = m3545a(context, roVar, str);
        String str2 = (String) a.get("fromDate");
        long parseLong = (str2 == null || "".equals(str2) || z) ? -1 : Long.parseLong(str2);
        Map a2 = m3545a(context, roVar, str + "_1");
        Map a3 = m3545a(context, roVar, str + "_2");
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 4);
        if (sharedPreferences.getLong("SMS_TIME" + str, -1) > 0 && !z) {
            parseLong = sharedPreferences.getLong("SMS_TIME" + str, -1);
        }
        List a4 = m3544a(context, str, parseLong);
        int i2 = 0;
        while (i2 < a4.size()) {
            int i3;
            try {
                Map map = (Map) a4.get(i2);
                Map a5 = m3546a((String) a.get("body"), (String) map.get("body"));
                map.put("account", a.get("account"));
                map.put("category", a.get("category"));
                map.put("paymentMethod", a.get("paymentMethod"));
                map.put("status", a.get("status"));
                map.put("referenceNumber", a.get("referenceNumber"));
                map.put("tag", str);
                if ((a5 == null || a5.size() == 0 || a5.get("amount") == null || "".equals(a5.get("amount"))) && a2 != null && a2.size() > 0) {
                    a5 = m3546a((String) a2.get("body"), (String) map.get("body"));
                    map.put("account", a2.get("account"));
                    map.put("category", a2.get("category"));
                    map.put("paymentMethod", a2.get("paymentMethod"));
                    map.put("status", a2.get("status"));
                    map.put("referenceNumber", a2.get("referenceNumber"));
                    map.put("tag", str + "_1");
                }
                if ((a5 == null || a5.size() == 0 || a5.get("amount") == null || "".equals(a5.get("amount"))) && a3 != null && a3.size() > 0) {
                    a5 = m3546a((String) a3.get("body"), (String) map.get("body"));
                    map.put("account", a3.get("account"));
                    map.put("category", a3.get("category"));
                    map.put("paymentMethod", a3.get("paymentMethod"));
                    map.put("status", a3.get("status"));
                    map.put("referenceNumber", a3.get("referenceNumber"));
                    map.put("tag", str + "_2");
                }
                Map map2 = a5;
                if (map2 == null || map2.size() == 0 || map2.get("amount") == null || "".equals(map2.get("amount"))) {
                    i3 = i;
                    i2++;
                    i = i3;
                } else {
                    List a6 = abd.m3798a(roVar, "account='" + ((String) a.get("account")) + "' and (" + "expensed" + "='" + ((String) map.get("date")) + "' or " + "description" + "='" + ((String) map.get("body")).replaceAll("'", "") + "')", "expensed");
                    if (a6 == null || a6.size() <= 0) {
                        map.put("amount", map2.get("amount"));
                        map.put("property", map2.get("payee"));
                        if (m3541a(context, roVar, map) != -1) {
                            i++;
                        }
                        i3 = i;
                        i2++;
                        i = i3;
                    } else {
                        i3 = i;
                        i2++;
                        i = i3;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                i3 = i;
            }
        }
        if (i > 0) {
            abd.m3805a(context, true);
            Editor edit = sharedPreferences.edit();
            edit.putLong("SMS_TIME" + str, System.currentTimeMillis());
            edit.commit();
        }
        return i;
    }

    public static int m3541a(Context context, ro roVar, Map<String, String> map) {
        String str = (String) map.get("account");
        String str2 = (String) map.get("amount");
        String replaceAll = str2 != null ? str2.replaceAll(",", "") : str2;
        try {
            Double.valueOf(replaceAll);
            roVar.m4193a();
            try {
                String[] split = ((String) map.get("category")).split(":");
                String str3 = split[0];
                String str4 = "";
                if (split.length > 1) {
                    str4 = split[1];
                }
                ro roVar2 = roVar;
                roVar.m4185a("expense_report", roVar2.m4190a(str, replaceAll, str3, str4, (String) map.get("paymentMethod"), ((String) map.get("body")).replaceAll("'", ""), (String) map.get("referenceNumber"), (String) map.get("property"), (String) map.get("status"), "", "SMS," + ((String) map.get("tag")), "", "", "", "", Long.valueOf(Long.parseLong((String) map.get("date"))).longValue(), Long.valueOf(System.currentTimeMillis()).longValue()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            roVar.m4201b();
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static List<String> m3543a(Context context, String str) {
        Exception e;
        Throwable th;
        Uri parse = Uri.parse("content://sms/inbox");
        List<String> arrayList = new ArrayList();
        Cursor query;
        try {
            query = context.getContentResolver().query(parse, null, "address='" + str + "'", null, null);
            if (query == null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        if (query != null) {
                            query.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            }
            for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
                String str2 = query.getString(query.getColumnIndexOrThrow("body")).toString();
                if (query.getString(query.getColumnIndexOrThrow("address")).toString().equalsIgnoreCase(str)) {
                    arrayList.add(str2);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
            e.printStackTrace();
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    public static List<Map<String, String>> m3544a(Context context, String str, long j) {
        Exception e;
        Throwable th;
        Uri parse = Uri.parse("content://sms/inbox");
        List<Map<String, String>> arrayList = new ArrayList();
        Cursor query;
        try {
            String str2 = "address='" + str + "'";
            if (j > 0) {
                str2 = str2 + " AND date>=" + j;
            }
            query = context.getContentResolver().query(parse, null, str2, null, null);
            if (query == null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        if (query != null) {
                            query.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            }
            for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
                String string = query.getString(query.getColumnIndexOrThrow("body"));
                String string2 = query.getString(query.getColumnIndexOrThrow("address"));
                str2 = query.getString(query.getColumnIndexOrThrow("date"));
                String string3 = query.getString(query.getColumnIndexOrThrow("type"));
                if (string2 != null) {
                    Map hashMap = new HashMap();
                    hashMap.put("sender_no", string2);
                    hashMap.put("body", string);
                    hashMap.put("date", str2);
                    hashMap.put("type", string3);
                    arrayList.add(hashMap);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
            e.printStackTrace();
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    public static Map<String, String> m3545a(Context context, ro roVar, String str) {
        Map<String, String> hashMap = new HashMap();
        String a = abd.m3786a(context, roVar, "SMS_" + str, "");
        if (!(a == null || "".equals(a))) {
            String[] split = a.split("\\|");
            hashMap.put("account", split[0]);
            hashMap.put("category", split[1]);
            hashMap.put("paymentMethod", split[2]);
            hashMap.put("status", split[3]);
            hashMap.put("referenceNumber", split[4]);
            hashMap.put("tag", str);
            hashMap.put("body", split[5]);
            if (split.length > 6) {
                hashMap.put("fromDate", split[6]);
            }
        }
        return hashMap;
    }

    public static Map<String, String> m3546a(String str, String str2) {
        String str3;
        CharSequence replaceAll = str2.replaceAll("\\[\\[", "").replaceAll("\\]\\]", "");
        List arrayList = new ArrayList();
        Map<String, String> hashMap = new HashMap();
        Matcher matcher = Pattern.compile("\\[\\[(.*?)\\]\\]").matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        String str4 = "";
        String str5 = "";
        if (arrayList.size() > 1) {
            str3 = ((String) arrayList.get(0)) + "(.*?)" + ((String) arrayList.get(1));
            if ("".equals(arrayList.get(1))) {
                str3 = ((String) arrayList.get(0)) + "(.*?)$";
            }
            if (".".equals(arrayList.get(1))) {
                str3 = ((String) arrayList.get(0)) + "(.*?)\\.";
            }
            matcher = Pattern.compile(str3).matcher(replaceAll);
            if (matcher.find()) {
                str3 = matcher.group(1);
                str4 = str3 != null ? str3.trim() : str3;
            }
        }
        if (arrayList.size() > 3) {
            str3 = ((String) arrayList.get(2)) + "(.*?)" + ((String) arrayList.get(3));
            if ("".equals(arrayList.get(3))) {
                str3 = ((String) arrayList.get(2)) + "(.*?)$";
            }
            if (".".equals(arrayList.get(3))) {
                str3 = ((String) arrayList.get(2)) + "(.*?)\\.";
            }
            if ("".equals(arrayList.get(2))) {
                str3 = ((String) arrayList.get(1)) + "(.*?)" + ((String) arrayList.get(3));
            }
            matcher = Pattern.compile(str3).matcher(replaceAll);
            if (matcher.find()) {
                str3 = matcher.group(1);
                if (str3 != null) {
                    str3 = str3.trim();
                }
                if (m3549a(str4)) {
                    hashMap.put("amount", m3550b(str4));
                    hashMap.put("payee", str3);
                } else if (!"".equals(m3550b(str4))) {
                    hashMap.put("amount", m3550b(str4));
                    hashMap.put("payee", str3);
                } else if (m3549a(str3)) {
                    hashMap.put("amount", m3550b(str3));
                    hashMap.put("payee", str4);
                } else if (!"".equals(m3550b(str3))) {
                    hashMap.put("amount", m3550b(str3));
                    hashMap.put("payee", str4);
                }
                return hashMap;
            }
        }
        str3 = str5;
        if (m3549a(str4)) {
            hashMap.put("amount", m3550b(str4));
            hashMap.put("payee", str3);
        } else if (!"".equals(m3550b(str4))) {
            hashMap.put("amount", m3550b(str4));
            hashMap.put("payee", str3);
        } else if (m3549a(str3)) {
            hashMap.put("amount", m3550b(str3));
            hashMap.put("payee", str4);
        } else if ("".equals(m3550b(str3))) {
            hashMap.put("amount", m3550b(str3));
            hashMap.put("payee", str4);
        }
        return hashMap;
    }

    private void m3547a() {
        List b = m3551b();
        String[] strArr = (String[]) b.toArray(new String[b.size()]);
        Builder builder = new Builder(this);
        builder.setTitle(2131100092);
        builder.setItems(strArr, new afa(this, b));
        builder.show();
    }

    public static void m3548a(Context context, ro roVar) {
        String a = abd.m3786a(context, roVar, "SMS_SENDER", "");
        if (!"".equals(a)) {
            String[] split = a.split(",");
            ArrayList arrayList = new ArrayList();
            for (String replace : split) {
                String replace2 = replace2.replace("_1", "").replace("_2", "");
                if (!arrayList.contains(replace2)) {
                    arrayList.add(replace2);
                    m3540a(context, roVar, replace2, false);
                }
            }
        }
    }

    public static boolean m3549a(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        String trim = str.trim().replaceAll("\u00a0", "").replace(Currency.getInstance(Locale.getDefault()).getSymbol(Locale.getDefault()), "").replace("$", "").trim();
        trim = (trim.matches(".+\\.\\d+,\\d+$") || trim.matches(".+\\d+,\\d+$")) ? trim.replaceAll("\\.", "").replaceAll(",", ".") : trim.replaceAll(",", "");
        try {
            Double.parseDouble(trim);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String m3550b(String str) {
        if ("".equals(str)) {
            return str;
        }
        try {
            String replace = str.trim().replaceAll("\u00a0", "").replace(Currency.getInstance(Locale.getDefault()).getSymbol(Locale.getDefault()), "");
            replace = (replace.matches(".+\\.\\d+,\\d+$") || replace.matches(".+\\d+,\\d+$")) ? replace.replaceAll("\\.", "").replaceAll(",", ".") : replace.replaceAll(",", "");
            return replace.replace("$", "").trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private List<String> m3551b() {
        Exception e;
        Throwable th;
        Uri parse = Uri.parse("content://sms/inbox");
        List<String> arrayList = new ArrayList();
        Cursor query;
        try {
            query = getContentResolver().query(parse, null, null, null, null);
            if (query == null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    try {
                        e.printStackTrace();
                        if (query != null) {
                            query.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            }
            for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
                String string = query.getString(query.getColumnIndexOrThrow("address"));
                if (!arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e3) {
            e = e3;
            query = null;
            e.printStackTrace();
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    onCreate(null);
                }
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle("SMS");
        setContentView(2130903153);
        this.f3581c = new ro(this);
        this.f3580b = new ArrayList();
        String a = abd.m3786a(this.f3579a, this.f3581c, "SMS_SENDER", "");
        if (!"".equals(a)) {
            this.f3580b = new ArrayList(Arrays.asList(a.split(",")));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        CheckBox checkBox = (CheckBox) findViewById(2131558997);
        checkBox.setChecked(sharedPreferences.getBoolean("SMS_AUTO", false));
        if (this.f3580b.size() == 0) {
            checkBox.setVisibility(8);
        } else {
            checkBox.setVisibility(0);
        }
        checkBox.setOnClickListener(new aez(this, sharedPreferences, checkBox));
        ((ListView) findViewById(16908298)).setAdapter(new afb(this, this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492885, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559115) {
            m3547a();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
