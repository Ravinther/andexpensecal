package p007b.p008a.p012b;

/* renamed from: b.a.b.g */
class C0162g extends ap {
    private boolean f975a;

    public C0162g(String str) {
        this.f975a = Boolean.valueOf(str).booleanValue();
    }

    public int m1337a(byte[] bArr, int i) {
        this.f975a = bArr[i] == (byte) 1;
        return 1;
    }

    public void m1338a(StringBuffer stringBuffer) {
        stringBuffer.append(new Boolean(this.f975a).toString());
    }

    byte[] m1339c() {
        int i = 0;
        byte[] bArr = new byte[2];
        bArr[0] = bi.f901g.m1285a();
        if (this.f975a) {
            i = 1;
        }
        bArr[1] = (byte) i;
        return bArr;
    }
}
