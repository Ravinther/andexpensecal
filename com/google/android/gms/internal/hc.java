package com.google.android.gms.internal;

import android.content.Intent;

@id
public class hc {
    private final String f6723a;

    public hc(String str) {
        this.f6723a = str;
    }

    public String m5709a() {
        return li.m6030e();
    }

    public boolean m5710a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String b = ha.m5705b(intent);
        String c = ha.m5707c(intent);
        if (b == null || c == null) {
            return false;
        }
        if (!str.equals(ha.m5704a(b))) {
            ly.m6074e("Developer payload not match.");
            return false;
        } else if (this.f6723a == null || hd.m5712a(this.f6723a, b, c)) {
            return true;
        } else {
            ly.m6074e("Fail to verify signature.");
            return false;
        }
    }
}
