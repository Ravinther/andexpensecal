package com.expensemanager;

import android.app.ProgressDialog;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0748e;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0682h;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.ParentReference;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

class abl implements Runnable {
    final /* synthetic */ String[] f3841a;
    final /* synthetic */ String f3842b;
    final /* synthetic */ File f3843c;
    final /* synthetic */ String f3844d;
    final /* synthetic */ ProgressDialog f3845e;
    final /* synthetic */ GoogleDrive f3846f;

    abl(GoogleDrive googleDrive, String[] strArr, String str, File file, String str2, ProgressDialog progressDialog) {
        this.f3846f = googleDrive;
        this.f3841a = strArr;
        this.f3842b = str;
        this.f3843c = file;
        this.f3844d = str2;
        this.f3845e = progressDialog;
    }

    public void run() {
        try {
            com.google.api.services.drive.model.File file;
            String id;
            String str = "";
            FileList fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3841a[0] + "' ").execute();
            if (fileList.getItems().size() < 1) {
                file = new com.google.api.services.drive.model.File();
                file.setTitle(this.f3841a[0]);
                file.setMimeType("application/vnd.google-apps.folder");
                id = ((com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
            } else {
                id = ((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId();
            }
            if (!(this.f3841a.length <= 1 || id == null || "".equals(id))) {
                fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3841a[1] + "' " + " AND '" + id + "' in parents").execute();
                if (fileList.getItems().size() < 1) {
                    file = new com.google.api.services.drive.model.File();
                    file.setTitle(this.f3841a[1]);
                    file.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                    file.setMimeType("application/vnd.google-apps.folder");
                    id = ((com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
                } else {
                    id = ((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId();
                }
            }
            C0672b c0682h = new C0682h(this.f3842b, this.f3843c);
            com.google.api.services.drive.model.File file2 = new com.google.api.services.drive.model.File();
            if (this.f3842b != null) {
                file2.setMimeType(this.f3842b);
            }
            str = "";
            fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("title = '" + this.f3844d + "' and trashed=false and '" + id + "' in parents").execute();
            if (fileList.getItems().size() > 0) {
                file = (com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().update(((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId(), file2, c0682h).execute();
            } else {
                file2.setTitle(this.f3844d);
                file2.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                file = (com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file2, c0682h).execute();
            }
            if (file != null) {
                this.f3846f.m3462a("File uploaded: " + file.getTitle());
            } else {
                this.f3846f.m3462a(this.f3846f.getResources().getString(2131099879));
            }
            if (this.f3845e != null) {
                this.f3845e.dismiss();
            }
        } catch (C0748e e) {
            if (this.f3845e != null) {
                this.f3845e.dismiss();
            }
            this.f3846f.startActivityForResult(e.m7015d(), 2);
        } catch (IOException e2) {
            if (this.f3845e != null) {
                this.f3845e.dismiss();
            }
            e2.printStackTrace();
        }
    }
}
