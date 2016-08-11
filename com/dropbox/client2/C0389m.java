package com.dropbox.client2;

import com.dropbox.client2.p029a.C0345a;
import com.dropbox.client2.p029a.C0347c;
import com.dropbox.client2.p029a.C0349e;
import com.dropbox.client2.p029a.C0351g;
import com.dropbox.client2.p029a.C0352h;
import com.dropbox.client2.p029a.C0353i;
import com.dropbox.client2.p029a.C0355k;
import com.dropbox.client2.p030c.C0357m;
import com.dropbox.client2.p030c.C0378o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import p018c.p025b.p026a.p027a.C0331b;
import p018c.p025b.p026a.p027a.C0332c;

/* renamed from: com.dropbox.client2.m */
public class C0389m {
    private static final DateFormat f2406a;

    static {
        f2406a = new SimpleDateFormat("EEE, dd MMM yyyy kk:mm:ss ZZZZZ", Locale.US);
    }

    public static Object m2349a(C0390n c0390n, String str, String str2, int i, String[] strArr, C0357m c0357m) {
        return C0389m.m2350a(C0389m.m2358b(c0390n, str, str2, i, strArr, c0357m).f2399b);
    }

    public static Object m2350a(HttpResponse httpResponse) {
        Reader bufferedReader;
        IOException e;
        Throwable th;
        Reader reader;
        BufferedReader bufferedReader2 = null;
        try {
            Object b;
            BufferedReader bufferedReader3;
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()), 16384);
                try {
                    bufferedReader.mark(16384);
                    b = new C0331b().m2241b(bufferedReader);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        throw new C0347c(e);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                            }
                        }
                        throw th;
                    }
                } catch (C0332c e4) {
                    reader = bufferedReader;
                    if (C0353i.m2279a(httpResponse)) {
                        throw new C0353i(httpResponse);
                    }
                    throw new C0349e(bufferedReader2);
                } catch (OutOfMemoryError e5) {
                    th = e5;
                    reader = bufferedReader;
                    throw new C0345a(th);
                }
            }
            bufferedReader3 = null;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (IOException e6) {
                }
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                return b;
            }
            if (statusCode == 401) {
                throw new C0355k();
            }
            throw new C0353i(httpResponse, b);
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
            throw new C0347c(e);
        } catch (C0332c e8) {
            if (C0353i.m2279a(httpResponse)) {
                throw new C0353i(httpResponse);
            }
            throw new C0349e(bufferedReader2);
        } catch (OutOfMemoryError e9) {
            th = e9;
            throw new C0345a(th);
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static String m2351a(String str, int i, String str2, String[] strArr) {
        if (!str2.startsWith("/")) {
            str2 = "/" + str2;
        }
        try {
            String replace = URLEncoder.encode("/" + i + str2, "UTF-8").replace("%2F", "/");
            if (strArr != null && strArr.length > 0) {
                replace = replace + "?" + C0389m.m2352a(strArr);
            }
            return "https://" + str + ":443" + replace.replace("+", "%20").replace("*", "%2A");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    private static String m2352a(String[] strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Params must have an even number of elements.");
        }
        String str = "";
        Object obj = 1;
        int i = 0;
        while (i < strArr.length) {
            try {
                if (strArr[i + 1] != null) {
                    if (obj != null) {
                        obj = null;
                    } else {
                        str = str + "&";
                    }
                    str = str + URLEncoder.encode(strArr[i], "UTF-8") + "=" + URLEncoder.encode(strArr[i + 1], "UTF-8");
                }
                i += 2;
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        }
        return str;
    }

    public static HttpResponse m2353a(C0357m c0357m, HttpUriRequest httpUriRequest) {
        return C0389m.m2354a(c0357m, httpUriRequest, -1);
    }

    public static HttpResponse m2354a(C0357m c0357m, HttpUriRequest httpUriRequest, int i) {
        HttpClient a = C0389m.m2355a(c0357m);
        c0357m.m2302a(httpUriRequest);
        if (i >= 0) {
            HttpConnectionParams.setSoTimeout(httpUriRequest.getParams(), i);
        }
        boolean a2 = C0389m.m2357a((HttpRequest) httpUriRequest);
        HttpResponse httpResponse = null;
        int i2 = 0;
        while (i2 < 5) {
            try {
                httpResponse = a.execute(httpUriRequest);
            } catch (NullPointerException e) {
            }
            if (httpResponse != null) {
                break;
            }
            C0389m.m2356a(a, c0357m);
            if (a2) {
                i2++;
            } else {
                throw new C0351g();
            }
        }
        if (httpResponse == null) {
            try {
                throw new C0347c("Apache HTTPClient encountered an error. No response, try again.");
            } catch (SSLException e2) {
                throw new C0352h(e2);
            } catch (IOException e3) {
                throw new C0347c(e3);
            } catch (Throwable e4) {
                throw new C0345a(e4);
            }
        }
        i2 = httpResponse.getStatusLine().getStatusCode();
        if (!(i2 == 200 || i2 == 206)) {
            C0389m.m2350a(httpResponse);
        }
        return httpResponse;
    }

    private static synchronized HttpClient m2355a(C0357m c0357m) {
        HttpClient j;
        synchronized (C0389m.class) {
            j = c0357m.m2307j();
            C0389m.m2356a(j, c0357m);
        }
        return j;
    }

    private static void m2356a(HttpClient httpClient, C0357m c0357m) {
        C0378o i = c0357m.m2306i();
        if (i == null || i.f2373a == null || i.f2373a.equals("")) {
            httpClient.getParams().removeParameter("http.route.default-proxy");
        } else {
            httpClient.getParams().setParameter("http.route.default-proxy", i.f2374b < 0 ? new HttpHost(i.f2373a) : new HttpHost(i.f2373a, i.f2374b));
        }
    }

    private static boolean m2357a(HttpRequest httpRequest) {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (!(entity == null || entity.isRepeatable())) {
                return false;
            }
        }
        return true;
    }

    public static C0385h m2358b(C0390n c0390n, String str, String str2, int i, String[] strArr, C0357m c0357m) {
        HttpUriRequest httpGet;
        if (c0390n == C0390n.GET) {
            httpGet = new HttpGet(C0389m.m2351a(str, i, str2, strArr));
        } else {
            HttpPost httpPost = new HttpPost(C0389m.m2351a(str, i, str2, null));
            if (strArr != null && strArr.length >= 2) {
                if (strArr.length % 2 != 0) {
                    throw new IllegalArgumentException("Params must have an even number of elements.");
                }
                List arrayList = new ArrayList();
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    if (strArr[i2 + 1] != null) {
                        arrayList.add(new BasicNameValuePair(strArr[i2], strArr[i2 + 1]));
                    }
                }
                try {
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                } catch (Throwable e) {
                    throw new C0345a(e);
                }
            }
            Object obj = httpPost;
        }
        c0357m.m2301a((HttpRequest) httpGet);
        return new C0385h(httpGet, C0389m.m2353a(c0357m, httpGet));
    }
}
