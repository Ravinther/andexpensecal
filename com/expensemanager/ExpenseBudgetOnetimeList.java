package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseBudgetOnetimeList extends ListActivity {
    ListView f2978a;
    lw f2979b;
    private ro f2980c;
    private Context f2981d;
    private int f2982e;
    private List<Map<String, String>> f2983f;
    private List<String> f2984g;
    private List<String> f2985h;
    private String f2986i;

    public ExpenseBudgetOnetimeList() {
        this.f2981d = this;
        this.f2982e = 4;
        this.f2984g = new ArrayList();
        this.f2985h = new ArrayList();
        this.f2986i = "Personal Expense";
    }

    public static ArrayList<Map<String, String>> m2895a(ro roVar) {
        ArrayList<Map<String, String>> arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            if (!roVar.m4206d()) {
                roVar.m4193a();
            }
            cursor = roVar.m4207e("frequency='4'", "account ASC");
            if (cursor != null && cursor.moveToFirst()) {
                int columnIndex = cursor.getColumnIndex("_id");
                int columnIndex2 = cursor.getColumnIndex("account");
                int columnIndex3 = cursor.getColumnIndex("amount");
                int columnIndex4 = cursor.getColumnIndex("category");
                int columnIndex5 = cursor.getColumnIndex("subcategory");
                int columnIndex6 = cursor.getColumnIndex("alert");
                int columnIndex7 = cursor.getColumnIndex("description");
                int columnIndex8 = cursor.getColumnIndex("frequency");
                int columnIndex9 = cursor.getColumnIndex("property");
                int columnIndex10 = cursor.getColumnIndex("property2");
                int columnIndex11 = cursor.getColumnIndex("property3");
                do {
                    String str = "" + cursor.getLong(columnIndex);
                    String string = cursor.getString(columnIndex2);
                    String string2 = cursor.getString(columnIndex3);
                    String string3 = cursor.getString(columnIndex4);
                    String string4 = cursor.getString(columnIndex5);
                    String string5 = cursor.getString(columnIndex7);
                    String string6 = cursor.getString(columnIndex8);
                    String string7 = cursor.getString(columnIndex9);
                    String string8 = cursor.getString(columnIndex10);
                    String string9 = cursor.getString(columnIndex11);
                    String string10 = cursor.getString(columnIndex6);
                    HashMap hashMap = new HashMap();
                    hashMap.put("rowId", str);
                    hashMap.put("account", string);
                    hashMap.put("category", string3);
                    hashMap.put("subcategory", string4);
                    hashMap.put("period", string6);
                    hashMap.put("amount", string2);
                    hashMap.put("originalAmount", string2);
                    hashMap.put("alert", string10);
                    hashMap.put("description", string5);
                    hashMap.put("property", string7);
                    hashMap.put("property2", string8);
                    hashMap.put("property3", string9);
                    if (!(string7 == null || "".equals(string7))) {
                        String[] split = string7.split(";");
                        if (!"".equals(split[1])) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date parse = r16.parse(split[1]);
                            Date date = new Date();
                            Calendar instance = Calendar.getInstance();
                            instance.add(6, -1);
                            if (instance.getTime().after(parse)) {
                                hashMap.put("expired", "expired");
                                arrayList.add(hashMap);
                            } else {
                                hashMap.put("expired", "");
                                arrayList.add(0, hashMap);
                            }
                        }
                    }
                } while (cursor.moveToNext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cursor != null) {
            cursor.close();
        }
        roVar.m4201b();
        return arrayList;
    }

    private void m2896a() {
        this.f2983f = m2895a(this.f2980c);
        if (this.f2983f == null || this.f2983f.size() == 0) {
            Toast.makeText(this.f2981d, getResources().getString(2131099691), 1).show();
        }
        this.f2978a = getListView();
        View inflate = LayoutInflater.from(this).inflate(2130903045, null);
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        if (this.f2978a.getHeaderViewsCount() == 0) {
            this.f2978a.addHeaderView(inflate);
        }
        int i = sharedPreferences.getInt("THEME_COLOR", 0);
        if (i == 1 || i > 3) {
            inflate.setBackgroundColor(-1725816286);
        }
        this.f2978a.setOnItemClickListener(new mo(this));
        m2898a(this.f2980c, this.f2983f, this.f2985h, this.f2984g);
        this.f2979b = new lw(this, 2130903046, this.f2983f, this.f2984g);
        this.f2978a.setAdapter(this.f2979b);
        registerForContextMenu(this.f2978a);
    }

    public static void m2898a(ro roVar, List<Map<String, String>> list, List<String> list2, List<String> list3) {
        int i = 0;
        while (i < list.size()) {
            try {
                String str = "category!='Income'";
                Map map = (Map) list.get(i);
                String str2 = (String) map.get("account");
                if (!(str2 == null || "".equals(str2))) {
                    str = str + " and " + "account" + " in (" + abd.m3792a(str2) + ")";
                }
                str2 = (String) map.get("property");
                if (!(str2 == null || "".equals(str2))) {
                    String[] split = str2.split(";");
                    if (!("".equals(split[0]) || "".equals(split[1]))) {
                        str = str + " and " + "expensed" + ">=" + abd.m3818c(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[0])) + " AND " + "expensed" + "<=" + abd.m3820d(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, split[1]));
                    }
                }
                str2 = (String) map.get("category");
                if (!(str2 == null || "".equals(str2))) {
                    if ("All-1".equalsIgnoreCase(str2)) {
                        str = str + " and " + "category" + "!='Account Transfer'";
                    }
                    if (!("All".equalsIgnoreCase(str2) || "All-1".equalsIgnoreCase(str2))) {
                        str = str + " and " + "category" + " in (" + abd.m3792a(str2.trim()) + ")";
                    }
                }
                str2 = (String) map.get("subcategory");
                if (!(str2 == null || "".equals(str2))) {
                    str = str + " and " + "subcategory" + " in (" + abd.m3792a(str2.trim()) + ")";
                }
                str2 = (String) map.get("property2");
                str2 = (str2 == null || "".equals(str2)) ? str : str + " and " + "payment_method" + " in (" + abd.m3792a(str2.trim()) + ")";
                String str3 = (String) map.get("property3");
                if (!(str3 == null || "".equals(str3))) {
                    str2 = str2.replace("Income", "") + " and " + " (" + abd.m3815b("expense_tag", str3) + ")";
                }
                if (str3 == null || "".equals(str3)) {
                    list3.add(abd.m3789a(roVar, str2, ExpenseManager.f3246v));
                } else {
                    Object b = abd.m3813b(roVar, str2, ExpenseManager.f3246v);
                    if (b.startsWith("(")) {
                        b = b.replace("(", "").replace(")", "");
                    } else if (!b.equals("0.00")) {
                        b = "-" + b;
                    }
                    list3.add(b);
                }
                if (list2 != null) {
                    list2.add(str2);
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void m2899a(Map<?, ?> map) {
        if (map == null) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f2981d, ExpenseBudgetOnetimeAdd.class);
            bundle.putString("account", this.f2986i);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return;
        }
        bundle = new Bundle();
        intent = new Intent(this.f2981d, ExpenseBudgetOnetimeAdd.class);
        bundle.putString("rowId", aib.m3852a(map.get("rowId")));
        bundle.putString("category", aib.m3852a(map.get("category")));
        bundle.putString("account", aib.m3852a(map.get("account")));
        bundle.putString("amount", aib.m3852a(map.get("originalAmount")));
        bundle.putString("alertAmount", aib.m3852a(map.get("alert")));
        bundle.putString("subcategory", aib.m3852a(map.get("subcategory")));
        bundle.putString("property", aib.m3852a(map.get("property")));
        bundle.putString("property2", aib.m3852a(map.get("property2")));
        bundle.putString("property3", aib.m3852a(map.get("property3")));
        bundle.putString("description", aib.m3852a(map.get("description")));
        bundle.putBoolean("isNew", false);
        bundle.putInt("period", 4);
        intent.putExtras(bundle);
        startActivityForResult(intent, 0);
    }

    private void m2901b() {
        aib.m3849a(this.f2981d, null, getResources().getString(2131099805), 17301543, getResources().getString(2131099804), getResources().getString(2131099983), new mp(this), getResources().getString(2131099754), null).show();
    }

    private void m2902b(Map<?, ?> map) {
        String str = (String) map.get("rowId");
        if (str != null && !"".equals(str)) {
            OnClickListener mqVar = new mq(this, Integer.valueOf(str).intValue());
            Resources resources = this.f2981d.getResources();
            aib.m3849a(this.f2981d, null, resources.getString(2131099805), 17301543, resources.getString(2131099809), resources.getString(2131099983), mqVar, resources.getString(2131099754), null).show();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f2982e = extras.getInt("tabId");
            }
        }
        onCreate(null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        String str = "";
        Map map = (Map) this.f2983f.get((int) adapterContextMenuInfo.id);
        if (menuItem.getItemId() == 10) {
            String str2 = (String) map.get("category");
            String str3 = (String) map.get("subcategory");
            String str4 = (String) this.f2985h.get((int) adapterContextMenuInfo.id);
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f2981d, ExpenseAccountExpandableList.class);
            bundle.putString("title", ((String) map.get("account")) + ":" + str2 + ":" + str3);
            bundle.putString("account", (String) map.get("account"));
            bundle.putString("whereClause", str4);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        }
        if (menuItem.getItemId() == 11) {
            m2899a(map);
        }
        if (menuItem.getItemId() == 12) {
            m2902b(map);
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, false);
        this.f2986i = getIntent().getStringExtra("account");
        this.f2982e = getIntent().getIntExtra("tabId", this.f2982e);
        setTitle(2131099743);
        this.f2980c = new ro(this);
        m2896a();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (((AdapterContextMenuInfo) contextMenuInfo).id >= 0) {
            contextMenu.setHeaderTitle(2131099743);
            contextMenu.add(0, 10, 0, 2131100163);
            contextMenu.add(0, 11, 0, 2131099860);
            contextMenu.add(0, 12, 0, 2131099802);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                startActivityForResult(new Intent(this, ExpenseBudgetAdd.class), 0);
                return true;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m2901b();
                return true;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                startActivityForResult(new Intent(this, ExpenseBudgetItems.class), 0);
                return true;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                startActivityForResult(new Intent(this, ExpenseBudgetOnetimeAdd.class), 0);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
