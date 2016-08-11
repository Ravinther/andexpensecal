package com.expensemanager;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class AmortizationSchedule extends Activity {
    private void m2367a() {
        View linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        float f = getResources().getDisplayMetrics().density;
        View linearLayout2 = new LinearLayout(this);
        linearLayout2.setPadding(5, 10, 0, 10);
        linearLayout2.setBackgroundColor(-198961);
        linearLayout2.setLayoutParams(new LayoutParams(-2, -2));
        View textView = new TextView(this);
        textView.setWidth(Math.round(30.0f * f));
        textView.setText("No.   ");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-16777216);
        linearLayout2.addView(textView);
        textView = new TextView(this);
        textView.setWidth(Math.round(65.0f * f));
        textView.setText("Amount   ");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-16777216);
        linearLayout2.addView(textView);
        textView = new TextView(this);
        textView.setWidth(Math.round(65.0f * f));
        textView.setText("Interest  ");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-16777216);
        linearLayout2.addView(textView);
        textView = new TextView(this);
        textView.setWidth(Math.round(65.0f * f));
        textView.setText("Principal   ");
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(-16777216);
        linearLayout2.addView(textView);
        View textView2 = new TextView(this);
        textView.setWidth(Math.round(85.0f * f));
        textView2.setText("Balance     ");
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        linearLayout2.addView(textView2);
        linearLayout.setOrientation(1);
        linearLayout.addView(linearLayout2, new LayoutParams(-1, -2));
        View tableLayout = new TableLayout(this);
        linearLayout2 = new ScrollView(this);
        linearLayout2.addView(tableLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        String stringExtra = getIntent().getStringExtra("Loan Amount");
        String stringExtra2 = getIntent().getStringExtra("Interest Rate");
        int intExtra = getIntent().getIntExtra("Loan Period", 0);
        String stringExtra3 = getIntent().getStringExtra("Extra Monthly");
        String stringExtra4 = getIntent().getStringExtra("Property Tax");
        String stringExtra5 = getIntent().getStringExtra("Property Insurance");
        String stringExtra6 = getIntent().getStringExtra("Property Price");
        String stringExtra7 = getIntent().getStringExtra("PMI");
        double i = aib.m3877i(stringExtra);
        double i2 = aib.m3877i(stringExtra2);
        double a = LoanCalculator.m3483a(i, i2, intExtra);
        if (!(stringExtra3 == null || "".equals(stringExtra3))) {
            a += aib.m3877i(stringExtra3);
        }
        int i3 = getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getInt("THEME_COLOR", 0);
        int i4 = 1;
        double d = i;
        double d2 = a;
        while (i4 <= intExtra) {
            View tableRow = new TableRow(this);
            tableRow.setPadding(5, 5, 0, 5);
            tableRow.setLayoutParams(new LayoutParams(-2, -2));
            if ((i4 / 2) * 2 == i4) {
                tableRow.setBackgroundColor(-2302756);
                if (i3 == 1 || i3 > 3) {
                    tableRow.setBackgroundColor(-1724303047);
                }
            }
            linearLayout = new TextView(this);
            linearLayout.setWidth(Math.round(30.0f * f));
            linearLayout.setText("" + i4);
            tableRow.addView(linearLayout);
            if (d2 > (1.0d + ((i2 / 100.0d) / 12.0d)) * d) {
                d2 = d * (1.0d + ((i2 / 100.0d) / 12.0d));
            }
            a = (stringExtra4 == null || "".equals(stringExtra4)) ? d2 : (aib.m3877i(stringExtra4) / 12.0d) + d2;
            if (stringExtra5 != null) {
                if (!"".equals(stringExtra5)) {
                    a += aib.m3877i(stringExtra5) / 12.0d;
                }
            }
            if (stringExtra7 != null) {
                if (!("".equals(stringExtra7) || stringExtra6 == null)) {
                    if (!"".equals(stringExtra6)) {
                        if ((d - (d2 - (((d * i2) / 100.0d) / 12.0d))) / aib.m3877i(stringExtra6) >= 0.8d) {
                            a += ((aib.m3877i(stringExtra7) / 100.0d) * i) / 12.0d;
                        }
                    }
                }
            }
            tableRow = new TextView(this);
            tableRow.setWidth(Math.round(65.0f * f));
            tableRow = tableRow;
            tableRow.setText(aib.m3850a(a) + " ");
            tableRow.setGravity(5);
            tableRow.addView(tableRow);
            a = ((d * i2) / 100.0d) / 12.0d;
            tableRow = new TextView(this);
            tableRow.setWidth(Math.round(65.0f * f));
            tableRow.setText(aib.m3850a(a) + " ");
            tableRow.setGravity(5);
            tableRow.addView(tableRow);
            a = d2 - a;
            tableRow = new TextView(this);
            tableRow.setWidth(Math.round(65.0f * f));
            tableRow.setText(aib.m3850a(a) + "  ");
            tableRow.setGravity(5);
            tableRow.addView(tableRow);
            a = d - a;
            if (i4 == intExtra || a <= 0.0d) {
                a = 0.0d;
            }
            View textView3 = new TextView(this);
            textView3.setWidth(Math.round(85.0f * f));
            textView3.setText(aib.m3850a(a));
            textView3.setGravity(5);
            tableRow.addView(textView3);
            tableLayout.addView(tableRow, new LayoutParams(-1, -2));
            if (Math.round(a) > 0) {
                i4++;
                d = a;
            } else {
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        abd.m3802a((Activity) this, true);
        setTitle("Amortization Schedule");
        m2367a();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
