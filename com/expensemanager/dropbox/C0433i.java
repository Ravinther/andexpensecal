package com.expensemanager.dropbox;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;
import com.dropbox.client2.C0356a;
import com.dropbox.client2.C0383f;
import com.dropbox.client2.p029a.C0345a;
import com.dropbox.client2.p029a.C0347c;
import com.dropbox.client2.p029a.C0349e;
import com.dropbox.client2.p029a.C0350f;
import com.dropbox.client2.p029a.C0353i;
import com.dropbox.client2.p029a.C0355k;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.expensemanager.dropbox.i */
public class C0433i extends AsyncTask<Void, Long, Boolean> {
    private Context f4518a;
    private final ProgressDialog f4519b;
    private C0356a<?> f4520c;
    private String f4521d;
    private ArrayList<String> f4522e;
    private FileOutputStream f4523f;
    private boolean f4524g;
    private Long f4525h;
    private String f4526i;

    public C0433i(Context context, C0356a<?> c0356a, String str, ArrayList<String> arrayList) {
        this.f4518a = context;
        this.f4520c = c0356a;
        this.f4521d = str;
        this.f4522e = arrayList;
        this.f4519b = new ProgressDialog(context);
        this.f4519b.setMessage(this.f4518a.getResources().getString(2131099946));
        this.f4519b.setButton(this.f4518a.getResources().getString(2131099754), new C0434j(this));
        this.f4519b.show();
    }

    private void m4071a(String str) {
        Toast.makeText(this.f4518a, str, 1).show();
    }

    protected Boolean m4073a(Void... voidArr) {
        try {
            if (this.f4524g) {
                return Boolean.valueOf(false);
            }
            C0383f a = this.f4520c.m2286a(this.f4521d, 1000, null, true, null);
            if (!a.f2387d || a.f2397n == null) {
                this.f4526i = "File or empty directory";
                return Boolean.valueOf(false);
            }
            for (C0383f a2 : a2.f2397n) {
                if (!"personal_finance.db".equals(a2.m2344a())) {
                    this.f4522e.add(a2.m2344a());
                }
            }
            if (this.f4524g) {
                return Boolean.valueOf(false);
            }
            if (this.f4522e.size() == 0) {
                this.f4526i = this.f4518a.getResources().getString(2131099928);
                return Boolean.valueOf(false);
            }
            Collections.sort(this.f4522e, Collections.reverseOrder());
            return Boolean.valueOf(true);
        } catch (C0355k e) {
            return Boolean.valueOf(false);
        } catch (C0350f e2) {
            this.f4526i = "Download canceled";
            return Boolean.valueOf(false);
        } catch (C0353i e3) {
            if (!(e3.f2329b == 304 || e3.f2329b == 401 || e3.f2329b == 403 || e3.f2329b == 404 || e3.f2329b == 406 || e3.f2329b == 415 || e3.f2329b != 507)) {
            }
            this.f4526i = e3.f2328a.f2335b;
            if (this.f4526i == null) {
                this.f4526i = e3.f2328a.f2334a;
            }
            return Boolean.valueOf(false);
        } catch (C0347c e4) {
            this.f4526i = "Network error.  Try again.";
            return Boolean.valueOf(false);
        } catch (C0349e e5) {
            this.f4526i = "Dropbox error.  Try again.";
            return Boolean.valueOf(false);
        } catch (C0345a e6) {
            this.f4526i = "Unknown error.  Try again.";
            return Boolean.valueOf(false);
        } catch (Exception e7) {
            return Boolean.valueOf(false);
        }
    }

    protected void m4074a(Boolean bool) {
        this.f4519b.dismiss();
        if (bool.booleanValue()) {
            Intent intent = new Intent(this.f4518a, DropboxDownloadList.class);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("files", this.f4522e);
            bundle.putString("dropboxPath", this.f4521d);
            intent.putExtras(bundle);
            this.f4518a.startActivity(intent);
            return;
        }
        m4071a(this.f4526i);
    }

    protected void m4075a(Long... lArr) {
        this.f4519b.setProgress((int) (((100.0d * ((double) lArr[0].longValue())) / ((double) this.f4525h.longValue())) + 0.5d));
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4073a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m4074a((Boolean) obj);
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        m4075a((Long[]) objArr);
    }
}
