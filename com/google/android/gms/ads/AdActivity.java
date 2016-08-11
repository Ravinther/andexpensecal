package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.ly;

public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private gi f6046a;

    private void m4882a() {
        if (this.f6046a != null) {
            try {
                this.f6046a.m5531j();
            } catch (Throwable e) {
                ly.m6073d("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6046a = gg.m5592a((Activity) this);
        if (this.f6046a == null) {
            ly.m6074e("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f6046a.m5523a(bundle);
        } catch (Throwable e) {
            ly.m6073d("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f6046a != null) {
                this.f6046a.m5530i();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f6046a != null) {
                this.f6046a.m5528g();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f6046a != null) {
                this.f6046a.m5525d();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f6046a != null) {
                this.f6046a.m5527f();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f6046a != null) {
                this.f6046a.m5524b(bundle);
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f6046a != null) {
                this.f6046a.m5526e();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f6046a != null) {
                this.f6046a.m5529h();
            }
        } catch (Throwable e) {
            ly.m6073d("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m4882a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m4882a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m4882a();
    }
}
