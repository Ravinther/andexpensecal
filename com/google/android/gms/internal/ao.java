package com.google.android.gms.internal;

import java.util.PriorityQueue;

public class ao {
    static long m5045a(int i, int i2, long j, long j2, long j3) {
        return ((((((j + 1073807359) - ((((((long) i) + 2147483647L) % 1073807359) * j2) % 1073807359)) % 1073807359) * j3) % 1073807359) + ((((long) i2) + 2147483647L) % 1073807359)) % 1073807359;
    }

    static long m5046a(long j, int i) {
        return i == 0 ? 1 : i != 1 ? i % 2 == 0 ? m5046a((j * j) % 1073807359, i / 2) % 1073807359 : ((m5046a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    static String m5047a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            ly.m6068b("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    static void m5048a(int i, long j, String str, PriorityQueue<ap> priorityQueue) {
        ap apVar = new ap(j, str);
        if ((priorityQueue.size() != i || ((ap) priorityQueue.peek()).f6232a <= apVar.f6232a) && !priorityQueue.contains(apVar)) {
            priorityQueue.add(apVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void m5049a(String[] strArr, int i, int i2, PriorityQueue<ap> priorityQueue) {
        long b = m5050b(strArr, 0, i2);
        m5048a(i, b, m5047a(strArr, 0, i2), (PriorityQueue) priorityQueue);
        long a = m5046a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            b = m5045a(am.m5038a(strArr[i3 - 1]), am.m5038a(strArr[(i3 + i2) - 1]), b, a, 16785407);
            m5048a(i, b, m5047a(strArr, i3, i2), (PriorityQueue) priorityQueue);
        }
    }

    private static long m5050b(String[] strArr, int i, int i2) {
        long a = (((long) am.m5038a(strArr[i])) + 2147483647L) % 1073807359;
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) am.m5038a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
