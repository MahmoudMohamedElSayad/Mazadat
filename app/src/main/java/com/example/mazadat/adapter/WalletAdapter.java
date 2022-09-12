package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class WalletAdapter extends RecyclerView.Adapter<WalletAdapter.WalletViewHolder> {
    List<String> walletList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public WalletAdapter(List<String> walletList, Activity activity, Context context, NavController navController) {
        this.walletList = walletList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;

    }

    @NonNull
    @Override
    public WalletViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_wallet_item, null, false);
        WalletViewHolder profileViewHolder = new WalletViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull WalletViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(WalletViewHolder holder, int position) {

    }

    private void setData(WalletViewHolder holder, int position) {
        if (position%2!=0){
            holder.cardWalletStatusTv.setText(context.getResources().getText(R.string.pall));
            holder.cardWalletStatusTv.setBackground(context.getResources().getDrawable(R.drawable.red_shape));
            holder.cardWalletPriceTv.setTextColor(activity.getResources().getColor(R.color.red_F44040));
        }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class WalletViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_wallet_price_tv)
        TextView cardWalletPriceTv;
        @BindView(R.id.card_wallet_date_tv)
        TextView cardWalletDateTv;
        @BindView(R.id.card_wallet_details_tv)
        TextView cardWalletDetailsTv;
        @BindView(R.id.card_wallet_status_tv)
        TextView cardWalletStatusTv;
        @BindView(R.id.card_parent)
        CardView cardParent;
        private View view;

        public WalletViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
