package com.expensemanager;

public class ack {
    private String f3906a;
    private String f3907b;
    private double f3908c;
    private double f3909d;
    private double f3910e;

    public ack(String str, String str2, double d, double d2, boolean z) {
        this.f3907b = str2;
        this.f3908c = d;
        this.f3909d = d2;
        this.f3906a = str;
        this.f3910e = d;
        if (z) {
            this.f3910e = d2;
        }
    }

    public String m3823a() {
        return this.f3906a;
    }

    public String m3824b() {
        return this.f3907b;
    }

    public double m3825c() {
        return this.f3908c;
    }

    public double m3826d() {
        return this.f3909d;
    }

    public double m3827e() {
        return this.f3910e;
    }

    public String toString() {
        return "name=" + this.f3907b + "; value=" + this.f3910e;
    }
}
