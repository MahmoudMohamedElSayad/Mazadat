package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.view.activity.BaseActivity;

import java.util.List;

import butterknife.ButterKnife;

public class CautionsRecordsAdapter extends RecyclerView.Adapter<CautionsRecordsAdapter.CautionsRecordsViewHolder> {
    List<String> allCautionsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public CautionsRecordsAdapter(List<String> allCautionsList, Activity activity, Context context, NavController navController) {
        this.allCautionsList = allCautionsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;

    }

    @NonNull
    @Override
    public CautionsRecordsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.caution_records_item, null, false);
        CautionsRecordsViewHolder profileViewHolder = new CautionsRecordsViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull CautionsRecordsViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(CautionsRecordsViewHolder holder, int position) {

    }

    private void setData(CautionsRecordsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class CautionsRecordsViewHolder extends RecyclerView.ViewHolder {

        private View view;

        public CautionsRecordsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
