package p018c.p025b.p026a.p027a;

import com.google.android.gms.C0607c;

/* renamed from: c.b.a.a.c */
public class C0332c extends Exception {
    private int f2296a;
    private Object f2297b;
    private int f2298c;

    public C0332c(int i, int i2, Object obj) {
        this.f2298c = i;
        this.f2296a = i2;
        this.f2297b = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.f2296a) {
            case C0607c.AdsAttrs_adSize /*0*/:
                stringBuffer.append("Unexpected character (").append(this.f2297b).append(") at position ").append(this.f2298c).append(".");
                break;
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                stringBuffer.append("Unexpected token ").append(this.f2297b).append(" at position ").append(this.f2298c).append(".");
                break;
            case C0607c.LoadingImageView_circleCrop /*2*/:
                stringBuffer.append("Unexpected exception at position ").append(this.f2298c).append(": ").append(this.f2297b);
                break;
            default:
                stringBuffer.append("Unkown error at position ").append(this.f2298c).append(".");
                break;
        }
        return stringBuffer.toString();
    }
}
