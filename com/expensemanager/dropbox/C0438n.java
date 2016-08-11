package com.expensemanager.dropbox;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.dropbox.client2.C0379i;
import com.dropbox.client2.C0386j;
import java.io.File;

/* renamed from: com.expensemanager.dropbox.n */
public class C0438n extends AsyncTask<Void, Long, Boolean> {
    C0386j f4537a;
    private C0356a<?> f4538b;
    private String f4539c;
    private File f4540d;
    private String f4541e;
    private long f4542f;
    private C0379i f4543g;
    private Context f4544h;
    private ProgressDialog f4545i;
    private String f4546j;

    public C0438n(Context context, C0356a<?> c0356a, String str, File file, String str2, boolean z) {
        this.f4544h = context.getApplicationContext();
        this.f4542f = file.length();
        this.f4538b = c0356a;
        this.f4539c = str;
        this.f4540d = file;
        this.f4541e = str2;
        if (z) {
            this.f4537a = new C0439o(this);
            this.f4545i = new ProgressDialog(context);
            this.f4545i.setMax(100);
            this.f4545i.setMessage("Uploading... ");
            this.f4545i.setProgressStyle(1);
            this.f4545i.setProgress(0);
            this.f4545i.setButton("Cancel", new C0440p(this));
            this.f4545i.show();
        }
    }

    private void m4082a(String str) {
        Toast.makeText(this.f4544h, str, 1).show();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Boolean m4083a(java.lang.Void... r8) {
        /*
        r7 = this;
        r3 = new java.io.FileInputStream;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r7.f4540d;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r3.<init>(r0);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = new java.lang.StringBuilder;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0.<init>();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r7.f4539c;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r7.f4540d;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r1.getName();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r2 = r0.toString();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = ".csv";
        r1 = r7.f4541e;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        if (r0 == 0) goto L_0x0053;
    L_0x002a:
        r0 = new java.lang.StringBuilder;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0.<init>();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r7.f4539c;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = "yyyy-MM-dd";
        r1 = com.expensemanager.aib.m3874f(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = "_";
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r7.f4540d;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r1.getName();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r2 = r0.toString();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
    L_0x0053:
        r1 = r7.f4538b;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r7.f4540d;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r4 = r0.length();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r6 = r7.f4537a;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r1.m2287a(r2, r3, r4, r6);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r7.f4543g = r0;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r7.f4543g;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        if (r0 == 0) goto L_0x00ab;
    L_0x0067:
        r0 = r7.f4543g;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.m2335b();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = ".db";
        r3 = r7.f4541e;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r1.equalsIgnoreCase(r3);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        if (r1 == 0) goto L_0x00ab;
    L_0x0077:
        if (r0 == 0) goto L_0x0082;
    L_0x0079:
        r1 = r7.f4544h;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r3 = "DB_MODIFIED";
        r0 = r0.f2388e;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        com.expensemanager.aib.m3859a(r1, r3, r0);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
    L_0x0082:
        r0 = new java.lang.StringBuilder;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0.<init>();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r7.f4539c;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = "yyyy-MM-dd";
        r1 = com.expensemanager.aib.m3874f(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = ".db";
        r0 = r0.append(r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r1 = r0.toString();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0 = r7.f4538b;	 Catch:{ i -> 0x00b1, k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0.m2288a(r1);	 Catch:{ i -> 0x00b1, k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
    L_0x00a6:
        r0 = r7.f4538b;	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        r0.m2289b(r2, r1);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
    L_0x00ab:
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
    L_0x00b0:
        return r0;
    L_0x00b1:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ k -> 0x00b6, b -> 0x00c1, f -> 0x00c7, i -> 0x00cd, c -> 0x00f8, e -> 0x00fe, a -> 0x0104, FileNotFoundException -> 0x010a }
        goto L_0x00a6;
    L_0x00b6:
        r0 = move-exception;
        r0 = "This app wasn't authenticated properly.";
        r7.f4546j = r0;
    L_0x00bb:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x00b0;
    L_0x00c1:
        r0 = move-exception;
        r0 = "This file is too big to upload";
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x00c7:
        r0 = move-exception;
        r0 = "Upload canceled";
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x00cd:
        r0 = move-exception;
        r1 = r0.f2329b;
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r1 != r2) goto L_0x00e5;
    L_0x00d4:
        r1 = r0.f2328a;
        r1 = r1.f2335b;
        r7.f4546j = r1;
        r1 = r7.f4546j;
        if (r1 != 0) goto L_0x00bb;
    L_0x00de:
        r0 = r0.f2328a;
        r0 = r0.f2334a;
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x00e5:
        r1 = r0.f2329b;
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r1 == r2) goto L_0x00d4;
    L_0x00eb:
        r1 = r0.f2329b;
        r2 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        if (r1 == r2) goto L_0x00d4;
    L_0x00f1:
        r1 = r0.f2329b;
        r2 = 507; // 0x1fb float:7.1E-43 double:2.505E-321;
        if (r1 != r2) goto L_0x00d4;
    L_0x00f7:
        goto L_0x00d4;
    L_0x00f8:
        r0 = move-exception;
        r0 = "Network error.  Try again.";
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x00fe:
        r0 = move-exception;
        r0 = "Dropbox error.  Try again.";
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x0104:
        r0 = move-exception;
        r0 = "Unknown error.  Try again.";
        r7.f4546j = r0;
        goto L_0x00bb;
    L_0x010a:
        r0 = move-exception;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.dropbox.n.a(java.lang.Void[]):java.lang.Boolean");
    }

    protected void m4084a(Boolean bool) {
        if (this.f4545i != null) {
            this.f4545i.dismiss();
        }
        if (bool.booleanValue()) {
            m4082a("File successfully uploaded");
        } else {
            m4082a(this.f4546j);
        }
    }

    protected void m4085a(Long... lArr) {
        this.f4545i.setProgress((int) (((100.0d * ((double) lArr[0].longValue())) / ((double) this.f4542f)) + 0.5d));
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4083a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4084a((Boolean) obj);
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        m4085a((Long[]) objArr);
    }
}
