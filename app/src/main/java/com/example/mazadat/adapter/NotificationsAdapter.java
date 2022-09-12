package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder> {
    List<String> notificationsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public NotificationsAdapter(List<String> notificationsList, Activity activity, Context context, NavController navController) {
        this.notificationsList = notificationsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;

    }

    @NonNull
    @Override
    public NotificationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_notifications_item, null, false);
        NotificationsViewHolder profileViewHolder = new NotificationsViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull NotificationsViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(NotificationsViewHolder holder, int position) {

    }

    private void setData(NotificationsViewHolder holder, int position) {
        if (position % 2 == 0) {
            holder.cardviewLayout.setBackground(activity.getResources().getDrawable(R.drawable.gradient_blue_color));
        }

    }

    @Override
    public int getItemCount() {
        return 16;
    }

    class NotificationsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_item_image_user_notification)
        CircleImageView cardItemImageUserNotification;
        @BindView(R.id.cardview_notification_body_tv)
        TextView cardviewNotificationBodyTv;
        @BindView(R.id.card_notification_date_tv)
        TextView cardNotificationDateTv;
        @BindView(R.id.cardview_layout)
        LinearLayout cardviewLayout;
        @BindView(R.id.card_parent)
        CardView cardParent;
        private View view;

        public NotificationsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
