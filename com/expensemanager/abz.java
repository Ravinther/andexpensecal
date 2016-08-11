package com.expensemanager;

import android.app.ProgressDialog;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0748e;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class abz implements Runnable {
    final /* synthetic */ String[] f3875a;
    final /* synthetic */ ProgressDialog f3876b;
    final /* synthetic */ String f3877c;
    final /* synthetic */ List f3878d;
    final /* synthetic */ Map f3879e;
    final /* synthetic */ GoogleDriveDownloadList f3880f;

    abz(GoogleDriveDownloadList googleDriveDownloadList, String[] strArr, ProgressDialog progressDialog, String str, List list, Map map) {
        this.f3880f = googleDriveDownloadList;
        this.f3875a = strArr;
        this.f3876b = progressDialog;
        this.f3877c = str;
        this.f3878d = list;
        this.f3879e = map;
    }

    public void run() {
        try {
            String str = "";
            FileList fileList = (FileList) GoogleDriveDownloadList.f3484j.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3875a[0] + "' ").execute();
            if (fileList.getItems().size() < 1) {
                if (this.f3876b != null) {
                    this.f3876b.dismiss();
                }
                this.f3880f.m3473a(this.f3880f.getResources().getString(2131099928));
                this.f3880f.m3472c();
                return;
            }
            str = ((File) fileList.getItems().get(0)).getId();
            if (!(this.f3875a.length <= 1 || str == null || "".equals(str))) {
                fileList = (FileList) GoogleDriveDownloadList.f3484j.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3875a[1] + "' and '" + str + "' in parents").execute();
                if (fileList.getItems().size() < 1) {
                    if (this.f3876b != null) {
                        this.f3876b.dismiss();
                    }
                    this.f3880f.m3473a(this.f3880f.getResources().getString(2131099928));
                    this.f3880f.m3472c();
                    return;
                }
                str = ((File) fileList.getItems().get(0)).getId();
            }
            String str2 = "";
            fileList = (FileList) GoogleDriveDownloadList.f3484j.files().list().setQ("trashed=false and '" + str + "' in parents " + this.f3877c).execute();
            if (fileList.getItems().size() > 0) {
                for (int i = 0; i < fileList.getItems().size(); i++) {
                    String id = ((File) fileList.getItems().get(i)).getId();
                    File file = (File) GoogleDriveDownloadList.f3484j.files().get(id).execute();
                    this.f3878d.add(aib.m3865b(file.getTitle()));
                    this.f3879e.put(aib.m3865b(file.getTitle()), id);
                }
            }
            Collections.sort(this.f3878d, Collections.reverseOrder());
            this.f3880f.f3492g.post(this.f3880f.f3493h);
            if (this.f3876b != null) {
                this.f3876b.dismiss();
            }
        } catch (C0748e e) {
            if (this.f3876b != null) {
                this.f3876b.dismiss();
            }
            this.f3880f.startActivityForResult(e.m7015d(), 2);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
