package p000a.p001a;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a.a.f */
final class C0005f {
    private static final Pattern f24i;
    private static final Pattern f25j;
    private static final List<String> f26k;
    private final String f27a;
    private final Locale f28b;
    private Collection<C0009j> f29c;
    private Collection<C0008i> f30d;
    private final Map<Locale, List<String>> f31e;
    private final Map<Locale, List<String>> f32f;
    private final Map<Locale, List<String>> f33g;
    private final C0007h f34h;

    static {
        f24i = Pattern.compile("\\|[^\\|]*\\|");
        f25j = Pattern.compile("f{1,9}");
        f26k = new ArrayList();
        f26k.add("YYYY");
        f26k.add("YY");
        f26k.add("MMMM");
        f26k.add("MMM");
        f26k.add("MM");
        f26k.add("M");
        f26k.add("DD");
        f26k.add("D");
        f26k.add("WWWW");
        f26k.add("WWW");
        f26k.add("hh12");
        f26k.add("h12");
        f26k.add("hh");
        f26k.add("h");
        f26k.add("mm");
        f26k.add("m");
        f26k.add("ss");
        f26k.add("s");
        f26k.add("a");
        f26k.add("fffffffff");
        f26k.add("ffffffff");
        f26k.add("fffffff");
        f26k.add("ffffff");
        f26k.add("fffff");
        f26k.add("ffff");
        f26k.add("fff");
        f26k.add("ff");
        f26k.add("f");
    }

    C0005f(String str) {
        this.f31e = new LinkedHashMap();
        this.f32f = new LinkedHashMap();
        this.f33g = new LinkedHashMap();
        this.f27a = str;
        this.f28b = null;
        this.f34h = null;
        m56c();
    }

    private C0009j m41a(int i) {
        C0009j c0009j = null;
        for (C0009j c0009j2 : this.f29c) {
            C0009j c0009j22;
            if (c0009j22.f40a != i) {
                c0009j22 = c0009j;
            }
            c0009j = c0009j22;
        }
        return c0009j;
    }

    private String m42a(Integer num) {
        String a = m43a((Object) num);
        while (a.length() < 9) {
            a = "0" + a;
        }
        return a;
    }

    private String m43a(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    private String m44a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            stringBuilder.append("@");
        }
        return stringBuilder.toString();
    }

    private String m45a(String str, int i) {
        return (!C0017r.m111a(str) || str.length() < i) ? str : str.substring(0, i);
    }

    private String m46a(String str, C0000a c0000a) {
        String str2 = "";
        if ("YYYY".equals(str)) {
            return m43a(c0000a.m21a());
        }
        if ("YY".equals(str)) {
            return m52b(m43a(c0000a.m21a()));
        }
        if ("MMMM".equals(str)) {
            return m51b(Integer.valueOf(c0000a.m27b().intValue()));
        }
        if ("MMM".equals(str)) {
            return m58d(m51b(Integer.valueOf(c0000a.m27b().intValue())));
        }
        if ("MM".equals(str)) {
            return m55c(m43a(c0000a.m27b()));
        }
        if ("M".equals(str)) {
            return m43a(c0000a.m27b());
        }
        if ("DD".equals(str)) {
            return m55c(m43a(c0000a.m31c()));
        }
        if ("D".equals(str)) {
            return m43a(c0000a.m31c());
        }
        if ("WWWW".equals(str)) {
            return m59e(Integer.valueOf(c0000a.m37i().intValue()));
        }
        if ("WWW".equals(str)) {
            return m58d(m59e(Integer.valueOf(c0000a.m37i().intValue())));
        }
        if ("hh".equals(str)) {
            return m55c(m43a(c0000a.m32d()));
        }
        if ("h".equals(str)) {
            return m43a(c0000a.m32d());
        }
        if ("h12".equals(str)) {
            return m43a(m62h(c0000a.m32d()));
        }
        if ("hh12".equals(str)) {
            return m55c(m43a(m62h(c0000a.m32d())));
        }
        if ("a".equals(str)) {
            return m63i(Integer.valueOf(c0000a.m32d().intValue()));
        }
        if ("mm".equals(str)) {
            return m55c(m43a(c0000a.m33e()));
        }
        if ("m".equals(str)) {
            return m43a(c0000a.m33e());
        }
        if ("ss".equals(str)) {
            return m55c(m43a(c0000a.m34f()));
        }
        if ("s".equals(str)) {
            return m43a(c0000a.m34f());
        }
        if (!str.startsWith("f")) {
            throw new IllegalArgumentException("Unknown token in date formatting pattern: " + str);
        } else if (f25j.matcher(str).matches()) {
            return m45a(m42a(c0000a.m35g()), str.length());
        } else {
            throw new IllegalArgumentException("Unknown token in date formatting pattern: " + str);
        }
    }

    private void m47a() {
        Matcher matcher = f24i.matcher(this.f27a);
        while (matcher.find()) {
            C0008i c0008i = new C0008i();
            c0008i.f38a = matcher.start();
            c0008i.f39b = matcher.end() - 1;
            this.f30d.add(c0008i);
        }
    }

    private boolean m48a(C0009j c0009j) {
        for (C0008i c0008i : this.f30d) {
            if (c0008i.f38a <= c0009j.f40a && c0009j.f40a <= c0008i.f39b) {
                return true;
            }
        }
        return false;
    }

    private String m49b() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < this.f27a.length()) {
            String b = m50b(i);
            C0009j a = m41a(i);
            if (a != null) {
                stringBuilder.append(a.f42c);
                i = a.f41b;
            } else if (!"|".equals(b)) {
                stringBuilder.append(b);
            }
            i++;
        }
        return stringBuilder.toString();
    }

    private String m50b(int i) {
        return this.f27a.substring(i, i + 1);
    }

    private String m51b(Integer num) {
        String str = "";
        if (num == null) {
            return str;
        }
        if (this.f34h != null) {
            return m54c(num);
        }
        if (this.f28b != null) {
            return m57d(num);
        }
        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + C0017r.m110a(this.f27a));
    }

    private String m52b(String str) {
        return C0017r.m111a(str) ? str.substring(2) : "";
    }

    private void m53b(C0000a c0000a) {
        String str = this.f27a;
        Object obj = str;
        for (String str2 : f26k) {
            Matcher matcher = Pattern.compile(str2).matcher(obj);
            while (matcher.find()) {
                C0009j c0009j = new C0009j();
                c0009j.f40a = matcher.start();
                c0009j.f41b = matcher.end() - 1;
                if (!m48a(c0009j)) {
                    c0009j.f42c = m46a(matcher.group(), c0000a);
                    this.f29c.add(c0009j);
                }
            }
            String replace = obj.replace(str2, m44a(str2));
        }
    }

    private String m54c(Integer num) {
        return (String) this.f34h.f35a.get(num.intValue() - 1);
    }

    private String m55c(String str) {
        return (C0017r.m111a(str) && str.length() == 1) ? "0" + str : str;
    }

    private void m56c() {
        if (!C0017r.m111a(this.f27a)) {
            throw new IllegalArgumentException("DateTime format has no content.");
        }
    }

    private String m57d(Integer num) {
        String str = "";
        if (!this.f31e.containsKey(this.f28b)) {
            List arrayList = new ArrayList();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", this.f28b);
            for (int i = 0; i <= 11; i++) {
                Calendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(1, 2000);
                gregorianCalendar.set(2, i);
                gregorianCalendar.set(5, 15);
                arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
            }
            this.f31e.put(this.f28b, arrayList);
        }
        return (String) ((List) this.f31e.get(this.f28b)).get(num.intValue() - 1);
    }

    private String m58d(String str) {
        return (!C0017r.m111a(str) || str.length() < 3) ? str : str.substring(0, 3);
    }

    private String m59e(Integer num) {
        String str = "";
        if (num == null) {
            return str;
        }
        if (this.f34h != null) {
            return m60f(num);
        }
        if (this.f28b != null) {
            return m61g(num);
        }
        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + C0017r.m110a(this.f27a));
    }

    private String m60f(Integer num) {
        return (String) this.f34h.f36b.get(num.intValue() - 1);
    }

    private String m61g(Integer num) {
        String str = "";
        if (!this.f32f.containsKey(this.f28b)) {
            List arrayList = new ArrayList();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", this.f28b);
            for (int i = 8; i <= 14; i++) {
                Calendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(1, 2009);
                gregorianCalendar.set(2, 1);
                gregorianCalendar.set(5, i);
                arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
            }
            this.f32f.put(this.f28b, arrayList);
        }
        return (String) ((List) this.f32f.get(this.f28b)).get(num.intValue() - 1);
    }

    private Integer m62h(Integer num) {
        return num != null ? num.intValue() == 0 ? Integer.valueOf(12) : num.intValue() > 12 ? Integer.valueOf(num.intValue() - 12) : num : num;
    }

    private String m63i(Integer num) {
        String str = "";
        if (num == null) {
            return str;
        }
        if (this.f34h != null) {
            return m64j(num);
        }
        if (this.f28b != null) {
            return m65k(num);
        }
        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + C0017r.m110a(this.f27a));
    }

    private String m64j(Integer num) {
        String str = "";
        return num.intValue() < 12 ? (String) this.f34h.f37c.get(0) : (String) this.f34h.f37c.get(1);
    }

    private String m65k(Integer num) {
        String str = "";
        if (!this.f33g.containsKey(this.f28b)) {
            List arrayList = new ArrayList();
            arrayList.add(m66l(Integer.valueOf(6)));
            arrayList.add(m66l(Integer.valueOf(18)));
            this.f33g.put(this.f28b, arrayList);
        }
        return num.intValue() < 12 ? (String) ((List) this.f33g.get(this.f28b)).get(0) : (String) ((List) this.f33g.get(this.f28b)).get(1);
    }

    private String m66l(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("a", this.f28b);
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2000);
        gregorianCalendar.set(2, 6);
        gregorianCalendar.set(5, 15);
        gregorianCalendar.set(11, num.intValue());
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    String m67a(C0000a c0000a) {
        this.f30d = new ArrayList();
        this.f29c = new ArrayList();
        m47a();
        m53b(c0000a);
        return m49b();
    }
}
