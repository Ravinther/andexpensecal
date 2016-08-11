package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public final class MediationAdRequest {
    private final Date f5971a;
    private final Gender f5972b;
    private final Set<String> f5973c;
    private final boolean f5974d;
    private final Location f5975e;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.f5971a = date;
        this.f5972b = gender;
        this.f5973c = set;
        this.f5974d = z;
        this.f5975e = location;
    }

    public Integer getAgeInYears() {
        if (this.f5971a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.f5971a);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.f5971a;
    }

    public Gender getGender() {
        return this.f5972b;
    }

    public Set<String> getKeywords() {
        return this.f5973c;
    }

    public Location getLocation() {
        return this.f5975e;
    }

    public boolean isTesting() {
        return this.f5974d;
    }
}
