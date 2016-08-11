package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ExpenseCustomActivities extends Activity {
    private String f3138A;
    private OnDateSetListener f3139B;
    int f3140a;
    ro f3141b;
    ArrayList<String> f3142c;
    private Context f3143d;
    private Button f3144e;
    private Button f3145f;
    private TextView f3146g;
    private RadioButton f3147h;
    private RadioButton f3148i;
    private RadioButton f3149j;
    private TextView f3150k;
    private TextView f3151l;
    private TextView f3152m;
    private TextView f3153n;
    private TextView f3154o;
    private TextView f3155p;
    private AutoCompleteTextView f3156q;
    private AutoCompleteTextView f3157r;
    private AutoCompleteTextView f3158s;
    private CheckBox f3159t;
    private int f3160u;
    private int f3161v;
    private int f3162w;
    private int f3163x;
    private int f3164y;
    private int f3165z;

    public ExpenseCustomActivities() {
        this.f3143d = this;
        this.f3138A = "Personal Expense";
        this.f3140a = 0;
        this.f3142c = new ArrayList();
        this.f3139B = new qj(this);
    }

    private String m3059a() {
        String charSequence;
        Exception e;
        String str = "account in (" + abd.m3792a(this.f3146g.getText().toString()) + ")";
        try {
            str = str + " and " + "expensed" + ">" + abd.m3818c(this.f3144e.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f3145f.getText().toString());
            if (this.f3147h.isChecked()) {
                str = str + " and " + "category" + "!='Income'";
            }
            if (this.f3148i.isChecked()) {
                str = str + " and " + "category" + "='Income'";
            }
            charSequence = this.f3153n.getText().toString();
            if (!(charSequence == null || "".endsWith(charSequence))) {
                str = str + " and " + "payment_method" + " in (" + abd.m3792a(charSequence.trim()) + ")";
            }
            charSequence = this.f3154o.getText().toString();
            if (!(charSequence == null || "".endsWith(charSequence))) {
                str = str + " and " + "status" + " in (" + abd.m3792a(charSequence.trim()) + ")";
            }
            charSequence = this.f3155p.getText().toString();
            if (!(charSequence == null || "".equals(charSequence))) {
                str = str + " and " + " (" + m3061a("expense_tag", charSequence) + ")";
            }
            if (this.f3159t.isChecked()) {
                str = str + " and " + "tax" + "!=''";
            }
            String obj = this.f3158s.getText().toString();
            if (!(obj == null || obj.equals(""))) {
                charSequence = obj.trim();
                if (charSequence.indexOf(".") != -1) {
                    charSequence = charSequence.substring(0, charSequence.indexOf("."));
                }
                str = str + " and (" + "amount" + "='" + obj.trim() + "' or " + "amount" + "='" + charSequence + "' or " + "amount" + " LIKE '" + charSequence + ".%')";
            }
            charSequence = this.f3157r.getText().toString();
            if (!(charSequence == null || charSequence.equals(""))) {
                str = str + " and LOWER(" + "reference_number" + ") LIKE '%" + charSequence.replaceAll("'", "''") + "%'";
            }
            charSequence = this.f3156q.getText().toString();
            if (!(charSequence == null || charSequence.equals(""))) {
                str = str + " and LOWER(" + "description" + ") LIKE '%" + charSequence.trim().toLowerCase() + "%'";
            }
            charSequence = this.f3151l.getText().toString();
            if (!(charSequence == null || "".equals(charSequence))) {
                str = str + " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
            }
            charSequence = this.f3152m.getText().toString();
            charSequence = (charSequence == null || "".equals(charSequence)) ? str : str + " and " + "subcategory" + " in (" + abd.m3792a(charSequence.trim()) + ")";
            try {
                str = this.f3150k.getText().toString();
                if (!(str == null || "".equals(str))) {
                    charSequence = charSequence + " and " + "property" + " in (" + abd.m3792a(str.trim()) + ")";
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return charSequence;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            charSequence = str;
            e = exception;
            e.printStackTrace();
            return charSequence;
        }
        return charSequence;
    }

    public static String m3060a(Context context, String str, String str2, ArrayList<String> arrayList) {
        String str3;
        ro roVar = new ro(context);
        List arrayList2 = new ArrayList();
        ExpenseAccountActivities.m2602a(roVar, str, arrayList2, false, "expensed DESC");
        Resources resources = context.getResources();
        StringBuffer append = m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(new StringBuffer().append("<head><title>Expense Report</title></head>").append("<body><p><b>" + resources.getString(2131099678) + ": " + str2 + "</b></p>").append("<hr><table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, resources.getString(2131099678), 0, "10%", "BLACK", "left"), true, resources.getString(2131099794), 0, "7%", "BLACK", "left"), true, resources.getString(2131099723), 0, "6%", "BLACK", "left"), true, resources.getString(2131100115), 0, "6%", "BLACK", "left"), true, resources.getString(2131100007), 0, "10%", "BLACK", "left"), true, resources.getString(2131100011), 0, "10%", "BLACK", "left"), true, resources.getString(2131099755), 0, "12%", "BLACK", "left"), true, resources.getString(2131100039), 0, "7%", "BLACK", "left"), true, resources.getString(2131100101), 0, "7%", "BLACK", "left"), true, resources.getString(2131100110), 0, "8%", "BLACK", "left"), true, resources.getString(2131099813), 0, "10%", "BLACK", "left"), true, resources.getString(2131100037), 0, "7%", "BLACK", "left").append("</tr></table><hr>").append("<table cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%>");
        String str4 = "#FFFFFF";
        double d = 0.0d;
        double d2 = 0.0d;
        int size = arrayList2.size() - 1;
        double d3 = 0.0d;
        double d4 = 0.0d;
        while (size >= 0) {
            double a;
            double d5;
            Map map = (Map) arrayList2.get(size);
            StringBuffer append2 = append.append("<tr bgcolor=" + ((size / 2) * 2 == size ? "#FCF6CF" : "#FFFFFF") + " align=center>");
            str3 = ((String) map.get("category")).toUpperCase().startsWith("INCOME") ? "GREEN" : "RED";
            String str5 = (String) map.get("amount");
            String b = "RED".equalsIgnoreCase(str3) ? str5.startsWith("-") ? aba.m3767b(str5.replace("-", "")) : "-" + aba.m3767b(str5) : aba.m3767b(str5);
            StringBuffer append3 = m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(append2, false, (String) map.get("account"), 0, "10%", "BLACK", "left"), false, (String) map.get("date"), 0, "7%", "BLACK", "left"), false, b + "&nbsp;&nbsp;&nbsp;", 0, "6%", str3, "right"), false, ((String) map.get("tax")) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "BLACK", "right"), false, (String) map.get("property"), 0, "10%", "BLACK", "left"), false, (String) map.get("paymentMethod"), 0, "10%", "BLACK", "left"), false, (String) map.get("category"), 0, "12%", "BLACK", "left"), false, (String) map.get("referenceNumber"), 0, "7%", "BLACK", "left"), false, (String) map.get("status"), 0, "7%", "BLACK", "left"), false, (String) map.get("tag"), 0, "8%", "BLACK", "left"), false, (String) map.get("description"), 0, "10%", "BLACK", "left"), false, (String) map.get("property2"), 0, "7%", "BLACK", "left").append("</tr>");
            str4 = (String) map.get("amount");
            if (((String) map.get("category")).toUpperCase().startsWith("INCOME")) {
                a = aba.m3742a(d2, str4);
                d5 = d;
            } else {
                str4 = "-" + str4;
                d5 = aba.m3742a(d, str4);
                a = d2;
            }
            d2 = aba.m3742a(d4, str4);
            double a2 = aba.m3742a(d3, (String) map.get("tax"));
            if (!(map.get("property2") == null || "".equals(map.get("property2")))) {
                arrayList.add((String) map.get("property2"));
            }
            size--;
            d3 = a2;
            d = d5;
            d4 = d2;
            append = append3;
            d2 = a;
        }
        append = append.append("</table>");
        str4 = "GREEN";
        str3 = aba.m3746a(d4);
        return m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(m3062a(append.append("<table bgcolor=#A4D1FF cellpadding=0 cellspacing=0 style=border-collapse: collapse width=100%><tr>"), true, "", 0, "10%", "BLACK", "center"), true, "Total Income", 0, "7%", "BLACK", "center"), true, aba.m3746a(d2) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "GREEN", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr>"), true, "", 0, "10%", "BLACK", "center"), true, "Total Expense", 0, "7%", "BLACK", "center"), true, aba.m3762b(d) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "RED", "right"), true, "", 0, "6%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr>").append("<tr>"), true, "", 0, "10%", "BLACK", "center"), true, "Total Balance", 0, "7%", "BLACK", "center"), true, str3 + "&nbsp;&nbsp;&nbsp;", 0, "6%", str3.trim().startsWith("(") ? "RED" : str4, "right"), true, aba.m3762b(d3) + "&nbsp;&nbsp;&nbsp;", 0, "6%", "RED", "right"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "12%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center"), true, "", 0, "8%", "BLACK", "center"), true, "", 0, "10%", "BLACK", "center"), true, "", 0, "7%", "BLACK", "center").append("</tr></table></body>").toString();
    }

    public static String m3061a(String str, String str2) {
        if (str2.indexOf("'") != -1) {
            str2 = str2.replace("'", "''");
        }
        String str3 = "','||" + str + "||','";
        String[] split = str2.split(",");
        String str4 = "";
        for (int i = 0; i < split.length; i++) {
            str4 = "".equals(str4) ? str3 + " like '%," + split[i] + ",%'" : str4 + " OR " + str3 + " like '%," + split[i] + ",%'";
        }
        return str4;
    }

    public static StringBuffer m3062a(StringBuffer stringBuffer, boolean z, String str, int i, String str2, String str3, String str4) {
        return z ? stringBuffer.append("<td width=" + str2 + " align=" + str4 + " ><font size=2 color=" + str3 + "><b>" + str + "</b></font></td>") : stringBuffer.append("<td width=" + str2 + " align=" + str4 + " ><font size=2 color=" + str3 + ">" + str + "</font></td>");
    }

    private void m3064a(String[] strArr, TextView textView) {
        boolean[] zArr = new boolean[strArr.length];
        String charSequence = textView.getText().toString();
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
        new Builder(this).setTitle(2131100026).setMultiChoiceItems(strArr, zArr, new qo(this, zArr)).setPositiveButton(2131099983, new qn(this, zArr, strArr, textView)).setNegativeButton(2131100057, new ql(this, strArr, textView)).setNeutralButton(2131100076, new qk(this, strArr, textView)).show();
    }

    public static boolean m3065a(ArrayList<String> arrayList, String str) {
        Exception e;
        Throwable th;
        boolean z = false;
        if (!(arrayList == null || arrayList.size() == 0)) {
            ZipOutputStream zipOutputStream = null;
            ZipOutputStream zipOutputStream2;
            try {
                File file = new File(co.f4430d + "/" + str);
                if (file.exists()) {
                    file.delete();
                }
                zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    File[] listFiles = new File(co.f4431e).listFiles();
                    if (listFiles == null || listFiles.length == 0) {
                        try {
                            zipOutputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        for (int i = 0; i < listFiles.length; i++) {
                            if (arrayList.contains(listFiles[i].getName())) {
                                byte[] bArr = new byte[1024];
                                zipOutputStream2.putNextEntry(new ZipEntry(listFiles[i].getName()));
                                FileInputStream fileInputStream = new FileInputStream(listFiles[i]);
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    zipOutputStream2.write(bArr, 0, read);
                                }
                                fileInputStream.close();
                                zipOutputStream2.closeEntry();
                            }
                        }
                        z = true;
                        try {
                            zipOutputStream2.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    zipOutputStream = zipOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
                try {
                    e.printStackTrace();
                    try {
                        zipOutputStream.close();
                    } catch (IOException e222) {
                        e222.printStackTrace();
                    }
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    zipOutputStream2 = zipOutputStream;
                    try {
                        zipOutputStream2.close();
                    } catch (IOException e2222) {
                        e2222.printStackTrace();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream2 = null;
                zipOutputStream2.close();
                throw th;
            }
        }
        return z;
    }

    private void m3068b() {
        this.f3144e.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3160u + "-" + (this.f3161v + 1) + "-" + this.f3162w));
        this.f3145f.setText(aba.m3757a("yyyy-MM-dd", ExpenseManager.f3244t, this.f3163x + "-" + (this.f3164y + 1) + "-" + this.f3165z));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CharSequence charSequence = "";
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                charSequence = extras.getString("account");
            }
        }
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    this.f3146g.setText(charSequence);
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle(2131100071);
        getWindow().setSoftInputMode(3);
        this.f3141b = new ro(this);
        this.f3138A = getIntent().getStringExtra("account");
        if (this.f3138A == null || "".equals(this.f3138A)) {
            this.f3138A = "Personal Expense";
        }
        setContentView(2130903096);
        this.f3146g = (TextView) findViewById(2131558476);
        this.f3146g.setText(this.f3138A);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131558475);
        Object a = abd.m3786a(this.f3143d, this.f3141b, "MY_ACCOUNT_NAMES", "Personal Expense");
        if ("All".equals(this.f3138A)) {
            this.f3146g.setText(a);
        }
        relativeLayout.setOnClickListener(new qb(this, a));
        this.f3144e = (Button) findViewById(2131558652);
        this.f3145f = (Button) findViewById(2131558654);
        this.f3144e.setOnClickListener(new qm(this));
        this.f3145f.setOnClickListener(new qp(this));
        Calendar instance = Calendar.getInstance();
        this.f3160u = instance.get(1) - 1;
        this.f3161v = instance.get(2);
        this.f3162w = instance.get(5);
        this.f3163x = instance.get(1);
        this.f3164y = instance.get(2);
        this.f3165z = instance.get(5);
        m3068b();
        TextView textView = (TextView) findViewById(2131558691);
        this.f3150k = (TextView) findViewById(2131558699);
        this.f3150k.setOnClickListener(new qq(this));
        this.f3151l = (TextView) findViewById(2131558720);
        this.f3151l.setOnClickListener(new qr(this));
        this.f3152m = (TextView) findViewById(2131558724);
        this.f3152m.setOnClickListener(new qs(this));
        this.f3147h = (RadioButton) findViewById(2131558763);
        this.f3148i = (RadioButton) findViewById(2131558764);
        this.f3149j = (RadioButton) findViewById(2131558770);
        this.f3147h.setOnClickListener(new qt(this, textView));
        this.f3148i.setOnClickListener(new qu(this, textView));
        this.f3149j.setOnClickListener(new qv(this, textView));
        this.f3153n = (TextView) findViewById(2131558771);
        this.f3153n.setOnClickListener(new qc(this));
        this.f3154o = (TextView) findViewById(2131558685);
        this.f3154o.setOnClickListener(new qd(this));
        this.f3155p = (TextView) findViewById(2131558772);
        this.f3155p.setOnClickListener(new qe(this));
        this.f3159t = (CheckBox) findViewById(2131558773);
        this.f3156q = (AutoCompleteTextView) findViewById(2131558537);
        String str2 = "account in (" + abd.m3792a(this.f3146g.getText().toString()) + ")";
        try {
            long c = abd.m3818c(this.f3144e.getText().toString());
            str = str2 + " and " + "expensed" + ">=" + c + " and " + "expensed" + "<=" + abd.m3820d(this.f3145f.getText().toString());
        } catch (Exception e) {
            e.printStackTrace();
            str = str2;
        }
        List a2 = abd.m3798a(this.f3141b, str, "description");
        String[] strArr = (String[]) a2.toArray(new String[a2.size()]);
        if (strArr != null && strArr.length > 0) {
            this.f3156q.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        }
        this.f3157r = (AutoCompleteTextView) findViewById(2131558548);
        a2 = abd.m3798a(this.f3141b, str, "reference_number");
        strArr = (String[]) a2.toArray(new String[a2.size()]);
        if (strArr != null && strArr.length > 0) {
            this.f3157r.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        }
        this.f3158s = (AutoCompleteTextView) findViewById(2131558526);
        a2 = abd.m3798a(this.f3141b, str, "amount");
        strArr = (String[]) a2.toArray(new String[a2.size()]);
        if (strArr != null && strArr.length > 0) {
            this.f3158s.setAdapter(new ArrayAdapter(this, 17367057, strArr));
        }
        Button button = (Button) findViewById(2131558774);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qf(this));
        button = (Button) findViewById(2131558775);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qg(this));
        button = (Button) findViewById(2131558776);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qh(this));
        button = (Button) findViewById(2131558777);
        aib.m3858a((Context) this, button, -1);
        button.setOnClickListener(new qi(this));
    }

    protected Dialog onCreateDialog(int i) {
        Calendar instance;
        this.f3140a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                try {
                    return new DatePickerDialog(this, this.f3139B, this.f3160u, this.f3161v, this.f3162w);
                } catch (Exception e) {
                    instance = Calendar.getInstance();
                    return new DatePickerDialog(this, this.f3139B, instance.get(1), instance.get(2), instance.get(5));
                }
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return new DatePickerDialog(this, this.f3139B, this.f3163x, this.f3164y, this.f3165z);
            default:
                return null;
        }
        instance = Calendar.getInstance();
        return new DatePickerDialog(this, this.f3139B, instance.get(1), instance.get(2), instance.get(5));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        this.f3140a = i;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                ((DatePickerDialog) dialog).updateDate(this.f3160u, this.f3161v, this.f3162w);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                ((DatePickerDialog) dialog).updateDate(this.f3163x, this.f3164y, this.f3165z);
            default:
        }
    }
}
