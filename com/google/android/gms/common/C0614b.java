package com.google.android.gms.common;

import android.app.PendingIntent;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ny;

/* renamed from: com.google.android.gms.common.b */
public final class C0614b {
    public static final C0614b f6136a;
    private final PendingIntent f6137b;
    private final int f6138c;

    static {
        f6136a = new C0614b(0, null);
    }

    public C0614b(int i, PendingIntent pendingIntent) {
        this.f6138c = i;
        this.f6137b = pendingIntent;
    }

    private String m4941a() {
        switch (this.f6138c) {
            case C0607c.AdsAttrs_adSize /*0*/:
                return "SUCCESS";
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return "SERVICE_MISSING";
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return "SERVICE_DISABLED";
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return "SIGN_IN_REQUIRED";
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                return "INVALID_ACCOUNT";
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                return "RESOLUTION_REQUIRED";
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                return "NETWORK_ERROR";
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                return "INTERNAL_ERROR";
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                return "SERVICE_INVALID";
            case adv.TitlePageIndicator_footerPadding /*10*/:
                return "DEVELOPER_ERROR";
            case adv.TitlePageIndicator_linePosition /*11*/:
                return "LICENSE_CHECK_FAILED";
            case adv.TitlePageIndicator_titlePadding /*13*/:
                return "CANCELED";
            case adv.TitlePageIndicator_topPadding /*14*/:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            default:
                return "unknown status code " + this.f6138c;
        }
    }

    public String toString() {
        return ny.m6311a((Object) this).m6314a("statusCode", m4941a()).m6314a("resolution", this.f6137b).toString();
    }
}
