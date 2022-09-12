package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class AllCautionsAdapter extends RecyclerView.Adapter<AllCautionsAdapter.AllCautionsViewHolder> {
    List<String> allCautionsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    private CountDownTimer countDownTimer;
    public AllCautionsAdapter(List<String> allCautionsList, Activity activity, Context context, NavController navController) {
        this.allCautionsList = allCautionsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;
    }

    @NonNull
    @Override
    public AllCautionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_all_cautions_item, null, false);
        AllCautionsViewHolder profileViewHolder = new AllCautionsViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull AllCautionsViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);
    }

    private void setAction(AllCautionsViewHolder holder, int position) {
        holder.cardAllCautionItemShowDetailsBtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.cautionDetailsFragment);
            }
        });
    }

    private void setData(AllCautionsViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.cardAllCautionsItemGoOnCautions.setVisibility(View.VISIBLE);
            holder.cardAllCautionsItemFinishCautions.setVisibility(View.GONE);
            holder.cautionStatusTv.setBackground(activity.getResources().getDrawable(R.drawable.sup_blue_shape));
            holder.cautionStatusTv.setText(activity.getResources().getText(R.string.Auction_in_progress));
            holder.cardAllCautionsItemCautionStatusTv.setText(activity.getResources().getString(R.string.Remaining_until_the_end_of_the_auction));
        } else if (position % 3 == 0) {
            holder.cardAllCautionWillStartCautionLayout.setVisibility(View.VISIBLE);
            holder.cautionStatusTv.setBackground(activity.getResources().getDrawable(R.drawable.sup_blue_shape));
            holder.cautionStatusTv.setText(activity.getResources().getText(R.string.Upcoming_auction));
            holder.cardAllCautionsItemCautionStatusTv.setText(activity.getResources().getString(R.string.The_auction_will_start_on));
        } else {
            holder.cardAllCautionsItemGoOnCautions.setVisibility(View.GONE);
            holder.cardAllCautionsItemFinishCautions.setVisibility(View.VISIBLE);
            holder.cautionStatusTv.setBackground(activity.getResources().getDrawable(R.drawable.sup_brown_shape));
            holder.cautionStatusTv.setText(activity.getResources().getText(R.string.Auction_finished));
            holder.cardAllCautionsItemCautionStatusTv.setText(activity.getResources().getString(R.string.Auction_has_ended));
        }
        CountDownTimer countDownTimer = new CountDownTimer(86407000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String timeLeftDay = String.format(Locale.ENGLISH, "%02d", TimeUnit.HOURS.toDays(TimeUnit.MILLISECONDS.toHours(millisUntilFinished)));
                String timeLeftHours = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toHours(millisUntilFinished) -
                        TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(millisUntilFinished))));
                String timeLeftMinutes = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) -
                        TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millisUntilFinished))));
                String timeLeftSeconds = String.format(Locale.ENGLISH, "%02d", (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                holder.cardAllCautionItemDayTv.setText(timeLeftDay);
                holder.cardAllCautionItemClockTv.setText(timeLeftHours);
                holder.cardAllCautionItemMinuteTv.setText(timeLeftMinutes);
                holder.cardAllCautionItemSecondsTv.setText(timeLeftSeconds);
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

    class AllCautionsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_all_cautions_item_go_on_cautions)
        LinearLayout cardAllCautionsItemGoOnCautions;
        @BindView(R.id.card_all_cautions_item_finish_cautions)
        LinearLayout cardAllCautionsItemFinishCautions;
        @BindView(R.id.card_all_cautions_item_caution_status_tv)
        TextView cardAllCautionsItemCautionStatusTv;
        @BindView(R.id.card_all_caution_item_show_details_btu)
        TextView cardAllCautionItemShowDetailsBtu;
        @BindView(R.id.linear_parent)
        LinearLayout linearParent;
        @BindView(R.id.card_parent)
        CardView cardParent;
        @BindView(R.id.caution_status_tv)
        TextView cautionStatusTv;
        @BindView(R.id.card_all_caution_will_start_caution_layout)
        LinearLayout cardAllCautionWillStartCautionLayout;
        @BindView(R.id.card_all_caution_item_day_tv)
        TextView cardAllCautionItemDayTv;
        @BindView(R.id.card_all_caution_item_clock_tv)
        TextView cardAllCautionItemClockTv;
        @BindView(R.id.card_all_caution_item_minute_tv)
        TextView cardAllCautionItemMinuteTv;
        @BindView(R.id.card_all_caution_item_seconds_tv)
        TextView cardAllCautionItemSecondsTv;
        private View view;

        public AllCautionsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
