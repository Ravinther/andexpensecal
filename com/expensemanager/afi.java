package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.expensemanager.dropbox.DBRoulette;
import com.google.android.gms.C0607c;
import com.google.android.gms.ads.search.SearchAdRequest;

class afi implements OnItemClickListener {
    final /* synthetic */ Settings f4046a;

    afi(Settings settings) {
        this.f4046a = settings;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent;
        Bundle bundle;
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, PinSetup.class));
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, ExpenseDataBackup.class));
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, DBRoulette.class));
            case SearchAdRequest.ERROR_CODE_NO_FILL /*3*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, GoogleDrive.class));
            case adv.ViewPagerIndicator_vpiTabPageIndicatorStyle /*4*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, DateSettings.class));
            case adv.ViewPagerIndicator_vpiUnderlinePageIndicatorStyle /*5*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, DisplaySettings.class));
            case adv.TitlePageIndicator_footerLineHeight /*6*/:
                this.f4046a.startActivity(new Intent(this.f4046a.f3590a, CurrencySettings.class));
            case adv.TitlePageIndicator_footerIndicatorStyle /*7*/:
                intent = new Intent(this.f4046a.f3590a, ExpenseCategoryExpandableList.class);
                bundle = new Bundle();
                bundle.putString("fromWhere", "settings");
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_footerIndicatorHeight /*8*/:
                intent = new Intent(this.f4046a.f3590a, ExpenseIncomeCategoryList.class);
                bundle = new Bundle();
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_footerIndicatorUnderlinePadding /*9*/:
                intent = new Intent(this.f4046a.f3590a, ExpensePayList.class);
                bundle = new Bundle();
                bundle.putString("categoryDisplay", "Expense");
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_footerPadding /*10*/:
                intent = new Intent(this.f4046a.f3590a, ExpensePayList.class);
                bundle = new Bundle();
                bundle.putString("categoryDisplay", "Income");
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_linePosition /*11*/:
                intent = new Intent(this.f4046a.f3590a, ExpensePaymentMethodList.class);
                bundle = new Bundle();
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_selectedBold /*12*/:
                intent = new Intent(this.f4046a.f3590a, SortableItemList.class);
                bundle = new Bundle();
                bundle.putInt("default_string_resource", 2131100103);
                bundle.putString("saved_string_key", "TRANSACTION_STATUS_KEY");
                bundle.putString("selected_item_key", "status");
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_titlePadding /*13*/:
                intent = new Intent(this.f4046a.f3590a, SortableItemList.class);
                bundle = new Bundle();
                bundle.putInt("default_string_resource", 2131100111);
                bundle.putString("saved_string_key", "EXPENSE_TAG");
                bundle.putString("selected_item_key", "tag");
                bundle.putBoolean("isEdit", true);
                intent.putExtras(bundle);
                this.f4046a.startActivity(intent);
            case adv.TitlePageIndicator_topPadding /*14*/:
                this.f4046a.m3557a();
            default:
        }
    }
}
