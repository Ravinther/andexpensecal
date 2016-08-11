package com.expensemanager;

import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseChartList extends ListActivity {
    Context f3068a;
    String f3069b;
    private ro f3070c;

    public ExpenseChartList() {
        this.f3068a = this;
        this.f3069b = "";
    }

    private void m2989a() {
        ArrayList arrayList = new ArrayList();
        Map hashMap = new HashMap();
        ro roVar = new ro(this);
        ExpenseBudgetAdd.m2800a(roVar, arrayList, hashMap);
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        Builder builder = new Builder(this);
        builder.setTitle(2131100109);
        builder.setItems(strArr, new ok(this, strArr, roVar));
        builder.show();
    }

    private void m2990a(int i, String str) {
        String str2;
        boolean z;
        boolean z2 = true;
        if (i == 0) {
            Intent intent = new Intent(this.f3068a, ExpenseChartSummary.class);
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f3069b);
            intent.putExtras(bundle);
            this.f3068a.startActivity(intent);
        }
        if (i == 1) {
            intent = new Intent(this.f3068a, ExpenseChartDate.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f3069b);
            intent.putExtras(bundle);
            this.f3068a.startActivity(intent);
        }
        if (i == 2) {
            intent = new Intent(this.f3068a, ExpenseChartMonthly.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f3069b);
            intent.putExtras(bundle);
            this.f3068a.startActivity(intent);
        }
        boolean z3 = false;
        if (i == 3) {
            List arrayList = new ArrayList();
            str2 = "category!='Income' AND account='" + this.f3069b + "'";
            if ("All".equalsIgnoreCase(this.f3069b)) {
                str2 = "category!='Income' AND category!='Account Transfer'  and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                z = true;
            } else {
                z = false;
            }
            m2991a(this.f3068a, arrayList, aba.m3755a(this.f3070c, str2, arrayList, z), "CATEGORY_VIEW", str, this.f3069b);
            z3 = z;
        }
        if (i == 4) {
            arrayList = new ArrayList();
            str2 = "category='Income' AND account='" + this.f3069b + "'";
            if ("All".equalsIgnoreCase(this.f3069b)) {
                str2 = "category='Income' AND subcategory!='Account Transfer'  and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                z = true;
            } else {
                z = z3;
            }
            m2991a(this.f3068a, arrayList, abd.m3791a(this.f3070c, str2, arrayList, z), "CATEGORY_VIEW", str, this.f3069b);
        } else {
            z = z3;
        }
        String str3 = "expensed ASC";
        if (i == 5) {
            arrayList = new ArrayList();
            str2 = "account='" + this.f3069b + "'";
            if ("All".equalsIgnoreCase(this.f3069b)) {
                str2 = "category!='Account Transfer'  and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                z = true;
            }
            abd.m3809a(this.f3070c, str2, arrayList, str3, z);
            m2991a(this.f3068a, arrayList, "0", "expense", str, this.f3069b);
        }
        z3 = z;
        if (i == 6) {
            arrayList = new ArrayList();
            str2 = "account='" + this.f3069b + "'";
            if ("All".equalsIgnoreCase(this.f3069b)) {
                str2 = "subcategory!='Account Transfer'  and account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
                z = true;
            } else {
                z = z3;
            }
            abd.m3809a(this.f3070c, str2, arrayList, str3, z);
            m2991a(this.f3068a, arrayList, "0", "income", str, this.f3069b);
            z3 = z;
        }
        if (i == 7) {
            arrayList = new ArrayList();
            str2 = "account='" + this.f3069b + "'";
            if ("All".equalsIgnoreCase(this.f3069b)) {
                str2 = "account in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
            } else {
                z2 = z3;
            }
            abd.m3809a(this.f3070c, str2, arrayList, str3, z2);
            m2991a(this.f3068a, arrayList, "0", "balance", str, this.f3069b);
        }
        if (i == 8) {
            m2989a();
        }
        if (i == 9) {
            intent = new Intent(this.f3068a, ExpenseChartCustom.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f3069b);
            intent.putExtras(bundle);
            this.f3068a.startActivity(intent);
        }
        if (i == 10) {
            intent = new Intent(this.f3068a, ExpenseChartPeriod.class);
            bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("account", this.f3069b);
            intent.putExtras(bundle);
            this.f3068a.startActivity(intent);
        }
    }

    public static void m2991a(Context context, List<Map<String, Object>> list, String str, String str2, String str3, String str4) {
        String str5 = "";
        String str6 = "";
        int i = 0;
        while (i < list.size()) {
            Map map = (Map) list.get(i);
            String a = aba.m3756a((String) map.get("category"));
            String a2 = !str2.equals("CATEGORY_VIEW") ? aba.m3756a((String) map.get("date")) : aba.m3756a((String) map.get("expenseDate"));
            String a3 = aba.m3756a((String) map.get("amount"));
            if ("expense".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("expense"));
            }
            if ("income".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("income"));
            }
            if ("balance".equalsIgnoreCase(str2)) {
                a3 = aba.m3756a((String) map.get("subTotal"));
                if (a3.indexOf("(") != -1) {
                    a3 = a3.replace("(", "-").replace(")", "");
                }
            }
            String replaceAll = a3.replaceAll(",", "");
            if ("CATEGORY_VIEW".equalsIgnoreCase(str2) && replaceAll.indexOf("-") != -1) {
                replaceAll = aba.m3767b(replaceAll.replace("-", "")).replaceAll(",", "");
            }
            if (i == 0) {
                a3 = !"CATEGORY_VIEW".equalsIgnoreCase(str2) ? a2 : a;
            } else {
                a3 = !"CATEGORY_VIEW".equalsIgnoreCase(str2) ? str6 + "," + a2 : str6 + "," + a;
                replaceAll = str5 + "," + replaceAll;
            }
            i++;
            str5 = replaceAll;
            str6 = a3;
        }
        Intent intent = new Intent(context, ExpenseChartBuilder.class);
        Bundle bundle = new Bundle();
        bundle.putString("xStr", str6);
        bundle.putString("yStr", str5);
        bundle.putString("total", str);
        bundle.putString("title", str3);
        bundle.putString("viewType", str2);
        bundle.putString("account", str4);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    private void m2993b() {
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 0);
        int i = sharedPreferences.getInt("CHART_THEME", -1);
        String[] split = getResources().getString(2131100118).split(",");
        CharSequence[] charSequenceArr = new CharSequence[]{split[0], split[1]};
        Builder builder = new Builder(this);
        builder.setTitle(getResources().getString(2131099764) + " " + getResources().getString(2131100117));
        builder.setSingleChoiceItems(charSequenceArr, i, new ol(this, sharedPreferences));
        builder.setPositiveButton(2131099983, null);
        builder.setNegativeButton("Default", new om(this, sharedPreferences));
        builder.show();
        builder.create();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131099764);
        this.f3069b = getIntent().getStringExtra("account");
        Resources resources = getResources();
        String[] strArr = new String[]{resources.getString(2131099756), resources.getString(2131099796), resources.getString(2131099959), resources.getString(2131099886), resources.getString(2131099933), resources.getString(2131099961), resources.getString(2131099962), resources.getString(2131099958), resources.getString(2131100107), resources.getString(2131099970), resources.getString(2131099966)};
        List arrayList = new ArrayList();
        for (Object put : strArr) {
            Map hashMap = new HashMap();
            hashMap.put("text", put);
            arrayList.add(hashMap);
        }
        setListAdapter(new cn(this, arrayList, 2130903148, new String[]{"text"}, new int[]{2131558423}));
        getListView().setOnItemClickListener(new oi(this, strArr));
        this.f3070c = new ro(this);
        Object arrayList2 = new ArrayList(Arrays.asList(abd.m3786a(this.f3068a, this.f3070c, "MY_ACCOUNT_NAMES", "Personal Expense").split(",")));
        if (arrayList2.size() > 1) {
            arrayList2.add("All");
        }
        int indexOf = arrayList2.indexOf(this.f3069b);
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903149, arrayList2);
        arrayAdapter.setDropDownViewResource(2130903150);
        OnNavigationListener ojVar = new oj(this, arrayList2);
        getActionBar().setNavigationMode(1);
        getActionBar().setDisplayShowTitleEnabled(false);
        getActionBar().setListNavigationCallbacks(arrayAdapter, ojVar);
        getActionBar().setSelectedNavigationItem(indexOf);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492883, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                break;
            case 2131559154:
                m2993b();
                break;
        }
        return super.onMenuItemSelected(i, menuItem);
    }
}
