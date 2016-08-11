package com.google.android.gms.internal;

import android.content.Context;

@id
public final class jb {
    public static lb m5798a(Context context, pb pbVar, ks ksVar, ma maVar, ee eeVar, jc jcVar) {
        lb jwVar;
        if (ksVar.f6999b.f6574t) {
            jwVar = new jw(context, pbVar, new C0646s(), ksVar, jcVar);
        } else {
            jwVar = new jd(context, ksVar, maVar, eeVar, jcVar);
        }
        jwVar.m5624e();
        return jwVar;
    }
}
