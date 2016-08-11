package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

@id
public final class jq {
    public final Bundle f6865a;
    public final av f6866b;
    public final ay f6867c;
    public final String f6868d;
    public final ApplicationInfo f6869e;
    public final PackageInfo f6870f;
    public final String f6871g;
    public final String f6872h;
    public final Bundle f6873i;
    public final gs f6874j;
    public final int f6875k;
    public final List<String> f6876l;
    public final Bundle f6877m;
    public final boolean f6878n;

    public jq(Bundle bundle, av avVar, ay ayVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, gs gsVar, Bundle bundle2, List<String> list, Bundle bundle3, boolean z) {
        this.f6865a = bundle;
        this.f6866b = avVar;
        this.f6867c = ayVar;
        this.f6868d = str;
        this.f6869e = applicationInfo;
        this.f6870f = packageInfo;
        this.f6871g = str2;
        this.f6872h = str3;
        this.f6874j = gsVar;
        this.f6873i = bundle2;
        this.f6878n = z;
        if (list == null || list.size() <= 0) {
            this.f6875k = 0;
            this.f6876l = null;
        } else {
            this.f6875k = 2;
            this.f6876l = list;
        }
        this.f6877m = bundle3;
    }
}
