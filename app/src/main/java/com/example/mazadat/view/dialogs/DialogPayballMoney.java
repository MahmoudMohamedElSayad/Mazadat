package com.example.mazadat.view.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavController;

import com.example.mazadat.R;


public class DialogPayballMoney extends DialogFragment {
    Activity activity;
    TextView cancel,paymentMoney;
    NavController navController;
    public DialogPayballMoney(Activity activity,NavController navController) {
        this.activity = activity;
        this.navController=navController;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.dialog_payball_money, null);
        cancel=(TextView) rootView.findViewById(R.id.dialog_payball_money_not_now_btu);
        paymentMoney=(TextView)rootView.findViewById(R.id.dialog_payball_money_pay_money_btu);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        paymentMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
//                final DialogNoAvailableMoney dialogPayballMoney = new DialogNoAvailableMoney(getActivity(),navController);
//                dialogPayballMoney.show(getActivity().getSupportFragmentManager(), "example");
                navController.navigate(R.id.cautionShareFragment);
            }
        });
        setCancelable(false);
        builder.setView(rootView);
        Dialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(Color.TRANSPARENT));
        return dialog;
    }
}
