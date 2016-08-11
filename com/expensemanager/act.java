package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class act implements OnItemClickListener {
    final /* synthetic */ MoreFeatures f3933a;

    act(MoreFeatures moreFeatures) {
        this.f3933a = moreFeatures;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String charSequence = ((TextView) view.findViewById(2131558423)).getText().toString();
        if (this.f3933a.getResources().getString(2131099777).equalsIgnoreCase(charSequence)) {
            this.f3933a.startActivity(new Intent(this.f3933a.f3518a, CreditCardList.class));
        } else if (this.f3933a.getResources().getString(2131099799).equalsIgnoreCase(charSequence)) {
            this.f3933a.startActivity(new Intent(this.f3933a.f3518a, DebtList.class));
        } else if (this.f3933a.getResources().getString(2131100088).equalsIgnoreCase(charSequence)) {
            this.f3933a.startActivity(new Intent(this.f3933a.f3518a, SMSMain.class));
        } else if (this.f3933a.getResources().getString(2131100082).equalsIgnoreCase(charSequence)) {
            this.f3933a.startActivity(new Intent(this.f3933a.f3518a, ShoppingList.class));
        }
    }
}
