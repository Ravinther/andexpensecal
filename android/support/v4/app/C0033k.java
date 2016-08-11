package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

/* renamed from: android.support.v4.app.k */
public class C0033k extends C0032l implements OnCancelListener, OnDismissListener {
    int f249a;
    int f250b;
    boolean f251c;
    boolean f252d;
    int f253e;
    Dialog f254f;
    boolean f255g;
    boolean f256h;
    boolean f257i;

    public C0033k() {
        this.f249a = 0;
        this.f250b = 0;
        this.f251c = true;
        this.f252d = true;
        this.f253e = -1;
    }

    public Dialog m336a() {
        return this.f254f;
    }

    public void m337a(Activity activity) {
        super.m278a(activity);
        if (!this.f257i) {
            this.f256h = false;
        }
    }

    public void m338a(Bundle bundle) {
        super.m283a(bundle);
        this.f252d = this.H == 0;
        if (bundle != null) {
            this.f249a = bundle.getInt("android:style", 0);
            this.f250b = bundle.getInt("android:theme", 0);
            this.f251c = bundle.getBoolean("android:cancelable", true);
            this.f252d = bundle.getBoolean("android:showsDialog", this.f252d);
            this.f253e = bundle.getInt("android:backStackId", -1);
        }
    }

    void m339a(boolean z) {
        if (!this.f256h) {
            this.f256h = true;
            this.f257i = false;
            if (this.f254f != null) {
                this.f254f.dismiss();
                this.f254f = null;
            }
            this.f255g = true;
            if (this.f253e >= 0) {
                m319k().m371a(this.f253e, 1);
                this.f253e = -1;
                return;
            }
            ad a = m319k().m369a();
            a.m163a(this);
            if (z) {
                a.m164b();
            } else {
                a.m160a();
            }
        }
    }

    public int m340b() {
        return this.f250b;
    }

    public LayoutInflater m341b(Bundle bundle) {
        if (!this.f252d) {
            return super.m290b(bundle);
        }
        this.f254f = m342c(bundle);
        switch (this.f249a) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
            case C0607c.LoadingImageView_circleCrop /*2*/:
                break;
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f254f.getWindow().addFlags(24);
                break;
        }
        this.f254f.requestWindowFeature(1);
        return this.f254f != null ? (LayoutInflater) this.f254f.getContext().getSystemService("layout_inflater") : (LayoutInflater) this.D.getSystemService("layout_inflater");
    }

    public Dialog m342c(Bundle bundle) {
        return new Dialog(m315i(), m340b());
    }

    public void m343c() {
        super.m296c();
        if (!this.f257i && !this.f256h) {
            this.f256h = true;
        }
    }

    public void m344d() {
        super.m300d();
        if (this.f254f != null) {
            this.f255g = false;
            this.f254f.show();
        }
    }

    public void m345d(Bundle bundle) {
        super.m301d(bundle);
        if (this.f252d) {
            View p = m325p();
            if (p != null) {
                if (p.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f254f.setContentView(p);
            }
            this.f254f.setOwnerActivity(m315i());
            this.f254f.setCancelable(this.f251c);
            this.f254f.setOnCancelListener(this);
            this.f254f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f254f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void m346e() {
        super.m305e();
        if (this.f254f != null) {
            this.f254f.hide();
        }
    }

    public void m347e(Bundle bundle) {
        super.m306e(bundle);
        if (this.f254f != null) {
            Bundle onSaveInstanceState = this.f254f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f249a != 0) {
            bundle.putInt("android:style", this.f249a);
        }
        if (this.f250b != 0) {
            bundle.putInt("android:theme", this.f250b);
        }
        if (!this.f251c) {
            bundle.putBoolean("android:cancelable", this.f251c);
        }
        if (!this.f252d) {
            bundle.putBoolean("android:showsDialog", this.f252d);
        }
        if (this.f253e != -1) {
            bundle.putInt("android:backStackId", this.f253e);
        }
    }

    public void m348f() {
        super.m308f();
        if (this.f254f != null) {
            this.f255g = true;
            this.f254f.dismiss();
            this.f254f = null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f255g) {
            m339a(true);
        }
    }
}
