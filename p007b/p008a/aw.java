package p007b.p008a;

import p007b.C0150a;
import p007b.C0155l;
import p007b.C0240m;

/* renamed from: b.a.aw */
public class aw implements C0155l {
    private C0240m f763a;
    private int f764b;
    private int f765c;
    private int f766d;
    private int f767e;

    public C0150a m1157a() {
        return (this.f764b >= this.f763a.m1731b() || this.f765c >= this.f763a.m1728a()) ? new ad(this.f764b, this.f765c) : this.f763a.m1729a(this.f764b, this.f765c);
    }

    public boolean m1158a(aw awVar) {
        return awVar == this ? true : this.f767e >= awVar.f765c && this.f765c <= awVar.f767e && this.f766d >= awVar.f764b && this.f764b <= awVar.f766d;
    }

    public C0150a m1159b() {
        return (this.f766d >= this.f763a.m1731b() || this.f767e >= this.f763a.m1728a()) ? new ad(this.f766d, this.f767e) : this.f763a.m1729a(this.f766d, this.f767e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return this.f764b == awVar.f764b && this.f766d == awVar.f766d && this.f765c == awVar.f765c && this.f767e == awVar.f767e;
    }

    public int hashCode() {
        return (((65535 ^ this.f765c) ^ this.f767e) ^ this.f764b) ^ this.f766d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        C0193m.m1453a(this.f764b, this.f765c, stringBuffer);
        stringBuffer.append('-');
        C0193m.m1453a(this.f766d, this.f767e, stringBuffer);
        return stringBuffer.toString();
    }
}
