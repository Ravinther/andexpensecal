package p007b.p008a;

/* renamed from: b.a.k */
public class C0192k {
    private int f1187a;
    private byte[] f1188b;
    private int f1189c;

    public C0192k() {
        this(1024);
    }

    public C0192k(int i) {
        this.f1187a = i;
        this.f1188b = new byte[1024];
        this.f1189c = 0;
    }

    private void m1446a(int i) {
        while (this.f1189c + i >= this.f1188b.length) {
            Object obj = new byte[(this.f1188b.length + this.f1187a)];
            System.arraycopy(this.f1188b, 0, obj, 0, this.f1189c);
            this.f1188b = obj;
        }
    }

    public void m1447a(byte b) {
        m1446a(1);
        this.f1188b[this.f1189c] = b;
        this.f1189c++;
    }

    public void m1448a(byte[] bArr) {
        m1446a(bArr.length);
        System.arraycopy(bArr, 0, this.f1188b, this.f1189c, bArr.length);
        this.f1189c += bArr.length;
    }

    public byte[] m1449a() {
        Object obj = new byte[this.f1189c];
        System.arraycopy(this.f1188b, 0, obj, 0, this.f1189c);
        return obj;
    }
}
