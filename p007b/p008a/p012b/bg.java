package p007b.p008a.p012b;

import p007b.p008a.ar;

/* renamed from: b.a.b.bg */
abstract class bg extends ap {
    private int f833a;
    private at[] f834b;

    protected bg() {
    }

    public int m1204a() {
        return this.f833a;
    }

    public int m1205a(byte[] bArr, int i) {
        this.f833a = ar.m1148a(bArr[i], bArr[i + 1]);
        return 2;
    }

    protected final void m1206a(int i) {
        this.f833a = i;
    }

    public void m1207a(at[] atVarArr) {
        this.f834b = atVarArr;
    }

    protected at[] m1208b() {
        return this.f834b;
    }

    byte[] m1209c() {
        return null;
    }
}
