package com.google.android.gms.internal;

import com.expensemanager.adv;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.C0590a;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Date;
import java.util.HashSet;

@id
public final class fd {
    public static int m5476a(ErrorCode errorCode) {
        switch (fe.f6528b[errorCode.ordinal()]) {
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return 1;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                return 2;
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                return 3;
            default:
                return 0;
        }
    }

    public static Gender m5477a(int i) {
        switch (i) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return Gender.MALE;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                return Gender.FEMALE;
            default:
                return Gender.UNKNOWN;
        }
    }

    public static AdSize m5478a(ay ayVar) {
        int i = 0;
        AdSize[] adSizeArr = new AdSize[]{AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
        while (i < adSizeArr.length) {
            if (adSizeArr[i].getWidth() == ayVar.f6258f && adSizeArr[i].getHeight() == ayVar.f6255c) {
                return adSizeArr[i];
            }
            i++;
        }
        return new AdSize(C0590a.m4885a(ayVar.f6258f, ayVar.f6255c, ayVar.f6254b));
    }

    public static MediationAdRequest m5479a(av avVar) {
        return new MediationAdRequest(new Date(avVar.f6238b), m5477a(avVar.f6240d), avVar.f6241e != null ? new HashSet(avVar.f6241e) : null, avVar.f6242f, avVar.f6247k);
    }
}
