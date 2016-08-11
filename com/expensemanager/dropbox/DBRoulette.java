package com.expensemanager.dropbox;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.dropbox.client2.C0381d;
import com.dropbox.client2.C0383f;
import com.dropbox.client2.android.C0359a;
import com.dropbox.client2.p029a.C0345a;
import com.dropbox.client2.p029a.C0347c;
import com.dropbox.client2.p029a.C0349e;
import com.dropbox.client2.p029a.C0350f;
import com.dropbox.client2.p029a.C0353i;
import com.dropbox.client2.p029a.C0355k;
import com.dropbox.client2.p030c.C0374p;
import com.dropbox.client2.p030c.C0375k;
import com.dropbox.client2.p030c.C0376l;
import com.dropbox.client2.p030c.C0377n;
import com.expensemanager.abd;
import com.expensemanager.aib;
import com.expensemanager.co;
import java.io.File;
import java.io.FileOutputStream;

public class DBRoulette extends Activity {
    private static final C0377n f4492b;
    C0356a<C0359a> f4493a;
    private boolean f4494c;
    private Button f4495d;
    private LinearLayout f4496e;
    private Button f4497f;
    private Button f4498g;
    private Button f4499h;
    private Button f4500i;
    private Button f4501j;
    private Button f4502k;
    private TextView f4503l;
    private CheckBox f4504m;
    private Context f4505n;

    static {
        f4492b = C0377n.DROPBOX;
    }

    public DBRoulette() {
        this.f4505n = this;
    }

    public static C0356a<C0359a> m4050a(Context context) {
        C0376l c0376l = new C0376l("f1g4pd3ltbrfaoc", co.f4435i);
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs", 0);
        String string = sharedPreferences.getString("ACCESS_KEY", null);
        String string2 = sharedPreferences.getString("ACCESS_SECRET", null);
        String[] strArr = new String[2];
        if (!(string == null || string2 == null)) {
            strArr[0] = string;
            strArr[1] = string2;
        }
        if (strArr[0] == null || strArr[1] == null || "".equals(strArr[0]) || "".equals(strArr[1])) {
            return null;
        }
        return new C0356a(new C0359a(c0376l, f4492b, new C0375k(strArr[0], strArr[1])));
    }

    public static String m4051a(Context context, C0356a<?> c0356a, String str) {
        try {
            C0383f a = c0356a.m2286a(str, 1, null, false, null);
            return a != null ? a.f2388e : null;
        } catch (C0345a e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void m4052a() {
        ((C0359a) this.f4493a.m2283a()).m2329c();
        m4067d();
        m4056a(false);
    }

    private void m4054a(String str) {
        Toast.makeText(this, str, 1).show();
    }

    private void m4055a(String str, String str2) {
        Editor edit = getSharedPreferences("prefs", 0).edit();
        edit.putString("ACCESS_KEY", str);
        edit.putString("ACCESS_SECRET", str2);
        edit.commit();
    }

    private void m4056a(boolean z) {
        this.f4494c = z;
        if (z) {
            this.f4495d.setText(2131099836);
            this.f4496e.setVisibility(0);
            this.f4503l.setText(2131099835);
            return;
        }
        this.f4495d.setText(2131099834);
        this.f4496e.setVisibility(8);
        this.f4503l.setText(2131099837);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4057a(com.dropbox.client2.C0356a<com.dropbox.client2.android.C0359a> r7, android.content.Context r8, java.lang.String r9, java.io.File r10) {
        /*
        r0 = 0;
        r1 = "";
        r3 = new java.io.FileInputStream;	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r3.<init>(r10);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = new java.lang.StringBuilder;	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1.<init>();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = r1.append(r9);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r2 = r10.getName();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = r1.append(r2);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r2 = r1.toString();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r4 = r10.length();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r6 = 0;
        r1 = r7;
        r1 = r1.m2287a(r2, r3, r4, r6);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        if (r1 == 0) goto L_0x0059;
    L_0x0029:
        r1 = r1.m2335b();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        if (r1 == 0) goto L_0x0036;
    L_0x002f:
        r3 = "DB_MODIFIED";
        r1 = r1.f2388e;	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        com.expensemanager.aib.m3859a(r8, r3, r1);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
    L_0x0036:
        r1 = new java.lang.StringBuilder;	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1.<init>();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = r1.append(r9);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r3 = "yyyy-MM-dd";
        r3 = com.expensemanager.aib.m3874f(r3);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = r1.append(r3);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r3 = ".db";
        r1 = r1.append(r3);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r1 = r1.toString();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        r7.m2288a(r1);	 Catch:{ i -> 0x005b, k -> 0x0060, b -> 0x0064, f -> 0x0068, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
    L_0x0056:
        r7.m2289b(r2, r1);	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
    L_0x0059:
        r0 = 1;
    L_0x005a:
        return r0;
    L_0x005b:
        r3 = move-exception;
        r3.printStackTrace();	 Catch:{ k -> 0x0060, b -> 0x0064, f -> 0x0068, i -> 0x006c, c -> 0x0091, e -> 0x0095, a -> 0x0099, FileNotFoundException -> 0x009f, Exception -> 0x009d }
        goto L_0x0056;
    L_0x0060:
        r1 = move-exception;
        r1 = "This app wasn't authenticated properly.";
        goto L_0x005a;
    L_0x0064:
        r1 = move-exception;
        r1 = "This file is too big to upload";
        goto L_0x005a;
    L_0x0068:
        r1 = move-exception;
        r1 = "Upload canceled";
        goto L_0x005a;
    L_0x006c:
        r1 = move-exception;
        r2 = r1.f2329b;
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r2 != r3) goto L_0x007e;
    L_0x0073:
        r2 = r1.f2328a;
        r2 = r2.f2335b;
        if (r2 != 0) goto L_0x005a;
    L_0x0079:
        r1 = r1.f2328a;
        r1 = r1.f2334a;
        goto L_0x005a;
    L_0x007e:
        r2 = r1.f2329b;
        r3 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r2 == r3) goto L_0x0073;
    L_0x0084:
        r2 = r1.f2329b;
        r3 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r2 == r3) goto L_0x0073;
    L_0x008a:
        r2 = r1.f2329b;
        r3 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        if (r2 != r3) goto L_0x0073;
    L_0x0090:
        goto L_0x0073;
    L_0x0091:
        r1 = move-exception;
        r1 = "Network error.  Try again.";
        goto L_0x005a;
    L_0x0095:
        r1 = move-exception;
        r1 = "Dropbox error.  Try again.";
        goto L_0x005a;
    L_0x0099:
        r1 = move-exception;
        r1 = "Unknown error.  Try again.";
        goto L_0x005a;
    L_0x009d:
        r1 = move-exception;
        goto L_0x005a;
    L_0x009f:
        r1 = move-exception;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.dropbox.DBRoulette.a(com.dropbox.client2.a, android.content.Context, java.lang.String, java.io.File):boolean");
    }

    public static boolean m4058a(C0356a<C0359a> c0356a, Context context, String str, String str2) {
        String str3;
        String str4 = "";
        boolean z = false;
        File databasePath = context.getDatabasePath("personal_finance.db");
        File file = new File(context.getCacheDir().getAbsolutePath() + "/" + str2);
        try {
            C0381d a = c0356a.m2284a(str + str2, null, new FileOutputStream(file), null);
            if (a != null && a.m2340a() > 0) {
                z = true;
            }
        } catch (C0355k e) {
        } catch (C0350f e2) {
            str3 = "Download canceled";
        } catch (C0353i e3) {
            if (!(e3.f2329b == 304 || e3.f2329b == 401 || e3.f2329b == 403 || e3.f2329b == 404 || e3.f2329b == 406 || e3.f2329b == 415 || e3.f2329b != 507)) {
            }
            if (e3.f2328a.f2335b == null) {
                str3 = e3.f2328a.f2334a;
            }
        } catch (C0347c e4) {
            str3 = "Network error.  Try again.";
        } catch (C0349e e5) {
            str3 = "Dropbox error.  Try again.";
        } catch (C0345a e6) {
            str3 = "Unknown error.  Try again.";
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return z ? file.renameTo(databasePath) : z;
    }

    public static boolean m4059a(C0356a<C0359a> c0356a, Context context, String str, String str2, String str3) {
        boolean z;
        String str4 = "";
        File file = new File(str2 + "/" + str3);
        try {
            C0381d a = c0356a.m2284a(str + str3, null, new FileOutputStream(file), null);
            if (a != null && a.m2340a() > 0) {
                z = true;
                return (z || file.length() > 0) ? z : false;
            }
        } catch (C0355k e) {
            z = false;
        } catch (C0350f e2) {
            str4 = "Download canceled";
            z = false;
        } catch (C0353i e3) {
            if (!(e3.f2329b == 304 || e3.f2329b == 401 || e3.f2329b == 403 || e3.f2329b == 404 || e3.f2329b == 406 || e3.f2329b == 415 || e3.f2329b != 507)) {
            }
            if (e3.f2328a.f2335b == null) {
                str4 = e3.f2328a.f2334a;
            }
            z = false;
        } catch (C0347c e4) {
            str4 = "Network error.  Try again.";
            z = false;
        } catch (C0349e e5) {
            str4 = "Dropbox error.  Try again.";
            z = false;
        } catch (C0345a e6) {
            str4 = "Unknown error.  Try again.";
            z = false;
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        z = false;
        if (z) {
        }
    }

    private void m4061b() {
        if ("f1g4pd3ltbrfaoc".startsWith("CHANGE") || co.f4435i.startsWith("CHANGE")) {
            m4054a("You must apply for an app key and secret from developers.dropbox.com, and add them to the DBRoulette ap before trying it.");
            finish();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        String str = "db-f1g4pd3ltbrfaoc";
        intent.setData(Uri.parse(str + "://" + 1 + "/test"));
        if (getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
            m4054a("URL scheme in your app's manifest is not set up correctly. You should have a com.dropbox.client2.android.AuthActivity with the scheme: " + str);
            finish();
        }
    }

    public static boolean m4063b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 4);
        boolean z = sharedPreferences.getBoolean("SYNC_FLAG", false);
        boolean z2 = sharedPreferences.getBoolean("AUTO_SYNC", false);
        C0356a a = m4050a(context);
        if (a == null) {
            return false;
        }
        boolean a2;
        if (z) {
            File databasePath = context.getDatabasePath("personal_finance.db");
            if (databasePath == null || !databasePath.exists()) {
                return false;
            }
            a2 = m4057a(a, context, "/ExpenseManager/Database/", databasePath);
            abd.m3805a(context, false);
        } else {
            if (z2) {
                String string = sharedPreferences.getString("DB_MODIFIED", null);
                String a3 = m4051a(context, a, "/ExpenseManager/Database/personal_finance.db");
                if (!(string == null || a3 == null || a3.equals(string))) {
                    a2 = m4058a(a, context, "/ExpenseManager/Database/", "personal_finance.db");
                    aib.m3859a(context, "DB_MODIFIED", a3);
                }
            }
            a2 = false;
        }
        return a2;
    }

    private String[] m4065c() {
        SharedPreferences sharedPreferences = getSharedPreferences("prefs", 0);
        String string = sharedPreferences.getString("ACCESS_KEY", null);
        String string2 = sharedPreferences.getString("ACCESS_SECRET", null);
        if (string == null || string2 == null) {
            return null;
        }
        return new String[]{string, string2};
    }

    private void m4067d() {
        Editor edit = getSharedPreferences("prefs", 0).edit();
        edit.clear();
        edit.commit();
    }

    private C0359a m4068e() {
        C0376l c0376l = new C0376l("f1g4pd3ltbrfaoc", co.f4435i);
        String[] c = m4065c();
        if (c == null) {
            return new C0359a(c0376l, f4492b);
        }
        return new C0359a(c0376l, f4492b, new C0375k(c[0], c[1]));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        this.f4493a = new C0356a(m4068e());
        setContentView(2130903070);
        setTitle("Dropbox");
        m4061b();
        SharedPreferences sharedPreferences = getSharedPreferences("MY_PORTFOLIO_TITLES", 4);
        Editor edit = sharedPreferences.edit();
        this.f4495d = (Button) findViewById(2131558584);
        aib.m3858a((Context) this, this.f4495d, -1);
        this.f4495d.setOnClickListener(new C0425a(this, edit));
        this.f4496e = (LinearLayout) findViewById(2131558586);
        this.f4497f = (Button) findViewById(2131558588);
        aib.m3858a((Context) this, this.f4497f, -1);
        this.f4503l = (TextView) findViewById(2131558585);
        this.f4504m = (CheckBox) findViewById(2131558597);
        this.f4504m.setChecked(sharedPreferences.getBoolean("AUTO_SYNC", false));
        this.f4504m.setOnClickListener(new C0426b(this, edit));
        this.f4497f.setOnClickListener(new C0427c(this));
        this.f4498g = (Button) findViewById(2131558589);
        aib.m3858a((Context) this, this.f4498g, -1);
        this.f4498g.setOnClickListener(new C0428d(this));
        this.f4499h = (Button) findViewById(2131558591);
        aib.m3858a((Context) this, this.f4499h, -1);
        this.f4499h.setOnClickListener(new C0429e(this));
        this.f4500i = (Button) findViewById(2131558592);
        aib.m3858a((Context) this, this.f4500i, -1);
        this.f4500i.setOnClickListener(new C0430f(this));
        this.f4501j = (Button) findViewById(2131558594);
        aib.m3858a((Context) this, this.f4501j, -1);
        this.f4501j.setOnClickListener(new C0431g(this));
        this.f4502k = (Button) findViewById(2131558595);
        aib.m3858a((Context) this, this.f4502k, -1);
        this.f4502k.setOnClickListener(new C0432h(this));
        m4056a(((C0359a) this.f4493a.m2283a()).m2321h());
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    protected void onResume() {
        super.onResume();
        C0359a c0359a = (C0359a) this.f4493a.m2283a();
        if (c0359a.m2327a()) {
            try {
                c0359a.m2328b();
                C0374p e = c0359a.m2318e();
                m4055a(e.f2366a, e.f2367b);
                m4056a(true);
            } catch (IllegalStateException e2) {
                m4054a("Couldn't authenticate with Dropbox:" + e2.getLocalizedMessage());
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
