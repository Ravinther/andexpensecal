package com.google.android.p033a.p034a;

import android.text.TextUtils;
import android.util.Log;
import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.p033a.p034a.p045a.C0560a;
import com.google.android.p033a.p034a.p045a.C0561b;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;

/* renamed from: com.google.android.a.a.n */
class C0575n {
    private final C0577q f6019a;
    private final C0462m f6020b;
    private final int f6021c;
    private final String f6022d;
    private final String f6023e;
    private final C0564b f6024f;

    C0575n(C0577q c0577q, C0564b c0564b, C0462m c0462m, int i, String str, String str2) {
        this.f6019a = c0577q;
        this.f6024f = c0564b;
        this.f6020b = c0462m;
        this.f6021c = i;
        this.f6022d = str;
        this.f6023e = str2;
    }

    private void m4855a(int i) {
        this.f6020b.m4233c(i);
    }

    private void m4856a(int i, C0579s c0579s) {
        this.f6019a.m4863a(i, c0579s);
        if (this.f6019a.m4864a()) {
            this.f6020b.m4231a(i);
        } else {
            this.f6020b.m4232b(i);
        }
    }

    private void m4857d() {
        this.f6020b.m4232b(561);
    }

    public C0462m m4858a() {
        return this.f6020b;
    }

    public void m4859a(PublicKey publicKey, int i, String str, String str2) {
        C0579s c0579s = null;
        String str3;
        if (i == 0 || i == 1 || i == 2) {
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(C0560a.m4821a(str2))) {
                    try {
                        c0579s = C0579s.m4868a(str);
                        if (c0579s.f6028a != i) {
                            Log.e("LicenseValidator", "Response codes don't match.");
                            m4857d();
                            return;
                        } else if (c0579s.f6029b != this.f6021c) {
                            Log.e("LicenseValidator", "Nonce doesn't match.");
                            m4857d();
                            return;
                        } else if (!c0579s.f6030c.equals(this.f6022d)) {
                            Log.e("LicenseValidator", "Package name doesn't match.");
                            m4857d();
                            return;
                        } else if (c0579s.f6031d.equals(this.f6023e)) {
                            str3 = c0579s.f6032e;
                            if (TextUtils.isEmpty(str3)) {
                                Log.e("LicenseValidator", "User identifier is empty.");
                                m4857d();
                                return;
                            }
                        } else {
                            Log.e("LicenseValidator", "Version codes don't match.");
                            m4857d();
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        Log.e("LicenseValidator", "Could not parse response.");
                        m4857d();
                        return;
                    }
                }
                Log.e("LicenseValidator", "Signature verification failed.");
                m4857d();
                return;
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (InvalidKeyException e3) {
                m4855a(5);
                return;
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            } catch (C0561b e4) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                m4857d();
                return;
            }
        }
        str3 = null;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
            case C0607c.LoadingImageView_circleCrop /*2*/:
                m4856a(this.f6024f.m4830a(str3), c0579s);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                m4856a(561, c0579s);
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                m4855a(3);
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                Log.w("LicenseValidator", "An error has occurred on the licensing server.");
                m4856a(291, c0579s);
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
                m4856a(291, c0579s);
            case 257:
                Log.w("LicenseValidator", "Error contacting licensing server.");
                m4856a(291, c0579s);
            case 258:
                m4855a(1);
            case 259:
                m4855a(2);
            default:
                Log.e("LicenseValidator", "Unknown response code for license check.");
                m4857d();
        }
    }

    public int m4860b() {
        return this.f6021c;
    }

    public String m4861c() {
        return this.f6022d;
    }
}
