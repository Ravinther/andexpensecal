package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class ExpenseMileageSearch extends Activity {
    int f3290a;
    ro f3291b;
    private Context f3292c;
    private AutoCompleteTextView f3293d;
    private Button f3294e;
    private Spinner f3295f;
    private Button f3296g;
    private Button f3297h;
    private int f3298i;
    private int f3299j;
    private int f3300k;
    private int f3301l;
    private int f3302m;
    private int f3303n;
    private String f3304o;
    private OnDateSetListener f3305p;

    public ExpenseMileageSearch() {
        this.f3292c = this;
        this.f3304o = "Personal Expense";
        this.f3290a = 0;
        this.f3305p = new wf(this);
    }

    private String m3252a() {
        String str;
        Exception e;
        String str2 = "account='" + this.f3304o + "'";
        try {
            str2 = str2 + " and " + "expensed" + ">=" + abd.m3818c(this.f3296g.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f3297h.getText().toString());
            if ("".equals(this.f3294e.getText().toString())) {
                Resources resources = this.f3292c.getResources();
                String[] strArr = new String[]{resources.getString(2131100026), resources.getString(2131100021), resources.getString(2131099747)};
                if (this.f3295f.getSelectedItemPosition() == 1) {
                    str2 = str2 + " and " + "property" + " like '%" + strArr[1] + "%' ";
                }
                str = this.f3295f.getSelectedItemPosition() == 2 ? str2 + " and " + "property" + " like '%" + strArr[2] + "%' " : str2;
            } else {
                str = str2 + " and " + " (" + abd.m3815b("expense_tag", this.f3294e.getText().toString()) + ")";
            }
            try {
                str2 = this.f3293d.getText().toString();
                if (!(str2 == null || str2.equals(""))) {
                    str = str + " and LOWER(" + "description" + ") LIKE '%" + str2.trim().toLowerCase() + "%'";
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            str = str2;
            e = exception;
            e.printStackTrace();
            return str;
        }
        return str;
    }

    private String m3255a(String str) {
        ro roVar = new ro(this.f3292c);
        List arrayList = new ArrayList();
        ExpenseMileageActivities.m3211a(this, roVar, str, arrayList, "expensed DESC", false);
        StringBuffer append = m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(new StringBuffer("<html><head><title>").append("Expense Report</title>").append("</head><body><p><b>" + getResources().getString(2131099678) + ": " + this.f3304o + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, getResources().getString(2131099678), 0, "6%", "BLACK", "left"), true, getResources().getString(2131099794), 0, "6%", "BLACK", "left"), true, getResources().getString(2131099815), 0, "12%", "BLACK", "left"), true, getResources().getString(2131100099), 0, "8%", "BLACK", "center"), true, getResources().getString(2131099871), 0, "8%", "BLACK", "center"), true, getResources().getString(2131099950), 0, "8%", "BLACK", "center"), true, getResources().getString(2131099723), 0, "8%", "BLACK", "center"), true, getResources().getString(2131100011), 0, "10%", "BLACK", "center"), true, getResources().getString(2131099755), 0, "10%", "BLACK", "center"), true, getResources().getString(2131100034), 0, "5%", "BLACK", "center"), true, getResources().getString(2131100110), 0, "5%", "BLACK", "center"), true, getResources().getString(2131099813), 0, "15%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str2 = "#FFFFFF";
        String a = abd.m3786a((Context) this, roVar, this.f3304o + "_" + "AUTO_ACCOUNT", "mi");
        int size = arrayList.size() - 1;
        double d = 0.0d;
        double d2 = 0.0d;
        StringBuffer stringBuffer = append;
        while (size >= 0) {
            Map map = (Map) arrayList.get(size);
            StringBuffer append2 = m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(stringBuffer.append("<tr bgcolor=" + ((size / 2) * 2 == size ? "#FCF6CF" : "#FFFFFF") + " align=center>"), false, (String) map.get("account"), 0, "6%", "BLACK", "left"), false, (String) map.get("date"), 0, "6%", "BLACK", "left"), false, (String) map.get("status"), 0, "12%", "BLACK", "left"), false, aib.m3865b((String) map.get("startOdometer")), 0, "8%", "BLACK", "right"), false, aib.m3865b((String) map.get("endOdometer")), 0, "8%", "BLACK", "right"), false, aib.m3865b((String) map.get("mileage")), 0, "8%", "BLACK", "right"), false, aba.m3767b((String) map.get("amount")), 0, "8%", "RED", "right"), false, (String) map.get("paymentMethod"), 0, "10%", "BLACK", "right"), false, (String) map.get("category"), 0, "10%", "BLACK", "center"), false, (String) map.get("property"), 0, "5%", "BLACK", "center"), false, (String) map.get("tag"), 0, "5%", "BLACK", "center"), false, (String) map.get("description"), 0, "15%", "BLACK", "left").append("</tr>");
            str2 = (String) map.get("amount");
            if (!((String) map.get("category")).toUpperCase().startsWith("INCOME")) {
                str2 = "-" + str2;
            }
            double a2 = aba.m3742a(d2, str2);
            size--;
            d = aba.m3742a(d, aib.m3865b((String) map.get("mileage")).replace("mi", "").replace("km", "").trim());
            d2 = a2;
            stringBuffer = append2;
        }
        stringBuffer = stringBuffer.append("</table>");
        str2 = "GREEN";
        String a3 = aba.m3746a(d2);
        return m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(m3256a(stringBuffer.append("<table bgcolor=#A4D1FF cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "Total", 0, "8%", "BLACK", "right"), true, d + " " + a, 0, "8%", "BLACK", "right"), true, a3, 0, "8%", a3.trim().startsWith("(") ? "RED" : str2, "right"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "5%", "BLACK", "center"), true, "", 0, "5%", "BLACK", "center"), true, "", 0, "15%", "BLACK", "center").append("</tr></table></body></html>").toString();
    }

    public static StringBuffer m3256a(StringBuffer stringBuffer, boolean z, String str, int i, String str2, String str3, String str4) {
        return z ? stringBuffer.append("<td width=" + str2 + " align=" + str4 + " ><font color=" + str3 + "><b>" + str + "</b></font></td>") : stringBuffer.append("<td width=" + str2 + " align=" + str4 + " ><font color=" + str3 + ">" + str + "</font></td>");
    }

    private void m3258a(String[] strArr, Button button) {
        boolean[] zArr = new boolean[strArr.length];
        String charSequence = button.getText().toString();
        if (!(charSequence == null || "".equals(charSequence))) {
            List arrayList = new ArrayList(Arrays.asList(strArr));
            String[] split = charSequence.split(",");
            for (Object indexOf : split) {
                int indexOf2 = arrayList.indexOf(indexOf);
                if (indexOf2 < zArr.length && indexOf2 != -1) {
                    zArr[indexOf2] = true;
                }
            }
        }
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new wn(this, zArr)).setPositiveButton(2131099983, new wm(this, zArr, strArr, button)).setNegativeButton(2131100057, new wl(this, button)).show();
    }

    private void m3261b() {
        this.f3296g.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3298i + "-" + (this.f3299j + 1) + "-" + this.f3300k));
        this.f3297h.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3301l + "-" + (this.f3302m + 1) + "-" + this.f3303n));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131100071);
        getWindow().setSoftInputMode(3);
        this.f3291b = new ro(this);
        this.f3304o = getIntent().getStringExtra("account");
        if (this.f3304o == null || "".equals(this.f3304o)) {
            this.f3304o = "Personal Expense";
        }
        setContentView(2130903105);
        this.f3296g = (Button) findViewById(2131558658);
        this.f3296g.setOnClickListener(new we(this));
        this.f3297h = (Button) findViewById(2131558762);
        this.f3297h.setOnClickListener(new wg(this));
        Calendar instance = Calendar.getInstance();
        this.f3298i = instance.get(1) - 1;
        this.f3299j = instance.get(2);
        this.f3300k = instance.get(5);
        this.f3301l = instance.get(1);
        this.f3302m = instance.get(2);
        this.f3303n = instance.get(5);
        m3261b();
        this.f3293d = (AutoCompleteTextView) findViewById(2131558537);
        String str = "account in ('" + this.f3304o + "')";
        try {
            long c = abd.m3818c(this.f3296g.getText().toString());
            str = str + " and " + "expensed" + ">=" + c + " and " + "expensed" + "<=" + abd.m3820d(this.f3297h.getText().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List a = abd.m3798a(this.f3291b, str, "description");
        String[] strArr = (String[]) a.toArray(new String[a.size()]);
        if (strArr != null && strArr.length > 0) {
            this.f3293d.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        }
        Resources resources = this.f3292c.getResources();
        String[] strArr2 = new String[]{resources.getString(2131100026), resources.getString(2131100021), resources.getString(2131099747)};
        SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 2130903151, new ArrayList(Arrays.asList(strArr2)));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f3295f = (Spinner) findViewById(2131558849);
        this.f3295f.setAdapter(arrayAdapter);
        this.f3294e = (Button) findViewById(2131558553);
        this.f3294e.setOnClickListener(new wh(this, strArr2));
        Button button = (Button) findViewById(2131558852);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new wi(this));
        button = (Button) findViewById(2131558851);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new wj(this));
        button = (Button) findViewById(2131558449);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new wk(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f3290a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3305p, this.f3298i, this.f3299j, this.f3300k);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3305p, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3305p, this.f3301l, this.f3302m, this.f3303n);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f3305p, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f3290a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f3298i, this.f3299j, this.f3300k);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3301l, this.f3302m, this.f3303n);
            default:
        }
    }
}
