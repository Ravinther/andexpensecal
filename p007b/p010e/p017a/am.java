package p007b.p010e.p017a;

import java.io.File;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import p007b.p013b.C0208c;

/* renamed from: b.e.a.am */
class am implements ag {
    private static C0208c f1567a;
    private File f1568b;
    private RandomAccessFile f1569c;

    static {
        f1567a = C0208c.m1493a(am.class);
    }

    public am(File file) {
        this.f1568b = File.createTempFile("jxl", ".tmp", file);
        this.f1568b.deleteOnExit();
        this.f1569c = new RandomAccessFile(this.f1568b, "rw");
    }

    public int m1571a() {
        return (int) this.f1569c.getFilePointer();
    }

    public void m1572a(OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        this.f1569c.seek(0);
        while (true) {
            int read = this.f1569c.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public void m1573a(byte[] bArr) {
        this.f1569c.write(bArr);
    }

    public void m1574a(byte[] bArr, int i) {
        long filePointer = this.f1569c.getFilePointer();
        this.f1569c.seek((long) i);
        this.f1569c.write(bArr);
        this.f1569c.seek(filePointer);
    }

    public void m1575b() {
        this.f1569c.close();
        this.f1568b.delete();
    }
}
