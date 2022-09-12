package com.example.mazadat.view.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.example.mazadat.R;

import org.aviran.cookiebar2.CookieBar;

import java.util.List;


public class DialogSearchCautions extends DialogFragment {
  Activity activity;
  Button searchBtu;
    AutoCompleteTextView cautionStatus;
    AutoCompleteTextView eayType;
    AutoCompleteTextView cautionCity;
    AutoCompleteTextView cautionDestination;
    public DialogSearchCautions(Activity activity) {
        this.activity = activity;


    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View rootView = inflater.inflate(R.layout.dialog_search_cautions, null);
        searchBtu=(Button) rootView.findViewById(R.id.dialog_search_cautions_search_btu);
        cautionStatus=(AutoCompleteTextView)rootView.findViewById(R.id.dialog_search_cautions_status_edit);
        eayType=(AutoCompleteTextView)rootView.findViewById(R.id.dialog_search_cautions_eay_type_edit);
        cautionCity=(AutoCompleteTextView)rootView.findViewById(R.id.dialog_search_cautions_city_edit);
        cautionDestination=(AutoCompleteTextView)rootView.findViewById(R.id.dialog_search_cautions_destination_edit);
        searchBtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
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
