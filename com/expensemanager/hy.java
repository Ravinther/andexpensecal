package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hy extends C0032l {
    int f4773a;
    List<Map<String, Object>> f4774b;
    private ListView f4775c;
    private TextView f4776d;
    private TextView f4777e;
    private TextView f4778f;

    static hy m4138a(int i) {
        hy hyVar = new hy();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        hyVar.m311g(bundle);
        return hyVar;
    }

    private void m4139a() {
        HashMap hashMap;
        String str = "account in (" + abd.m3792a(ExpenseAccountSummary.f2780y.getText().toString()) + ")";
        if (ExpenseAccountSummary.f2778v == 7) {
            str = str + " and " + "category" + "!='Account Transfer' " + " and " + "subcategory" + "!='Account Transfer' ";
        }
        String str2 = ExpenseAccountSummary.f2778v == 8 ? str + " and " + "category" + "!='Account Transfer' " + " and " + "subcategory" + "!='Account Transfer' " : str;
        if (ExpenseAccountSummary.f2774q.size() > 1) {
            try {
                hashMap = (HashMap) ExpenseAccountSummary.f2774q.get(this.f4773a);
                str2 = (str2 + " AND " + "expensed" + ">=" + abd.m3818c((String) hashMap.get("fromDate"))) + " AND " + "expensed" + "<=" + abd.m3820d((String) hashMap.get("toDate"));
            } catch (Exception e) {
            }
        }
        hashMap = null;
        if (ExpenseAccountSummary.f2776t) {
            hashMap = ExpenseManager.f3246v;
        }
        Object a = abd.m3789a(ExpenseAccountSummary.f2775r, str2 + " AND " + "category" + "='Income'", hashMap);
        this.f4777e.setText(a);
        Object a2 = abd.m3789a(ExpenseAccountSummary.f2775r, str2 + " AND " + "category" + "!='Income'", hashMap);
        this.f4776d.setText(a2);
        double i = aib.m3877i(a) - aib.m3877i(a2);
        this.f4778f.setText(aba.m3762b(i));
        if (i < 0.0d) {
            this.f4778f.setTextColor(co.f4428b);
        }
        if (i > 0.0d) {
            this.f4778f.setTextColor(co.f4429c);
        }
    }

    private void m4140a(String str, int i) {
        ExpenseAccountSummary.f2775r = new ro(m315i());
        this.f4774b = new ArrayList();
        String str2 = ("Income".equalsIgnoreCase(str) || ExpenseAccountSummary.f2778v == 9 || ExpenseAccountSummary.f2778v == 10) ? "account in (" + abd.m3792a(ExpenseAccountSummary.f2780y.getText().toString()) + ") and " + "category" + "='Income' " : "account in (" + abd.m3792a(ExpenseAccountSummary.f2780y.getText().toString()) + ") and " + "category" + "!='Income' ";
        if (ExpenseAccountSummary.f2774q.size() > 1) {
            try {
                HashMap hashMap = (HashMap) ExpenseAccountSummary.f2774q.get(i);
                str2 = (str2 + " AND " + "expensed" + ">=" + abd.m3818c((String) hashMap.get("fromDate"))) + " AND " + "expensed" + "<=" + abd.m3820d((String) hashMap.get("toDate"));
            } catch (Exception e) {
            }
        }
        if (ExpenseAccountSummary.f2778v == 7) {
            str2 = str2 + " and " + "category" + "!='Account Transfer' ";
        }
        String str3 = ExpenseAccountSummary.f2778v == 8 ? str2 + " and " + "subcategory" + "!='Account Transfer' " : str2;
        String str4 = str + " COLLATE NOCASE ASC";
        if ("Income".equalsIgnoreCase(str)) {
            str4 = "subcategory COLLATE NOCASE ASC";
        }
        String str5 = "subcategory".equalsIgnoreCase(str) ? "category COLLATE NOCASE ASC" : str4;
        str4 = ExpenseAccountSummary.f2780y.getText().toString();
        if (!"".equals(str4) && str4.split(",").length > 1) {
            ExpenseAccountSummary.f2776t = true;
        }
        ExpenseAccountSummary.m2681a(ExpenseAccountSummary.f2775r, str3, this.f4774b, str, str5, ExpenseAccountSummary.f2776t);
        boolean z = ExpenseAccountSummary.f2778v == 8 || ExpenseAccountSummary.f2778v == 1 || ExpenseAccountSummary.f2778v == 9 || ExpenseAccountSummary.f2778v == 10;
        this.f4774b = abd.m3801a(this.f4774b, z, "name");
        this.f4775c.setAdapter(new cm(m315i(), this.f4774b, 2130903120, new String[]{"name", "expense", "income"}, new int[]{2131558423, 2131558421, 2131558424}));
        this.f4775c.setOnItemClickListener(new hz(this, i));
        ExpenseAccountSummary.f2775r.m4201b();
        m286a(this.f4775c);
    }

    private void m4141b() {
        StringBuffer append = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(new StringBuffer("<html><head><title>").append(m317j().getString(2131099725) + "</title></head>").append("<body><p><b>" + m317j().getString(2131099678) + ": " + ExpenseAccountSummary.f2780y.getText().toString() + "</b></p>").append("<p><b>" + ExpenseAccountSummary.f2779w + "</b></p>").append("<p><b>Income: " + this.f4777e.getText().toString() + "</b></p>").append("<p><b>Expense: " + this.f4776d.getText().toString() + "</b></p>").append("<p><b>Balance: " + this.f4778f.getText().toString() + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, ExpenseAccountSummary.f2771G.toUpperCase(), 0, "20%", "BLACK", "left"), true, m317j().getString(2131099723).toUpperCase(), 0, "20%", "BLACK", "left"), true, "", 0, "40%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str = "#FFFFFF";
        int i = 0;
        StringBuffer stringBuffer = append;
        while (i < this.f4775c.getCount()) {
            Map map = (Map) this.f4775c.getItemAtPosition(i);
            stringBuffer = stringBuffer.append("<tr bgcolor=" + ((i / 2) * 2 == i ? "#FCF6CF" : "#FFFFFF") + " align=center>");
            String str2 = (String) map.get("expense");
            String str3 = (String) map.get("name");
            if (str2 == null || "".equals(str2)) {
                str2 = (String) map.get("income");
            }
            int i2 = 0;
            stringBuffer = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(stringBuffer, false, str3, 0, "20%", "BLACK", "left"), false, str2, 0, "20%", "BLACK", "left"), false, "", i2, "40%", "BLACK", "left").append("</tr>");
            i++;
        }
        append = stringBuffer.append("</table></body></html>");
        str = m317j().getString(2131099725) + ".html";
        if (ExpenseExport.m3164a(co.f4430d, str, append.toString())) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", m317j().getString(2131099725) + ":" + str);
            intent.putExtra("android.intent.extra.TEXT", m317j().getString(2131100054));
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(co.f4430d + "/" + str)));
            m315i().startActivity(Intent.createChooser(intent, "Send mail..."));
        }
    }

    public View m4142a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(m315i()).inflate(2130903132, null);
        this.f4775c = (ListView) inflate.findViewById(2131558561);
        m4140a(ExpenseAccountSummary.f2771G, this.f4773a);
        this.f4776d = (TextView) inflate.findViewById(2131558456);
        this.f4777e = (TextView) inflate.findViewById(2131558454);
        this.f4778f = (TextView) inflate.findViewById(2131558455);
        m4139a();
        return inflate;
    }

    public void m4143a(Bundle bundle) {
        super.m283a(bundle);
        this.f4773a = m313h() != null ? m313h().getInt("num") : 1;
        m303d(true);
    }

    public void m4144a(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 0, 0, 2131099869).setIcon(2130837600).setShowAsAction(2);
        menu.add(0, 1, 1, 2131099686).setIcon(2130837611).setShowAsAction(2);
        super.m285a(menu, menuInflater);
    }

    public boolean m4145a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            m4141b();
            return true;
        } else if (itemId == 1) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(m315i(), ExpenseAccountSummaryTime.class);
            bundle.putString("account", ExpenseAccountSummary.f2780y.getText().toString());
            bundle.putInt("typeId", 0);
            bundle.putInt("timeMode", 1);
            intent.putExtras(bundle);
            m281a(intent, 0);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            m315i().dispatchKeyEvent(new KeyEvent(0, 4));
            return true;
        }
    }

    public boolean m4146b(MenuItem menuItem) {
        Map map = (Map) this.f4774b.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 1) {
            int i = ExpenseAccountSummary.f2778v;
            if (i == 7) {
                i = 0;
            }
            if (i == 8) {
                i = 1;
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(m315i(), ExpenseAccountSummaryTime.class);
            bundle.putString("name", (String) map.get("name"));
            bundle.putString("account", (String) map.get("account"));
            bundle.putInt("typeId", i);
            bundle.putInt("timeMode", ExpenseAccountSummary.f2777u);
            intent.putExtras(bundle);
            m280a(intent);
        }
        return super.m295b(menuItem);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle((String) ((Map) this.f4774b.get(((AdapterContextMenuInfo) contextMenuInfo).position)).get("name"));
        contextMenu.add(0, 1, 0, m315i().getResources().getString(2131100165) + "/" + m315i().getResources().getString(2131099956) + "/" + m315i().getResources().getString(2131100179));
    }
}
