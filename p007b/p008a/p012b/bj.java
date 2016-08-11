package p007b.p008a.p012b;

import java.util.Stack;
import p007b.C0150a;
import p007b.C0287p;
import p007b.p008a.bb;
import p007b.p013b.C0208c;
import p007b.p013b.C0210a;

/* renamed from: b.a.b.bj */
class bj implements au {
    private static C0208c f922a;
    private byte[] f923b;
    private C0150a f924c;
    private int f925d;
    private at f926e;
    private Stack f927f;
    private C0175t f928g;
    private bb f929h;
    private C0287p f930i;
    private as f931j;

    static {
        f922a = C0208c.m1493a(bj.class);
    }

    public bj(byte[] bArr, C0150a c0150a, C0175t c0175t, bb bbVar, C0287p c0287p, as asVar) {
        boolean z = false;
        this.f923b = bArr;
        this.f925d = 0;
        this.f924c = c0150a;
        this.f928g = c0175t;
        this.f929h = bbVar;
        this.f927f = new Stack();
        this.f930i = c0287p;
        this.f931j = asVar;
        if (this.f929h != null) {
            z = true;
        }
        C0210a.m1505a(z);
    }

    private void m1289a(int i) {
        Stack stack = new Stack();
        int i2 = this.f925d + i;
        while (this.f925d < i2) {
            int i3 = this.f923b[this.f925d];
            this.f925d++;
            bi a = bi.m1284a(i3);
            if (a == bi.f894N) {
                throw new C0177v(C0177v.f1012a, i3);
            }
            C0210a.m1505a(a != bi.f894N);
            if (a == bi.f896b) {
                C0164i c0164i = new C0164i(this.f924c);
                this.f925d += c0164i.m1344a(this.f923b, this.f925d);
                this.f927f.push(c0164i);
            } else if (a == bi.f904j) {
                C0166k c0166k = new C0166k();
                this.f925d += c0166k.m1350a(this.f923b, this.f925d);
                this.f927f.push(c0166k);
            } else if (a == bi.f900f) {
                C0174s c0174s = new C0174s();
                this.f925d += c0174s.m1364a(this.f923b, this.f925d);
                this.f927f.push(c0174s);
            } else if (a == bi.f905k) {
                ba baVar = new ba(this.f924c);
                this.f925d += baVar.m1268a(this.f923b, this.f925d);
                this.f927f.push(baVar);
            } else if (a == bi.f897c) {
                C0165j c0165j = new C0165j(this.f924c, this.f928g);
                this.f925d += c0165j.m1347a(this.f923b, this.f925d);
                this.f927f.push(c0165j);
            } else if (a == bi.f908n) {
                C0158b c0158b = new C0158b();
                this.f925d += c0158b.m1263a(this.f923b, this.f925d);
                this.f927f.push(c0158b);
            } else if (a == bi.f906l) {
                az azVar = new az(this.f924c);
                this.f925d += azVar.m1259a(this.f923b, this.f925d);
                this.f927f.push(azVar);
            } else if (a == bi.f911q) {
                C0159c c0159c = new C0159c(this.f928g);
                this.f925d += c0159c.m1323a(this.f923b, this.f925d);
                this.f927f.push(c0159c);
            } else if (a == bi.f910p) {
                ak akVar = new ak();
                this.f925d += akVar.m1225a(this.f923b, this.f925d);
                akVar.m1169a(this.f931j);
                this.f927f.push(akVar);
            } else if (a == bi.f909o) {
                al alVar = new al(this.f929h);
                this.f925d += alVar.m1228a(this.f923b, this.f925d);
                alVar.m1169a(this.f931j);
                this.f927f.push(alVar);
            } else if (a == bi.f902h) {
                ac acVar = new ac();
                this.f925d += acVar.m1197a(this.f923b, this.f925d);
                this.f927f.push(acVar);
            } else if (a == bi.f903i) {
                C0172q c0172q = new C0172q();
                this.f925d += c0172q.m1360a(this.f923b, this.f925d);
                this.f927f.push(c0172q);
            } else if (a == bi.f901g) {
                C0162g c0162g = new C0162g();
                this.f925d += c0162g.m1337a(this.f923b, this.f925d);
                this.f927f.push(c0162g);
            } else if (a == bi.f899e) {
                bf bfVar = new bf(this.f930i);
                this.f925d += bfVar.m1279a(this.f923b, this.f925d);
                this.f927f.push(bfVar);
            } else if (a == bi.f898d) {
                ai aiVar = new ai();
                this.f925d += aiVar.m1220a(this.f923b, this.f925d);
                this.f927f.push(aiVar);
            } else if (a == bi.f912r) {
                r0 = new bm();
                this.f925d += r0.m1243a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f913s) {
                r0 = new bk();
                this.f925d += r0.m1243a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f914t) {
                r0 = new av();
                this.f925d += r0.m1243a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f917w) {
                r0 = new bh();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f916v) {
                r0 = new C0157a();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f918x) {
                r0 = new aj();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f919y) {
                r0 = new C0171p();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f881A) {
                r0 = new C0170o();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f920z) {
                r0 = new ax();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f882B) {
                r0 = new ae();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f883C) {
                r0 = new ad();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f886F) {
                r0 = new ab();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f885E) {
                r0 = new aa();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f887G) {
                r0 = new am();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f884D) {
                r0 = new C0173r();
                this.f925d += r0.m1182a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f915u) {
                r0 = new ar();
                this.f925d += r0.m1235a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f892L) {
                r0 = new C0161e(this.f930i);
                this.f925d += r0.m1329a(this.f923b, this.f925d);
                if (r0.m1333a()) {
                    m1290a(r0);
                } else if (r0.m1334b()) {
                    stack.push(r0);
                }
            } else if (a == bi.f890J) {
                r0 = new C0163h(this.f930i);
                this.f925d += r0.m1340a(this.f923b, this.f925d);
                m1290a(r0);
            } else if (a == bi.f891K) {
                bn bnVar = new bn(this.f930i);
                this.f925d += bnVar.m1300a(this.f923b, this.f925d);
                if (bnVar.m1301a() != C0180y.f1049b) {
                    m1290a((aq) bnVar);
                } else {
                    bnVar.m1303a(this.f927f);
                    C0161e c0161e = stack.empty() ? new C0161e(this.f930i) : (C0161e) stack.pop();
                    c0161e.m1330a(bnVar);
                    this.f927f.push(c0161e);
                }
            } else if (a == bi.f893M) {
                m1291a(new ag());
            } else if (a == bi.f907m) {
                m1291a(new af());
            }
        }
    }

    private void m1290a(aq aqVar) {
        aqVar.m1179a(this.f927f);
        this.f927f.push(aqVar);
    }

    private void m1291a(bg bgVar) {
        this.f925d += bgVar.m1205a(this.f923b, this.f925d);
        Stack stack = this.f927f;
        this.f927f = new Stack();
        m1289a(bgVar.m1204a());
        at[] atVarArr = new at[this.f927f.size()];
        int i = 0;
        while (!this.f927f.isEmpty()) {
            atVarArr[i] = (at) this.f927f.pop();
            i++;
        }
        bgVar.m1207a(atVarArr);
        this.f927f = stack;
        this.f927f.push(bgVar);
    }

    public void m1292a() {
        m1289a(this.f923b.length);
        this.f926e = (at) this.f927f.pop();
        C0210a.m1505a(this.f927f.empty());
    }

    public String m1293b() {
        StringBuffer stringBuffer = new StringBuffer();
        this.f926e.m1170a(stringBuffer);
        return stringBuffer.toString();
    }

    public byte[] m1294c() {
        return this.f926e.m1172c();
    }
}
