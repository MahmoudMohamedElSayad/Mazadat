package com.example.mazadat.view.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

import com.example.mazadat.R;


public class DialogDone {
    TextView sucessMessage;
    Handler handler;
    public void showDialog(final Activity activity, String message) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_done);
        dialog.setCanceledOnTouchOutside(true);
        sucessMessage = (TextView) dialog.findViewById(R.id.sucess_message);
        sucessMessage.setText(message);
        handler = new Handler();
        Runnable r = new Runnable() {
            public void run() {
                dialog.dismiss();

            }
        };
        handler.postDelayed(r, 3000);
        dialog.show();
    }
}
