package com.expensemanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ro {
    private rp f5224a;
    private SQLiteDatabase f5225b;
    private final Context f5226c;

    public ro(Context context) {
        this.f5226c = context;
    }

    public long m4185a(String str, ContentValues contentValues) {
        return this.f5225b.insert(str, null, contentValues);
    }

    public ContentValues m4186a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("note_title", str);
        contentValues.put("note_content", str2);
        contentValues.put("note_order", str3);
        contentValues.put("note_transaction_id", str4);
        contentValues.put("note_tag", str5);
        contentValues.put("note_reminder", str6);
        contentValues.put("property", str8);
        contentValues.put("status", str7);
        contentValues.put("modified", Long.valueOf(j));
        return contentValues;
    }

    public ContentValues m4187a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str);
        contentValues.put("category", str2);
        contentValues.put("subcategory", str3);
        contentValues.put("frequency", str4);
        contentValues.put("amount", str5);
        contentValues.put("description", str6);
        contentValues.put("alert", str7);
        contentValues.put("property", str8);
        contentValues.put("property2", str9);
        contentValues.put("property3", str10);
        contentValues.put("modified", Long.valueOf(j));
        return contentValues;
    }

    public ContentValues m4188a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, long j3, String str11, String str12, String str13, String str14) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str);
        contentValues.put("description", str2);
        contentValues.put("amount", str3);
        contentValues.put("no_of_payment", str4);
        contentValues.put("category", str5);
        contentValues.put("subcategory", str6);
        contentValues.put("payment_method", str7);
        contentValues.put("frequency", str8);
        contentValues.put("remind_time", str9);
        contentValues.put("paid_cycle", str10);
        contentValues.put("property", str11);
        contentValues.put("next_payment_date", Long.valueOf(j));
        contentValues.put("first_expensed", Long.valueOf(j2));
        contentValues.put("modified", Long.valueOf(j3));
        contentValues.put("status", str12);
        contentValues.put("property2", str13);
        contentValues.put("property3", str14);
        return contentValues;
    }

    public ContentValues m4189a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str2);
        contentValues.put("amount", str3);
        contentValues.put("category", str4);
        contentValues.put("subcategory", str5);
        contentValues.put("payment_method", str6);
        contentValues.put("description", str7);
        contentValues.put("reference_number", str8);
        contentValues.put("property", str11);
        contentValues.put("status", str9);
        contentValues.put("address", str10);
        contentValues.put("payee_payer", str);
        contentValues.put("modified", Long.valueOf(j));
        return contentValues;
    }

    public ContentValues m4190a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, long j, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str);
        contentValues.put("amount", str2);
        contentValues.put("category", str3);
        contentValues.put("subcategory", str4);
        contentValues.put("payment_method", str5);
        contentValues.put("description", str6);
        contentValues.put("reference_number", str7);
        contentValues.put("property", str8);
        contentValues.put("status", str9);
        contentValues.put("property2", str10);
        contentValues.put("expensed", Long.valueOf(j));
        contentValues.put("modified", Long.valueOf(j2));
        contentValues.put("expense_tag", str11);
        contentValues.put("tax", str12);
        contentValues.put("property3", str13);
        contentValues.put("property4", str14);
        contentValues.put("property5", str15);
        return contentValues;
    }

    public Cursor m4191a(long j) {
        Cursor query = this.f5225b.query(true, "expense_report", new String[]{"_id", "account", "amount", "category", "subcategory", "payment_method", "description", "reference_number", "property", "status", "property2", "expensed", "modified", "expense_tag", "tax", "property3", "property4", "property5"}, "_id=" + j, null, null, null, null, null);
        if (query != null) {
            query.moveToFirst();
        }
        return query;
    }

    public Cursor m4192a(String str, String str2) {
        return this.f5225b.query(true, "expense_report", new String[]{"_id", "account", "amount", "category", "subcategory", "payment_method", "description", "reference_number", "property", "status", "property2", "expensed", "modified", "expense_tag", "tax", "property3", "property4", "property5"}, str, null, null, null, str2, null);
    }

    public ro m4193a() {
        this.f5224a = new rp(this.f5226c);
        this.f5225b = this.f5224a.getWritableDatabase();
        return this;
    }

    public void m4194a(String str) {
        this.f5225b.execSQL(str);
    }

    public boolean m4195a(String str, long j) {
        return this.f5225b.delete(str, new StringBuilder().append("_id=").append(j).toString(), null) > 0;
    }

    public boolean m4196a(String str, long j, ContentValues contentValues) {
        return this.f5225b.update(str, contentValues, new StringBuilder().append("_id=").append(j).toString(), null) > 0;
    }

    public boolean m4197a(String str, String str2, String str3) {
        return this.f5225b.delete(str, new StringBuilder().append(str2).append("='").append(str3).append("'").toString(), null) > 0;
    }

    public boolean m4198a(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str3, str4);
        return this.f5225b.update(str, contentValues, str2, null) > 0;
    }

    public Cursor m4199b(String str, String str2) {
        return this.f5225b.query(true, "expense_category", new String[]{"category", "subcategory"}, str, null, null, null, str2, null);
    }

    public Cursor m4200b(String str, String str2, String str3) {
        return this.f5225b.query(true, "expense_report", new String[]{str}, str2, null, null, null, str3, null);
    }

    public void m4201b() {
        this.f5224a.close();
    }

    public boolean m4202b(String str) {
        try {
            this.f5225b.execSQL(str);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ContentValues m4203c(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("category", str);
        contentValues.put("subcategory", str2);
        return contentValues;
    }

    public Cursor m4204c() {
        return this.f5225b.query("expense_category", new String[]{"category", "subcategory"}, null, null, null, null, "category ASC, subcategory ASC");
    }

    public Cursor m4205d(String str, String str2) {
        return this.f5225b.query(true, "expense_repeating", new String[]{"_id", "account", "description", "amount", "no_of_payment", "category", "subcategory", "payment_method", "frequency", "remind_time", "paid_cycle", "property", "next_payment_date", "first_expensed", "modified", "status", "property2", "property3"}, str, null, null, null, str2, null);
    }

    public boolean m4206d() {
        return this.f5225b == null ? false : this.f5225b.isOpen();
    }

    public Cursor m4207e(String str, String str2) {
        return this.f5225b.query(true, "expense_budget", new String[]{"_id", "account", "category", "subcategory", "frequency", "amount", "description", "alert", "property", "property2", "property3", "modified"}, str, null, null, null, str2, null);
    }

    public Cursor m4208f(String str, String str2) {
        return this.f5225b.query(true, "expense_payee_payer", new String[]{"_id", "account", "category", "subcategory", "payment_method", "amount", "description", "reference_number", "payee_payer", "address", "property", "status", "modified"}, str, null, null, null, str2, null);
    }

    public Cursor m4209g(String str, String str2) {
        return this.f5225b.query(true, "expense_preference", new String[]{"_id", "name", "value", "modified"}, str, null, null, null, null, str2);
    }

    public Cursor m4210h(String str, String str2) {
        return this.f5225b.query(true, "expense_note", new String[]{"_id", "note_title", "note_content", "note_order", "note_transaction_id", "note_tag", "note_reminder", "property", "status", "modified"}, str, null, null, null, str2, null);
    }
}
