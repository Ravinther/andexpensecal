package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

@id
public class ac implements ActivityLifecycleCallbacks {
    private Activity f6197a;
    private Context f6198b;
    private final Object f6199c;

    public ac(Application application, Activity activity) {
        this.f6199c = new Object();
        application.registerActivityLifecycleCallbacks(this);
        m5015a(activity);
        this.f6198b = application.getApplicationContext();
    }

    private void m5015a(Activity activity) {
        synchronized (this.f6199c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f6197a = activity;
            }
        }
    }

    public Activity m5016a() {
        return this.f6197a;
    }

    public Context m5017b() {
        return this.f6198b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (this.f6199c) {
            if (this.f6197a == null) {
                return;
            }
            if (this.f6197a.equals(activity)) {
                this.f6197a = null;
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        m5015a(activity);
    }

    public void onActivityResumed(Activity activity) {
        m5015a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m5015a(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
