package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.ob;
import java.util.Date;
import java.util.Set;

public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final bm f6048a;

    public final class Builder {
        private final bn f6047a;

        public Builder() {
            this.f6047a = new bn();
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f6047a.m5169b(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.f6047a.m5166a(str);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f6047a.m5164a(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f6047a.m5165a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.f6047a.m5170b(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest();
        }

        public Builder setBirthday(Date date) {
            this.f6047a.m5167a(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            ob.m6316a((Object) str, (Object) "Content URL must be non-null.");
            ob.m6317a(str, (Object) "Content URL must be non-empty.");
            boolean z = str.length() <= AdRequest.MAX_CONTENT_URL_LENGTH;
            Object[] objArr = new Object[AdRequest.GENDER_FEMALE];
            objArr[AdRequest.GENDER_UNKNOWN] = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
            objArr[AdRequest.GENDER_MALE] = Integer.valueOf(str.length());
            ob.m6321a(z, "Content URL must not exceed %d in length.  Provided length was %d.", objArr);
            this.f6047a.m5172c(str);
            return this;
        }

        public Builder setGender(int i) {
            this.f6047a.m5162a(i);
            return this;
        }

        public Builder setLocation(Location location) {
            this.f6047a.m5163a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.f6047a.m5171b(z);
            return this;
        }
    }

    static {
        DEVICE_ID_EMULATOR = bm.f6286a;
    }

    private AdRequest(Builder builder) {
        this.f6048a = new bm(builder.f6047a);
    }

    bm m4884a() {
        return this.f6048a;
    }

    public Date getBirthday() {
        return this.f6048a.m5137a();
    }

    public String getContentUrl() {
        return this.f6048a.m5140b();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f6048a.m5142c(cls);
    }

    public int getGender() {
        return this.f6048a.m5141c();
    }

    public Set<String> getKeywords() {
        return this.f6048a.m5143d();
    }

    public Location getLocation() {
        return this.f6048a.m5144e();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f6048a.m5136a((Class) cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f6048a.m5139b(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.f6048a.m5138a(context);
    }
}
