package com.expensemanager;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.C0607c;
import com.google.android.gms.common.C0619g;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0745a;
import com.google.api.client.json.p076a.C0772a;
import com.google.api.client.p047a.p048a.p049a.C0654a;
import com.google.api.client.p051b.C0659w;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Builder;
import com.google.api.services.drive.DriveScopes;
import java.io.File;
import java.util.List;

public class GoogleDrive extends Activity {
    private static Drive f3476b;
    private static ro f3477g;
    final Handler f3478a;
    private C0745a f3479c;
    private Button f3480d;
    private LinearLayout f3481e;
    private EditText f3482f;
    private Context f3483h;

    public GoogleDrive() {
        this.f3483h = this;
        this.f3478a = new Handler();
    }

    private Drive m3447a(C0745a c0745a) {
        return new Builder(C0654a.m6519a(), new C0772a(), c0745a).build();
    }

    public static void m3448a(Context context) {
        try {
            boolean z = context.getSharedPreferences("MY_PORTFOLIO_TITLES", 4).getBoolean("SYNC_FLAG", true);
            ro roVar = new ro(context);
            C0659w a = C0745a.m7006a(context, DriveScopes.DRIVE, new String[0]);
            String a2 = abd.m3786a(context, roVar, "GOOGLE_DRIVE_ACCOUNT", null);
            if (a2 != null && !"".equals(a2)) {
                a.m7008a(a2);
                f3476b = new Builder(C0654a.m6519a(), new C0772a(), a).build();
                if (f3476b != null && z) {
                    String str = aib.m3874f("yyyy-MM-dd") + ".db";
                    String a3 = abd.m3786a(context, roVar, "DRIVE_DB_DIR", "expensemanager/db");
                    File databasePath = context.getDatabasePath("personal_finance.db");
                    if (a3 != null && !"".equals(a3)) {
                        new Thread(new abn(a3.replace("\\", "/").split("/"), databasePath, str)).start();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m3449a(Button button, String str, String str2) {
        OnClickListener com_expensemanager_abj = new abj(this, button, str2);
        String string = getResources().getString(2131099833);
        String string2 = getResources().getString(2131099754);
        aib.m3849a(this, m3456b(str), string, 17301659, null, getResources().getString(2131099983), com_expensemanager_abj, string2, null).show();
    }

    private void m3454a(String str, File file, String str2, String str3) {
        ProgressDialog show = ProgressDialog.show(this, null, "Loading...", true, true);
        if (str == null || "".equals(str)) {
            m3462a(getResources().getString(2131099879));
        }
        if (file == null) {
            m3462a(getResources().getString(2131099879));
        }
        new Thread(new abl(this, str.replace("\\", "/").split("/"), str2, file, str3, show)).start();
    }

    private void m3455a(String str, List<File> list, String str2, List<String> list2) {
        ProgressDialog show = ProgressDialog.show(this, null, "Loading...", true, true);
        if (list == null || list2 == null) {
            m3462a(getResources().getString(2131099879));
        }
        if (str == null || "".equals(str)) {
            m3462a(getResources().getString(2131099879));
        }
        new Thread(new abm(this, str.replace("\\", "/").split("/"), list, str2, list2, show)).start();
    }

    private LinearLayout m3456b(String str) {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(10, 10, 10, 10);
        this.f3482f = new EditText(this);
        this.f3482f.setText(str);
        View textView = new TextView(this);
        textView.setText("(dir or dir/sub_dir)");
        textView.setTextSize(16.0f);
        textView.setTypeface(null, 2);
        linearLayout.addView(this.f3482f, new LayoutParams(-1, -2));
        linearLayout.addView(textView, new LayoutParams(-1, -2));
        this.f3482f.addTextChangedListener(new abk(this));
        return linearLayout;
    }

    private void m3460c() {
        finish();
    }

    public void m3462a(String str) {
        runOnUiThread(new abo(this, str));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (i2 != -1 || intent == null || intent.getExtras() == null) {
                    this.f3481e.setVisibility(8);
                    this.f3480d.setText(2131099765);
                    abd.m3810a((Context) this, f3477g, "GOOGLE_DRIVE_ACCOUNT");
                    return;
                }
                String stringExtra = intent.getStringExtra("authAccount");
                if (stringExtra != null) {
                    this.f3479c.m7008a(stringExtra);
                    f3476b = m3447a(this.f3479c);
                    this.f3480d.setText(stringExtra);
                    this.f3481e.setVisibility(0);
                    abd.m3810a((Context) this, f3477g, "GOOGLE_DRIVE_ACCOUNT");
                    abd.m3811a((Context) this, f3477g, "expense_preference", "GOOGLE_DRIVE_ACCOUNT", stringExtra);
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (i2 != -1) {
                    startActivityForResult(this.f3479c.m7007a(), 1);
                }
            default:
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903125);
        setTitle("Google Drive");
        StrictMode.setThreadPolicy(new ThreadPolicy.Builder().permitAll().build());
        try {
            CharSequence charSequence;
            OnClickListener com_expensemanager_abg = new abg(this);
            if (C0619g.m4944a((Context) this) != 0) {
                aib.m3849a(this.f3483h, null, getResources().getString(2131099702), 17301543, "Please update Google Play Store app to get Google Play services APK.", getResources().getString(2131099983), com_expensemanager_abg, null, null).show();
            }
            f3477g = new ro(this);
            this.f3479c = C0745a.m7006a(this, DriveScopes.DRIVE, new String[0]);
            String a = abd.m3786a((Context) this, f3477g, "GOOGLE_DRIVE_ACCOUNT", null);
            this.f3480d = (Button) findViewById(2131558898);
            aib.m3858a((Context) this, this.f3480d, -1);
            this.f3481e = (LinearLayout) findViewById(2131558899);
            Object obj;
            if (a == null || "".equals(a)) {
                this.f3481e.setVisibility(8);
                this.f3480d.setText(2131099765);
                obj = a;
            } else {
                if (a.toLowerCase().indexOf("@gmail.com") == -1) {
                    charSequence = a.trim() + "@gmail.com";
                } else {
                    obj = a;
                }
                this.f3480d.setText(charSequence);
                this.f3481e.setVisibility(0);
                this.f3479c.m7008a((String) charSequence);
                f3476b = m3447a(this.f3479c);
            }
            this.f3480d.setOnClickListener(new abp(this));
            if (charSequence == null || "".equals(charSequence)) {
                this.f3481e.setVisibility(8);
                this.f3480d.setText(2131099765);
            } else {
                this.f3480d.setText(charSequence);
                this.f3481e.setVisibility(0);
            }
            Button button = (Button) findViewById(2131558901);
            Button button2 = (Button) findViewById(2131558902);
            Button button3 = (Button) findViewById(2131558903);
            button.setText(abd.m3786a(this.f3483h, f3477g, "DRIVE_DB_DIR", "expensemanager/db"));
            button2.setText(abd.m3786a(this.f3483h, f3477g, "DRIVE_CSV_DIR", "expensemanager/csv"));
            button3.setText(abd.m3786a(this.f3483h, f3477g, "DRIVE_RECEIPT_DIR", "expensemanager/receipt"));
            button.setOnClickListener(new abq(this, button));
            button2.setOnClickListener(new abr(this, button2));
            button3.setOnClickListener(new abs(this, button3));
            Button button4 = (Button) findViewById(2131558588);
            Button button5 = (Button) findViewById(2131558591);
            Button button6 = (Button) findViewById(2131558594);
            Button button7 = (Button) findViewById(2131558589);
            Button button8 = (Button) findViewById(2131558592);
            Button button9 = (Button) findViewById(2131558595);
            aib.m3858a((Context) this, button4, -1);
            aib.m3858a((Context) this, button5, -1);
            aib.m3858a((Context) this, button6, -1);
            aib.m3858a((Context) this, button7, -1);
            aib.m3858a((Context) this, button8, -1);
            aib.m3858a((Context) this, button9, -1);
            button4.setOnClickListener(new abt(this, button));
            button5.setOnClickListener(new abu(this, button2));
            button6.setOnClickListener(new abv(this, button3));
            button7.setOnClickListener(new abw(this, button));
            button8.setOnClickListener(new abh(this, button2));
            button9.setOnClickListener(new abi(this, button3));
        } catch (Exception e) {
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
