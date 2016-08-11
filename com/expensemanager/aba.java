package com.expensemanager;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.view.View;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class aba {
    public static double m3742a(double d, String str) {
        if ("0".equals(str) || "".equals(str) || "-".equals(str)) {
            return d;
        }
        try {
            return d + new Double(str.replace("--", "").replaceAll(",", "").trim()).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
    }

    public static double m3743a(String str, String str2) {
        if (str == null || "".equals(str)) {
            str = "0";
        }
        if (str2 == null || "".equals(str2)) {
            str2 = "0";
        }
        String replaceAll = str2.replace("--", "").replaceAll(",", "");
        double d = 0.0d;
        try {
            return Double.parseDouble(replaceAll) + Double.parseDouble(str.replace("--", "").replaceAll(",", ""));
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
    }

    public static long m3744a(String str, String str2, Locale locale) {
        try {
            return new SimpleDateFormat(str2, locale).parse(str).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static AlertDialog m3745a(Context context, View view, String str, int i, String str2, String str3, OnClickListener onClickListener, String str4, OnClickListener onClickListener2) {
        Builder builder = new Builder(context);
        builder.setTitle(str);
        if (i != -1) {
            builder.setIcon(i);
        }
        if (str2 != null) {
            builder.setMessage(str2);
        }
        if (view != null) {
            builder.setView(view);
        }
        if (onClickListener == null) {
            onClickListener = new abb();
        }
        builder.setPositiveButton(str3, onClickListener);
        if (onClickListener2 == null) {
            onClickListener2 = new abc();
        }
        builder.setNegativeButton(str4, onClickListener2);
        return builder.create();
    }

    public static String m3746a(double d) {
        try {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
            decimalFormat.setNegativePrefix("(" + decimalFormat.getPositivePrefix());
            decimalFormat.setNegativeSuffix(")");
            return decimalFormat.format(d).replace("$", "");
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String m3747a(int i, String str, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(7, i * 7);
        instance.set(7, ExpenseManager.f3243s);
        if (instance.after(Calendar.getInstance())) {
            instance.add(7, -7);
        }
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        long timeInMillis = instance.getTimeInMillis();
        instance.add(7, 7);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        long timeInMillis2 = instance.getTimeInMillis();
        String str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "!='Income'" + " AND " + "account" + "='" + str + "'";
        if (i2 == 1) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "='Income'" + " AND " + "account" + "='" + str + "'";
        }
        if (i2 == 0) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "account" + "='" + str + "'";
        }
        if (!"All".equalsIgnoreCase(str)) {
            return str2;
        }
        str2 = str2.replace(" AND account='" + str + "'", "") + " AND " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
        if (i2 == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer' ";
        }
        return i2 == 1 ? str2 + " AND " + "subcategory" + "!='Account Transfer' " : str2;
    }

    public static String m3748a(int i, String[] strArr) {
        Calendar instance = Calendar.getInstance();
        instance.add(2, i);
        return strArr[instance.get(2)];
    }

    public static String m3749a(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String m3750a(ro roVar, String str) {
        double d = 0.0d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, null);
        if (a == null || !a.moveToFirst()) {
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
            return m3746a(d);
        }
        int columnIndex = a.getColumnIndex("amount");
        do {
            d = m3742a(d, a.getString(columnIndex));
        } while (a.moveToNext());
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3751a(com.expensemanager.ro r33, java.lang.String r34, java.lang.String r35, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r36, int r37, java.lang.String r38) {
        /*
        r2 = 0;
        r4 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0470 }
        r5 = java.util.Locale.US;	 Catch:{ Exception -> 0x0470 }
        r0 = r35;
        r4 = m3744a(r0, r4, r5);	 Catch:{ Exception -> 0x0470 }
        r6 = java.util.Calendar.getInstance();	 Catch:{ Exception -> 0x0470 }
        r6.setTimeInMillis(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = 11;
        r5 = 0;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 12;
        r5 = 0;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 13;
        r5 = 0;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 14;
        r5 = 0;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r8 = r6.getTimeInMillis();	 Catch:{ Exception -> 0x0470 }
        r4 = 11;
        r5 = 23;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 12;
        r5 = 59;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 13;
        r5 = 59;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r4 = 14;
        r5 = 999; // 0x3e7 float:1.4E-42 double:4.936E-321;
        r6.set(r4, r5);	 Catch:{ Exception -> 0x0470 }
        r6 = r6.getTimeInMillis();	 Catch:{ Exception -> 0x0470 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r4.<init>();	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed>=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "<=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r6);	 Catch:{ Exception -> 0x0470 }
        r5 = " and ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "category";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "!='Income'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "account";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "='";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r0 = r34;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0470 }
        r5 = "'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
        if (r37 != 0) goto L_0x00f1;
    L_0x00aa:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r4.<init>();	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed>=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "<=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r6);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "account";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "='";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r0 = r34;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0470 }
        r5 = "'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
    L_0x00f1:
        r5 = 1;
        r0 = r37;
        if (r0 != r5) goto L_0x0178;
    L_0x00f6:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r4.<init>();	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed>=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "expensed";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "<=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r6);	 Catch:{ Exception -> 0x0470 }
        r5 = " and ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "category";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "='Income'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "account";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "='";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r0 = r34;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0470 }
        r5 = "'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
        r5 = "YES";
        r0 = r38;
        r5 = r5.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0470 }
        if (r5 == 0) goto L_0x0178;
    L_0x0159:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "subcategory";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "!='Account Transfer'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
    L_0x0178:
        r5 = "All";
        r0 = r34;
        r5 = r5.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0470 }
        if (r5 == 0) goto L_0x021a;
    L_0x0182:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r6 = " AND account='";
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0470 }
        r0 = r34;
        r5 = r5.append(r0);	 Catch:{ Exception -> 0x0470 }
        r6 = "'";
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0470 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0470 }
        r6 = "";
        r4 = r4.replace(r5, r6);	 Catch:{ Exception -> 0x0470 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "account";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = " in (";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = com.expensemanager.ExpenseManager.f3245u;	 Catch:{ Exception -> 0x0470 }
        r5 = com.expensemanager.abd.m3792a(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = ")";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
        r5 = 2;
        r0 = r37;
        if (r0 != r5) goto L_0x01f6;
    L_0x01d7:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "category";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "!='Account Transfer' ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
    L_0x01f6:
        r5 = 1;
        r0 = r37;
        if (r0 != r5) goto L_0x021a;
    L_0x01fb:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "subcategory";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "!='Account Transfer' ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
    L_0x021a:
        r5 = "YES";
        r0 = r38;
        r5 = r5.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0470 }
        if (r5 == 0) goto L_0x0248;
    L_0x0224:
        r5 = 2;
        r0 = r37;
        if (r0 != r5) goto L_0x0248;
    L_0x0229:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0470 }
        r5.<init>();	 Catch:{ Exception -> 0x0470 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0470 }
        r5 = " AND ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "category";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r5 = "!='Account Transfer'";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0470 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0470 }
    L_0x0248:
        r5 = r33.m4206d();	 Catch:{ Exception -> 0x0470 }
        if (r5 != 0) goto L_0x0251;
    L_0x024e:
        r33.m4193a();	 Catch:{ Exception -> 0x0470 }
    L_0x0251:
        r5 = 0;
        r0 = r33;
        r7 = r0.m4192a(r4, r5);	 Catch:{ Exception -> 0x0470 }
        if (r7 == 0) goto L_0x044c;
    L_0x025a:
        r4 = r7.moveToFirst();	 Catch:{ Exception -> 0x0470 }
        if (r4 == 0) goto L_0x044c;
    L_0x0260:
        r4 = "_id";
        r8 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "account";
        r9 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "amount";
        r10 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "category";
        r11 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "subcategory";
        r12 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "payment_method";
        r13 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "description";
        r14 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "reference_number";
        r15 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "property";
        r16 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "status";
        r17 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "property2";
        r18 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = "expensed";
        r19 = r7.getColumnIndex(r4);	 Catch:{ Exception -> 0x0470 }
        r4 = r2;
    L_0x02a9:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r2.<init>();	 Catch:{ Exception -> 0x0475 }
        r3 = "";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0475 }
        r20 = r7.getLong(r8);	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r2 = r2.append(r0);	 Catch:{ Exception -> 0x0475 }
        r20 = r2.toString();	 Catch:{ Exception -> 0x0475 }
        r21 = r7.getString(r9);	 Catch:{ Exception -> 0x0475 }
        r3 = r7.getString(r10);	 Catch:{ Exception -> 0x0475 }
        r22 = r7.getString(r11);	 Catch:{ Exception -> 0x0475 }
        r23 = r7.getString(r12);	 Catch:{ Exception -> 0x0475 }
        r24 = r7.getString(r13);	 Catch:{ Exception -> 0x0475 }
        r6 = r7.getString(r14);	 Catch:{ Exception -> 0x0475 }
        r25 = r7.getString(r15);	 Catch:{ Exception -> 0x0475 }
        r0 = r16;
        r26 = r7.getString(r0);	 Catch:{ Exception -> 0x0475 }
        r0 = r17;
        r27 = r7.getString(r0);	 Catch:{ Exception -> 0x0475 }
        r0 = r18;
        r28 = r7.getString(r0);	 Catch:{ Exception -> 0x0475 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r2.<init>();	 Catch:{ Exception -> 0x0475 }
        r29 = "";
        r0 = r29;
        r2 = r2.append(r0);	 Catch:{ Exception -> 0x0475 }
        r0 = r19;
        r30 = r7.getLong(r0);	 Catch:{ Exception -> 0x0475 }
        r0 = r30;
        r2 = r2.append(r0);	 Catch:{ Exception -> 0x0475 }
        r29 = r2.toString();	 Catch:{ Exception -> 0x0475 }
        r2 = com.expensemanager.ExpenseManager.f3246v;	 Catch:{ Exception -> 0x0475 }
        if (r2 == 0) goto L_0x0481;
    L_0x0311:
        r2 = "All";
        r0 = r34;
        r2 = r2.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0475 }
        if (r2 == 0) goto L_0x0481;
    L_0x031b:
        r2 = com.expensemanager.ExpenseManager.f3246v;	 Catch:{ Exception -> 0x0475 }
        r0 = r21;
        r2 = r2.get(r0);	 Catch:{ Exception -> 0x0475 }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x0475 }
        r2 = com.expensemanager.abd.m3793a(r3, r2);	 Catch:{ Exception -> 0x0475 }
    L_0x0329:
        r30 = new java.util.HashMap;	 Catch:{ Exception -> 0x0475 }
        r30.<init>();	 Catch:{ Exception -> 0x0475 }
        r3 = "rowId";
        r0 = r30;
        r1 = r20;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "expenseDate";
        r0 = r30;
        r1 = r29;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "account";
        r0 = r30;
        r1 = r21;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "amount";
        r20 = m3767b(r2);	 Catch:{ Exception -> 0x0475 }
        r0 = r30;
        r1 = r20;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "category";
        r20 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r20.<init>();	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r1 = r22;
        r20 = r0.append(r1);	 Catch:{ Exception -> 0x0475 }
        r21 = ":";
        r20 = r20.append(r21);	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r1 = r23;
        r20 = r0.append(r1);	 Catch:{ Exception -> 0x0475 }
        r20 = r20.toString();	 Catch:{ Exception -> 0x0475 }
        r0 = r30;
        r1 = r20;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "paymentMethod";
        r0 = r30;
        r1 = r24;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "referenceNumber";
        r0 = r30;
        r1 = r25;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "property";
        r0 = r30;
        r1 = r26;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "status";
        r0 = r30;
        r1 = r27;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "property2";
        r0 = r30;
        r1 = r28;
        r0.put(r3, r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "";
        r20 = com.expensemanager.aib.m3865b(r28);	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r3 = r3.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0475 }
        if (r3 != 0) goto L_0x03d8;
    L_0x03b9:
        r3 = "\u2605";
        r3 = r6.indexOf(r3);	 Catch:{ Exception -> 0x0475 }
        r20 = -1;
        r0 = r20;
        if (r3 != r0) goto L_0x03d8;
    L_0x03c5:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r3.<init>();	 Catch:{ Exception -> 0x0475 }
        r3 = r3.append(r6);	 Catch:{ Exception -> 0x0475 }
        r6 = "\u2605";
        r3 = r3.append(r6);	 Catch:{ Exception -> 0x0475 }
        r6 = r3.toString();	 Catch:{ Exception -> 0x0475 }
    L_0x03d8:
        r3 = "description";
        r0 = r30;
        r0.put(r3, r6);	 Catch:{ Exception -> 0x0475 }
        r3 = new java.util.Date;	 Catch:{ Exception -> 0x0475 }
        r0 = r19;
        r20 = r7.getLong(r0);	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r3.<init>(r0);	 Catch:{ Exception -> 0x0475 }
        r20 = new java.text.SimpleDateFormat;	 Catch:{ Exception -> 0x0475 }
        r21 = "HH:mm:ss";
        r20.<init>(r21);	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r3 = r0.format(r3);	 Catch:{ Exception -> 0x0475 }
        r20 = "00:00:00";
        r0 = r20;
        r20 = r0.equals(r3);	 Catch:{ Exception -> 0x0475 }
        if (r20 != 0) goto L_0x047f;
    L_0x0403:
        r20 = "Transfer";
        r0 = r20;
        r20 = r6.startsWith(r0);	 Catch:{ Exception -> 0x0475 }
        if (r20 != 0) goto L_0x047f;
    L_0x040d:
        r20 = "";
        r0 = r20;
        r20 = r0.equals(r6);	 Catch:{ Exception -> 0x0475 }
        if (r20 == 0) goto L_0x0454;
    L_0x0417:
        r6 = "fulldescription";
        r0 = r30;
        r0.put(r6, r3);	 Catch:{ Exception -> 0x0475 }
        r0 = r36;
        r1 = r30;
        r0.add(r1);	 Catch:{ Exception -> 0x0475 }
        r3 = "Income";
        r0 = r22;
        r3 = r3.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0475 }
        if (r3 != 0) goto L_0x0442;
    L_0x042f:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r3.<init>();	 Catch:{ Exception -> 0x0475 }
        r6 = "-";
        r3 = r3.append(r6);	 Catch:{ Exception -> 0x0475 }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x0475 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0475 }
    L_0x0442:
        r2 = m3742a(r4, r2);	 Catch:{ Exception -> 0x0475 }
        r4 = r7.moveToNext();	 Catch:{ Exception -> 0x0470 }
        if (r4 != 0) goto L_0x047c;
    L_0x044c:
        r33.m4201b();
        r2 = m3746a(r2);
        return r2;
    L_0x0454:
        r20 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0475 }
        r20.<init>();	 Catch:{ Exception -> 0x0475 }
        r0 = r20;
        r6 = r0.append(r6);	 Catch:{ Exception -> 0x0475 }
        r20 = ";";
        r0 = r20;
        r6 = r6.append(r0);	 Catch:{ Exception -> 0x0475 }
        r3 = r6.append(r3);	 Catch:{ Exception -> 0x0475 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0475 }
        goto L_0x0417;
    L_0x0470:
        r4 = move-exception;
    L_0x0471:
        r4.printStackTrace();
        goto L_0x044c;
    L_0x0475:
        r2 = move-exception;
        r32 = r2;
        r2 = r4;
        r4 = r32;
        goto L_0x0471;
    L_0x047c:
        r4 = r2;
        goto L_0x02a9;
    L_0x047f:
        r3 = r6;
        goto L_0x0417;
    L_0x0481:
        r2 = r3;
        goto L_0x0329;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.aba.a(com.expensemanager.ro, java.lang.String, java.lang.String, java.util.List, int, java.lang.String):java.lang.String");
    }

    public static String m3752a(ro roVar, String str, List<Map<String, Object>> list, int i, boolean z) {
        double d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        ArrayList a2 = m3758a(i);
        String str2 = "";
        String str3;
        if (a == null || !a.moveToFirst()) {
            String str4 = str2;
            d = 0.0d;
            str3 = str4;
        } else {
            String string;
            double a3;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            d = 0.0d;
            while (true) {
                string = a.getString(columnIndex);
                str3 = a.getString(columnIndex2);
                String a4 = (ExpenseManager.f3246v == null || !z) ? str3 : abd.m3793a(str3, (String) ExpenseManager.f3246v.get(string));
                String a5 = m3749a(a.getLong(columnIndex3), ExpenseManager.f3244t);
                str3 = !"Income".equalsIgnoreCase(a.getString(columnIndex4)) ? "-" + a4 : a4;
                if (hashMap.get(a5) == null) {
                    hashMap.put(a5, m3781g(str3));
                } else {
                    hashMap.put(a5, "" + m3743a((String) hashMap.get(a5), str3));
                }
                a3 = m3742a(d, str3);
                if (!a.moveToNext()) {
                    break;
                }
                d = a3;
            }
            d = a3;
            Object obj = string;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            Map hashMap2 = new HashMap();
            String a6 = m3756a((String) a2.get(i2));
            Object a7 = m3756a((String) hashMap.get(a6));
            if ("".equals(a7)) {
                a7 = "0";
            }
            hashMap2.put("expenseDate", a6);
            hashMap2.put("amount", a7);
            hashMap2.put("account", obj);
            list.add(hashMap2);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3753a(ro roVar, String str, List<Map<String, Object>> list, int i, String[] strArr, boolean z) {
        double d;
        int columnIndex;
        int i2;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        String str2 = "";
        String str3;
        if (a == null || !a.moveToFirst()) {
            String str4 = str2;
            d = 0.0d;
            str3 = str4;
        } else {
            String string;
            double a2;
            columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            double d2 = 0.0d;
            while (true) {
                string = a.getString(columnIndex);
                str3 = a.getString(columnIndex2);
                String a3 = (ExpenseManager.f3246v == null || !z) ? str3 : abd.m3793a(str3, (String) ExpenseManager.f3246v.get(string));
                long j = a.getLong(columnIndex3);
                str3 = !"Income".equalsIgnoreCase(a.getString(columnIndex4)) ? "-" + a3 : a3;
                Calendar instance = Calendar.getInstance();
                if (j != 0) {
                    instance.setTimeInMillis(j);
                }
                int i3 = instance.get(2);
                i2 = instance.get(1);
                if (instance.get(5) < ExpenseManager.f3242r) {
                    i3--;
                    if (i3 < 0) {
                        i3 += 12;
                        i2--;
                    }
                }
                str2 = strArr[i3] + " " + i2;
                if (hashMap.get(str2) == null) {
                    hashMap.put(str2, m3781g(str3));
                } else {
                    hashMap.put(str2, new BigDecimal(m3743a((String) hashMap.get(str2), str3)).toPlainString());
                }
                a2 = m3742a(d2, str3);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = a2;
            }
            d = a2;
            Object obj = string;
        }
        int i4 = Calendar.getInstance().get(1) + i;
        for (columnIndex = 0; columnIndex < 12; columnIndex++) {
            int i5;
            Map hashMap2 = new HashMap();
            i2 = ExpenseManager.f3241q + columnIndex;
            if (i2 >= 12) {
                i5 = i2 - 12;
                i2 = i4 + 1;
            } else {
                i5 = i2;
                i2 = i4;
            }
            if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
                i2--;
            }
            String str5 = strArr[i5] + " " + i2;
            Object a4 = m3756a((String) hashMap.get(str5));
            if ("".equals(a4)) {
                a4 = "0";
            }
            hashMap2.put("expenseDate", str5);
            hashMap2.put("amount", a4);
            hashMap2.put("account", obj);
            list.add(hashMap2);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3754a(ro roVar, String str, List<Map<String, String>> list, List<List<Map<String, String>>> list2, boolean z) {
        double d = 0.0d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        if (a != null && a.moveToFirst()) {
            int columnIndex = a.getColumnIndex("_id");
            int columnIndex2 = a.getColumnIndex("account");
            int columnIndex3 = a.getColumnIndex("amount");
            int columnIndex4 = a.getColumnIndex("category");
            int columnIndex5 = a.getColumnIndex("subcategory");
            int columnIndex6 = a.getColumnIndex("payment_method");
            int columnIndex7 = a.getColumnIndex("description");
            int columnIndex8 = a.getColumnIndex("reference_number");
            int columnIndex9 = a.getColumnIndex("property");
            int columnIndex10 = a.getColumnIndex("status");
            int columnIndex11 = a.getColumnIndex("property2");
            int columnIndex12 = a.getColumnIndex("expensed");
            double d2 = 0.0d;
            while (true) {
                String str2;
                String str3 = "" + a.getLong(columnIndex);
                String string = a.getString(columnIndex2);
                String string2 = a.getString(columnIndex3);
                String string3 = a.getString(columnIndex4);
                String string4 = a.getString(columnIndex5);
                String string5 = a.getString(columnIndex6);
                String string6 = a.getString(columnIndex7);
                String string7 = a.getString(columnIndex8);
                String string8 = a.getString(columnIndex9);
                String string9 = a.getString(columnIndex10);
                String string10 = a.getString(columnIndex11);
                long j = a.getLong(columnIndex12);
                String a2 = (ExpenseManager.f3246v == null || !z) ? string2 : abd.m3793a(string2, (String) ExpenseManager.f3246v.get(string));
                Map hashMap4 = new HashMap();
                if (hashMap2.get(string4) == null) {
                    hashMap2.put(string4, m3781g(a2));
                    hashMap4.put("subcategory", string3 + ":" + string4);
                    list.add(hashMap4);
                    hashMap.put(string4, hashMap4);
                    ArrayList arrayList = new ArrayList();
                    list2.add(arrayList);
                    hashMap3.put(string4, arrayList);
                } else {
                    str2 = string4;
                    hashMap2.put(str2, "" + m3743a((String) hashMap2.get(string4), a2));
                }
                hashMap4 = (Map) hashMap.get(string4);
                if ("Income".equalsIgnoreCase(string3)) {
                    str2 = "subcategorySubTotal";
                    hashMap4.put(str2, "+" + m3767b((String) hashMap2.get(string4)));
                } else {
                    str2 = "subcategorySubTotal";
                    hashMap4.put(str2, "-" + m3767b((String) hashMap2.get(string4)));
                }
                List list3 = (List) hashMap3.get(string4);
                if (list3 != null) {
                    Map hashMap5 = new HashMap();
                    hashMap5.put("rowId", str3);
                    hashMap5.put("expenseDate", m3749a(j, ExpenseManager.f3244t));
                    hashMap5.put("account", string);
                    if ("Income".equalsIgnoreCase(string3)) {
                        hashMap5.put("amount", "+" + m3767b(a2));
                    } else {
                        hashMap5.put("amount", "-" + m3767b(a2));
                    }
                    hashMap5.put("category", string3 + ":" + string4);
                    hashMap5.put("paymentMethod", string5);
                    hashMap5.put("description", string6);
                    hashMap5.put("referenceNumber", string7);
                    hashMap5.put("property", string8);
                    hashMap5.put("status", string9);
                    hashMap5.put("property2", string10);
                    list3.add(hashMap5);
                }
                d = m3742a(d2, a2);
                if (!a.moveToNext()) {
                    break;
                }
                d2 = d;
            }
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3755a(ro roVar, String str, List<Map<String, Object>> list, boolean z) {
        double d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, "category ASC");
        Map hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        String str3;
        if (a == null || !a.moveToFirst()) {
            String str4 = str2;
            d = 0.0d;
            str3 = str4;
        } else {
            String string;
            double a2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("category");
            d = 0.0d;
            while (true) {
                string = a.getString(columnIndex);
                str3 = a.getString(columnIndex2);
                if (ExpenseManager.f3246v != null && z) {
                    str3 = abd.m3793a(str3, (String) ExpenseManager.f3246v.get(string));
                }
                String string2 = a.getString(columnIndex3);
                if (hashMap.get(string2) == null) {
                    hashMap.put(string2, m3781g(str3));
                    arrayList.add(string2);
                } else {
                    hashMap.put(string2, "" + m3743a((String) hashMap.get(string2), str3));
                }
                if (!"Income".equalsIgnoreCase(string2)) {
                    str3 = "-" + str3;
                }
                a2 = m3742a(d, str3);
                if (!a.moveToNext()) {
                    break;
                }
                d = a2;
            }
            d = a2;
            Object obj = string;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Map hashMap2 = new HashMap();
            String a3 = m3756a((String) arrayList.get(i));
            Object a4 = m3756a((String) hashMap.get(a3));
            if ("".equals(a4)) {
                a4 = "0";
            }
            if (!"Income".equalsIgnoreCase(a3)) {
                a4 = "-" + a4;
            }
            hashMap2.put("category", a3);
            hashMap2.put("amount", a4);
            hashMap2.put("account", obj);
            list.add(hashMap2);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3756a(String str) {
        return str == null ? "" : str.trim();
    }

    public static String m3757a(String str, String str2, String str3) {
        try {
            str3 = new SimpleDateFormat(str2).format(new SimpleDateFormat(str).parse(str3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str3;
    }

    public static ArrayList<String> m3758a(int i) {
        ArrayList<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.add(7, i * 7);
        instance.set(7, ExpenseManager.f3243s);
        if (instance.after(Calendar.getInstance())) {
            instance.add(7, -7);
        }
        for (int i2 = 0; i2 < 7; i2++) {
            arrayList.add(new SimpleDateFormat(ExpenseManager.f3244t).format(new Date(new Long(instance.getTimeInMillis()).longValue())));
            instance.add(5, 1);
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3759a(android.content.Context r55, com.expensemanager.ro r56) {
        /*
        r51 = new java.util.ArrayList;
        r51.<init>();
        r4 = 0;
        r0 = r55;
        r1 = r56;
        r2 = r51;
        m3760a(r0, r1, r4, r2);
        r4 = r56.m4206d();
        if (r4 != 0) goto L_0x0018;
    L_0x0015:
        r56.m4193a();
    L_0x0018:
        r4 = 0;
        r47 = r4;
    L_0x001b:
        r4 = r51.size();
        r0 = r47;
        if (r0 >= r4) goto L_0x036d;
    L_0x0023:
        r0 = r51;
        r1 = r47;
        r4 = r0.get(r1);	 Catch:{ Exception -> 0x0367 }
        r0 = r4;
        r0 = (java.util.Map) r0;	 Catch:{ Exception -> 0x0367 }
        r44 = r0;
        r4 = "frequencyValue";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r0 = r4;
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0367 }
        r45 = r0;
        r4 = "firstExpenseDate";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r0 = r4;
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0367 }
        r46 = r0;
        r4 = "paidCycle";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r8 = m3780f(r4);	 Catch:{ Exception -> 0x0367 }
        r50 = r8 + 1;
        r5 = "numberOfPayment";
        r0 = r44;
        r5 = r0.get(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0367 }
        r6 = "status";
        r0 = r44;
        r13 = r0.get(r6);	 Catch:{ Exception -> 0x0367 }
        r13 = (java.lang.String) r13;	 Catch:{ Exception -> 0x0367 }
        r6 = "property2";
        r0 = r44;
        r6 = r0.get(r6);	 Catch:{ Exception -> 0x0367 }
        if (r6 == 0) goto L_0x0090;
    L_0x0078:
        r6 = "property2";
        r0 = r44;
        r6 = r0.get(r6);	 Catch:{ Exception -> 0x0367 }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x0367 }
        r7 = "Reminder";
        r6 = r6.indexOf(r7);	 Catch:{ Exception -> 0x0367 }
        r7 = -1;
        if (r6 == r7) goto L_0x0090;
    L_0x008b:
        r4 = r47 + 1;
        r47 = r4;
        goto L_0x001b;
    L_0x0090:
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r5 == 0) goto L_0x037a;
    L_0x0094:
        r9 = "";
        r9 = r9.equals(r5);	 Catch:{ Exception -> 0x0367 }
        if (r9 != 0) goto L_0x037a;
    L_0x009c:
        r6 = new java.lang.Long;	 Catch:{ Exception -> 0x0367 }
        r6.<init>(r5);	 Catch:{ Exception -> 0x0367 }
        r6 = r6.longValue();	 Catch:{ Exception -> 0x0367 }
        r52 = r6;
    L_0x00a7:
        r0 = r46;
        r1 = r45;
        r4 = m3768b(r0, r1, r4);	 Catch:{ Exception -> 0x0367 }
        if (r4 == 0) goto L_0x008b;
    L_0x00b1:
        r5 = "";
        r5 = r5.equals(r4);	 Catch:{ Exception -> 0x0367 }
        if (r5 != 0) goto L_0x008b;
    L_0x00b9:
        r5 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0367 }
        r6 = java.util.Locale.US;	 Catch:{ Exception -> 0x0367 }
        r20 = m3744a(r4, r5, r6);	 Catch:{ Exception -> 0x0367 }
        r4 = "0d";
        r0 = r45;
        r4 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0367 }
        if (r4 == 0) goto L_0x00cd;
    L_0x00cb:
        if (r8 > 0) goto L_0x008b;
    L_0x00cd:
        r4 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0367 }
        r5 = java.util.Locale.US;	 Catch:{ Exception -> 0x0367 }
        r0 = r46;
        m3744a(r0, r4, r5);	 Catch:{ Exception -> 0x0367 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r0 = r50;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0367 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r0 = r46;
        r1 = r45;
        r4 = m3768b(r0, r1, r4);	 Catch:{ Exception -> 0x0367 }
        r5 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0367 }
        r6 = java.util.Locale.US;	 Catch:{ Exception -> 0x0367 }
        r48 = m3744a(r4, r5, r6);	 Catch:{ Exception -> 0x0367 }
        r4 = new java.util.Date;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r22 = r4.getTime();	 Catch:{ Exception -> 0x0367 }
        r5 = "YES";
        r4 = "property2";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r54 = r5.equalsIgnoreCase(r4);	 Catch:{ Exception -> 0x0367 }
    L_0x0114:
        if (r54 != 0) goto L_0x0121;
    L_0x0116:
        r4 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1));
        if (r4 > 0) goto L_0x0121;
    L_0x011a:
        r0 = r50;
        r4 = (long) r0;	 Catch:{ Exception -> 0x0367 }
        r4 = (r4 > r52 ? 1 : (r4 == r52 ? 0 : -1));
        if (r4 <= 0) goto L_0x012a;
    L_0x0121:
        if (r54 == 0) goto L_0x008b;
    L_0x0123:
        r0 = r50;
        r4 = (long) r0;	 Catch:{ Exception -> 0x0367 }
        r4 = (r4 > r52 ? 1 : (r4 == r52 ? 0 : -1));
        if (r4 > 0) goto L_0x008b;
    L_0x012a:
        r4 = "category";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r0 = r4;
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x0367 }
        r24 = r0;
        r4 = ":";
        r0 = r24;
        r4 = r0.split(r4);	 Catch:{ Exception -> 0x0367 }
        r7 = "";
        r8 = "";
        if (r4 == 0) goto L_0x014c;
    L_0x0145:
        r5 = r4.length;	 Catch:{ Exception -> 0x0367 }
        r6 = 1;
        if (r5 != r6) goto L_0x014c;
    L_0x0149:
        r5 = 0;
        r7 = r4[r5];	 Catch:{ Exception -> 0x0367 }
    L_0x014c:
        if (r4 == 0) goto L_0x0158;
    L_0x014e:
        r5 = r4.length;	 Catch:{ Exception -> 0x0367 }
        r6 = 2;
        if (r5 != r6) goto L_0x0158;
    L_0x0152:
        r5 = 0;
        r7 = r4[r5];	 Catch:{ Exception -> 0x0367 }
        r5 = 1;
        r8 = r4[r5];	 Catch:{ Exception -> 0x0367 }
    L_0x0158:
        r4 = "property";
        r0 = r44;
        r12 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r12 = (java.lang.String) r12;	 Catch:{ Exception -> 0x0367 }
        r4 = "property3";
        r0 = r44;
        r16 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r16 = (java.lang.String) r16;	 Catch:{ Exception -> 0x0367 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "Repeating:";
        r5 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r4 = "description";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0367 }
        r10 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r4 = "Account Transfer";
        r0 = r24;
        r4 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0367 }
        if (r4 == 0) goto L_0x01b0;
    L_0x0193:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "Transfer:";
        r5 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r4 = "description";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0367 }
        r10 = r4.toString();	 Catch:{ Exception -> 0x0367 }
    L_0x01b0:
        r4 = "account";
        r0 = r44;
        r5 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0367 }
        r4 = "amount";
        r0 = r44;
        r6 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r6 = (java.lang.String) r6;	 Catch:{ Exception -> 0x0367 }
        r4 = "paymentMethod";
        r0 = r44;
        r9 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r9 = (java.lang.String) r9;	 Catch:{ Exception -> 0x0367 }
        r11 = "";
        r14 = "";
        r15 = "";
        r17 = "";
        r18 = "";
        r19 = "";
        r4 = r56;
        r4 = r4.m4190a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22);	 Catch:{ Exception -> 0x0367 }
        r5 = r56.m4206d();	 Catch:{ Exception -> 0x0367 }
        if (r5 != 0) goto L_0x01e9;
    L_0x01e6:
        r56.m4193a();	 Catch:{ Exception -> 0x0367 }
    L_0x01e9:
        r5 = "expense_report";
        r0 = r56;
        r6 = r0.m4185a(r5, r4);	 Catch:{ Exception -> 0x0367 }
        r4 = "Account Transfer";
        r0 = r24;
        r4 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0367 }
        if (r4 == 0) goto L_0x02b9;
    L_0x01fb:
        r4 = "paymentMethod";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r5 = "amount";
        r0 = r44;
        r5 = r0.get(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x0367 }
        if (r4 == 0) goto L_0x0376;
    L_0x0211:
        r8 = "";
        r8 = r8.equals(r4);	 Catch:{ Exception -> 0x0367 }
        if (r8 != 0) goto L_0x0376;
    L_0x0219:
        r8 = "=";
        r8 = r4.indexOf(r8);	 Catch:{ Exception -> 0x0367 }
        r9 = -1;
        if (r8 == r9) goto L_0x0376;
    L_0x0222:
        r8 = "|";
        r8 = r4.indexOf(r8);	 Catch:{ Exception -> 0x0367 }
        r9 = -1;
        if (r8 == r9) goto L_0x0376;
    L_0x022b:
        r8 = new java.lang.Double;	 Catch:{ Exception -> 0x0367 }
        r8.<init>(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = "=";
        r5 = r4.indexOf(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = r5 + 1;
        r4 = r4.substring(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = new java.lang.Double;	 Catch:{ Exception -> 0x0367 }
        r5.<init>(r4);	 Catch:{ Exception -> 0x0367 }
        r8 = r8.doubleValue();	 Catch:{ Exception -> 0x0367 }
        r4 = r5.doubleValue();	 Catch:{ Exception -> 0x0367 }
        r4 = r4 * r8;
        r5 = com.expensemanager.CurrencyConverter.m2541a(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = ",";
        r4 = r5.indexOf(r4);	 Catch:{ Exception -> 0x0367 }
        r8 = -1;
        if (r4 == r8) goto L_0x0376;
    L_0x0257:
        r4 = ",";
        r8 = "";
        r5 = r5.replaceAll(r4, r8);	 Catch:{ Exception -> 0x0367 }
        r26 = r5;
    L_0x0261:
        r27 = "Income";
        r28 = "Account Transfer";
        r4 = "paymentMethod";
        r0 = r44;
        r29 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r29 = (java.lang.String) r29;	 Catch:{ Exception -> 0x0367 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "Transfer:";
        r5 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r4 = "description";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0367 }
        r30 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r31 = "";
        r4 = "account";
        r0 = r44;
        r32 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r32 = (java.lang.String) r32;	 Catch:{ Exception -> 0x0367 }
        r34 = "";
        r35 = "";
        r36 = "";
        r37 = "";
        r38 = "";
        r39 = "";
        r24 = r56;
        r25 = r12;
        r33 = r13;
        r40 = r20;
        r42 = r22;
        r4 = r24.m4190a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42);	 Catch:{ Exception -> 0x0367 }
        r5 = "expense_report";
        r0 = r56;
        r0.m4185a(r5, r4);	 Catch:{ Exception -> 0x0367 }
    L_0x02b9:
        r4 = -1;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0371;
    L_0x02bf:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "UPDATE expense_repeating SET paid_cycle=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r0 = r50;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0367 }
        r5 = ",";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = "next_payment_date";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = "=";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r0 = r48;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0367 }
        r5 = " WHERE ";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = "_id";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r5 = "=";
        r5 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r4 = "rowId";
        r0 = r44;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0367 }
        r4 = r5.append(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r0 = r56;
        r0.m4194a(r4);	 Catch:{ Exception -> 0x0367 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r0 = r50;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0367 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r0 = r46;
        r1 = r45;
        r4 = m3768b(r0, r1, r4);	 Catch:{ Exception -> 0x0367 }
        r5 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0367 }
        r6 = java.util.Locale.US;	 Catch:{ Exception -> 0x0367 }
        r20 = m3744a(r4, r5, r6);	 Catch:{ Exception -> 0x0367 }
        r6 = r50 + 1;
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r4.<init>();	 Catch:{ Exception -> 0x0367 }
        r5 = "";
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x0367 }
        r4 = r4.append(r6);	 Catch:{ Exception -> 0x0367 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0367 }
        r0 = r46;
        r1 = r45;
        r4 = m3768b(r0, r1, r4);	 Catch:{ Exception -> 0x0367 }
        r5 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0367 }
        r7 = java.util.Locale.US;	 Catch:{ Exception -> 0x0367 }
        r4 = m3744a(r4, r5, r7);	 Catch:{ Exception -> 0x0367 }
        r7 = 1;
        r0 = r55;
        com.expensemanager.abd.m3805a(r0, r7);	 Catch:{ Exception -> 0x0367 }
    L_0x0361:
        r48 = r4;
        r50 = r6;
        goto L_0x0114;
    L_0x0367:
        r4 = move-exception;
        r4.printStackTrace();
        goto L_0x008b;
    L_0x036d:
        r56.m4201b();
        return;
    L_0x0371:
        r4 = r48;
        r6 = r50;
        goto L_0x0361;
    L_0x0376:
        r26 = r5;
        goto L_0x0261;
    L_0x037a:
        r52 = r6;
        goto L_0x00a7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.aba.a(android.content.Context, com.expensemanager.ro):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3760a(android.content.Context r48, com.expensemanager.ro r49, java.lang.String r50, java.util.List<java.util.Map<java.lang.String, java.lang.String>> r51) {
        /*
        r9 = r48.getResources();
        r6 = 1;
        r5 = 0;
        r4 = r49.m4206d();	 Catch:{ Exception -> 0x0469 }
        if (r4 != 0) goto L_0x000f;
    L_0x000c:
        r49.m4193a();	 Catch:{ Exception -> 0x0469 }
    L_0x000f:
        r4 = "next_payment_date DESC,first_expensed DESC";
        r0 = r49;
        r1 = r50;
        r5 = r0.m4205d(r1, r4);	 Catch:{ Exception -> 0x0469 }
        if (r5 == 0) goto L_0x040d;
    L_0x001b:
        r4 = r5.moveToFirst();	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x040d;
    L_0x0021:
        r4 = "_id";
        r10 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "account";
        r11 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "amount";
        r12 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "category";
        r13 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "subcategory";
        r14 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "payment_method";
        r15 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "description";
        r16 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "frequency";
        r17 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "no_of_payment";
        r18 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "paid_cycle";
        r19 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "property";
        r20 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "next_payment_date";
        r21 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "first_expensed";
        r22 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "status";
        r23 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "property2";
        r24 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "property3";
        r25 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = "remind_time";
        r26 = r5.getColumnIndex(r4);	 Catch:{ Exception -> 0x0469 }
    L_0x0087:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r4.<init>();	 Catch:{ Exception -> 0x0469 }
        r7 = "";
        r4 = r4.append(r7);	 Catch:{ Exception -> 0x0469 }
        r28 = r5.getLong(r10);	 Catch:{ Exception -> 0x0469 }
        r0 = r28;
        r4 = r4.append(r0);	 Catch:{ Exception -> 0x0469 }
        r27 = r4.toString();	 Catch:{ Exception -> 0x0469 }
        r28 = r5.getString(r11);	 Catch:{ Exception -> 0x0469 }
        r29 = r5.getString(r12);	 Catch:{ Exception -> 0x0469 }
        r30 = r5.getString(r13);	 Catch:{ Exception -> 0x0469 }
        r31 = r5.getString(r14);	 Catch:{ Exception -> 0x0469 }
        r32 = r5.getString(r15);	 Catch:{ Exception -> 0x0469 }
        r0 = r16;
        r33 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r17;
        r34 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r18;
        r4 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r19;
        r35 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r20;
        r36 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r22;
        r38 = r5.getLong(r0);	 Catch:{ Exception -> 0x0469 }
        r7 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0469 }
        r0 = r38;
        r37 = m3749a(r0, r7);	 Catch:{ Exception -> 0x0469 }
        r0 = r21;
        r38 = r5.getLong(r0);	 Catch:{ Exception -> 0x0469 }
        r7 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0469 }
        r0 = r38;
        m3749a(r0, r7);	 Catch:{ Exception -> 0x0469 }
        r0 = r26;
        r38 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r23;
        r39 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r24;
        r40 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r25;
        r41 = r5.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r42 = m3778e(r35);	 Catch:{ Exception -> 0x0469 }
        r44 = 0;
        r7 = (r42 > r44 ? 1 : (r42 == r44 ? 0 : -1));
        if (r7 != 0) goto L_0x010f;
    L_0x010f:
        r7 = "0d";
        r0 = r34;
        r7 = r7.equals(r0);	 Catch:{ Exception -> 0x0469 }
        if (r7 == 0) goto L_0x011b;
    L_0x0119:
        r4 = "1";
    L_0x011b:
        r7 = "0d";
        r0 = r34;
        r7 = r7.equals(r0);	 Catch:{ Exception -> 0x0469 }
        if (r7 == 0) goto L_0x0127;
    L_0x0125:
        r4 = "1";
    L_0x0127:
        r8 = 0;
        r7 = "";
        r7 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        if (r4 == 0) goto L_0x0141;
    L_0x012e:
        r42 = "";
        r0 = r42;
        r42 = r0.equals(r4);	 Catch:{ Exception -> 0x0469 }
        if (r42 != 0) goto L_0x0141;
    L_0x0138:
        r7 = new java.lang.Integer;	 Catch:{ Exception -> 0x0469 }
        r7.<init>(r4);	 Catch:{ Exception -> 0x0469 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x0469 }
    L_0x0141:
        r42 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r42.<init>();	 Catch:{ Exception -> 0x0469 }
        r43 = "";
        r42 = r42.append(r43);	 Catch:{ Exception -> 0x0469 }
        r0 = r42;
        r42 = r0.append(r8);	 Catch:{ Exception -> 0x0469 }
        r42 = r42.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r37;
        r1 = r34;
        r2 = r42;
        r42 = m3768b(r0, r1, r2);	 Catch:{ Exception -> 0x0469 }
        if (r42 == 0) goto L_0x016e;
    L_0x0162:
        r43 = "";
        r0 = r43;
        r1 = r42;
        r43 = r0.equals(r1);	 Catch:{ Exception -> 0x0469 }
        if (r43 == 0) goto L_0x0417;
    L_0x016e:
        r43 = new java.util.HashMap;	 Catch:{ Exception -> 0x0469 }
        r43.<init>();	 Catch:{ Exception -> 0x0469 }
        r7 = "rowId";
        r0 = r43;
        r1 = r27;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "account";
        r0 = r43;
        r1 = r28;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "amount";
        r0 = r43;
        r1 = r29;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "category";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r30;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r44 = ":";
        r0 = r27;
        r1 = r44;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        if (r31 == 0) goto L_0x01c6;
    L_0x01bc:
        r7 = "";
        r0 = r31;
        r7 = r7.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0469 }
        if (r7 == 0) goto L_0x01cf;
    L_0x01c6:
        r7 = "category";
        r0 = r43;
        r1 = r30;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
    L_0x01cf:
        r7 = "paymentMethod";
        r0 = r43;
        r1 = r32;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "description";
        r0 = r43;
        r1 = r33;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = com.expensemanager.qa.f5164c;	 Catch:{ Exception -> 0x0469 }
        r0 = r34;
        r7 = com.expensemanager.aib.m3846a(r7, r0);	 Catch:{ Exception -> 0x0469 }
        r27 = "frequency";
        r31 = com.expensemanager.qa.f5163b;	 Catch:{ Exception -> 0x0469 }
        r7 = r31[r7];	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r1, r7);	 Catch:{ Exception -> 0x0469 }
        r7 = "frequencyValue";
        r0 = r43;
        r1 = r34;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "paidCycle";
        r0 = r43;
        r1 = r35;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "paidCycleInt";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r31 = "";
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r27 = r0.append(r8);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "paidCycleText";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r31 = 2131099790; // 0x7f06008e float:1.7811943E38 double:1.052903194E-314;
        r0 = r31;
        r31 = r9.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r31 = ": ";
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r27 = r0.append(r8);	 Catch:{ Exception -> 0x0469 }
        r31 = "/";
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r27 = r0.append(r4);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "property";
        r0 = r43;
        r1 = r36;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "numberOfPayment";
        r0 = r43;
        r0.put(r7, r4);	 Catch:{ Exception -> 0x0469 }
        r7 = "nextPaymentDate";
        r0 = r43;
        r1 = r42;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "firstExpenseDate";
        r0 = r43;
        r1 = r37;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "nextPaymentDateLong";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r31 = "";
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r31 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0469 }
        r33 = java.util.Locale.US;	 Catch:{ Exception -> 0x0469 }
        r0 = r42;
        r1 = r31;
        r2 = r33;
        r44 = m3744a(r0, r1, r2);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r44;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "remindTime";
        r0 = r43;
        r1 = r38;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "status";
        r0 = r43;
        r1 = r39;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "property2";
        r0 = r43;
        r1 = r40;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        r7 = "property3";
        r0 = r43;
        r1 = r41;
        r0.put(r7, r1);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x02ef;
    L_0x02e7:
        r7 = "";
        r7 = r7.equals(r4);	 Catch:{ Exception -> 0x0469 }
        if (r7 == 0) goto L_0x0488;
    L_0x02ef:
        r4 = "1000";
        r7 = r4;
    L_0x02f2:
        r0 = (long) r8;	 Catch:{ Exception -> 0x0469 }
        r38 = r0;
        r40 = m3778e(r7);	 Catch:{ Exception -> 0x0469 }
        r4 = (r38 > r40 ? 1 : (r38 == r40 ? 0 : -1));
        if (r4 >= 0) goto L_0x0309;
    L_0x02fd:
        r4 = "0d";
        r0 = r34;
        r4 = r4.equals(r0);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x0432;
    L_0x0307:
        if (r8 <= 0) goto L_0x0432;
    L_0x0309:
        r4 = "nextPaymentDateStr";
        r27 = 2131099977; // 0x7f060149 float:1.7812322E38 double:1.0529032865E-314;
        r0 = r27;
        r27 = r9.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
    L_0x031b:
        r4 = "Account Transfer";
        r0 = r30;
        r4 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x03d2;
    L_0x0325:
        r4 = "from_to";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r28 = "/";
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r36;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
        r4 = "numberOfPaymentText";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r28 = 2131099982; // 0x7f06014e float:1.7812333E38 double:1.052903289E-314;
        r0 = r28;
        r28 = r9.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r28 = ": ";
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r27 = r0.append(r7);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
        r27 = "Once Only";
        r4 = "frequency";
        r0 = r43;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r4 = r0.equals(r4);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x03d2;
    L_0x0388:
        r4 = "remindTime";
        r0 = r43;
        r4 = r0.get(r4);	 Catch:{ Exception -> 0x0469 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0469 }
        r27 = "0";
        r0 = r27;
        r4 = r4.startsWith(r0);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x03d2;
    L_0x039c:
        r4 = "numberOfPaymentText";
        r0 = r43;
        r1 = r32;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
        r4 = "nextPaymentDateStr";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r28 = 2131099794; // 0x7f060092 float:1.7811951E38 double:1.052903196E-314;
        r0 = r28;
        r28 = r9.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r28 = ": ";
        r27 = r27.append(r28);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r37;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
    L_0x03d2:
        r4 = "Income";
        r0 = r30;
        r4 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x0470;
    L_0x03dc:
        r4 = "incomeAmount";
        r27 = m3767b(r29);	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
    L_0x03e9:
        r0 = (long) r8;	 Catch:{ Exception -> 0x0469 }
        r28 = r0;
        r30 = m3778e(r7);	 Catch:{ Exception -> 0x0469 }
        r4 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1));
        if (r4 >= 0) goto L_0x0400;
    L_0x03f4:
        r4 = "0d";
        r0 = r34;
        r4 = r4.equals(r0);	 Catch:{ Exception -> 0x0469 }
        if (r4 == 0) goto L_0x047f;
    L_0x03fe:
        if (r8 <= 0) goto L_0x047f;
    L_0x0400:
        r0 = r51;
        r1 = r43;
        r0.add(r1);	 Catch:{ Exception -> 0x0469 }
    L_0x0407:
        r4 = r5.moveToNext();	 Catch:{ Exception -> 0x0469 }
        if (r4 != 0) goto L_0x0087;
    L_0x040d:
        r4 = r6;
    L_0x040e:
        if (r5 == 0) goto L_0x0413;
    L_0x0410:
        r5.close();
    L_0x0413:
        r49.m4201b();
        return r4;
    L_0x0417:
        r43 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x0469 }
        r44 = java.util.Locale.US;	 Catch:{ Exception -> 0x0469 }
        r44 = m3744a(r42, r43, r44);	 Catch:{ Exception -> 0x0469 }
        r43 = new java.util.Date;	 Catch:{ Exception -> 0x0469 }
        r43.<init>();	 Catch:{ Exception -> 0x0469 }
        r46 = r43.getTime();	 Catch:{ Exception -> 0x0469 }
        r43 = (r44 > r46 ? 1 : (r44 == r46 ? 0 : -1));
        if (r43 > 0) goto L_0x016e;
    L_0x042c:
        if (r8 >= r7) goto L_0x016e;
    L_0x042e:
        r8 = r8 + 1;
        goto L_0x0141;
    L_0x0432:
        r4 = "nextPaymentDateStr";
        r27 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0469 }
        r27.<init>();	 Catch:{ Exception -> 0x0469 }
        r31 = 2131099976; // 0x7f060148 float:1.781232E38 double:1.052903286E-314;
        r0 = r31;
        r31 = r9.getString(r0);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r31 = ": ";
        r0 = r27;
        r1 = r31;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r0 = r27;
        r1 = r42;
        r27 = r0.append(r1);	 Catch:{ Exception -> 0x0469 }
        r27 = r27.toString();	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
        goto L_0x031b;
    L_0x0469:
        r4 = move-exception;
        r6 = 0;
        r4.printStackTrace();
        r4 = r6;
        goto L_0x040e;
    L_0x0470:
        r4 = "expenseAmount";
        r27 = m3767b(r29);	 Catch:{ Exception -> 0x0469 }
        r0 = r43;
        r1 = r27;
        r0.put(r4, r1);	 Catch:{ Exception -> 0x0469 }
        goto L_0x03e9;
    L_0x047f:
        r4 = 0;
        r0 = r51;
        r1 = r43;
        r0.add(r4, r1);	 Catch:{ Exception -> 0x0469 }
        goto L_0x0407;
    L_0x0488:
        r7 = r4;
        goto L_0x02f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.aba.a(android.content.Context, com.expensemanager.ro, java.lang.String, java.util.List):boolean");
    }

    public static int m3761b(String str, String str2) {
        float f = 1.0f;
        if (str == null || "".equals(str)) {
            return 0;
        }
        float floatValue;
        if (str2 == null || "".equals(str2)) {
            str2 = "0";
        }
        float f2 = 0.0f;
        try {
            String replace = str.replaceAll(",", "").replaceAll(":", "").replace("(", "").replace(")", "");
            String replaceAll = str2.replaceAll(",", "").replaceAll(":", "");
            floatValue = new Float(replaceAll.trim()).floatValue() / new Float(replace.trim()).floatValue();
        } catch (Exception e) {
            e.printStackTrace();
            floatValue = f2;
        }
        floatValue *= 100.0f;
        if (floatValue >= 1.0f || ((double) floatValue) < 0.5d) {
            f = floatValue;
        }
        return Math.round(f);
    }

    public static String m3762b(double d) {
        try {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
            decimalFormat.setNegativePrefix("-" + decimalFormat.getPositivePrefix());
            return decimalFormat.format(d).replace("$", "").replace(")", "");
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String m3763b(int i) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Calendar instance = Calendar.getInstance();
            instance.add(7, i * 7);
            instance.set(7, ExpenseManager.f3243s);
            if (instance.after(Calendar.getInstance())) {
                instance.add(7, -7);
            }
            String format = simpleDateFormat.format(new Date(new Long(instance.getTimeInMillis()).longValue()));
            instance.add(5, 6);
            return format + " - " + new SimpleDateFormat(ExpenseManager.f3244t, Locale.US).format(new Date(new Long(instance.getTimeInMillis()).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "Weekly Expense";
        }
    }

    public static String m3764b(int i, String str, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(2, i);
        instance.set(5, ExpenseManager.f3242r);
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        Calendar instance2 = Calendar.getInstance();
        instance2.add(2, 0);
        instance2.set(5, ExpenseManager.f3242r);
        if (instance2.after(Calendar.getInstance())) {
            instance.add(2, -1);
        }
        long timeInMillis = instance.getTimeInMillis();
        instance = Calendar.getInstance();
        instance.add(2, i + 1);
        instance.set(5, ExpenseManager.f3242r);
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        if (instance2.after(Calendar.getInstance())) {
            instance.add(2, -1);
        }
        long timeInMillis2 = instance.getTimeInMillis();
        String str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "!='Income'" + " AND " + "account" + "='" + str + "'";
        if (i2 == 1) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "='Income'" + " AND " + "account" + "='" + str + "'";
        }
        if (i2 == 0) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "account" + "='" + str + "'";
        }
        if (!"All".equalsIgnoreCase(str)) {
            return str2;
        }
        str2 = str2.replace(" AND account='" + str + "'", "") + " AND " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
        if (i2 == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer' ";
        }
        return i2 == 1 ? str2 + " AND " + "subcategory" + "!='Account Transfer' " : str2;
    }

    public static String m3765b(ro roVar, String str) {
        double d = 0.0d;
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor a = roVar.m4192a(str, "expensed ASC");
        if (a == null || !a.moveToFirst()) {
            if (a != null) {
                a.close();
            }
            roVar.m4201b();
            return m3746a(d);
        }
        int columnIndex = a.getColumnIndex("amount");
        int columnIndex2 = a.getColumnIndex("category");
        do {
            String string = a.getString(columnIndex);
            if (!"Income".equalsIgnoreCase(a.getString(columnIndex2))) {
                string = "-" + string;
            }
            d = m3742a(d, string);
        } while (a.moveToNext());
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3766b(ro roVar, String str, List<Map<String, Object>> list, int i, boolean z) {
        double d;
        roVar.m4193a();
        Cursor a = roVar.m4192a(str, "expensed DESC");
        Map hashMap = new HashMap();
        ArrayList c = m3774c(i);
        String str2 = "";
        String str3;
        if (a == null || !a.moveToFirst()) {
            String str4 = str2;
            d = 0.0d;
            str3 = str4;
        } else {
            String string;
            double a2;
            int columnIndex = a.getColumnIndex("account");
            int columnIndex2 = a.getColumnIndex("amount");
            int columnIndex3 = a.getColumnIndex("expensed");
            int columnIndex4 = a.getColumnIndex("category");
            d = 0.0d;
            while (true) {
                string = a.getString(columnIndex);
                str3 = a.getString(columnIndex2);
                String a3 = (ExpenseManager.f3246v == null || !z) ? str3 : abd.m3793a(str3, (String) ExpenseManager.f3246v.get(string));
                String a4 = m3749a(a.getLong(columnIndex3), ExpenseManager.f3244t);
                str3 = !"Income".equalsIgnoreCase(a.getString(columnIndex4)) ? "-" + a3 : a3;
                if (hashMap.get(a4) == null) {
                    hashMap.put(a4, m3781g(str3));
                } else {
                    hashMap.put(a4, "" + m3743a((String) hashMap.get(a4), str3));
                }
                a2 = m3742a(d, str3);
                if (!a.moveToNext()) {
                    break;
                }
                d = a2;
            }
            d = a2;
            Object obj = string;
        }
        for (int i2 = 0; i2 < c.size(); i2++) {
            Map hashMap2 = new HashMap();
            String a5 = m3756a((String) c.get(i2));
            Object a6 = m3756a((String) hashMap.get(a5));
            if ("".equals(a6)) {
                a6 = "0";
            }
            hashMap2.put("expenseDate", a5);
            hashMap2.put("amount", a6);
            hashMap2.put("account", obj);
            list.add(hashMap2);
        }
        if (a != null) {
            a.close();
        }
        roVar.m4201b();
        return m3746a(d);
    }

    public static String m3767b(String str) {
        if (str == null || "".equals(str)) {
            return "0.00";
        }
        try {
            double parseDouble = Double.parseDouble(str);
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
            decimalFormat.setNegativePrefix("(" + decimalFormat.getPositivePrefix());
            decimalFormat.setNegativeSuffix(")");
            return decimalFormat.format(parseDouble).replace("$", "");
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static String m3768b(String str, String str2, String str3) {
        String str4 = "";
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(m3744a(str, ExpenseManager.f3244t, Locale.US));
        int intValue = new Integer(str3).intValue();
        if ("1d".equalsIgnoreCase(str2)) {
            instance.add(5, intValue * 1);
        }
        if ("7d".equalsIgnoreCase(str2)) {
            instance.add(5, intValue * 7);
        }
        if ("14d".equalsIgnoreCase(str2)) {
            instance.add(5, intValue * 14);
        }
        if ("28d".equalsIgnoreCase(str2)) {
            instance.add(5, intValue * 28);
        }
        if ("1/2m".equalsIgnoreCase(str2)) {
            if ((intValue / 2) * 2 == intValue) {
                instance.add(2, intValue / 2);
                instance.set(5, instance.getTime().getDate());
            } else {
                instance.add(2, intValue / 2);
                if (instance.getTime().getDate() == 1) {
                    instance.set(5, 15);
                } else {
                    instance.set(5, instance.getActualMaximum(5));
                }
            }
        }
        if ("1m".equalsIgnoreCase(str2)) {
            instance.add(2, intValue * 1);
        }
        if ("2m".equalsIgnoreCase(str2)) {
            instance.add(2, intValue * 2);
        }
        if ("3m".equalsIgnoreCase(str2)) {
            instance.add(2, intValue * 3);
        }
        if ("6m".equalsIgnoreCase(str2)) {
            instance.add(2, intValue * 6);
        }
        if ("12m".equalsIgnoreCase(str2)) {
            instance.add(2, intValue * 12);
        }
        return "0d".equalsIgnoreCase(str2) ? str : m3749a(instance.getTimeInMillis(), ExpenseManager.f3244t);
    }

    public static ArrayList<String> m3769b(Context context, ro roVar) {
        ArrayList<String> arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        m3760a(context, roVar, null, arrayList2);
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            try {
                Map map = (Map) arrayList2.get(i);
                String str = (String) map.get("account");
                String str2 = (String) map.get("description");
                String str3 = (String) map.get("amount");
                String str4 = (String) map.get("frequencyValue");
                String str5 = (String) map.get("firstExpenseDate");
                String str6 = (String) map.get("paidCycleInt");
                int f = m3780f(str6);
                int i2 = f + 1;
                String str7 = (String) map.get("numberOfPayment");
                String str8 = (String) map.get("property2");
                String str9 = (String) map.get("category");
                if (str8 != null) {
                    if (str8.indexOf("Reminder") != -1) {
                        str = "$Reminder";
                    }
                }
                str8 = str9.startsWith("Account Transfer") ? "$Transfer" : str;
                String str10 = (String) map.get("remindTime");
                if (!(str10 == null || "".equals(str10.trim()))) {
                    String[] split = str10.split(",");
                    if (split.length != 0) {
                        int intValue = Integer.valueOf(split[0]).intValue();
                        int intValue2 = Integer.valueOf(split[1]).intValue();
                        if (intValue != 0) {
                            long j = 1000;
                            if (str7 != null) {
                                if (!"".equals(str7)) {
                                    j = m3778e(str7);
                                }
                            }
                            str7 = m3768b(str5, str4, str6.trim());
                            if (str7 != null) {
                                if (!"".equals(str7)) {
                                    long a = m3744a(str7, ExpenseManager.f3244t, Locale.US);
                                    Calendar instance = Calendar.getInstance();
                                    int i3 = instance.get(11);
                                    a = ((a - instance.getTimeInMillis()) / 86400000) + 1;
                                    if (intValue == 1) {
                                        String format = new SimpleDateFormat(ExpenseManager.f3244t).format(Calendar.getInstance().getTime());
                                        str5 = m3768b(str5, str4, "" + (m3780f(str6) - 1));
                                        if ((format.equals(str7) || format.equals(str5)) && i3 == intValue2) {
                                            if (((long) i2) <= j) {
                                                arrayList.add(str8 + "@" + str2 + ":" + str3 + " due on " + format);
                                            }
                                        }
                                    }
                                    if ((!"0d".equalsIgnoreCase(str4) || f <= 0) && a == ((long) (intValue - 1)) && i3 == intValue2 && ((long) i2) <= j) {
                                        arrayList.add(str8 + "@" + str2 + ":" + str3 + " due on " + str7);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        roVar.m4201b();
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m3770c(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
        r1 = 0;
        r0 = "";
        r0 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        if (r8 == 0) goto L_0x0018;
    L_0x0007:
        r2 = "";
        r2 = r2.equals(r8);
        if (r2 != 0) goto L_0x0018;
    L_0x000f:
        r0 = new java.lang.Integer;
        r0.<init>(r8);
        r0 = r0.intValue();
    L_0x0018:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "";
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        r2 = m3768b(r6, r7, r2);
        if (r2 == 0) goto L_0x0039;
    L_0x0031:
        r3 = "";
        r3 = r3.equals(r2);
        if (r3 == 0) goto L_0x003a;
    L_0x0039:
        return r1;
    L_0x003a:
        r3 = com.expensemanager.ExpenseManager.f3244t;
        r4 = java.util.Locale.US;
        r2 = m3744a(r2, r3, r4);
        r4 = new java.util.Date;
        r4.<init>();
        r4 = r4.getTime();
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x0039;
    L_0x004f:
        if (r1 >= r0) goto L_0x0039;
    L_0x0051:
        r1 = r1 + 1;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.aba.c(java.lang.String, java.lang.String, java.lang.String):int");
    }

    public static String m3771c(int i, String str, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.add(1, i);
        instance.set(2, ExpenseManager.f3241q);
        instance.set(5, ExpenseManager.f3242r);
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
            instance.add(1, -1);
        }
        long timeInMillis = instance.getTimeInMillis();
        instance = Calendar.getInstance();
        instance.add(1, i + 1);
        instance.set(2, ExpenseManager.f3241q);
        instance.set(5, ExpenseManager.f3242r);
        instance.add(5, -1);
        instance.set(11, 23);
        instance.set(12, 59);
        instance.set(13, 59);
        instance.set(14, 999);
        if (Calendar.getInstance().get(2) < ExpenseManager.f3241q) {
            instance.add(1, -1);
        }
        long timeInMillis2 = instance.getTimeInMillis();
        String str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "!='Income'" + " AND " + "account" + "='" + str + "'";
        if (i2 == 1) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "category" + "='Income'" + " AND " + "account" + "='" + str + "'";
        }
        if (i2 == 0) {
            str2 = "expensed>" + timeInMillis + " AND " + "expensed" + "<=" + timeInMillis2 + " AND " + "account" + "='" + str + "'";
        }
        if (!"All".equalsIgnoreCase(str)) {
            return str2;
        }
        str2 = str2.replace(" AND account='" + str + "'", "") + " AND " + "account" + " in (" + abd.m3792a(ExpenseManager.f3245u) + ")";
        if (i2 == 2) {
            str2 = str2 + " AND " + "category" + "!='Account Transfer' ";
        }
        return i2 == 1 ? str2 + " AND " + "subcategory" + "!='Account Transfer' " : str2;
    }

    public static String m3772c(Context context, ro roVar) {
        String[] split = abd.m3786a(context, roVar, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        int a = abd.m3783a(context, roVar, "Default_Account_Index", 0);
        if (a > split.length - 1 || a < 0) {
            a = 0;
        }
        return split[a];
    }

    public static String m3773c(String str) {
        if (str == null || "".equals(str)) {
            return "0.00";
        }
        try {
            double doubleValue = new Double(str).doubleValue();
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
            decimalFormat.applyPattern("#0.00");
            return decimalFormat.format(doubleValue);
        } catch (Exception e) {
            return "0.00";
        }
    }

    public static ArrayList<String> m3774c(int i) {
        int i2 = 0;
        ArrayList<String> arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.add(2, i);
        instance.set(5, ExpenseManager.f3242r);
        Calendar instance2 = Calendar.getInstance();
        instance2.add(2, i + 1);
        instance2.set(5, ExpenseManager.f3242r);
        instance2.add(5, -1);
        Calendar instance3 = Calendar.getInstance();
        instance3.add(2, 0);
        instance3.set(5, ExpenseManager.f3242r);
        if (instance3.after(Calendar.getInstance())) {
            instance.add(2, -1);
            instance2.add(2, -1);
        }
        DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t);
        while (i2 <= 31) {
            if (i2 > 0) {
                instance.add(5, 1);
            }
            if (instance.after(instance2)) {
                break;
            }
            arrayList.add(simpleDateFormat.format(new Date(new Long(instance.getTimeInMillis()).longValue())));
            i2++;
        }
        return arrayList;
    }

    public static void m3775c(ro roVar, String str) {
        String a = ExpenseAccountActivities.m2602a(roVar, "account='" + str + "'", new ArrayList(), true, "expensed ASC");
        ExpenseExport.m3164a(co.f4430d, str + ".csv", a);
    }

    public static String m3776d(int i) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Calendar instance = Calendar.getInstance();
            instance.add(2, i);
            instance.set(5, ExpenseManager.f3242r);
            Calendar instance2 = Calendar.getInstance();
            instance2.add(2, 0);
            instance2.set(5, ExpenseManager.f3242r);
            if (instance2.after(Calendar.getInstance())) {
                instance.add(2, -1);
            }
            String format = simpleDateFormat.format(new Date(new Long(instance.getTimeInMillis()).longValue()));
            Calendar instance3 = Calendar.getInstance();
            instance3.add(2, i + 1);
            instance3.set(5, ExpenseManager.f3242r);
            instance3.add(5, -1);
            if (instance2.after(Calendar.getInstance())) {
                instance3.add(2, -1);
            }
            return format + " - " + simpleDateFormat.format(new Date(new Long(instance3.getTimeInMillis()).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "Monthly Expense";
        }
    }

    public static String m3777d(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.toLowerCase().trim();
        StringBuilder stringBuilder = new StringBuilder(trim.length());
        String[] split = trim.split(" ");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String trim2 = split[i].trim();
            if (!"".equals(trim2)) {
                if (i > 0) {
                    stringBuilder.append(" ");
                }
                stringBuilder.append(Character.toUpperCase(trim2.charAt(0))).append(trim2.substring(1));
            }
        }
        return stringBuilder.toString();
    }

    public static long m3778e(String str) {
        long j = 0;
        if (!(str == null || "".equals(str))) {
            try {
                j = new Long(str).longValue();
            } catch (Exception e) {
            }
        }
        return j;
    }

    public static String m3779e(int i) {
        try {
            DateFormat simpleDateFormat = new SimpleDateFormat(ExpenseManager.f3244t, Locale.US);
            Calendar instance = Calendar.getInstance();
            instance.add(1, i);
            instance.set(2, ExpenseManager.f3241q);
            instance.set(5, ExpenseManager.f3242r);
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, i + 1);
            instance2.set(2, ExpenseManager.f3241q);
            instance2.set(5, ExpenseManager.f3242r);
            instance2.add(5, -1);
            Calendar instance3 = Calendar.getInstance();
            instance3.add(1, 0);
            instance3.set(2, ExpenseManager.f3241q);
            instance3.set(5, ExpenseManager.f3242r);
            if (instance3.after(Calendar.getInstance())) {
                instance.add(1, -1);
                instance2.add(1, -1);
            }
            String format = simpleDateFormat.format(new Date(new Long(instance.getTimeInMillis()).longValue()));
            return format + " - " + simpleDateFormat.format(new Date(new Long(instance2.getTimeInMillis()).longValue()));
        } catch (Exception e) {
            e.printStackTrace();
            return "Yealy Expense";
        }
    }

    public static int m3780f(String str) {
        int i = 0;
        if (!(str == null || "".equals(str))) {
            try {
                i = new Integer(str).intValue();
            } catch (Exception e) {
            }
        }
        return i;
    }

    public static String m3781g(String str) {
        return str == null ? "" : "0".equals(str) ? "" : str.trim();
    }

    public static String m3782h(String str) {
        if (str == null || "".equals(str)) {
            return "0.00";
        }
        String replace = str.replace("(", "").replace(")", "");
        return replace.trim().startsWith("(") ? "-" + replace : replace;
    }
}
