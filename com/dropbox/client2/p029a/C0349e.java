package com.dropbox.client2.p029a;

import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: com.dropbox.client2.a.e */
public class C0349e extends C0345a {
    public C0349e(BufferedReader bufferedReader) {
        super("failed to parse: " + C0349e.m2277a(bufferedReader));
    }

    public C0349e(String str) {
        super(str);
    }

    public static String m2277a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.reset();
            } catch (IOException e) {
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            } catch (IOException e2) {
            }
        }
        return stringBuffer.toString();
    }
}
