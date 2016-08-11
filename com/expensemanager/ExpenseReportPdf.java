package com.expensemanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfDocument.Page;
import android.graphics.pdf.PdfDocument.PageInfo.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExpenseReportPdf extends Activity {
    ArrayList<WebView> f3460a;
    double f3461b;
    double f3462c;
    double f3463d;
    double f3464e;
    ArrayList<String> f3465f;
    private Context f3466g;
    private LinearLayout f3467h;
    private String f3468i;
    private String f3469j;
    private String f3470k;

    public ExpenseReportPdf() {
        this.f3466g = this;
        this.f3468i = "Personal Expense";
        this.f3460a = new ArrayList();
        this.f3461b = 0.0d;
        this.f3462c = 0.0d;
        this.f3463d = 0.0d;
        this.f3464e = 0.0d;
        this.f3465f = new ArrayList();
    }

    private String m3439a(List<Map<String, Object>> list, int i, int i2) {
        StringBuffer append;
        StringBuffer append2 = m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(new StringBuffer("<html>").append("<body><b><span style=font-size:8pt;>" + this.f3466g.getResources().getString(2131099678) + ": " + this.f3468i + "</span></b><br>").append("<table cellpadding=2 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, this.f3466g.getResources().getString(2131099678), 0, "10%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131099794), 0, "6%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131099723), 0, "6%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100115), 0, "6%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100007), 0, "10%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100011), 0, "8%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131099755), 0, "12%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100039), 0, "6%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100101), 0, "6%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100110), 0, "8%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131099813), 0, "10%", "BLACK", "left"), true, this.f3466g.getResources().getString(2131100037) + "&nbsp;" + this.f3466g.getResources().getString(2131099972), 0, "10%", "BLACK", "left").append("</tr>");
        String str = "#FFFFFF";
        while (i < i2) {
            Map map = (Map) list.get(i);
            append2 = append2.append("<tr bgcolor=" + ((i / 2) * 2 == i ? "#FCF6CF" : "#FFFFFF") + " align=center>");
            String str2 = ((String) map.get("category")).toUpperCase().startsWith("INCOME") ? "GREEN" : "RED";
            str = (String) map.get("amount");
            if ("RED".equalsIgnoreCase(str2)) {
                str = str.startsWith("-") ? aba.m3767b(str.replace("-", "")) : "-" + aba.m3767b(str);
            }
            int i3 = 0;
            i3 = 0;
            i3 = 0;
            i3 = 0;
            i3 = 0;
            i3 = 0;
            i3 = 0;
            StringBuffer append3 = m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(append2, false, (String) map.get("account"), 0, "10%", "BLACK", "left"), false, (String) map.get("date"), 0, "6%", "BLACK", "left"), false, str + "&nbsp;&nbsp;&nbsp;", 0, "6%", str2, "right"), false, ((String) map.get("tax")) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "BLACK", "right"), false, (String) map.get("property"), 0, "10%", "BLACK", "left"), false, (String) map.get("paymentMethod"), i3, "10%", "BLACK", "left"), false, (String) map.get("category"), i3, "12%", "BLACK", "left"), false, (String) map.get("referenceNumber"), i3, "6%", "BLACK", "left"), false, (String) map.get("status"), i3, "6%", "BLACK", "left"), false, (String) map.get("tag"), i3, "8%", "BLACK", "left"), false, (String) map.get("description"), i3, "10%", "BLACK", "left"), false, (String) map.get("property2"), i3, "10%", "BLACK", "left").append("</tr>");
            str = (String) map.get("amount");
            if (((String) map.get("category")).toUpperCase().startsWith("INCOME")) {
                this.f3463d = aba.m3742a(this.f3463d, str);
            } else {
                str = "-" + str;
                this.f3462c = aba.m3742a(this.f3462c, str);
            }
            this.f3461b = aba.m3742a(this.f3461b, str);
            this.f3464e = aba.m3742a(this.f3464e, (String) map.get("tax"));
            i++;
            append2 = append3;
        }
        if (i2 == list.size()) {
            str = "GREEN";
            String a = aba.m3746a(this.f3461b);
            append = m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(m3440a(append2.append("<tr bgcolor=#A4D1FF>"), true, "", 0, "10%", "BLACK", "center"), true, "Total Income", 0, "7%", "BLACK", "center"), true, aba.m3746a(this.f3463d) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "GREEN", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr bgcolor=#A4D1FF>"), true, "", 0, "10%", "BLACK", "center"), true, "Total Expense", 0, "7%", "BLACK", "center"), true, aba.m3762b(this.f3462c) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "RED", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr bgcolor=#A4D1FF>"), true, "&nbsp;&nbsp;", 0, "10%", "BLACK", "center"), true, "Total Balance", 0, "7%", "BLACK", "center"), true, a + "&nbsp;&nbsp;&nbsp;", 0, "6%", a.trim().startsWith("(") ? "RED" : str, "right"), true, aba.m3746a(this.f3464e) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "RED", "right"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr></table></body></html>");
        } else {
            append = append2;
        }
        return append.toString();
    }

    public static StringBuffer m3440a(StringBuffer stringBuffer, boolean z, String str, int i, String str2, String str3, String str4) {
        return z ? stringBuffer.append("<td nowrap width=" + str2 + " align=" + str4 + " ><font color=" + str3 + "><b><span style=font-size:5pt;>" + str + "</span></b></font></td>") : stringBuffer.append("<td width=" + str2 + " align=" + str4 + " ><font color=" + str3 + "><span style=font-size:5pt;>" + str + "</span></font></td>");
    }

    private boolean m3441a(Context context) {
        boolean z;
        Exception exception;
        PdfDocument pdfDocument = new PdfDocument();
        try {
            File file = new File(co.f4431e + "/report.pdf");
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(co.f4431e);
            if (!file2.exists()) {
                file2.mkdir();
            }
            for (int i = 0; i < this.f3460a.size(); i++) {
                View view = (View) this.f3460a.get(i);
                Page startPage = pdfDocument.startPage(new Builder(view.getWidth(), view.getHeight(), i).create());
                view.draw(startPage.getCanvas());
                startPage.getCanvas().translate(0.0f, (float) view.getHeight());
                pdfDocument.finishPage(startPage);
            }
            pdfDocument.writeTo(new FileOutputStream(file));
            try {
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{""});
                intent.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099887));
                intent.putExtra("android.intent.extra.TEXT", this.f3470k);
                ArrayList arrayList = new ArrayList();
                this.f3465f.add(0, "report.pdf");
                ExpenseCustomActivities.m3065a(this.f3465f, "reports.zip");
                arrayList.add(Uri.fromFile(new File(co.f4430d + "/" + "reports.zip")));
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                context.startActivity(Intent.createChooser(intent, "Send mail..."));
                file.delete();
                return true;
            } catch (Exception e) {
                Exception exception2 = e;
                z = true;
                exception = exception2;
                exception.printStackTrace();
                return z;
            }
        } catch (Exception e2) {
            exception = e2;
            z = false;
            exception.printStackTrace();
            return z;
        }
    }

    protected void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903118);
        this.f3468i = getIntent().getStringExtra("account");
        this.f3469j = getIntent().getStringExtra("whereClause");
        this.f3470k = getIntent().getStringExtra("msgBody");
        this.f3467h = (LinearLayout) findViewById(2131558894);
        ro roVar = new ro(this.f3466g);
        List arrayList = new ArrayList();
        ExpenseAccountActivities.m2602a(roVar, this.f3469j, arrayList, false, "expensed ASC");
        setTitle(getResources().getString(2131099887) + ": " + arrayList.size());
        int size = arrayList.size() / 40;
        int i2 = arrayList.size() % 40 != 0 ? size + 1 : size;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 40;
            size = (i3 + 1) * 40;
            if (size > arrayList.size()) {
                size = arrayList.size();
            }
            String a = m3439a(arrayList, i4, size);
            View webView = new WebView(this);
            webView.loadDataWithBaseURL("file:///", a, "text/html", "utf-8", "");
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            this.f3467h.addView(webView);
            this.f3460a.add(webView);
        }
        ArrayList arrayList2 = new ArrayList();
        for (i4 = 0; i4 < arrayList.size(); i4++) {
            String str = (String) ((Map) arrayList.get(i4)).get("property2");
            if (!(str == null || "".equals(str))) {
                arrayList2.add(str);
            }
        }
        while (i < arrayList2.size()) {
            String str2 = "<table><tr><td id=image1></td><td id=image2></td><td id=image3></td></tr></table>";
            str = (String) arrayList2.get(i);
            a = "<td><span style=font-size:5pt;>fileName</span><p><img HEIGHT='420px' WIDTH='300px' src='file://fileName'/></p></td>";
            if (!(str == null || "".equals(str))) {
                str2 = str2.replaceAll("<td id=image1></td>", a.replaceAll("fileName", co.f4431e + str));
            }
            if (i + 1 < arrayList2.size()) {
                str = (String) arrayList2.get(i + 1);
                if (!(str == null || "".equals(str))) {
                    str2 = str2.replaceAll("<td id=image2></td>", a.replaceAll("fileName", co.f4431e + str));
                }
            }
            if (i + 2 < arrayList2.size()) {
                str = (String) arrayList2.get(i + 2);
                if (!(str == null || "".equals(str))) {
                    a = str2.replaceAll("<td id=image3></td>", a.replaceAll("fileName", co.f4431e + str));
                    webView = new WebView(this);
                    webView.getSettings().setLoadWithOverviewMode(true);
                    webView.getSettings().setUseWideViewPort(true);
                    webView.loadDataWithBaseURL("fake://not/needed", a, "text/html", "utf-8", "");
                    this.f3467h.addView(webView);
                    this.f3460a.add(webView);
                    i += 3;
                }
            }
            a = str2;
            webView = new WebView(this);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.loadDataWithBaseURL("fake://not/needed", a, "text/html", "utf-8", "");
            this.f3467h.addView(webView);
            this.f3460a.add(webView);
            i += 3;
        }
        if (arrayList.size() > 200) {
            aib.m3849a(this.f3466g, null, getResources().getString(2131099702), 17301543, "There are more than 200 records in the report. The PDF file size will be very large.", getResources().getString(2131099983), null, null, null).show();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492874, menu);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559161) {
            try {
                new aaw(this).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m3441a(this.f3466g);
            return true;
        } else if (itemId != 16908332) {
            return super.onMenuItemSelected(i, menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
