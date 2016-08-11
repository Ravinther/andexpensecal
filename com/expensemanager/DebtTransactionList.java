package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.C0607c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DebtTransactionList extends ListActivity {
    Map<String, String> f2680a;
    List<Map<String, Object>> f2681b;
    String f2682c;
    private ro f2683d;
    private Context f2684e;

    public DebtTransactionList() {
        this.f2680a = new HashMap();
        this.f2681b = new ArrayList();
        this.f2682c = "";
        this.f2684e = this;
    }

    private void m2593a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("\ufeff");
        String str2 = ",";
        String a = abd.m3786a(null, this.f2683d, "csv_delimiter", ",");
        StringBuffer append = ";".equals(a) ? stringBuffer.append("\nDate;Amount;Category;Subcategory;Payment Method;Description;Ref/Check No;Payee/Payer;Status;Receipt Picture;Account;Tag;Tax") : stringBuffer.append("\nDate,Amount,Category,Subcategory,Payment Method,Description,Ref/Check No,Payee/Payer,Status,Receipt Picture,Account,Tag,Tax");
        ArrayList arrayList = new ArrayList();
        Resources resources = this.f2684e.getResources();
        StringBuffer append2 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(new StringBuffer().append("<head><title>Expense Report</title></head>").append("<body><p><b>" + resources.getString(2131099678) + ": " + resources.getString(2131099799) + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, resources.getString(2131099794), 0, "7%", "BLACK", "left"), true, resources.getString(2131099723), 0, "6%", "BLACK", "left"), true, resources.getString(2131100040), 0, "6%", "BLACK", "left"), true, resources.getString(2131100007), 0, "10%", "BLACK", "left"), true, resources.getString(2131100011), 0, "10%", "BLACK", "left"), true, resources.getString(2131099755), 0, "12%", "BLACK", "left"), true, resources.getString(2131100039), 0, "7%", "BLACK", "left"), true, resources.getString(2131100101), 0, "7%", "BLACK", "left"), true, resources.getString(2131099856), 0, "8%", "BLACK", "left"), true, resources.getString(2131099813), 0, "10%", "BLACK", "left"), true, resources.getString(2131100037), 0, "7%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str3 = "#FFFFFF";
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        StringBuffer stringBuffer2 = append;
        while (i < this.f2681b.size()) {
            double a2;
            double d5;
            String str4;
            Map map = (Map) this.f2681b.get(i);
            stringBuffer = append2.append("<tr bgcolor=" + ((i / 2) * 2 == i ? "#FCF6CF" : "#FFFFFF") + " align=center>");
            str = ((String) map.get("category")).toUpperCase().startsWith("INCOME") ? "GREEN" : "RED";
            str2 = (String) map.get("amount");
            String b = "RED".equalsIgnoreCase(str) ? str2.startsWith("-") ? aba.m3767b(str2.replace("-", "")) : "-" + aba.m3767b(str2) : aba.m3767b(str2);
            String a3 = i > 0 ? "" : aib.m3853a((String) map.get("tag"));
            str2 = (String) map.get("category");
            String string = (str2 == null || !str2.startsWith("Income")) ? str2 : resources.getString(2131099776);
            StringBuffer append3 = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(stringBuffer, false, aib.m3853a((String) map.get("date")), 0, "7%", "BLACK", "left"), false, b + "&nbsp;&nbsp;&nbsp;", 0, "6%", str, "right"), false, aib.m3853a((String) map.get("remaining")) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "BLACK", "right"), false, aib.m3853a((String) map.get("property")), 0, "10%", "BLACK", "left"), false, aib.m3853a((String) map.get("paymentMethod")), 0, "10%", "BLACK", "left"), false, string, 0, "12%", "BLACK", "left"), false, aib.m3853a((String) map.get("referenceNumber")), 0, "7%", "BLACK", "left"), false, aib.m3853a((String) map.get("status")), 0, "7%", "BLACK", "left"), false, a3, 0, "8%", "BLACK", "left"), false, aib.m3853a((String) map.get("description")), 0, "10%", "BLACK", "left"), false, aib.m3853a((String) map.get("property2")), 0, "7%", "BLACK", "left").append("</tr>");
            str3 = (String) map.get("amount");
            if (((String) map.get("category")).toUpperCase().startsWith("INCOME")) {
                a2 = aba.m3742a(d2, str3);
                d5 = d;
                str4 = str3;
            } else {
                str3 = "-" + str3;
                a2 = d2;
                d5 = aba.m3742a(d, str3);
                str4 = str3;
            }
            d = aba.m3742a(d4, str4);
            str3 = (String) map.get("tax");
            d2 = aba.m3742a(d3, str3);
            if (!(map.get("property2") == null || "".equals(map.get("property2")))) {
                arrayList.add((String) map.get("property2"));
            }
            str2 = aib.m3853a((String) map.get("description")).replaceAll("\u2605", "");
            String replaceAll = (!",".equals(a) || str2.indexOf(",") == -1) ? str2 : str2.replaceAll(",", " ");
            str2 = aib.m3853a((String) map.get("referenceNumber"));
            String replaceAll2 = (!",".equals(a) || str2.indexOf(",") == -1) ? str2 : str2.replaceAll(",", " ");
            a3 = ",".equals(a) ? a3.replaceAll(",", ";") : a3.replaceAll(",", "|");
            str2 = "";
            String[] split = aib.m3853a((String) map.get("category")).split(":");
            String str5 = split[0];
            int length = split.length;
            append = stringBuffer2.append("\n" + (aib.m3853a((String) map.get("date")) + a + str4 + a + str5 + a + (r0 > 1 ? split[1] : str2) + a + aib.m3853a((String) map.get("paymentMethod")) + a + replaceAll + a + replaceAll2 + a + aib.m3853a((String) map.get("property")) + a + aib.m3853a((String) map.get("status")) + a + aib.m3853a((String) map.get("property2")) + a + aib.m3853a((String) map.get("account")) + a + a3 + a + str3));
            i++;
            d3 = d2;
            d4 = d;
            append2 = append3;
            stringBuffer2 = append;
            d = d5;
            d2 = a2;
        }
        append2 = append2.append("</table>");
        str3 = "GREEN";
        str = aba.m3762b(d4);
        stringBuffer = ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(ExpenseCustomActivities.m3062a(append2.append("<table bgcolor=#A4D1FF cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, "Total Credit", 0, "7%", "BLACK", "center"), true, aba.m3746a(d2) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "GREEN", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr>"), true, "Total Debt", 0, "7%", "BLACK", "center"), true, aba.m3762b(d) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "RED", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr>"), true, "Total Balance", 0, "7%", "BLACK", "center"), true, str + "&nbsp;&nbsp;&nbsp;", 0, "6%", str.trim().startsWith("-") ? "RED" : str3, "right"), true, "", 0, "6%", "RED", "right"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr></table></body>");
        str2 = getResources().getString(2131099725) + "-" + aib.m3876h("yyyy-MM-dd-HHmmss");
        if (ExpenseExport.m3164a(co.f4430d, str2 + ".html", stringBuffer.toString())) {
            ExpenseExport.m3164a(co.f4430d, str2 + ".csv", stringBuffer2.toString());
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
            intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ":" + str2);
            intent.putExtra("android.intent.extra.TEXT", getResources().getString(2131100054));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + str2 + ".html")));
            arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + str2 + ".csv")));
            if (arrayList.size() > 0) {
                ExpenseCustomActivities.m3065a(arrayList, "receipts.zip");
                arrayList2.add(Uri.fromFile(new File(co.f4430d + "/" + "receipts.zip")));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
            this.f2684e.startActivity(Intent.createChooser(intent, "Send mail..."));
        }
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
        setTitle(getResources().getString(2131099799));
        this.f2683d = new ro(this);
        long longExtra = getIntent().getLongExtra("rowId", -1);
        this.f2680a = ExpenseNewAccount.m3276a(this.f2683d, longExtra);
        this.f2680a.put("rowId", "" + longExtra);
        String str = "expense_tag='" + longExtra + "'";
        this.f2681b = new ArrayList();
        ExpenseAccountActivities.m2602a(this.f2683d, str, this.f2681b, true, "expensed DESC");
        this.f2682c = (String) this.f2680a.get("amount");
        String str2 = "";
        String str3 = (String) this.f2680a.get("category");
        int i = 0;
        String str4 = (String) this.f2680a.get("amount");
        while (this.f2681b != null && i < this.f2681b.size()) {
            Map map = (Map) this.f2681b.get(i);
            String a = aib.m3852a(map.get("amount"));
            String str5 = (String) map.get("category");
            if (!(str5.startsWith("Income") && str3.startsWith("Income")) && (str5.startsWith("Income") || str3.startsWith("Income"))) {
                str2 = "" + aba.m3743a(str2, a);
                str5 = "-" + a;
                a = str4;
                str4 = str2;
            } else {
                str4 = str2;
                String str6 = "" + aba.m3743a(str4, a);
                str5 = a;
                a = str6;
            }
            this.f2682c = aib.m3850a(aba.m3743a(this.f2682c, str5));
            map.put("remaining", this.f2682c);
            map.put("paid", str4);
            map.put("totalDebt", a);
            i++;
            str2 = str4;
            str4 = a;
        }
        Map hashMap = new HashMap();
        hashMap.putAll(this.f2680a);
        this.f2681b.add(0, hashMap);
        str = (String) hashMap.get("category");
        getListView().setAdapter(new ep(this, 2130903046, this.f2681b));
        getListView().setOnItemClickListener(new eo(this, hashMap, str));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        int i = 2131100003;
        if (!((String) this.f2680a.get("category")).startsWith("Income")) {
            i = 2131099944;
        }
        int i2 = ((String) this.f2680a.get("category")).startsWith("Income") ? 2131099741 : 2131100038;
        menu.add(0, 1, 0, i).setShowAsAction(2);
        menu.add(0, 0, 0, i2).setShowAsAction(2);
        menu.add(0, 2, 0, 2131099869);
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Intent intent = new Intent(this.f2684e, DebtList.class);
            Bundle bundle = new Bundle();
            bundle.putString("account", (String) this.f2680a.get("account"));
            intent.putExtras(bundle);
            setResult(-1, intent);
            finish();
        }
        return false;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            dispatchKeyEvent(new KeyEvent(0, 4));
            return true;
        }
        Bundle bundle;
        Intent intent;
        String str;
        if (itemId == 1) {
            bundle = new Bundle();
            intent = new Intent(this.f2684e, DebtAddEdit.class);
            bundle.putString("account", (String) this.f2680a.get("account"));
            bundle.putString("remainingAmount", this.f2682c);
            bundle.putString("rowIdStr", (String) this.f2680a.get("rowId"));
            bundle.putString("dueDate", (String) this.f2680a.get("tag"));
            bundle.putString("property", (String) this.f2680a.get("property"));
            bundle.putString("fromWhere", "payment");
            bundle.putInt("action", 2131100003);
            str = (String) this.f2680a.get("category");
            if (!(str == null || str.startsWith("Income"))) {
                bundle.putInt("action", 2131099944);
            }
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        } else if (itemId == 0) {
            bundle = new Bundle();
            intent = new Intent(this.f2684e, DebtAddEdit.class);
            bundle.putString("account", (String) this.f2680a.get("account"));
            bundle.putString("remainingAmount", this.f2682c);
            bundle.putString("rowIdStr", (String) this.f2680a.get("rowId"));
            bundle.putString("dueDate", (String) this.f2680a.get("tag"));
            bundle.putString("property", (String) this.f2680a.get("property"));
            bundle.putString("fromWhere", "payment");
            bundle.putInt("action", 2131100038);
            str = (String) this.f2680a.get("category");
            if (str != null && str.startsWith("Income")) {
                bundle.putInt("action", 2131099741);
            }
            bundle.putString("category", "Income");
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
        } else if (itemId == 2) {
            m2593a();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
