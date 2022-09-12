package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.view.activity.BaseActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GellaryShowImageAdapter extends RecyclerView.Adapter<GellaryShowImageAdapter.GalarryImageViewHolder> {
    List<String> gallaryImageList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public GellaryShowImageAdapter(List<String> gallaryImageList, Activity activity, Context context, NavController navController) {
        this.gallaryImageList = gallaryImageList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;

    }

    @NonNull
    @Override
    public GalarryImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_all_images_gallary_item, null, false);
        GalarryImageViewHolder profileViewHolder = new GalarryImageViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull GalarryImageViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(GalarryImageViewHolder holder, int position) {


    }

    private void setData(GalarryImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class GalarryImageViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_all_images_gallary_item_image_view)
        ImageView cardAllImagesGallaryItemImageView;
        @BindView(R.id.card_parent)
        CardView cardParent;
        private View view;

        public GalarryImageViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
