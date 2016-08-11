package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import org.json.JSONObject;

class fi implements OnClickListener {
    final /* synthetic */ ff f6554a;

    fi(ff ffVar) {
        this.f6554a = ffVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f6554a.f6529a.m6092b("onCalendarEventCanceled", new JSONObject());
    }
}
