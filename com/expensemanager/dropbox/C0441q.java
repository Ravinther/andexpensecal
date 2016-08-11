package com.expensemanager.dropbox;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.dropbox.client2.C0379i;
import com.dropbox.client2.C0383f;
import com.dropbox.client2.C0386j;
import com.dropbox.client2.p029a.C0345a;
import com.dropbox.client2.p029a.C0346b;
import com.dropbox.client2.p029a.C0347c;
import com.dropbox.client2.p029a.C0349e;
import com.dropbox.client2.p029a.C0350f;
import com.dropbox.client2.p029a.C0353i;
import com.dropbox.client2.p029a.C0355k;
import com.expensemanager.co;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* renamed from: com.expensemanager.dropbox.q */
public class C0441q extends AsyncTask<Void, Long, Boolean> {
    C0386j f4549a;
    private C0356a<?> f4550b;
    private String f4551c;
    private File f4552d;
    private C0379i f4553e;
    private Context f4554f;
    private ProgressDialog f4555g;
    private String f4556h;
    private ArrayList<String> f4557i;

    public C0441q(Context context, C0356a<?> c0356a, String str, File file, boolean z) {
        this.f4554f = context.getApplicationContext();
        this.f4550b = c0356a;
        this.f4551c = str;
        this.f4552d = file;
        if (z) {
            this.f4549a = new C0442r(this);
            this.f4555g = new ProgressDialog(context);
            this.f4555g.setMax(100);
            this.f4555g.setMessage("Uploading... ");
            this.f4555g.setButton("Cancel", new C0443s(this));
            this.f4555g.show();
        }
    }

    private void m4091a(String str) {
        Toast.makeText(this.f4554f, str, 1).show();
    }

    protected Boolean m4093a(Void... voidArr) {
        this.f4557i = new ArrayList();
        try {
            C0383f a = this.f4550b.m2286a(this.f4551c, 1000, null, true, null);
            if (a.f2387d && a.f2397n != null) {
                for (C0383f a2 : a2.f2397n) {
                    this.f4557i.add(a2.m2344a());
                }
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (C0355k e2) {
                this.f4556h = "This app wasn't authenticated properly.";
                return Boolean.valueOf(false);
            } catch (C0346b e3) {
                this.f4556h = "This file is too big to upload";
                return Boolean.valueOf(false);
            } catch (C0350f e4) {
                this.f4556h = "Upload cancelled";
                return Boolean.valueOf(false);
            } catch (C0353i e5) {
                if (!(e5.f2329b == 401 || e5.f2329b == 403 || e5.f2329b == 404 || e5.f2329b != 507)) {
                }
                this.f4556h = e5.f2328a.f2335b;
                if (this.f4556h == null) {
                    this.f4556h = e5.f2328a.f2334a;
                }
                return Boolean.valueOf(false);
            } catch (C0347c e6) {
                this.f4556h = "Network error.  Try again.";
                return Boolean.valueOf(false);
            } catch (C0349e e7) {
                this.f4556h = "Dropbox error.  Try again.";
                return Boolean.valueOf(false);
            } catch (C0345a e8) {
                this.f4556h = "Unknown error.  Try again.";
                return Boolean.valueOf(false);
            } catch (FileNotFoundException e9) {
                return Boolean.valueOf(false);
            }
        }
        String[] list = this.f4552d.list();
        for (String str : list) {
            if (!this.f4557i.contains(str)) {
                File file = new File(co.f4431e + str);
                this.f4553e = this.f4550b.m2287a(this.f4551c + file.getName(), new FileInputStream(file), file.length(), this.f4549a);
                if (this.f4553e != null) {
                    this.f4553e.m2335b();
                }
            }
        }
        return Boolean.valueOf(true);
    }

    protected void m4094a(Boolean bool) {
        if (this.f4555g != null) {
            this.f4555g.dismiss();
        }
        if (bool.booleanValue()) {
            m4091a("File successfully uploaded");
        } else {
            m4091a(this.f4556h);
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4093a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4094a((Boolean) obj);
    }
}
