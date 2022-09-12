package com.example.mazadat.view.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavController;

import com.example.mazadat.R;


public class DialogNoAvailableMoney extends DialogFragment {
    Activity activity;
    TextView cancel,contactUs;
    NavController navController;
    public DialogNoAvailableMoney(Activity activity,NavController navController) {
        this.activity = activity;
        this.navController=navController;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.dialog_not_available_money, null);
        cancel=(TextView) rootView.findViewById(R.id.dialog_not_available_money_not_now_btu);
        contactUs=(TextView)rootView.findViewById(R.id.dialog_not_available_contact_us_btu);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                navController.navigate(R.id.contactUsFragment);

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
