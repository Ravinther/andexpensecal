package p018c.p025b.p026a.p027a;

import com.expensemanager.adv;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p018c.p025b.p026a.C0336a;
import p018c.p025b.p026a.C0337c;

/* renamed from: c.b.a.a.b */
public class C0331b {
    private LinkedList f2292a;
    private C0333d f2293b;
    private C0334e f2294c;
    private int f2295d;

    public C0331b() {
        this.f2293b = new C0333d((Reader) null);
        this.f2294c = null;
        this.f2295d = 0;
    }

    private int m2233a(LinkedList linkedList) {
        return linkedList.size() == 0 ? -1 : ((Integer) linkedList.getFirst()).intValue();
    }

    private Map m2234a(C0330a c0330a) {
        if (c0330a == null) {
            return new C0337c();
        }
        Map a = c0330a.m2231a();
        return a == null ? new C0337c() : a;
    }

    private List m2235b(C0330a c0330a) {
        if (c0330a == null) {
            return new C0336a();
        }
        List b = c0330a.m2232b();
        return b == null ? new C0336a() : b;
    }

    private void m2236c() {
        this.f2294c = this.f2293b.m2256c();
        if (this.f2294c == null) {
            this.f2294c = new C0334e(-1, null);
        }
    }

    public Object m2237a(Reader reader, C0330a c0330a) {
        m2239a(reader);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            m2236c();
            Map a;
            switch (this.f2295d) {
                case MediationAdRequest.TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED /*-1*/:
                    throw new C0332c(m2240b(), 1, this.f2294c);
                case C0607c.AdsAttrs_adSize /*0*/:
                    try {
                        switch (this.f2294c.f2320a) {
                            case C0607c.AdsAttrs_adSize /*0*/:
                                this.f2295d = 1;
                                linkedList.addFirst(new Integer(this.f2295d));
                                linkedList2.addFirst(this.f2294c.f2321b);
                                break;
                            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                                this.f2295d = 2;
                                linkedList.addFirst(new Integer(this.f2295d));
                                linkedList2.addFirst(m2234a(c0330a));
                                break;
                            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                                this.f2295d = 3;
                                linkedList.addFirst(new Integer(this.f2295d));
                                linkedList2.addFirst(m2235b(c0330a));
                                break;
                            default:
                                this.f2295d = -1;
                                break;
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                    if (this.f2294c.f2320a == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new C0332c(m2240b(), 1, this.f2294c);
                case C0607c.LoadingImageView_circleCrop /*2*/:
                    switch (this.f2294c.f2320a) {
                        case C0607c.AdsAttrs_adSize /*0*/:
                            if (!(this.f2294c.f2321b instanceof String)) {
                                this.f2295d = -1;
                                break;
                            }
                            linkedList2.addFirst((String) this.f2294c.f2321b);
                            this.f2295d = 4;
                            linkedList.addFirst(new Integer(this.f2295d));
                            break;
                        case C0607c.LoadingImageView_circleCrop /*2*/:
                            if (linkedList2.size() <= 1) {
                                this.f2295d = 1;
                                break;
                            }
                            linkedList.removeFirst();
                            linkedList2.removeFirst();
                            this.f2295d = m2233a(linkedList);
                            break;
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            break;
                        default:
                            this.f2295d = -1;
                            break;
                    }
                case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                    List list;
                    switch (this.f2294c.f2320a) {
                        case C0607c.AdsAttrs_adSize /*0*/:
                            ((List) linkedList2.getFirst()).add(this.f2294c.f2321b);
                            break;
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            list = (List) linkedList2.getFirst();
                            a = m2234a(c0330a);
                            list.add(a);
                            this.f2295d = 2;
                            linkedList.addFirst(new Integer(this.f2295d));
                            linkedList2.addFirst(a);
                            break;
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            list = (List) linkedList2.getFirst();
                            List b = m2235b(c0330a);
                            list.add(b);
                            this.f2295d = 3;
                            linkedList.addFirst(new Integer(this.f2295d));
                            linkedList2.addFirst(b);
                            break;
                        case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                            if (linkedList2.size() <= 1) {
                                this.f2295d = 1;
                                break;
                            }
                            linkedList.removeFirst();
                            linkedList2.removeFirst();
                            this.f2295d = m2233a(linkedList);
                            break;
                        case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                            break;
                        default:
                            this.f2295d = -1;
                            break;
                    }
                case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                    String str;
                    switch (this.f2294c.f2320a) {
                        case C0607c.AdsAttrs_adSize /*0*/:
                            linkedList.removeFirst();
                            ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.f2294c.f2321b);
                            this.f2295d = m2233a(linkedList);
                            break;
                        case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                            linkedList.removeFirst();
                            str = (String) linkedList2.removeFirst();
                            a = (Map) linkedList2.getFirst();
                            Map a2 = m2234a(c0330a);
                            a.put(str, a2);
                            this.f2295d = 2;
                            linkedList.addFirst(new Integer(this.f2295d));
                            linkedList2.addFirst(a2);
                            break;
                        case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                            linkedList.removeFirst();
                            str = (String) linkedList2.removeFirst();
                            a = (Map) linkedList2.getFirst();
                            List b2 = m2235b(c0330a);
                            a.put(str, b2);
                            this.f2295d = 3;
                            linkedList.addFirst(new Integer(this.f2295d));
                            linkedList2.addFirst(b2);
                            break;
                        case adv.TitlePageIndicator_footerLineHeight /*6*/:
                            break;
                        default:
                            this.f2295d = -1;
                            break;
                    }
            }
            if (this.f2295d == -1) {
                throw new C0332c(m2240b(), 1, this.f2294c);
            }
        } while (this.f2294c.f2320a != -1);
        throw new C0332c(m2240b(), 1, this.f2294c);
    }

    public void m2238a() {
        this.f2294c = null;
        this.f2295d = 0;
        this.f2292a = null;
    }

    public void m2239a(Reader reader) {
        this.f2293b.m2253a(reader);
        m2238a();
    }

    public int m2240b() {
        return this.f2293b.m2251a();
    }

    public Object m2241b(Reader reader) {
        return m2237a(reader, (C0330a) null);
    }
}
