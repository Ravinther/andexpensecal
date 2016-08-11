package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@id
public class mb extends MutableContextWrapper {
    private Activity f7107a;
    private Context f7108b;

    public mb(Context context) {
        super(context);
        setBaseContext(context);
    }

    public Context m6104a() {
        return this.f7107a;
    }

    public void setBaseContext(Context context) {
        this.f7108b = context.getApplicationContext();
        this.f7107a = context instanceof Activity ? (Activity) context : null;
        super.setBaseContext(this.f7108b);
    }

    public void startActivity(Intent intent) {
        if (this.f7107a != null) {
            this.f7107a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f7108b.startActivity(intent);
    }
}
