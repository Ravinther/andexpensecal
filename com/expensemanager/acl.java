package com.expensemanager;

import java.util.Comparator;

class acl implements Comparator<ack> {
    acl() {
    }

    public int m3828a(ack com_expensemanager_ack, ack com_expensemanager_ack2) {
        return com_expensemanager_ack.m3827e() < com_expensemanager_ack2.m3827e() ? -1 : com_expensemanager_ack.m3827e() > com_expensemanager_ack2.m3827e() ? 1 : 0;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m3828a((ack) obj, (ack) obj2);
    }
}
