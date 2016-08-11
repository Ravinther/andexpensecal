package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.C0607c;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public class aj {
    private final int f6224a;
    private final int f6225b;
    private final ai f6226c;
    private Base64OutputStream f6227d;
    private ByteArrayOutputStream f6228e;

    public aj(int i) {
        this.f6226c = new an();
        this.f6225b = i;
        this.f6224a = 6;
    }

    private String m5033b(String str) {
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return "";
        }
        this.f6228e = new ByteArrayOutputStream();
        this.f6227d = new Base64OutputStream(this.f6228e, 10);
        Arrays.sort(split, new ak(this));
        int i = 0;
        while (i < split.length && i < this.f6225b) {
            if (split[i].trim().length() != 0) {
                try {
                    this.f6227d.write(this.f6226c.m5032a(split[i]));
                } catch (Throwable e) {
                    ly.m6069b("Error while writing hash to byteStream", e);
                }
            }
            i++;
        }
        try {
            this.f6227d.flush();
            this.f6227d.close();
            return this.f6228e.toString();
        } catch (Throwable e2) {
            ly.m6069b("HashManager: Unable to convert to base 64", e2);
            return "";
        }
    }

    String m5034a(String str) {
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return "";
        }
        this.f6228e = new ByteArrayOutputStream();
        this.f6227d = new Base64OutputStream(this.f6228e, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.f6225b, new al(this));
        for (String b : split) {
            String[] b2 = am.m5041b(b);
            if (b2.length >= this.f6224a) {
                ao.m5049a(b2, this.f6225b, this.f6224a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                this.f6227d.write(this.f6226c.m5032a(((ap) it.next()).f6233b));
            } catch (Throwable e) {
                ly.m6069b("Error while writing hash to byteStream", e);
            }
        }
        try {
            this.f6227d.flush();
            this.f6227d.close();
            return this.f6228e.toString();
        } catch (Throwable e2) {
            ly.m6069b("HashManager: unable to convert to base 64", e2);
            return "";
        }
    }

    public String m5035a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        switch (null) {
            case C0607c.AdsAttrs_adSize /*0*/:
                return m5034a(stringBuffer.toString());
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                return m5033b(stringBuffer.toString());
            default:
                return "";
        }
    }
}
