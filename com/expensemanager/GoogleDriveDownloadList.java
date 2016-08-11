package com.expensemanager;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.C0607c;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0745a;
import com.google.api.client.json.p076a.C0772a;
import com.google.api.client.p047a.p048a.p049a.C0654a;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.Drive.Builder;
import com.google.api.services.drive.DriveScopes;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleDriveDownloadList extends ListActivity {
    private static Drive f3484j;
    private static ro f3485m;
    Context f3486a;
    List<String> f3487b;
    String f3488c;
    Map<String, String> f3489d;
    String f3490e;
    String f3491f;
    final Handler f3492g;
    Runnable f3493h;
    final Runnable f3494i;
    private C0745a f3495k;
    private String f3496l;

    public GoogleDriveDownloadList() {
        this.f3486a = this;
        this.f3488c = "";
        this.f3490e = "";
        this.f3491f = "";
        this.f3492g = new Handler();
        this.f3494i = new acb(this);
    }

    private List<String> m3465a(String str, String str2, Map<String, String> map) {
        ProgressDialog show = ProgressDialog.show(this.f3486a, null, "Loading...", true, true);
        if (str == null || "".equals(str)) {
            return null;
        }
        String[] split = str.replace("\\", "/").split("/");
        List<String> arrayList = new ArrayList();
        new Thread(new abz(this, split, show, str2, arrayList, map)).start();
        return arrayList;
    }

    public static void m3468a(File file, InputStream inputStream) {
        Exception e;
        Throwable th;
        OutputStream bufferedOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.writeTo(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e22) {
                            e22.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            e = e5;
            bufferedOutputStream = null;
            e.printStackTrace();
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }

    private void m3469a(String str, String str2, File file) {
        new Thread(new aca(this, str, file, ProgressDialog.show(this.f3486a, null, "Loading...", true, true))).start();
    }

    private void m3471b() {
        this.f3489d = new HashMap();
        this.f3487b = m3465a(this.f3488c, this.f3491f, this.f3489d);
        this.f3493h = new abx(this);
    }

    private void m3472c() {
        finish();
    }

    public void m3473a(String str) {
        runOnUiThread(new acc(this, str));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (i2 == -1 && intent != null && intent.getExtras() != null) {
                    String stringExtra = intent.getStringExtra("authAccount");
                    if (stringExtra != null) {
                        this.f3495k.m7008a(stringExtra);
                        f3484j = new Builder(C0654a.m6519a(), new C0772a(), this.f3495k).build();
                        abd.m3811a((Context) this, f3485m, "expense_preference", "GOOGLE_DRIVE_ACCOUNT", stringExtra);
                    }
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                if (i2 == -1) {
                    m3471b();
                } else {
                    startActivityForResult(this.f3495k.m7007a(), 1);
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
        setTitle(2131099913);
        f3485m = new ro(this);
        this.f3495k = C0745a.m7006a(this, DriveScopes.DRIVE, new String[0]);
        String a = abd.m3786a((Context) this, f3485m, "GOOGLE_DRIVE_ACCOUNT", null);
        if (!(a == null || "".equals(a))) {
            this.f3495k.m7008a(a);
            f3484j = new Builder(C0654a.m6519a(), new C0772a(), this.f3495k).build();
        }
        this.f3488c = getIntent().getStringExtra("DIR");
        this.f3490e = getIntent().getStringExtra("FILE_TYPE");
        try {
            Calendar instance = Calendar.getInstance();
            instance.add(6, -31);
            this.f3491f = " and modifiedDate > '" + new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(instance.getTime()) + "'";
        } catch (Exception e) {
            e.printStackTrace();
        }
        m3471b();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 0, 0, 2131100076).setIcon(2130837607);
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f3491f = "";
                m3471b();
                setTitle(2131100076);
                return true;
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onMenuItemSelected(i, menuItem);
        }
    }
}
