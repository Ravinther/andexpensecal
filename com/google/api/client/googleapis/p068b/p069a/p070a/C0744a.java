package com.google.api.client.googleapis.p068b.p069a.p070a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.api.client.p050d.am;

/* renamed from: com.google.api.client.googleapis.b.a.a.a */
public final class C0744a {
    private final AccountManager f7672a;

    public C0744a(AccountManager accountManager) {
        this.f7672a = (AccountManager) am.m6911a((Object) accountManager);
    }

    public C0744a(Context context) {
        this(AccountManager.get(context));
    }

    public Account m7004a(String str) {
        if (str != null) {
            for (Account account : m7005a()) {
                if (str.equals(account.name)) {
                    return account;
                }
            }
        }
        return null;
    }

    public Account[] m7005a() {
        return this.f7672a.getAccountsByType("com.google");
    }
}
