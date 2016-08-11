package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.C0606b;
import java.util.Map;

@id
public class ff {
    private final ma f6529a;
    private final Map<String, String> f6530b;
    private final Context f6531c;
    private String f6532d;
    private long f6533e;
    private long f6534f;
    private String f6535g;
    private String f6536h;

    public ff(ma maVar, Map<String, String> map) {
        this.f6529a = maVar;
        this.f6530b = map;
        this.f6531c = maVar.m6102k();
        m5483c();
    }

    private String m5481a(String str) {
        return TextUtils.isEmpty((CharSequence) this.f6530b.get(str)) ? "" : (String) this.f6530b.get(str);
    }

    private void m5483c() {
        this.f6532d = m5481a("description");
        this.f6535g = m5481a("summary");
        this.f6533e = li.m6027d((String) this.f6530b.get("start"));
        this.f6534f = li.m6027d((String) this.f6530b.get("end"));
        this.f6536h = m5481a("location");
    }

    public void m5484a() {
        if (new br(this.f6531c).m5219f()) {
            Builder builder = new Builder(this.f6531c);
            builder.setTitle(kw.m5948a(C0606b.create_calendar_title, "Create calendar event"));
            builder.setMessage(kw.m5948a(C0606b.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(kw.m5948a(C0606b.accept, "Accept"), new fg(this));
            builder.setNegativeButton(kw.m5948a(C0606b.decline, "Decline"), new fi(this));
            builder.create().show();
            return;
        }
        ly.m6074e("This feature is not available on this version of the device.");
    }

    Intent m5485b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f6535g);
        data.putExtra("eventLocation", this.f6536h);
        data.putExtra("description", this.f6532d);
        data.putExtra("beginTime", this.f6533e);
        data.putExtra("endTime", this.f6534f);
        data.setFlags(268435456);
        return data;
    }
}
