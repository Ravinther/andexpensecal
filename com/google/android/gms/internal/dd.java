package com.google.android.gms.internal;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.HashMap;
import java.util.Map;

@id
public class dd implements cz {
    static final Map<String, Integer> f6399a;

    static {
        f6399a = new HashMap();
        f6399a.put("resize", Integer.valueOf(1));
        f6399a.put("playVideo", Integer.valueOf(2));
        f6399a.put("storePicture", Integer.valueOf(3));
        f6399a.put("createCalendarEvent", Integer.valueOf(4));
    }

    public void m5308a(ma maVar, Map<String, String> map) {
        switch (((Integer) f6399a.get((String) map.get("a"))).intValue()) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                new fk(maVar, map).m5489b();
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                new fl(maVar, map).m5497a();
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                new ff(maVar, map).m5484a();
            default:
                ly.m6070c("Unknown MRAID command called.");
        }
    }
}
