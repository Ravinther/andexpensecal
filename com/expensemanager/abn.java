package com.expensemanager;

import com.google.api.client.googleapis.p068b.p069a.p071b.p072a.C0748e;
import com.google.api.client.p051b.C0672b;
import com.google.api.client.p051b.C0682h;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.drive.model.ParentReference;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class abn implements Runnable {
    final /* synthetic */ String[] f3853a;
    final /* synthetic */ File f3854b;
    final /* synthetic */ String f3855c;

    abn(String[] strArr, File file, String str) {
        this.f3853a = strArr;
        this.f3854b = file;
        this.f3855c = str;
    }

    public void run() {
        try {
            com.google.api.services.drive.model.File file;
            String id;
            String str = "";
            FileList fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3853a[0] + "' ").execute();
            if (fileList.getItems().size() < 1) {
                file = new com.google.api.services.drive.model.File();
                file.setTitle(this.f3853a[0]);
                file.setMimeType("application/vnd.google-apps.folder");
                id = ((com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
            } else {
                id = ((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId();
            }
            if (!(this.f3853a.length <= 1 || id == null || "".equals(id))) {
                fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("mimeType='application/vnd.google-apps.folder' and trashed=false and title = '" + this.f3853a[1] + "' ").execute();
                if (fileList.getItems().size() < 1) {
                    file = new com.google.api.services.drive.model.File();
                    file.setTitle(this.f3853a[1]);
                    file.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                    file.setMimeType("application/vnd.google-apps.folder");
                    id = ((com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file).execute()).getId();
                } else {
                    id = ((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId();
                }
            }
            C0672b c0682h = new C0682h("application/octet-stream", this.f3854b);
            com.google.api.services.drive.model.File file2 = new com.google.api.services.drive.model.File();
            str = "";
            fileList = (FileList) GoogleDrive.f3476b.files().list().setQ("title = '" + this.f3855c + "' and trashed=false and '" + id + "' in parents").execute();
            if (fileList.getItems().size() > 0) {
                file = (com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().update(((com.google.api.services.drive.model.File) fileList.getItems().get(0)).getId(), file2, c0682h).execute();
            } else {
                file2.setTitle(this.f3855c);
                file2.setParents(Arrays.asList(new ParentReference[]{new ParentReference().setId(id)}));
                file = (com.google.api.services.drive.model.File) GoogleDrive.f3476b.files().insert(file2, c0682h).execute();
            }
            if (file == null) {
            }
        } catch (C0748e e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
