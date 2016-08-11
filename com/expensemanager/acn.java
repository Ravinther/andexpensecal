package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;

class acn implements OnClickListener {
    final /* synthetic */ TextView f3911a;
    final /* synthetic */ TextView f3912b;
    final /* synthetic */ LinearLayout f3913c;
    final /* synthetic */ TextView f3914d;
    final /* synthetic */ TextView f3915e;
    final /* synthetic */ TextView f3916f;
    final /* synthetic */ TextView f3917g;
    final /* synthetic */ LinearLayout f3918h;
    final /* synthetic */ SharedPreferences f3919i;
    final /* synthetic */ TextView f3920j;
    final /* synthetic */ TextView f3921k;
    final /* synthetic */ TextView f3922l;
    final /* synthetic */ TextView f3923m;
    final /* synthetic */ TextView f3924n;
    final /* synthetic */ LinearLayout f3925o;
    final /* synthetic */ LoanCalculator f3926p;

    acn(LoanCalculator loanCalculator, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout2, SharedPreferences sharedPreferences, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout3) {
        this.f3926p = loanCalculator;
        this.f3911a = textView;
        this.f3912b = textView2;
        this.f3913c = linearLayout;
        this.f3914d = textView3;
        this.f3915e = textView4;
        this.f3916f = textView5;
        this.f3917g = textView6;
        this.f3918h = linearLayout2;
        this.f3919i = sharedPreferences;
        this.f3920j = textView7;
        this.f3921k = textView8;
        this.f3922l = textView9;
        this.f3923m = textView10;
        this.f3924n = textView11;
        this.f3925o = linearLayout3;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.f3926p.getSystemService("input_method")).hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        try {
            double i = aib.m3877i(this.f3926p.f3504a.getText().toString());
            double i2 = aib.m3877i(this.f3926p.f3505b.getText().toString());
            String obj = this.f3926p.f3506c.getText().toString();
            String str = "".equals(obj) ? "0" : obj;
            obj = this.f3926p.f3507d.getText().toString();
            if ("".equals(obj)) {
                obj = "0";
            }
            int parseInt = (Integer.parseInt(str) * 12) + Integer.parseInt(obj);
            if (parseInt != 0) {
                double d;
                double d2;
                double round;
                CharSequence charSequence;
                CharSequence charSequence2;
                double d3;
                Object obj2;
                int i3;
                this.f3926p.f3514k = parseInt;
                double a = LoanCalculator.m3483a(i, i2, parseInt);
                double a2 = LoanCalculator.m3483a(i, i2, parseInt) * ((double) parseInt);
                if (i2 == 0.0d) {
                    a2 = i;
                }
                double d4 = a2 - i;
                this.f3926p.f3515l = a;
                String str2 = "";
                String str3 = "";
                if ("".equals(this.f3926p.f3508e.getText().toString())) {
                    this.f3913c.setVisibility(8);
                    Object obj3 = str3;
                    Object obj4 = str2;
                    d = d4;
                    d4 = a2;
                } else {
                    d2 = (i2 / 100.0d) / 12.0d;
                    d4 = aib.m3877i(this.f3926p.f3508e.getText().toString()) + a;
                    this.f3926p.f3515l = d4;
                    d2 = (-Math.log10(1.0d - ((d2 * i) / d4))) / Math.log10(d2 + 1.0d);
                    round = ((double) Math.round((d2 * d4) * 100.0d)) / 100.0d;
                    if (i2 == 0.0d) {
                        d2 = i / d4;
                        round = i;
                    }
                    long round2 = Math.round(Math.ceil(d2));
                    int i4 = parseInt - ((int) round2);
                    this.f3926p.f3514k = (int) round2;
                    CharSequence a3 = aib.m3850a(a2 - round);
                    this.f3911a.setText(a3);
                    str3 = " months";
                    if (i4 < 2) {
                        str3 = " month";
                    }
                    CharSequence charSequence3 = i4 + str3;
                    this.f3912b.setText(charSequence3);
                    d4 = round - i;
                    this.f3913c.setVisibility(0);
                    charSequence = charSequence3;
                    charSequence2 = a3;
                    d = d4;
                    d4 = round;
                }
                double i5 = !"".equals(this.f3926p.f3508e.getText().toString().trim()) ? aib.m3877i(this.f3926p.f3508e.getText().toString()) + a : a;
                if (!"".equals(this.f3926p.f3510g.getText().toString().trim()) && "Basic".equals(this.f3926p.f3513j.getText().toString())) {
                    d2 = aib.m3877i(this.f3926p.f3510g.getText().toString());
                    a += d2 / 12.0d;
                    d4 += (d2 / 12.0d) * ((double) parseInt);
                }
                if ("".equals(this.f3926p.f3511h.getText().toString().trim()) || !"Basic".equals(this.f3926p.f3513j.getText().toString())) {
                    d3 = a;
                } else {
                    d2 = aib.m3877i(this.f3926p.f3511h.getText().toString());
                    d4 += (d2 / 12.0d) * ((double) parseInt);
                    d3 = a + (d2 / 12.0d);
                }
                d2 = 0.0d;
                Object obj5 = null;
                int i6 = 0;
                if ("".equals(this.f3926p.f3512i.getText().toString().trim()) || "".equals(this.f3926p.f3509f.getText().toString().trim()) || !"Basic".equals(this.f3926p.f3513j.getText().toString())) {
                    this.f3918h.setVisibility(8);
                    round = d4;
                    d4 = 0.0d;
                    obj2 = null;
                    i3 = 0;
                } else {
                    double i7 = aib.m3877i(this.f3926p.f3509f.getText().toString().trim());
                    if (i / i7 <= 0.8d || i > i7) {
                        this.f3918h.setVisibility(8);
                    } else {
                        obj5 = 1;
                        double i8 = aib.m3877i(this.f3926p.f3512i.getText().toString());
                        d2 = (((i8 / 100.0d) * i) / 12.0d) + d3;
                        int i9 = 1;
                        a2 = i;
                        while (i9 < parseInt) {
                            a2 -= i5 - (((a2 * i2) / 100.0d) / 12.0d);
                            if (a2 / i7 <= 0.8d) {
                                i6 = i9 - 1;
                                break;
                            } else {
                                i9++;
                                d4 = (((i8 / 100.0d) * i) / 12.0d) + d4;
                            }
                        }
                        this.f3914d.setText("First " + i6 + " months: ");
                        this.f3915e.setText(aib.m3850a(d2));
                        this.f3916f.setText(aib.m3850a(((i8 / 100.0d) * i) / 12.0d));
                        this.f3917g.setText("After " + i6 + " months");
                        if (!"".equals(aib.m3850a(d2))) {
                            this.f3918h.setVisibility(0);
                        }
                        Editor edit = this.f3919i.edit();
                        edit.putString("pmi", this.f3926p.f3512i.getText().toString());
                        edit.commit();
                    }
                    round = d4;
                    d4 = d2;
                    obj2 = obj5;
                    i3 = i6;
                }
                this.f3920j.setText(aib.m3850a(d3));
                this.f3921k.setText(aib.m3850a(round));
                this.f3922l.setText(aib.m3850a(d));
                this.f3923m.setText(aib.m3850a(12.0d * d3));
                this.f3924n.setText(aib.m3850a(((100.0d * d3) * 12.0d) / i) + "%");
                this.f3925o.setVisibility(0);
                this.f3926p.f3517n = "Loan Amount: " + this.f3926p.f3504a.getText().toString() + "\n";
                this.f3926p.f3517n = this.f3926p.f3517n + "Interest Rate: " + this.f3926p.f3505b.getText().toString() + "% per year \n";
                str = this.f3926p.f3506c.getText().toString();
                obj = this.f3926p.f3507d.getText().toString();
                if ("".equals(this.f3926p.f3506c.getText().toString())) {
                    str = "0";
                }
                if ("".equals(this.f3926p.f3507d.getText().toString())) {
                    obj = "0";
                }
                this.f3926p.f3517n = this.f3926p.f3517n + "Loan Term: " + str + " years " + obj + " months" + "\n";
                if (!"".equals(this.f3926p.f3508e.getText().toString())) {
                    this.f3926p.f3517n = this.f3926p.f3517n + "Extra Payment Per Month: " + this.f3926p.f3508e.getText().toString() + "\n";
                }
                if (!"".equals(this.f3926p.f3510g.getText().toString().trim()) && "Basic".equals(this.f3926p.f3513j.getText().toString())) {
                    this.f3926p.f3517n = this.f3926p.f3517n + "Property Tax: " + this.f3926p.f3510g.getText().toString() + " per year\n";
                }
                if (!"".equals(this.f3926p.f3511h.getText().toString().trim())) {
                    this.f3926p.f3517n = this.f3926p.f3517n + "Insurance: " + this.f3926p.f3511h.getText().toString() + " per year\n";
                }
                if (obj2 != null) {
                    this.f3926p.f3517n = this.f3926p.f3517n + "PMI: " + this.f3926p.f3512i.getText().toString() + "% per year\n";
                    this.f3926p.f3517n = this.f3926p.f3517n + "Property Price: " + this.f3926p.f3509f.getText().toString() + "\n";
                }
                this.f3926p.f3517n = this.f3926p.f3517n + "\nYou will pay: \n\n";
                if (obj2 != null) {
                    this.f3926p.f3517n = this.f3926p.f3517n + "First " + i3 + " months: " + aib.m3850a(d4) + "\n";
                    this.f3926p.f3517n = this.f3926p.f3517n + "Monthly PMI: " + this.f3916f.getText().toString() + "\n\n";
                    this.f3926p.f3517n = this.f3926p.f3517n + "After " + i3 + " months:" + "\n";
                }
                this.f3926p.f3517n = this.f3926p.f3517n + "Monthly payment: " + aib.m3850a(d3) + "\n";
                this.f3926p.f3517n = this.f3926p.f3517n + "Total payment: " + aib.m3850a(round) + "\n";
                this.f3926p.f3517n = this.f3926p.f3517n + "Total Interest: " + aib.m3850a(d) + "\n";
                this.f3926p.f3517n = this.f3926p.f3517n + "Annual Payment: " + this.f3923m.getText().toString() + "\n";
                this.f3926p.f3517n = this.f3926p.f3517n + "Mortgage Constant: " + this.f3924n.getText().toString() + "\n\n";
                if (!"".equals(this.f3926p.f3508e.getText().toString())) {
                    this.f3926p.f3517n = "\n" + this.f3926p.f3517n + "With Additional Payment: " + "\n";
                    this.f3926p.f3517n = this.f3926p.f3517n + "Interest Saving: " + charSequence2 + "\n";
                    this.f3926p.f3517n = this.f3926p.f3517n + "Payoff Earlier by: " + charSequence + "\n";
                }
            }
        } catch (NumberFormatException e) {
            new Builder(this.f3926p.f3516m).setTitle("Attention").setMessage("Please enter a valid number!").setPositiveButton("Close", new aco(this)).show();
        }
    }
}
