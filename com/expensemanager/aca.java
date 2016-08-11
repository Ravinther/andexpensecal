package com.expensemanager;

import android.app.ProgressDialog;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0748e;
import com.google.api.client.p051b.C0686k;
import java.io.File;
import java.io.IOException;

class aca implements Runnable {
    final /* synthetic */ String f3883a;
    final /* synthetic */ File f3884b;
    final /* synthetic */ ProgressDialog f3885c;
    final /* synthetic */ GoogleDriveDownloadList f3886d;

    aca(GoogleDriveDownloadList googleDriveDownloadList, String str, File file, ProgressDialog progressDialog) {
        this.f3886d = googleDriveDownloadList;
        this.f3883a = str;
        this.f3884b = file;
        this.f3885c = progressDialog;
    }

    public void run() {
        boolean z;
        try {
            com.google.api.services.drive.model.File file = (com.google.api.services.drive.model.File) GoogleDriveDownloadList.f3484j.files().get(this.f3883a).execute();
            if (file.getDownloadUrl() != null && file.getDownloadUrl().length() > 0) {
                GoogleDriveDownloadList.m3468a(this.f3884b, GoogleDriveDownloadList.f3484j.getRequestFactory().m6800a(new C0686k(file.getDownloadUrl())).m6793n().m6814g());
            }
            this.f3886d.m3473a(this.f3886d.getResources().getString(2131099842) + " " + this.f3886d.f3496l);
            z = true;
        } catch (C0748e e) {
            if (this.f3885c != null) {
                this.f3885c.dismiss();
            }
            this.f3886d.startActivityForResult(e.m7015d(), 2);
            z = false;
        } catch (IOException e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z && "db".equalsIgnoreCase(this.f3886d.f3490e)) {
            z = this.f3884b.renameTo(this.f3886d.f3486a.getDatabasePath("personal_finance.db"));
        }
        if (z && "csv".equalsIgnoreCase(this.f3886d.f3490e)) {
            this.f3886d.f3492g.post(this.f3886d.f3494i);
        }
        if (this.f3885c != null) {
            this.f3885c.dismiss();
        }
    }
}
