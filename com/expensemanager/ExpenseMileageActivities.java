package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ExpenseMileageActivities extends Activity {
    static int f3257a;
    private static String f3258i;
    private static String f3259j;
    private static String f3260k;
    private ro f3261b;
    private String f3262c;
    private Context f3263d;
    private String f3264e;
    private String f3265f;
    private ListView f3266g;
    private List<Map<String, Object>> f3267h;

    static {
        f3257a = 0;
        f3258i = "expensed ASC";
        f3259j = "USD";
        f3260k = "mi";
    }

    public ExpenseMileageActivities() {
        this.f3262c = "Personal Expense";
        this.f3263d = this;
        this.f3264e = "";
        this.f3265f = "";
    }

    public static String m3211a(Context context, ro roVar, String str, List<Map<String, Object>> list, String str2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer(context.getResources().getString(2131099794) + "," + context.getResources().getString(2131099910) + "," + context.getResources().getString(2131100130) + "," + context.getResources().getString(2131100064) + "/" + context.getResources().getString(2131099988) + "," + context.getResources().getString(2131100099) + "," + context.getResources().getString(2131099871) + "," + context.getResources().getString(2131099950) + "," + context.getResources().getString(2131099723) + "," + context.getResources().getString(2131100011) + "," + context.getResources().getString(2131099755) + "," + context.getResources().getString(2131100106) + "," + context.getResources().getString(2131099813) + "," + context.getResources().getString(2131100034) + "," + context.getResources().getString(2131100110) + "," + context.getResources().getString(2131099678));
        double d = 0.0d;
        double d2 = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        f3257a = 0;
        if (a != null && a.moveToFirst()) {
            StringBuffer append;
            int columnIndex = a.getColumnIndex("_id");
            int columnIndex2 = a.getColumnIndex("account");
            int columnIndex3 = a.getColumnIndex("amount");
            int columnIndex4 = a.getColumnIndex("category");
            int columnIndex5 = a.getColumnIndex("subcategory");
            int columnIndex6 = a.getColumnIndex("expensed");
            int columnIndex7 = a.getColumnIndex("description");
            int columnIndex8 = a.getColumnIndex("payment_method");
            int columnIndex9 = a.getColumnIndex("reference_number");
            int columnIndex10 = a.getColumnIndex("property");
            int columnIndex11 = a.getColumnIndex("status");
            int columnIndex12 = a.getColumnIndex("property2");
            int columnIndex13 = a.getColumnIndex("expense_tag");
            StringBuffer stringBuffer2 = stringBuffer;
            while (true) {
                String str3;
                Object obj;
                String str4;
                HashMap hashMap = new HashMap();
                String str5 = "" + a.getLong(columnIndex);
                String b = aib.m3865b(a.getString(columnIndex2));
                String b2 = aib.m3865b(a.getString(columnIndex3));
                Object b3 = aib.m3865b(a.getString(columnIndex4));
                long j = a.getLong(columnIndex6);
                String b4 = aib.m3865b(a.getString(columnIndex7));
                String b5 = aib.m3865b(a.getString(columnIndex5));
                String b6 = aib.m3865b(a.getString(columnIndex8));
                String b7 = aib.m3865b(a.getString(columnIndex9));
                String b8 = aib.m3865b(a.getString(columnIndex10));
                String b9 = aib.m3865b(a.getString(columnIndex11));
                String b10 = aib.m3865b(a.getString(columnIndex12));
                String b11 = aib.m3865b(a.getString(columnIndex13));
                String str6 = b3 + "," + b4;
                if (b5 == null || "".equals(b5)) {
                    str3 = str6;
                } else {
                    str6 = b3 + ":" + b5 + "," + b4;
                    b3 = b3 + ":" + b5;
                    obj = str6;
                }
                str6 = "0";
                if (b7 != null) {
                    String[] split = b7.split("/");
                    if (split.length > 0) {
                        str6 = split[0];
                    }
                    int length = split.length;
                    if (r0 > 1) {
                        hashMap.put("startOdometer", split[1]);
                    }
                    length = split.length;
                    if (r0 > 2) {
                        hashMap.put("endOdometer", split[2]);
                    }
                }
                String str7 = str6;
                hashMap.put("rowId", str5);
                hashMap.put("description", b4);
                HashMap hashMap2 = hashMap;
                hashMap2.put("date", aba.m3749a(j, ExpenseManager.f3244t));
                hashMap.put("category", b3);
                hashMap.put("account", b);
                hashMap.put("paymentMethod", b6);
                hashMap.put("referenceNumber", b7);
                hashMap.put("property", b8);
                hashMap.put("status", b9);
                hashMap.put("property2", b10);
                hashMap.put("amount", b2);
                String str8 = f3260k;
                hashMap2 = hashMap;
                hashMap2.put("mileage", str7 + " " + str5);
                double a2 = aba.m3742a(d, b2);
                d = aba.m3742a(d2, str7);
                str8 = aba.m3746a(a2);
                str8 = f3259j;
                hashMap2 = hashMap;
                hashMap2.put("subTotal", str5 + " " + str5);
                str8 = aba.m3746a(d);
                str8 = f3260k;
                hashMap2 = hashMap;
                hashMap2.put("mileageTotal", str5 + " " + str5);
                hashMap.put("desc", obj);
                hashMap.put("tag", b11);
                Object obj2 = "";
                if (!"".equals(b9)) {
                    obj2 = b9;
                }
                if (!"".equals(b8)) {
                    if ("".equals(obj2)) {
                        str4 = b8;
                    } else {
                        obj2 = obj2 + ";" + b8;
                    }
                }
                if (!"".equals(b11)) {
                    if ("".equals(obj2)) {
                        str4 = b11;
                    } else {
                        obj2 = obj2 + ";" + b11;
                    }
                }
                if (!"".equals(b4)) {
                    if ("".equals(obj2)) {
                        str4 = b4;
                    } else {
                        obj2 = obj2 + ";" + b4;
                    }
                }
                hashMap.put("fullDescription", obj2);
                list.add(0, hashMap);
                if (z) {
                    if (b4.indexOf(",") != -1) {
                        b4 = b4.replaceAll(",", " ");
                    }
                    if (b7.indexOf(",") != -1) {
                        b7.replaceAll(",", " ");
                    }
                    String[] split2 = aib.m3853a((String) hashMap.get("status")).split("/");
                    str4 = "";
                    String str9 = "";
                    str3 = "";
                    if (split2.length > 0) {
                        str4 = split2[0];
                    }
                    int length2 = split2.length;
                    if (r0 > 1) {
                        str9 = split2[1];
                    }
                    length2 = split2.length;
                    if (r0 > 2) {
                        str3 = split2[2];
                    }
                    str8 = ",";
                    append = stringBuffer2.append("\n" + (aba.m3749a(j, ExpenseManager.f3244t) + str5 + str4 + "," + str9 + "," + str3 + "," + aib.m3853a((String) hashMap.get("startOdometer")) + "," + aib.m3853a((String) hashMap.get("endOdometer")) + "," + aib.m3853a(str7) + "," + b2 + "," + b6 + "," + aib.m3865b(a.getString(columnIndex4)) + "," + b5 + "," + b4 + "," + b8 + "," + b11 + "," + b));
                } else {
                    append = stringBuffer2;
                }
                f3257a++;
                if (!a.moveToNext()) {
                    break;
                }
                stringBuffer2 = append;
                d2 = d;
                d = a2;
            }
            stringBuffer = append;
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return stringBuffer.toString();
    }

    public static String m3214a(Calendar calendar, int i) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
            calendar.add(7, i * 7);
            calendar.set(7, calendar.getFirstDayOfWeek());
            String format = simpleDateFormat.format(new Date(Long.valueOf(calendar.getTimeInMillis()).longValue()));
            calendar.add(5, 6);
            return format + " - " + new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).format(new Date(Long.valueOf(calendar.getTimeInMillis()).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "Weekly Expense";
        }
    }

    private void m3215a() {
        this.f3267h = new ArrayList();
        m3211a(this, this.f3261b, this.f3264e, this.f3267h, f3258i, false);
        Object cmVar = new cm(this, this.f3267h, 2130903106, new String[]{"date", "mileage", "mileageTotal", "paymentMethod", "amount", "subTotal", "fullDescription"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671});
        this.f3266g.setAdapter(cmVar);
        if (cmVar.getCount() == 0) {
            aib.m3849a(this.f3263d, null, getResources().getString(2131099702), 17301543, getResources().getString(2131100147), getResources().getString(2131099983), null, null, null).show();
        }
        this.f3266g.setOnItemClickListener(new ve(this));
    }

    private void m3216a(ListView listView, int i) {
        listView.post(new vj(this, listView, i));
    }

    public static void m3217a(ro roVar, String str, List<Map<String, Object>> list, String str2) {
        String b;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        String str3 = "";
        String str4;
        if (a == null || !a.moveToFirst()) {
            str4 = str3;
        } else {
            String string;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("reference_number");
            do {
                Calendar instance;
                int i;
                int i2;
                string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                long j = a.getLong(columnIndex3);
                b = aib.m3865b(a.getString(columnIndex4));
                str3 = "0";
                if (b != null) {
                    String[] split = b.split("/");
                    if (split.length > 0) {
                        b = split[0];
                        instance = Calendar.getInstance();
                        if (j != 0) {
                            instance.setTimeInMillis(j);
                        }
                        i = instance.get(2);
                        i2 = instance.get(1);
                        if (instance.get(5) < ExpenseManager.f3242r) {
                            i--;
                            if (i < 0) {
                                i += 12;
                                i2--;
                            }
                        }
                        str4 = i2 + "-" + (i + 1);
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                        if (hashMap.get(str4) != null) {
                            hashMap.put(str4, aib.m3865b(string2));
                        } else {
                            hashMap.put(str4, "" + aba.m3743a((String) hashMap.get(str4), string2));
                        }
                        if (hashMap2.get(str4) != null) {
                            hashMap2.put(str4, aib.m3865b(b));
                        } else {
                            hashMap2.put(str4, "" + aba.m3743a((String) hashMap2.get(str4), b));
                        }
                    }
                }
                b = str3;
                instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                i = instance.get(2);
                i2 = instance.get(1);
                if (instance.get(5) < ExpenseManager.f3242r) {
                    i--;
                    if (i < 0) {
                        i += 12;
                        i2--;
                    }
                }
                str4 = i2 + "-" + (i + 1);
                if (arrayList.contains(str4)) {
                    arrayList.add(str4);
                }
                if (hashMap.get(str4) != null) {
                    hashMap.put(str4, "" + aba.m3743a((String) hashMap.get(str4), string2));
                } else {
                    hashMap.put(str4, aib.m3865b(string2));
                }
                if (hashMap2.get(str4) != null) {
                    hashMap2.put(str4, "" + aba.m3743a((String) hashMap2.get(str4), b));
                } else {
                    hashMap2.put(str4, aib.m3865b(b));
                }
            } while (a.moveToNext());
            Object obj = string;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(i3);
            String a2 = aba.m3756a((String) hashMap.get(str3));
            String a3 = aba.m3756a((String) hashMap2.get(str3));
            b = "".equals(a2) ? "0" : a2;
            hashMap3.put("date", str3);
            hashMap3.put("account", obj);
            hashMap3.put("expense", aba.m3767b(b) + " " + f3259j);
            hashMap3.put("mileage", a3 + " " + f3260k);
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    private void m3218a(Map<String, Object> map) {
        aib.m3849a(this.f3263d, null, getResources().getString(2131099805), 17301543, getResources().getString(2131099809), getResources().getString(2131099983), new vi(this, Long.valueOf((String) map.get("rowId")).longValue(), getTitle().toString()), getResources().getString(2131099754), null).show();
    }

    private void m3220b() {
        this.f3261b = new ro(this);
        List arrayList = new ArrayList();
        m3217a(this.f3261b, ("account='" + this.f3262c + "'") + " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')", arrayList, "expensed DESC");
        this.f3266g.setAdapter(new cm(this, arrayList, 2130903107, new String[]{"date", "mileage", "expense"}, new int[]{2131558423, 2131558421, 2131558424}));
        this.f3266g.setOnItemClickListener(new vf(this));
        this.f3261b.m4201b();
    }

    public static void m3221b(ro roVar, String str, List<Map<String, Object>> list, String str2) {
        int columnIndex;
        String b;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, str2);
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        String str3 = "";
        if (a == null || !a.moveToFirst()) {
            String str4 = str3;
        } else {
            columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("reference_number");
            do {
                Calendar instance;
                int i;
                int i2;
                String str5;
                Object string = a.getString(columnIndex);
                String string2 = a.getString(columnIndex2);
                long j = a.getLong(columnIndex3);
                b = aib.m3865b(a.getString(columnIndex4));
                str3 = "0";
                if (b != null) {
                    String[] split = b.split("/");
                    if (split.length > 0) {
                        b = split[0];
                        instance = Calendar.getInstance();
                        if (j != 0) {
                            instance.setTimeInMillis(j);
                        }
                        i = instance.get(3);
                        i2 = instance.get(1);
                        str3 = m3214a(instance, 0);
                        str5 = "Week " + i + " " + i2;
                        if (!arrayList.contains(str5)) {
                            arrayList.add(str5);
                            arrayList2.add(str3);
                        }
                        if (hashMap.get(str5) != null) {
                            hashMap.put(str5, aib.m3865b(string2));
                        } else {
                            hashMap.put(str5, "" + aba.m3743a((String) hashMap.get(str5), string2));
                        }
                        if (hashMap2.get(str5) != null) {
                            hashMap2.put(str5, aib.m3865b(b));
                        } else {
                            hashMap2.put(str5, "" + aba.m3743a((String) hashMap2.get(str5), b));
                        }
                    }
                }
                b = str3;
                instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                i = instance.get(3);
                i2 = instance.get(1);
                str3 = m3214a(instance, 0);
                str5 = "Week " + i + " " + i2;
                if (arrayList.contains(str5)) {
                    arrayList.add(str5);
                    arrayList2.add(str3);
                }
                if (hashMap.get(str5) != null) {
                    hashMap.put(str5, "" + aba.m3743a((String) hashMap.get(str5), string2));
                } else {
                    hashMap.put(str5, aib.m3865b(string2));
                }
                if (hashMap2.get(str5) != null) {
                    hashMap2.put(str5, "" + aba.m3743a((String) hashMap2.get(str5), b));
                } else {
                    hashMap2.put(str5, aib.m3865b(b));
                }
            } while (a.moveToNext());
        }
        for (columnIndex = 0; columnIndex < arrayList.size(); columnIndex++) {
            Map hashMap3 = new HashMap();
            str3 = (String) arrayList.get(columnIndex);
            String a2 = aba.m3756a((String) hashMap.get(str3));
            String a3 = aba.m3756a((String) hashMap2.get(str3));
            b = "".equals(a2) ? "0" : a2;
            a2 = "".equals(a3) ? "0" : a3;
            hashMap3.put("date", str3);
            hashMap3.put("account", string);
            hashMap3.put("expense", aba.m3767b(b) + " " + f3259j);
            hashMap3.put("mileage", a2 + " " + f3260k);
            hashMap3.put("dateRange", arrayList2.get(columnIndex));
            list.add(hashMap3);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
    }

    private boolean m3223b(String str) {
        boolean z = false;
        ro roVar = new ro(this);
        roVar.m4193a();
        try {
            roVar.m4194a(str);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        return z;
    }

    private void m3226c() {
        this.f3261b = new ro(this);
        List arrayList = new ArrayList();
        m3221b(this.f3261b, ("account='" + this.f3262c + "'") + " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')", arrayList, "expensed DESC");
        this.f3266g.setAdapter(new cm(this, arrayList, 2130903108, new String[]{"date", "mileage", "expense", "dateRange"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422}));
        this.f3266g.setOnItemClickListener(new vg(this));
        this.f3261b.m4201b();
    }

    private void m3227c(String str) {
        try {
            Address address = (Address) new Geocoder(this).getFromLocationName(str, 1).get(0);
            if (address != null) {
                String str2 = "" + address.getLatitude();
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + str2 + "," + ("" + address.getLongitude()) + "?q=" + str)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3228d() {
        aib.m3849a(this.f3263d, null, getResources().getString(2131099702), 17301543, getResources().getString(2131099812), getResources().getString(2131099983), new vh(this), getResources().getString(2131099754), null).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 0;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3262c = extras.getString("account");
                if (extras.getString("whereClause") != null) {
                    this.f3264e = extras.getString("whereClause");
                }
                this.f3265f = extras.getString("activityDesc");
                i3 = extras.getInt("position");
            }
        }
        if (-1 != i2) {
            return;
        }
        if (i == 3) {
            m3215a();
            setTitle(this.f3265f + " (" + f3257a + ")");
            return;
        }
        m3215a();
        m3216a(this.f3266g, i3);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Map map = (Map) this.f3267h.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 100) {
            m3218a(map);
        }
        if (menuItem.getItemId() == 101) {
            String str = co.f4431e + ((String) map.get("property2"));
            Intent intent = new Intent(this.f3263d, DisplayPicture.class);
            Bundle bundle = new Bundle();
            bundle.putString("image_file", str);
            intent.putExtras(bundle);
            startActivity(intent);
        }
        if (menuItem.getItemId() == 102) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getResources().getString(2131099678) + ": " + ((String) map.get("account")) + "\n");
            stringBuffer.append(getResources().getString(2131099794) + ": " + ((String) map.get("date")) + "\n");
            stringBuffer.append(getResources().getString(2131100007) + ": " + ((String) map.get("property")) + "\n");
            stringBuffer.append(getResources().getString(2131099755) + ": " + ((String) map.get("category")) + "\n");
            stringBuffer.append(getResources().getString(2131099723) + ": " + ((String) map.get("amount")) + "\n");
            stringBuffer.append(getResources().getString(2131100011) + ": " + ((String) map.get("paymentMethod")) + "\n");
            stringBuffer.append(getResources().getString(2131100101) + ": " + ((String) map.get("status")) + "\n");
            stringBuffer.append(getResources().getString(2131100039) + ": " + ((String) map.get("referenceNumber")) + "\n");
            stringBuffer.append(getResources().getString(2131099813) + ": " + ((String) map.get("description")) + "\n");
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("plain/text");
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent2.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725));
            intent2.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
            str = (String) map.get("property2");
            if (!(str == null || "".equals(str))) {
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4431e + str)));
            }
            startActivity(Intent.createChooser(intent2, "Send mail..."));
        }
        if (menuItem.getItemId() == 103) {
            m3227c((String) ExpenseAutoFillAddEdit.m2770a(this.f3261b, "payee_payer='" + ((String) map.get("property")) + "'").get("address"));
        }
        return super.onContextItemSelected(menuItem);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        this.f3261b = new ro(this);
        setContentView(2130903131);
        this.f3266g = (ListView) findViewById(2131558561);
        registerForContextMenu(this.f3266g);
        this.f3266g.setItemsCanFocus(true);
        this.f3262c = getIntent().getStringExtra("account");
        String stringExtra = getIntent().getStringExtra("title");
        f3258i = "expensed ASC";
        this.f3265f = this.f3262c + " - All transactions: ";
        this.f3264e = getIntent().getStringExtra("whereClause");
        if (this.f3264e == null || "".equals(this.f3264e)) {
            this.f3264e = "account='" + this.f3262c + "'";
        }
        this.f3264e += " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')";
        m3215a();
        String stringExtra2 = getIntent().getStringExtra("activityDesc");
        if (stringExtra2 == null) {
            stringExtra2 = stringExtra;
        }
        CharSequence charSequence = (stringExtra2 == null || "".equals(stringExtra2)) ? this.f3262c + " (" + f3257a + ")" : stringExtra2 + "(" + f3257a + ")";
        setTitle(charSequence);
        f3260k = abd.m3786a((Context) this, this.f3261b, this.f3262c + "_" + "AUTO_ACCOUNT", "mi");
        stringExtra2 = co.f4436j[abd.m3783a((Context) this, this.f3261b, this.f3262c + "_CURRENCY", 0)];
        f3259j = stringExtra2.substring(stringExtra2.indexOf(":") + 1);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        String charSequence = getTitle().toString();
        if (!charSequence.equals(this.f3262c + ": " + getResources().getString(2131099957)) && !charSequence.equals(this.f3262c + ": " + getResources().getString(2131100166)) && !charSequence.equals(this.f3262c + ": " + getResources().getString(2131100007)) && !charSequence.equals(this.f3262c + ": " + getResources().getString(2131100011))) {
            contextMenu.setHeaderTitle(this.f3262c);
            contextMenu.add(0, 100, 0, 2131099802);
            Map map = (Map) this.f3267h.get(((AdapterContextMenuInfo) contextMenuInfo).position);
            String str = (String) map.get("property2");
            if (!(str == null || str.indexOf(".jpg") == -1)) {
                contextMenu.add(0, 101, 0, 2131100162);
            }
            contextMenu.add(0, 102, 0, "Email");
            map = ExpenseAutoFillAddEdit.m2770a(this.f3261b, "payee_payer='" + ((String) map.get("property")) + "'");
            if (map != null && map.size() > 0 && map.get("address") != null && !"".equals(map.get("address"))) {
                contextMenu.add(0, 103, 0, 2131099947);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492876, menu);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f3263d, ExpenseManager.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", this.f3262c);
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
            case 2131558668:
                m3228d();
                return true;
            case 2131559122:
                Intent intent = new Intent(this, ExpenseMileageSearch.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", this.f3262c);
                intent.putExtras(bundle);
                startActivityForResult(intent, 3);
                return true;
            case 2131559143:
                setTitle(this.f3262c + ": " + getResources().getString(2131099957));
                m3220b();
                return true;
            case 2131559144:
                setTitle(this.f3262c + ": " + getResources().getString(2131100166));
                m3226c();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
