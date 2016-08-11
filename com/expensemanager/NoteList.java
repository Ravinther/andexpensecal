package com.expensemanager;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.text.Html;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.gms.C0607c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteList extends ListActivity {
    int f3538a;
    private Button f3539b;
    private Button f3540c;
    private Context f3541d;
    private ro f3542e;
    private ArrayList<Map<String, String>> f3543f;
    private boolean f3544g;
    private int f3545h;
    private adk f3546i;
    private ListView f3547j;
    private ahz f3548k;
    private aia f3549l;

    public NoteList() {
        this.f3541d = this;
        this.f3544g = false;
        this.f3545h = 0;
        this.f3538a = 0;
        this.f3548k = new adg(this);
        this.f3549l = new adh(this);
    }

    public static int m3507a(ro roVar, String str, String str2, List<Map<String, String>> list) {
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        Cursor h = roVar.m4210h(str, str2);
        int i = 0;
        if (h == null || !h.moveToFirst()) {
            if (h != null) {
                h.close();
            }
            roVar.m4201b();
            return i;
        }
        int columnIndex = h.getColumnIndex("_id");
        int columnIndex2 = h.getColumnIndex("note_title");
        int columnIndex3 = h.getColumnIndex("note_content");
        int columnIndex4 = h.getColumnIndex("note_tag");
        int columnIndex5 = h.getColumnIndex("note_order");
        int columnIndex6 = h.getColumnIndex("note_reminder");
        int columnIndex7 = h.getColumnIndex("note_transaction_id");
        int columnIndex8 = h.getColumnIndex("property");
        int columnIndex9 = h.getColumnIndex("status");
        int columnIndex10 = h.getColumnIndex("modified");
        do {
            Map hashMap = new HashMap();
            String str3 = "" + h.getLong(columnIndex);
            String b = aib.m3865b(h.getString(columnIndex2));
            String b2 = aib.m3865b(h.getString(columnIndex3));
            String b3 = aib.m3865b(h.getString(columnIndex4));
            String b4 = aib.m3865b(h.getString(columnIndex7));
            String b5 = aib.m3865b(h.getString(columnIndex5));
            String b6 = aib.m3865b(h.getString(columnIndex6));
            String b7 = aib.m3865b(h.getString(columnIndex8));
            String b8 = aib.m3865b(h.getString(columnIndex9));
            long j = h.getLong(columnIndex10);
            hashMap.put("rowId", str3);
            hashMap.put("title", b);
            hashMap.put("content", b2);
            hashMap.put("tag", b3);
            hashMap.put("order", b5);
            hashMap.put("reminder", b6);
            hashMap.put("transactionId", b4);
            hashMap.put("property", b7);
            hashMap.put("status", b8);
            hashMap.put("date", aba.m3749a(j, ExpenseManager.f3244t + " EEEE HH:mm aaa"));
            list.add(hashMap);
            i++;
        } while (h.moveToNext());
        if (h != null) {
            h.close();
        }
        roVar.m4201b();
        return i;
    }

    private void m3510a(ro roVar) {
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        for (int i = 0; i < this.f3546i.getCount(); i++) {
            try {
                roVar.m4194a("update expense_note set note_order='" + i + "' where " + "_id" + "=" + ((String) ((Map) this.f3546i.getItem(i)).get("rowId")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        roVar.m4201b();
    }

    private void m3511a(String str, String str2) {
        new Builder(this.f3541d).setTitle(2131099805).setMessage(getResources().getText(2131099808).toString() + str2 + "?").setPositiveButton(2131099983, new adj(this, str)).setNegativeButton(2131099754, new adi(this)).show();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                if (-1 == i2) {
                    onCreate(null);
                }
            default:
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Map map = (Map) this.f3543f.get(((AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        Intent intent;
        if (menuItem.getItemId() == 1) {
            intent = new Intent(this.f3541d, NoteAdd.class);
            Bundle bundle = new Bundle();
            bundle.putInt("count", this.f3545h);
            bundle.putString("rowId", (String) map.get("rowId"));
            bundle.putString("where", "edit");
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return false;
        } else if (menuItem.getItemId() == 2) {
            m3511a((String) map.get("rowId"), (String) map.get("title"));
            return false;
        } else if (menuItem.getItemId() == 3) {
            Bundle bundle2 = new Bundle();
            r3 = new Intent(this.f3541d, ExpenseNewTransaction.class);
            List arrayList = new ArrayList();
            ExpenseAccountActivities.m2602a(this.f3542e, "_id=" + ((String) map.get("transactionId")), arrayList, false, null);
            if (arrayList == null || arrayList.size() == 0) {
                return false;
            }
            Map map2 = (Map) arrayList.get(0);
            String str = (String) map2.get("paymentMethod");
            Intent intent2 = (str.indexOf("/mi") == -1 && str.indexOf("/km") == -1) ? r3 : new Intent(this.f3541d, ExpenseMileageNewEdit.class);
            bundle2.putLong("rowId", Long.valueOf((String) map.get("transactionId")).longValue());
            bundle2.putString("date", (String) map2.get("date"));
            bundle2.putString("category", (String) map2.get("category"));
            bundle2.putString("account", (String) map2.get("account"));
            bundle2.putString("amount", (String) map2.get("amount"));
            bundle2.putString("description", (String) map2.get("description"));
            bundle2.putString("paymentMethod", (String) map2.get("paymentMethod"));
            bundle2.putString("referenceNumber", (String) map2.get("referenceNumber"));
            bundle2.putString("property", (String) map2.get("property"));
            bundle2.putString("status", (String) map2.get("status"));
            bundle2.putString("property2", (String) map2.get("property2"));
            bundle2.putString("fromWhere", "EditActivity");
            intent2.putExtras(bundle2);
            startActivity(intent2);
            return false;
        } else {
            StringBuffer stringBuffer;
            if (menuItem.getItemId() == 4) {
                stringBuffer = new StringBuffer();
                stringBuffer.append(Html.fromHtml("<b>" + ((String) map.get("date")) + "</b> " + ((String) map.get("content"))) + "\n");
                r3 = new Intent("android.intent.action.SEND");
                r3.setType("plain/text");
                r3.putExtra("android.intent.extra.EMAIL", new String[]{""});
                r3.putExtra("android.intent.extra.SUBJECT", getResources().getString(2131099725) + ": " + ((String) map.get("title")));
                r3.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
                startActivity(Intent.createChooser(r3, "Send mail..."));
            }
            if (menuItem.getItemId() == 5) {
                stringBuffer = new StringBuffer();
                stringBuffer.append(getResources().getString(2131099725) + ": " + ((String) map.get("title")) + "\n");
                stringBuffer.append(Html.fromHtml("<b>" + ((String) map.get("date")) + "</b> " + ((String) map.get("content"))) + "\n");
                if (VERSION.SDK_INT >= 19) {
                    String defaultSmsPackage = Sms.getDefaultSmsPackage(this);
                    intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", stringBuffer.toString());
                    if (defaultSmsPackage != null) {
                        intent.setPackage(defaultSmsPackage);
                    }
                    startActivity(intent);
                } else {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setData(Uri.parse("sms:"));
                    intent3.putExtra("sms_body", stringBuffer.toString());
                    startActivity(intent3);
                }
            }
            return super.onContextItemSelected(menuItem);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setContentView(2130903135);
        this.f3538a = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        this.f3542e = new ro(this);
        this.f3543f = new ArrayList();
        ro roVar = this.f3542e;
        this.f3545h = m3507a(roVar, "status='0'", "note_order*1 ASC", this.f3543f);
        setTitle(getResources().getString(2131099979) + " (" + this.f3545h + ")");
        this.f3539b = (Button) findViewById(2131558956);
        this.f3539b.setVisibility(8);
        aib.m3858a((Context) this, this.f3539b, -1);
        this.f3539b.setOnClickListener(new add(this));
        this.f3546i = new adk(this);
        setListAdapter(this.f3546i);
        getListView().setDivider(getResources().getDrawable(17301522));
        getListView().setDividerHeight(1);
        TouchListView touchListView = (TouchListView) getListView();
        touchListView.setDropListener(this.f3548k);
        touchListView.setRemoveListener(this.f3549l);
        this.f3547j = getListView();
        this.f3547j.setOnItemClickListener(new ade(this));
        registerForContextMenu(this.f3547j);
        this.f3540c = (Button) findViewById(2131558703);
        this.f3540c.setVisibility(8);
        aib.m3858a((Context) this, this.f3540c, -1);
        this.f3540c.setOnClickListener(new adf(this));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (view.getId() == 16908298) {
            Map map = (Map) this.f3543f.get(((AdapterContextMenuInfo) contextMenuInfo).position);
            String str = (String) map.get("description");
            String str2 = (String) map.get("transactionId");
            contextMenu.setHeaderTitle(str);
            contextMenu.add(0, 1, 0, 2131099860);
            contextMenu.add(0, 2, 0, 2131099802);
            if (!(str2 == null || "".equalsIgnoreCase(str2))) {
                contextMenu.add(0, 3, 0, 2131100163);
            }
            contextMenu.add(0, 4, 0, "Email");
            contextMenu.add(0, 5, 0, "SMS");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131492878, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559115) {
            Intent intent = new Intent(this.f3541d, NoteAdd.class);
            Bundle bundle = new Bundle();
            bundle.putInt("count", this.f3545h);
            intent.putExtras(bundle);
            startActivityForResult(intent, 0);
            return true;
        } else if (itemId == 2131559127) {
            if (getResources().getString(2131100094).equals(menuItem.getTitle())) {
                menuItem.setTitle(2131100065);
                menuItem.setIcon(2130837591);
                this.f3544g = true;
                this.f3546i.notifyDataSetChanged();
                return true;
            }
            menuItem.setTitle(2131100094);
            menuItem.setIcon(2130837609);
            this.f3544g = false;
            this.f3546i.notifyDataSetChanged();
            m3510a(this.f3542e);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }
}
