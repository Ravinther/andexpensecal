package com.expensemanager;

import android.app.ProgressDialog;
import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0748e;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0682h;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.ParentReference;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class abm implements Runnable {
    final /* synthetic */ String[] f3847a;
    final /* synthetic */ List f3848b;
    final /* synthetic */ String f3849c;
    final /* synthetic */ List f3850d;
    final /* synthetic */ ProgressDialog f3851e;
    final /* synthetic */ GoogleDrive f3852f;

    abm(GoogleDrive googleDrive, String[] strArr, List list, String str, List list2, ProgressDialog progressDialog) {
        this.f3852f = googleDrive;
        this.f3847a = strArr;
        this.f3848b = list;
        this.f3849c = str;
        this.f3850d = list2;
        this.f3851e = progressDialog;
    }

    public void run() {
        int i = 0;
        try {
            File file;
            String id;
            String str = "";
            FileList fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3847a[0] + "' ").execute();
            if (fileList.getItems().size() < 1) {
                file = new File();
                file.setTitle(this.f3847a[0]);
                file.setMimeType("application/vnd.google-apps.folder");
                id = ((File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
            } else {
                id = ((File) fileList.getItems().get(0)).getId();
            }
            if (!(this.f3847a.length <= 1 || id == null || "".equals(id))) {
                fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3847a[1] + "' ").execute();
                if (fileList.getItems().size() < 1) {
                    file = new File();
                    file.setTitle(this.f3847a[1]);
                    file.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                    file.setMimeType("application/vnd.google-apps.folder");
                    id = ((File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
                } else {
                    id = ((File) fileList.getItems().get(0)).getId();
                }
            }
            while (i < this.f3848b.size()) {
                C0672b c0682h = new C0682h(this.f3849c, (java.io.File) this.f3848b.get(i));
                File file2 = new File();
                if (this.f3849c != null) {
                    file2.setMimeType(this.f3849c);
                }
                str = "";
                fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("title = '" + ((String) this.f3850d.get(i)) + "' and trashed=false and '" + id + "' in parents").execute();
                if (fileList.getItems().size() > 0) {
                    file = (File) GoogleDrive.f3476b.files().update(((File) fileList.getItems().get(0)).getId(), file2, c0682h).execute();
                } else {
                    file2.setTitle((String) this.f3850d.get(i));
                    file2.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                    file = (File) GoogleDrive.f3476b.files().insert(file2, c0682h).execute();
                }
                if (file != null) {
                    this.f3852f.m3462a("File uploaded: " + file.getTitle());
                } else {
                    this.f3852f.m3462a(this.f3852f.getResources().getString(2131099879));
                }
                i++;
            }
            if (this.f3851e != null) {
                this.f3851e.dismiss();
            }
        } catch (C0748e e) {
            if (this.f3851e != null) {
                this.f3851e.dismiss();
            }
            this.f3852f.startActivityForResult(e.m7015d(), 2);
        } catch (IOException e2) {
            if (this.f3851e != null) {
                this.f3851e.dismiss();
            }
            e2.printStackTrace();
        }
    }
}
