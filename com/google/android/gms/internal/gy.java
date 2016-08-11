package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

@id
public class gy {
    private static final String f6698a;
    private static final Object f6699c;
    private static gy f6700d;
    private final gz f6701b;

    static {
        f6698a = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});
        f6699c = new Object();
    }

    private gy(Context context) {
        this.f6701b = new gz(this, context, "google_inapp_purchase.db");
    }

    public static gy m5665a(Context context) {
        gy gyVar;
        synchronized (f6699c) {
            if (f6700d == null) {
                f6700d = new gy(context);
            }
            gyVar = f6700d;
        }
        return gyVar;
    }

    public SQLiteDatabase m5667a() {
        try {
            return this.f6701b.getWritableDatabase();
        } catch (SQLiteException e) {
            ly.m6074e("Error opening writable conversion tracking database");
            return null;
        }
    }

    public gw m5668a(Cursor cursor) {
        return cursor == null ? null : new gw(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    public List<gw> m5669a(long j) {
        Cursor query;
        SQLiteException e;
        Throwable th;
        synchronized (f6699c) {
            List<gw> linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase a = m5667a();
            if (a == null) {
                return linkedList;
            }
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                try {
                    if (query.moveToFirst()) {
                        do {
                            linkedList.add(m5668a(query));
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        ly.m6074e("Error extracing purchase info: " + e.getMessage());
                        if (query != null) {
                            query.close();
                        }
                        return linkedList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                ly.m6074e("Error extracing purchase info: " + e.getMessage());
                if (query != null) {
                    query.close();
                }
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
            return linkedList;
        }
    }

    public void m5670a(gw gwVar) {
        if (gwVar != null) {
            synchronized (f6699c) {
                SQLiteDatabase a = m5667a();
                if (a == null) {
                    return;
                }
                a.delete("InAppPurchase", String.format("%s = %d", new Object[]{"purchase_id", Long.valueOf(gwVar.f6688a)}), null);
            }
        }
    }

    public int m5671b() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f6699c) {
            SQLiteDatabase a = m5667a();
            if (a == null) {
            } else {
                try {
                    cursor = a.rawQuery("select count(*) from InAppPurchase", null);
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    ly.m6074e("Error getting record count" + e.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }

    public void m5672b(gw gwVar) {
        if (gwVar != null) {
            synchronized (f6699c) {
                SQLiteDatabase a = m5667a();
                if (a == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("product_id", gwVar.f6690c);
                contentValues.put("developer_payload", gwVar.f6689b);
                contentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
                gwVar.f6688a = a.insert("InAppPurchase", null, contentValues);
                if (((long) m5671b()) > 20000) {
                    m5673c();
                }
            }
        }
    }

    public void m5673c() {
        SQLiteException e;
        synchronized (f6699c) {
            SQLiteDatabase a = m5667a();
            if (a == null) {
                return;
            }
            Cursor query;
            try {
                query = a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            m5670a(m5668a(query));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            ly.m6074e("Error remove oldest record" + e.getMessage());
                            if (query != null) {
                                query.close();
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            if (query != null) {
                                query.close();
                            }
                            throw th2;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                ly.m6074e("Error remove oldest record" + e.getMessage());
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th3) {
                th2 = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        }
    }
}
