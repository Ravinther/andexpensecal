package com.expensemanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class rp extends SQLiteOpenHelper {
    rp(Context context) {
        super(context, "personal_finance.db", null, 7);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE expense_report (_id INTEGER PRIMARY KEY,account TEXT,amount TEXT,category TEXT,subcategory TEXT,payment_method TEXT,description TEXT,expensed INTEGER,modified INTEGER,reference_number TEXT,property TEXT,status TEXT,property2 TEXT,property3 TEXT,property4 TEXT,property5 TEXT,tax TEXT,expense_tag TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_category (_id INTEGER PRIMARY KEY,category TEXT,subcategory TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_repeating (_id INTEGER PRIMARY KEY,account TEXT,description TEXT,amount TEXT,no_of_payment TEXT,category TEXT,subcategory TEXT,payment_method TEXT,frequency TEXT,remind_time TEXT,paid_cycle TEXT,property TEXT,next_payment_date INTEGER,first_expensed INTEGER,modified INTEGER,status TEXT,property2 TEXT,property3 TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_budget (_id INTEGER PRIMARY KEY,account TEXT,no_of_payment TEXT,category TEXT,subcategory TEXT,frequency TEXT,amount TEXT,alert TEXT,description TEXT,property TEXT,modified INTEGER,property2 TEXT,property3 TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_payee_payer (_id INTEGER PRIMARY KEY,payee_payer TEXT,account TEXT,amount TEXT,category TEXT,subcategory TEXT,payment_method TEXT,reference_number TEXT,description TEXT,status TEXT,address TEXT,property TEXT,modified INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_preference (_id INTEGER PRIMARY KEY,name TEXT,value TEXT,modified INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE expense_note (_id INTEGER PRIMARY KEY,note_title TEXT,note_content TEXT,note_order TEXT,note_transaction_id TEXT,note_tag TEXT,note_reminder TEXT,status TEXT,property TEXT,modified INTEGER);");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2) {
            String str;
            String str2;
            String str3;
            String str4;
            if (i == 2) {
                str = "alter table expense_report add property text;";
                try {
                    sQLiteDatabase.execSQL("alter table expense_report add reference_number text;");
                    sQLiteDatabase.execSQL(str);
                    sQLiteDatabase.execSQL("CREATE TABLE expense_repeating (_id INTEGER PRIMARY KEY,account TEXT,description TEXT,amount TEXT,no_of_payment TEXT,category TEXT,subcategory TEXT,payment_method TEXT,frequency TEXT,remind_time TEXT,paid_cycle TEXT,property TEXT,next_payment_date INTEGER,first_expensed INTEGER,modified INTEGER,status TEXT,property2 TEXT,property3 TEXT);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (i == 3) {
                str = "alter table expense_report add property2 text;";
                str2 = "alter table expense_repeating add status text;";
                str3 = "alter table expense_repeating add property2 text;";
                str4 = "alter table expense_repeating add property3 text;";
                try {
                    sQLiteDatabase.execSQL("alter table expense_report add status text;");
                    sQLiteDatabase.execSQL(str);
                    sQLiteDatabase.execSQL(str2);
                    sQLiteDatabase.execSQL(str3);
                    sQLiteDatabase.execSQL(str4);
                    sQLiteDatabase.execSQL("CREATE TABLE expense_budget (_id INTEGER PRIMARY KEY,account TEXT,no_of_payment TEXT,category TEXT,subcategory TEXT,frequency TEXT,amount TEXT,alert TEXT,description TEXT,property TEXT,modified INTEGER,property2 TEXT,property3 TEXT);");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (i <= 4) {
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE expense_payee_payer (_id INTEGER PRIMARY KEY,payee_payer TEXT,account TEXT,amount TEXT,category TEXT,subcategory TEXT,payment_method TEXT,reference_number TEXT,description TEXT,status TEXT,address TEXT,property TEXT,modified INTEGER);");
                    sQLiteDatabase.execSQL("CREATE TABLE expense_preference (_id INTEGER PRIMARY KEY,name TEXT,value TEXT,modified INTEGER);");
                } catch (Exception e22) {
                    e22.printStackTrace();
                }
            }
            if (i <= 5) {
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE expense_note (_id INTEGER PRIMARY KEY,note_title TEXT,note_content TEXT,note_order TEXT,note_transaction_id TEXT,note_tag TEXT,note_reminder TEXT,status TEXT,property TEXT,modified INTEGER);");
                } catch (Exception e222) {
                    e222.printStackTrace();
                }
            }
            if (i <= 6) {
                str = "alter table expense_report add property4 text;";
                str2 = "alter table expense_report add property5 text;";
                str3 = "alter table expense_report add tax text;";
                str4 = "alter table expense_report add expense_tag text;";
                String str5 = "alter table expense_budget add property2 text;";
                String str6 = "alter table expense_budget add property3 text;";
                try {
                    sQLiteDatabase.execSQL("alter table expense_report add property3 text;");
                    sQLiteDatabase.execSQL(str);
                    sQLiteDatabase.execSQL(str2);
                    sQLiteDatabase.execSQL(str3);
                    sQLiteDatabase.execSQL(str4);
                    sQLiteDatabase.execSQL(str5);
                    sQLiteDatabase.execSQL(str6);
                } catch (Exception e2222) {
                    e2222.printStackTrace();
                }
            }
        }
    }
}
