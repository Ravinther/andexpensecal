package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.C0606b;
import java.util.Map;

@id
public class fl {
    private final ma f6587a;
    private final Map<String, String> f6588b;
    private final Context f6589c;

    public fl(ma maVar, Map<String, String> map) {
        this.f6587a = maVar;
        this.f6588b = map;
        this.f6589c = maVar.m6102k();
    }

    Request m5495a(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        if (oj.m6344a()) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
        } else {
            request.setShowRunningNotification(true);
        }
        return request;
    }

    String m5496a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    public void m5497a() {
        if (!new br(this.f6589c).m5217c()) {
            ly.m6074e("Store picture feature is not supported on this device.");
        } else if (TextUtils.isEmpty((CharSequence) this.f6588b.get("iurl"))) {
            ly.m6074e("Image url cannot be empty.");
        } else {
            String str = (String) this.f6588b.get("iurl");
            if (URLUtil.isValidUrl(str)) {
                String a = m5496a(str);
                if (li.m6026c(a)) {
                    Builder builder = new Builder(this.f6589c);
                    builder.setTitle(kw.m5948a(C0606b.store_picture_title, "Save image"));
                    builder.setMessage(kw.m5948a(C0606b.store_picture_message, "Allow Ad to store image in Picture gallery?"));
                    builder.setPositiveButton(kw.m5948a(C0606b.accept, "Accept"), new fm(this, str, a));
                    builder.setNegativeButton(kw.m5948a(C0606b.decline, "Decline"), new fn(this));
                    builder.create().show();
                    return;
                }
                ly.m6074e("Image type not recognized:");
                return;
            }
            ly.m6074e("Invalid image url:" + str);
        }
    }
}
