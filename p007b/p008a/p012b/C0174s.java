package p007b.p008a.p012b;

/* renamed from: b.a.b.s */
class C0174s extends ap {
    private C0176u f1000a;

    public C0174s(String str) {
        this.f1000a = C0176u.m1371a(str);
    }

    public int m1364a(byte[] bArr, int i) {
        this.f1000a = C0176u.m1370a(bArr[i]);
        return 1;
    }

    public void m1365a(StringBuffer stringBuffer) {
        stringBuffer.append(this.f1000a.m1373b());
    }

    byte[] m1366c() {
        return new byte[]{bi.f900f.m1285a(), (byte) this.f1000a.m1372a()};
    }
}
