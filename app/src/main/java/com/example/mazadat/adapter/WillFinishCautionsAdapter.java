package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mazadat.R;
import com.example.mazadat.view.activity.BaseActivity;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WillFinishCautionsAdapter extends RecyclerView.Adapter<WillFinishCautionsAdapter.WillFinViewHolder> {
    List<String> willFinishCautionsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public WillFinishCautionsAdapter(List<String> willFinishCautionsList, Activity activity, Context context, NavController navController) {
        this.willFinishCautionsList = willFinishCautionsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;

    }

    @NonNull
    @Override
    public WillFinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_will_finish_cautions_item, null, false);
        WillFinViewHolder profileViewHolder = new WillFinViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull WillFinViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);
    }
    private void setAction(WillFinViewHolder holder, int position) {
        holder.cardWillFinishCautionsShowDetailsBtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.cautionDetailsFragment);

            }
        });


    }

    private void setData(WillFinViewHolder holder, int position) {
        CountDownTimer countDownTimer = new CountDownTimer(1584700200, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String timeLeftDay = String.format(Locale.ENGLISH, "%02d", TimeUnit.HOURS.toDays(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)));
                String timeLeftHours = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toHours(millisUntilFinished) -
                        TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(millisUntilFinished))));
                String timeLeftMinutes = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) -
                        TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished))));
                String timeLeftSeconds = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                holder.cardWillFinishCautionsDayTv.setText(timeLeftDay);
                holder.cardWillFinishCautionsClockTv.setText(timeLeftHours);
                holder.cardWillFinishCautionsMinuteTv.setText(timeLeftMinutes);
                holder.cardWillFinishCautionsSecondsTv.setText(timeLeftSeconds);
            }

            @Override
            public void onFinish() {
//                onBack();
            }
        }.start();

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class WillFinViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_will_finish_cautions_day_tv)
        TextView cardWillFinishCautionsDayTv;
        @BindView(R.id.card_will_finish_cautions_clock_tv)
        TextView cardWillFinishCautionsClockTv;
        @BindView(R.id.card_will_finish_cautions_minute_tv)
        TextView cardWillFinishCautionsMinuteTv;
        @BindView(R.id.card_will_finish_cautions_seconds_tv)
        TextView cardWillFinishCautionsSecondsTv;
        @BindView(R.id.card_will_finish_cautions_image)
        ImageView cardWillFinishCautionsImage;
        @BindView(R.id.card_will_finish_cautions_status_details_tv)
        TextView cardWillFinishCautionsStatusDetailsTv;
        @BindView(R.id.card_will_finish_cautions_details_tv)
        TextView cardWillFinishCautionsDetailsTv;
        @BindView(R.id.card_will_finish_cautions_show_details_btu)
        TextView cardWillFinishCautionsShowDetailsBtu;
        @BindView(R.id.linear_parent)
        LinearLayout linearParent;
        @BindView(R.id.card_parent)
        CardView cardParent;
        private View view;

        public WillFinViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
