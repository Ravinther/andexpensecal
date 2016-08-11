package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.bm;
import com.google.android.gms.internal.bn;

public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final bm f6098a;
    private final int f6099b;
    private final int f6100c;
    private final int f6101d;
    private final int f6102e;
    private final int f6103f;
    private final int f6104g;
    private final int f6105h;
    private final int f6106i;
    private final String f6107j;
    private final int f6108k;
    private final String f6109l;
    private final int f6110m;
    private final int f6111n;
    private final String f6112o;

    public final class Builder {
        private final bn f6083a;
        private int f6084b;
        private int f6085c;
        private int f6086d;
        private int f6087e;
        private int f6088f;
        private int f6089g;
        private int f6090h;
        private int f6091i;
        private String f6092j;
        private int f6093k;
        private String f6094l;
        private int f6095m;
        private int f6096n;
        private String f6097o;

        public Builder() {
            this.f6083a = new bn();
            this.f6090h = SearchAdRequest.ERROR_CODE_INTERNAL_ERROR;
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f6083a.m5169b(cls, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f6083a.m5164a(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f6083a.m5165a(cls, bundle);
            return this;
        }

        public Builder addTestDevice(String str) {
            this.f6083a.m5170b(str);
            return this;
        }

        public SearchAdRequest build() {
            return new SearchAdRequest();
        }

        public Builder setAnchorTextColor(int i) {
            this.f6084b = i;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.f6085c = i;
            this.f6086d = Color.argb(SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR);
            this.f6087e = Color.argb(SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR);
            return this;
        }

        public Builder setBackgroundGradient(int i, int i2) {
            this.f6085c = Color.argb(SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR, SearchAdRequest.ERROR_CODE_INTERNAL_ERROR);
            this.f6086d = i2;
            this.f6087e = i;
            return this;
        }

        public Builder setBorderColor(int i) {
            this.f6088f = i;
            return this;
        }

        public Builder setBorderThickness(int i) {
            this.f6089g = i;
            return this;
        }

        public Builder setBorderType(int i) {
            this.f6090h = i;
            return this;
        }

        public Builder setCallButtonColor(int i) {
            this.f6091i = i;
            return this;
        }

        public Builder setCustomChannels(String str) {
            this.f6092j = str;
            return this;
        }

        public Builder setDescriptionTextColor(int i) {
            this.f6093k = i;
            return this;
        }

        public Builder setFontFace(String str) {
            this.f6094l = str;
            return this;
        }

        public Builder setHeaderTextColor(int i) {
            this.f6095m = i;
            return this;
        }

        public Builder setHeaderTextSize(int i) {
            this.f6096n = i;
            return this;
        }

        public Builder setLocation(Location location) {
            this.f6083a.m5163a(location);
            return this;
        }

        public Builder setQuery(String str) {
            this.f6097o = str;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean z) {
            this.f6083a.m5171b(z);
            return this;
        }
    }

    static {
        DEVICE_ID_EMULATOR = bm.f6286a;
    }

    private SearchAdRequest(Builder builder) {
        this.f6099b = builder.f6084b;
        this.f6100c = builder.f6085c;
        this.f6101d = builder.f6086d;
        this.f6102e = builder.f6087e;
        this.f6103f = builder.f6088f;
        this.f6104g = builder.f6089g;
        this.f6105h = builder.f6090h;
        this.f6106i = builder.f6091i;
        this.f6107j = builder.f6092j;
        this.f6108k = builder.f6093k;
        this.f6109l = builder.f6094l;
        this.f6110m = builder.f6095m;
        this.f6111n = builder.f6096n;
        this.f6112o = builder.f6097o;
        this.f6098a = new bm(builder.f6083a, this);
    }

    bm m4914a() {
        return this.f6098a;
    }

    public int getAnchorTextColor() {
        return this.f6099b;
    }

    public int getBackgroundColor() {
        return this.f6100c;
    }

    public int getBackgroundGradientBottom() {
        return this.f6101d;
    }

    public int getBackgroundGradientTop() {
        return this.f6102e;
    }

    public int getBorderColor() {
        return this.f6103f;
    }

    public int getBorderThickness() {
        return this.f6104g;
    }

    public int getBorderType() {
        return this.f6105h;
    }

    public int getCallButtonColor() {
        return this.f6106i;
    }

    public String getCustomChannels() {
        return this.f6107j;
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f6098a.m5142c(cls);
    }

    public int getDescriptionTextColor() {
        return this.f6108k;
    }

    public String getFontFace() {
        return this.f6109l;
    }

    public int getHeaderTextColor() {
        return this.f6110m;
    }

    public int getHeaderTextSize() {
        return this.f6111n;
    }

    public Location getLocation() {
        return this.f6098a.m5144e();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f6098a.m5136a((Class) cls);
    }

    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f6098a.m5139b(cls);
    }

    public String getQuery() {
        return this.f6112o;
    }

    public boolean isTestDevice(Context context) {
        return this.f6098a.m5138a(context);
    }
}
