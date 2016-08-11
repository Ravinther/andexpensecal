package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseReminderTransactionList extends ListActivity {
    private static double f3390e;
    private static double f3391f;
    private String f3392a;
    private Context f3393b;
    private ro f3394c;
    private List<Map<String, String>> f3395d;

    static {
        f3390e = 0.0d;
        f3391f = 0.0d;
    }

    public ExpenseReminderTransactionList() {
        this.f3392a = "Personal Expense";
        this.f3393b = this;
    }

    public static void m3372a(Context context, ro roVar, String str, List<Map<String, String>> list) {
        Resources resources = context.getResources();
        List arrayList = new ArrayList();
        aba.m3760a(context, roVar, "category!='Account Transfer' AND property2 LIKE 'Reminder%' AND description='" + str + "'", arrayList);
        Map map = (Map) arrayList.get(0);
        int f = aba.m3780f((String) map.get("numberOfPayment"));
        String str2 = (String) map.get("frequencyValue");
        String str3 = (String) map.get("firstExpenseDate");
        f3390e = aib.m3877i((String) map.get("amount")) * ((double) f);
        List arrayList2 = new ArrayList();
        ExpenseAccountActivities.m2602a(roVar, "property3='" + ((String) map.get("property2")) + "'", arrayList2, false, "expensed DESC");
        for (int i = 0; i < f; i++) {
            Map hashMap = new HashMap(map);
            hashMap.put("dueDate", aba.m3768b(str3, str2, "" + i));
            if (arrayList2.size() > i) {
                Map map2 = (Map) arrayList2.get(i);
                if (map2 != null) {
                    Object obj;
                    String str4 = (String) map2.get("date");
                    if (str4 == null || "".equals(str4)) {
                        String str5 = "";
                    } else {
                        obj = resources.getString(2131099994) + ": " + aib.m3852a(map2.get("date"));
                    }
                    str4 = (String) map2.get("amount");
                    Object obj2 = (str4 == null || "".equals(str4)) ? "" : resources.getString(2131099994) + ": " + aba.m3767b((String) map2.get("amount"));
                    hashMap.put("paidDate", obj);
                    hashMap.put("paidAmount", obj2);
                    hashMap.put("paid_rowId", aib.m3852a(map2.get("rowId")));
                    f3391f = aba.m3742a(f3391f, ((String) map2.get("amount")).replaceAll(",", ""));
                }
            }
            list.add(hashMap);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f3392a = extras.getString("account");
            }
        }
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
        String stringExtra = getIntent().getStringExtra("description");
        setTitle(getResources().getString(2131100133) + ": " + new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime()) + ", " + stringExtra);
        this.f3394c = new ro(this);
        f3390e = 0.0d;
        f3391f = 0.0d;
        ListView listView = getListView();
        listView.setItemsCanFocus(true);
        this.f3395d = new ArrayList();
        m3372a(this.f3393b, this.f3394c, stringExtra, this.f3395d);
        ListAdapter cmVar = new cm(this, this.f3395d, 2130903112, new String[]{"dueDate", "frequency", "expenseAmount", "incomeAmount", "paidDate", "paidAmount", "incomeAmount"}, new int[]{2131558423, 2131558421, 2131558424, 2131558422, 2131558425, 2131558426, 2131558671}, null);
        View inflate = LayoutInflater.from(this).inflate(2130903111, null);
        if (listView.getHeaderViewsCount() == 0) {
            listView.addHeaderView(inflate);
        }
        TextView textView = (TextView) inflate.findViewById(2131558423);
        TextView textView2 = (TextView) inflate.findViewById(2131558421);
        TextView textView3 = (TextView) inflate.findViewById(2131558424);
        textView.setText(aba.m3746a(f3391f));
        textView2.setText(aba.m3746a(f3390e - f3391f));
        textView3.setText(aba.m3746a(f3390e));
        listView.setAdapter(cmVar);
        listView.setOnItemClickListener(new zh(this));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(-1, new Intent(this.f3393b, ExpenseReminderList.class));
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        dispatchKeyEvent(new KeyEvent(0, 4));
        return true;
    }
}
