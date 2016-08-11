package p007b.p008a;

import p007b.p013b.C0208c;

/* renamed from: b.a.ao */
public abstract class ao {
    private static C0208c f753a;
    private ap f754b;
    private ap f755c;
    private ap f756d;

    static {
        f753a = C0208c.m1493a(ao.class);
    }

    protected ao() {
        this.f754b = m1143a();
        this.f755c = m1143a();
        this.f756d = m1143a();
    }

    protected abstract ap m1143a();

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (!this.f754b.m1144a()) {
            stringBuffer.append("&L");
            stringBuffer.append(this.f754b.m1145b());
        }
        if (!this.f756d.m1144a()) {
            stringBuffer.append("&C");
            stringBuffer.append(this.f756d.m1145b());
        }
        if (!this.f755c.m1144a()) {
            stringBuffer.append("&R");
            stringBuffer.append(this.f755c.m1145b());
        }
        return stringBuffer.toString();
    }
}
