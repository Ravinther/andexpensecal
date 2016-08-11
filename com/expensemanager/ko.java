package com.expensemanager;

import android.view.View.OnClickListener;

class ko implements OnClickListener {
    final /* synthetic */ String f4891a;
    final /* synthetic */ String f4892b;
    final /* synthetic */ boolean f4893c;
    final /* synthetic */ ExpenseBudgetAdd f4894d;

    ko(ExpenseBudgetAdd expenseBudgetAdd, String str, String str2, boolean z) {
        this.f4894d = expenseBudgetAdd;
        this.f4891a = str;
        this.f4892b = str2;
        this.f4893c = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r20) {
        /*
        r19 = this;
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.getText();	 Catch:{ Exception -> 0x0250 }
        r4 = r2.toString();	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r2 = r0.f4891a;	 Catch:{ Exception -> 0x0250 }
        r2 = r4.equalsIgnoreCase(r2);	 Catch:{ Exception -> 0x0250 }
        if (r2 == 0) goto L_0x001c;
    L_0x001a:
        r4 = "All";
    L_0x001c:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2895e;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.getText();	 Catch:{ Exception -> 0x0250 }
        r5 = r2.toString();	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r2 = r0.f4892b;	 Catch:{ Exception -> 0x0250 }
        r2 = r5.equalsIgnoreCase(r2);	 Catch:{ Exception -> 0x0250 }
        if (r2 == 0) goto L_0x0038;
    L_0x0036:
        r5 = "All";
    L_0x0038:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2896f;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.getText();	 Catch:{ Exception -> 0x0250 }
        r6 = r2.toString();	 Catch:{ Exception -> 0x0250 }
        r2 = "";
        r2 = r2.equals(r6);	 Catch:{ Exception -> 0x0250 }
        if (r2 != 0) goto L_0x0065;
    L_0x0050:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.getResources();	 Catch:{ Exception -> 0x0250 }
        r3 = 2131099721; // 0x7f060049 float:1.7811803E38 double:1.05290316E-314;
        r2 = r2.getString(r3);	 Catch:{ Exception -> 0x0250 }
        r2 = r6.equalsIgnoreCase(r2);	 Catch:{ Exception -> 0x0250 }
        if (r2 == 0) goto L_0x0067;
    L_0x0065:
        r6 = "All";
    L_0x0067:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2899i;	 Catch:{ Exception -> 0x0250 }
        r16 = r2.getSelectedItemPosition();	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2900j;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.getText();	 Catch:{ Exception -> 0x0250 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0250 }
        r8 = r2.trim();	 Catch:{ Exception -> 0x0250 }
        r2 = new java.lang.Double;	 Catch:{ Exception -> 0x020b }
        r2.<init>(r8);	 Catch:{ Exception -> 0x020b }
        r2 = 1;
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2906q;	 Catch:{ Exception -> 0x026b }
        r3 = r3.m4206d();	 Catch:{ Exception -> 0x026b }
        if (r3 != 0) goto L_0x00a6;
    L_0x009b:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2906q;	 Catch:{ Exception -> 0x026b }
        r3.m4193a();	 Catch:{ Exception -> 0x026b }
    L_0x00a6:
        r3 = new java.util.Date;	 Catch:{ Exception -> 0x026b }
        r3.<init>();	 Catch:{ Exception -> 0x026b }
        r14 = r3.getTime();	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2897g;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r12 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2898h;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r13 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2903m;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r9 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r11 = "";
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2909t;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r3 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r7 = com.expensemanager.aib.m3865b(r3);	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2908s;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r3 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r10 = com.expensemanager.aib.m3865b(r3);	 Catch:{ Exception -> 0x026b }
        r3 = "NO";
        r0 = r19;
        r0 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r17 = r0;
        r17 = r17.f2907r;	 Catch:{ Exception -> 0x026b }
        r17 = r17.isChecked();	 Catch:{ Exception -> 0x026b }
        if (r17 == 0) goto L_0x011d;
    L_0x011b:
        r3 = "YES";
    L_0x011d:
        r17 = "";
        r0 = r17;
        r17 = r0.equals(r7);	 Catch:{ Exception -> 0x026b }
        if (r17 == 0) goto L_0x0131;
    L_0x0127:
        r17 = "";
        r0 = r17;
        r17 = r0.equals(r10);	 Catch:{ Exception -> 0x026b }
        if (r17 != 0) goto L_0x0168;
    L_0x0131:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x026b }
        r11.<init>();	 Catch:{ Exception -> 0x026b }
        r17 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x026b }
        r18 = "yyyy-MM-dd";
        r0 = r17;
        r1 = r18;
        r7 = com.expensemanager.aib.m3867b(r7, r0, r1);	 Catch:{ Exception -> 0x026b }
        r7 = r11.append(r7);	 Catch:{ Exception -> 0x026b }
        r11 = ";";
        r7 = r7.append(r11);	 Catch:{ Exception -> 0x026b }
        r11 = com.expensemanager.ExpenseManager.f3244t;	 Catch:{ Exception -> 0x026b }
        r17 = "yyyy-MM-dd";
        r0 = r17;
        r10 = com.expensemanager.aib.m3867b(r10, r11, r0);	 Catch:{ Exception -> 0x026b }
        r7 = r7.append(r10);	 Catch:{ Exception -> 0x026b }
        r10 = ";";
        r7 = r7.append(r10);	 Catch:{ Exception -> 0x026b }
        r3 = r7.append(r3);	 Catch:{ Exception -> 0x026b }
        r11 = r3.toString();	 Catch:{ Exception -> 0x026b }
    L_0x0168:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2902l;	 Catch:{ Exception -> 0x026b }
        r3 = r3.getText();	 Catch:{ Exception -> 0x026b }
        r3 = r3.toString();	 Catch:{ Exception -> 0x026b }
        r10 = r3.trim();	 Catch:{ Exception -> 0x026b }
        r3 = "All";
        r3 = r5.equalsIgnoreCase(r3);	 Catch:{ Exception -> 0x026b }
        if (r3 == 0) goto L_0x0194;
    L_0x0184:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2901k;	 Catch:{ Exception -> 0x026b }
        r3 = r3.isChecked();	 Catch:{ Exception -> 0x026b }
        if (r3 == 0) goto L_0x0194;
    L_0x0192:
        r5 = "All-1";
    L_0x0194:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r3 = r3.f2906q;	 Catch:{ Exception -> 0x026b }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x026b }
        r7.<init>();	 Catch:{ Exception -> 0x026b }
        r17 = "";
        r0 = r17;
        r7 = r7.append(r0);	 Catch:{ Exception -> 0x026b }
        r0 = r16;
        r7 = r7.append(r0);	 Catch:{ Exception -> 0x026b }
        r7 = r7.toString();	 Catch:{ Exception -> 0x026b }
        r3 = r3.m4187a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r4 = r0.f4893c;	 Catch:{ Exception -> 0x026b }
        if (r4 == 0) goto L_0x0255;
    L_0x01bd:
        r0 = r19;
        r4 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r5 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r5 = r5.f2906q;	 Catch:{ Exception -> 0x026b }
        r6 = "expense_budget";
        r6 = r5.m4185a(r6, r3);	 Catch:{ Exception -> 0x026b }
        r4.f2891a = r6;	 Catch:{ Exception -> 0x026b }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r4 = r3.f2891a;	 Catch:{ Exception -> 0x026b }
        r6 = -1;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x01de;
    L_0x01dd:
        r2 = 0;
    L_0x01de:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r3 = r3.f2906q;	 Catch:{ Exception -> 0x0250 }
        r3.m4201b();	 Catch:{ Exception -> 0x0250 }
        if (r2 != 0) goto L_0x0272;
    L_0x01eb:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2893c;	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r3 = r3.getResources();	 Catch:{ Exception -> 0x0250 }
        r4 = 2131099715; // 0x7f060043 float:1.7811791E38 double:1.052903157E-314;
        r3 = r3.getString(r4);	 Catch:{ Exception -> 0x0250 }
        r4 = 1;
        r2 = android.widget.Toast.makeText(r2, r3, r4);	 Catch:{ Exception -> 0x0250 }
        r2.show();	 Catch:{ Exception -> 0x0250 }
    L_0x020a:
        return;
    L_0x020b:
        r2 = move-exception;
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2 = r2.f2893c;	 Catch:{ Exception -> 0x0250 }
        r3 = 0;
        r0 = r19;
        r4 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r4 = r4.getResources();	 Catch:{ Exception -> 0x0250 }
        r5 = 2131099702; // 0x7f060036 float:1.7811765E38 double:1.0529031506E-314;
        r4 = r4.getString(r5);	 Catch:{ Exception -> 0x0250 }
        r5 = 17301543; // 0x1080027 float:2.4979364E-38 double:8.548098E-317;
        r0 = r19;
        r6 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r6 = r6.getResources();	 Catch:{ Exception -> 0x0250 }
        r7 = 2131099718; // 0x7f060046 float:1.7811797E38 double:1.0529031585E-314;
        r6 = r6.getString(r7);	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r7 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r7 = r7.getResources();	 Catch:{ Exception -> 0x0250 }
        r8 = 2131099983; // 0x7f06014f float:1.7812335E38 double:1.0529032895E-314;
        r7 = r7.getString(r8);	 Catch:{ Exception -> 0x0250 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r2 = com.expensemanager.aib.m3849a(r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x0250 }
        r2.show();	 Catch:{ Exception -> 0x0250 }
        goto L_0x020a;
    L_0x0250:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x020a;
    L_0x0255:
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r2 = r2.f2906q;	 Catch:{ Exception -> 0x026b }
        r4 = "expense_budget";
        r0 = r19;
        r5 = r0.f4894d;	 Catch:{ Exception -> 0x026b }
        r6 = r5.f2891a;	 Catch:{ Exception -> 0x026b }
        r2 = r2.m4196a(r4, r6, r3);	 Catch:{ Exception -> 0x026b }
        goto L_0x01de;
    L_0x026b:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ Exception -> 0x0250 }
        r2 = 0;
        goto L_0x01de;
    L_0x0272:
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r3 = r3.f2893c;	 Catch:{ Exception -> 0x0250 }
        com.expensemanager.abd.m3805a(r3, r2);	 Catch:{ Exception -> 0x0250 }
        r2 = new android.content.Intent;	 Catch:{ Exception -> 0x0250 }
        r2.<init>();	 Catch:{ Exception -> 0x0250 }
        r3 = new android.os.Bundle;	 Catch:{ Exception -> 0x0250 }
        r3.<init>();	 Catch:{ Exception -> 0x0250 }
        r4 = "account";
        r0 = r19;
        r5 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r5 = r5.f2905o;	 Catch:{ Exception -> 0x0250 }
        r3.putString(r4, r5);	 Catch:{ Exception -> 0x0250 }
        r4 = "tabId";
        r0 = r16;
        r3.putInt(r4, r0);	 Catch:{ Exception -> 0x0250 }
        r2.putExtras(r3);	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r3 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r4 = -1;
        r3.setResult(r4, r2);	 Catch:{ Exception -> 0x0250 }
        r0 = r19;
        r2 = r0.f4894d;	 Catch:{ Exception -> 0x0250 }
        r2.finish();	 Catch:{ Exception -> 0x0250 }
        goto L_0x020a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.expensemanager.ko.onClick(android.view.View):void");
    }
}
