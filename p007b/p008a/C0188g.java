package p007b.p008a;

import p007b.p013b.C0210a;

/* renamed from: b.a.g */
public class C0188g {
    public String f1155a;
    public int f1156b;
    public int f1157c;
    public int f1158d;
    public int f1159e;
    public int f1160f;
    public int f1161g;
    public int f1162h;
    public byte[] f1163i;
    final /* synthetic */ C0187f f1164j;

    public C0188g(C0187f c0187f, String str) {
        int i = 0;
        this.f1164j = c0187f;
        this.f1163i = new byte[128];
        C0210a.m1505a(str.length() < 32);
        ar.m1150a((str.length() + 1) * 2, this.f1163i, 64);
        while (i < str.length()) {
            this.f1163i[i * 2] = (byte) str.charAt(i);
            i++;
        }
    }

    public void m1435a(int i) {
        this.f1156b = i;
        this.f1163i[66] = (byte) i;
    }

    public void m1436b(int i) {
        this.f1158d = i;
        ar.m1153b(i, this.f1163i, 116);
    }

    public void m1437c(int i) {
        this.f1159e = i;
        ar.m1153b(i, this.f1163i, 120);
    }

    public void m1438d(int i) {
        this.f1160f = i;
        ar.m1153b(i, this.f1163i, 68);
    }

    public void m1439e(int i) {
        this.f1161g = i;
        ar.m1153b(this.f1161g, this.f1163i, 72);
    }

    public void m1440f(int i) {
        this.f1162h = i;
        ar.m1153b(this.f1162h, this.f1163i, 76);
    }

    public void m1441g(int i) {
        this.f1157c = i == 0 ? 0 : 1;
        this.f1163i[67] = (byte) this.f1157c;
    }
}
