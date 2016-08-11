package com.google.api.client.googleapis.json;

import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0775h;
import com.google.api.client.json.C0779c;
import com.google.api.client.json.C0783k;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.aq;
import com.google.api.client.p050d.ar;
import com.google.api.client.p051b.C0663y;
import com.google.api.client.p051b.C0691s;
import com.google.api.client.p051b.C0695x;
import com.google.api.client.p051b.C0696z;
import java.io.IOException;

/* renamed from: com.google.api.client.googleapis.json.a */
public class C0768a extends C0663y {
    private final transient GoogleJsonError f7725a;

    C0768a(C0696z c0696z, GoogleJsonError googleJsonError) {
        super(c0696z);
        this.f7725a = googleJsonError;
    }

    public static C0768a m7043a(C0771d c0771d, C0695x c0695x) {
        StringBuilder a;
        GoogleJsonError googleJsonError;
        IOException e;
        GoogleJsonError googleJsonError2;
        Object obj;
        GoogleJsonError googleJsonError3;
        Throwable th;
        GoogleJsonError googleJsonError4 = null;
        C0696z c0696z = new C0696z(c0695x.m6811d(), c0695x.m6812e(), c0695x.m6809b());
        am.m6911a((Object) c0771d);
        String j;
        try {
            if (c0695x.m6810c() || !C0691s.m6751b(C0779c.f7738a, c0695x.m6807a()) || c0695x.m6814g() == null) {
                j = c0695x.m6817j();
                a = C0663y.m6525a(c0695x);
                if (!ar.m6924a(j)) {
                    a.append(aq.f7582a).append(j);
                    c0696z.m6823c(j);
                }
                c0696z.m6821a(a.toString());
                return new C0768a(c0696z, googleJsonError4);
            }
            C0775h a2;
            try {
                a2 = c0771d.m7054a(c0695x.m6814g());
                try {
                    C0783k d = a2.m7112d();
                    if (d == null) {
                        d = a2.m7111c();
                    }
                    if (d != null) {
                        a2.m7108a("error");
                        if (a2.m7112d() != C0783k.END_OBJECT) {
                            googleJsonError = (GoogleJsonError) a2.m7105a(GoogleJsonError.class, null);
                            try {
                                googleJsonError4 = googleJsonError;
                                j = googleJsonError.toPrettyString();
                                if (a2 != null) {
                                    try {
                                        c0695x.m6815h();
                                    } catch (IOException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        a = C0663y.m6525a(c0695x);
                                        if (ar.m6924a(j)) {
                                            a.append(aq.f7582a).append(j);
                                            c0696z.m6823c(j);
                                        }
                                        c0696z.m6821a(a.toString());
                                        return new C0768a(c0696z, googleJsonError4);
                                    }
                                    a = C0663y.m6525a(c0695x);
                                    if (ar.m6924a(j)) {
                                        a.append(aq.f7582a).append(j);
                                        c0696z.m6823c(j);
                                    }
                                    c0696z.m6821a(a.toString());
                                    return new C0768a(c0696z, googleJsonError4);
                                }
                                if (googleJsonError4 == null) {
                                    a2.m7110b();
                                }
                                a = C0663y.m6525a(c0695x);
                                if (ar.m6924a(j)) {
                                    a.append(aq.f7582a).append(j);
                                    c0696z.m6823c(j);
                                }
                                c0696z.m6821a(a.toString());
                                return new C0768a(c0696z, googleJsonError4);
                            } catch (IOException e3) {
                                e = e3;
                                try {
                                    e.printStackTrace();
                                    if (a2 != null) {
                                        try {
                                            c0695x.m6815h();
                                            googleJsonError2 = googleJsonError4;
                                            googleJsonError4 = googleJsonError;
                                            obj = googleJsonError2;
                                        } catch (IOException e4) {
                                            e = e4;
                                            googleJsonError2 = googleJsonError4;
                                            googleJsonError4 = googleJsonError;
                                            obj = googleJsonError2;
                                            e.printStackTrace();
                                            a = C0663y.m6525a(c0695x);
                                            if (ar.m6924a(j)) {
                                                a.append(aq.f7582a).append(j);
                                                c0696z.m6823c(j);
                                            }
                                            c0696z.m6821a(a.toString());
                                            return new C0768a(c0696z, googleJsonError4);
                                        }
                                    } else if (googleJsonError == null) {
                                        a2.m7110b();
                                        googleJsonError2 = googleJsonError4;
                                        googleJsonError4 = googleJsonError;
                                        obj = googleJsonError2;
                                    } else {
                                        googleJsonError2 = googleJsonError4;
                                        googleJsonError4 = googleJsonError;
                                        obj = googleJsonError2;
                                    }
                                    a = C0663y.m6525a(c0695x);
                                    if (ar.m6924a(j)) {
                                        a.append(aq.f7582a).append(j);
                                        c0696z.m6823c(j);
                                    }
                                    c0696z.m6821a(a.toString());
                                    return new C0768a(c0696z, googleJsonError4);
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    googleJsonError3 = googleJsonError;
                                    th = th3;
                                    if (a2 != null) {
                                        try {
                                            c0695x.m6815h();
                                        } catch (IOException e5) {
                                            IOException iOException = e5;
                                            obj = googleJsonError4;
                                            googleJsonError4 = googleJsonError3;
                                            e = iOException;
                                            e.printStackTrace();
                                            a = C0663y.m6525a(c0695x);
                                            if (ar.m6924a(j)) {
                                                a.append(aq.f7582a).append(j);
                                                c0696z.m6823c(j);
                                            }
                                            c0696z.m6821a(a.toString());
                                            return new C0768a(c0696z, googleJsonError4);
                                        }
                                    } else if (googleJsonError3 == null) {
                                        a2.m7110b();
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    obj = googleJsonError4;
                    if (a2 != null) {
                        if (googleJsonError4 == null) {
                            a2.m7110b();
                        }
                        a = C0663y.m6525a(c0695x);
                        if (ar.m6924a(j)) {
                            a.append(aq.f7582a).append(j);
                            c0696z.m6823c(j);
                        }
                        c0696z.m6821a(a.toString());
                        return new C0768a(c0696z, googleJsonError4);
                    }
                    c0695x.m6815h();
                    a = C0663y.m6525a(c0695x);
                    if (ar.m6924a(j)) {
                        a.append(aq.f7582a).append(j);
                        c0696z.m6823c(j);
                    }
                    c0696z.m6821a(a.toString());
                    return new C0768a(c0696z, googleJsonError4);
                } catch (IOException e52) {
                    e = e52;
                    googleJsonError = googleJsonError4;
                    e.printStackTrace();
                    if (a2 != null) {
                        c0695x.m6815h();
                        googleJsonError2 = googleJsonError4;
                        googleJsonError4 = googleJsonError;
                        obj = googleJsonError2;
                    } else if (googleJsonError == null) {
                        a2.m7110b();
                        googleJsonError2 = googleJsonError4;
                        googleJsonError4 = googleJsonError;
                        obj = googleJsonError2;
                    } else {
                        googleJsonError2 = googleJsonError4;
                        googleJsonError4 = googleJsonError;
                        obj = googleJsonError2;
                    }
                    a = C0663y.m6525a(c0695x);
                    if (ar.m6924a(j)) {
                        a.append(aq.f7582a).append(j);
                        c0696z.m6823c(j);
                    }
                    c0696z.m6821a(a.toString());
                    return new C0768a(c0696z, googleJsonError4);
                } catch (Throwable th4) {
                    th = th4;
                    googleJsonError3 = googleJsonError4;
                    if (a2 != null) {
                        c0695x.m6815h();
                    } else if (googleJsonError3 == null) {
                        a2.m7110b();
                    }
                    throw th;
                }
            } catch (IOException e522) {
                e = e522;
                a2 = googleJsonError4;
                googleJsonError = googleJsonError4;
                e.printStackTrace();
                if (a2 != null) {
                    c0695x.m6815h();
                    googleJsonError2 = googleJsonError4;
                    googleJsonError4 = googleJsonError;
                    obj = googleJsonError2;
                } else if (googleJsonError == null) {
                    googleJsonError2 = googleJsonError4;
                    googleJsonError4 = googleJsonError;
                    obj = googleJsonError2;
                } else {
                    a2.m7110b();
                    googleJsonError2 = googleJsonError4;
                    googleJsonError4 = googleJsonError;
                    obj = googleJsonError2;
                }
                a = C0663y.m6525a(c0695x);
                if (ar.m6924a(j)) {
                    a.append(aq.f7582a).append(j);
                    c0696z.m6823c(j);
                }
                c0696z.m6821a(a.toString());
                return new C0768a(c0696z, googleJsonError4);
            } catch (Throwable th5) {
                th = th5;
                a2 = googleJsonError4;
                googleJsonError3 = googleJsonError4;
                if (a2 != null) {
                    c0695x.m6815h();
                } else if (googleJsonError3 == null) {
                    a2.m7110b();
                }
                throw th;
            }
        } catch (IOException e5222) {
            e = e5222;
            obj = googleJsonError4;
            e.printStackTrace();
            a = C0663y.m6525a(c0695x);
            if (ar.m6924a(j)) {
                a.append(aq.f7582a).append(j);
                c0696z.m6823c(j);
            }
            c0696z.m6821a(a.toString());
            return new C0768a(c0696z, googleJsonError4);
        }
    }
}
