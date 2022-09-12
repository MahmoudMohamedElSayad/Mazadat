package com.example.mazadat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    List<String> newsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    String type;
    public NewsAdapter(List<String> newsList, Activity activity, Context context, NavController navController, String type) {
        this.newsList = newsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;
        this.type = type;

    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        if (type.equalsIgnoreCase("relatedNews")) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_related_news_item, null, false);
        } else {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_news_item, null, false);
        }

        NewsViewHolder profileViewHolder = new NewsViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(NewsViewHolder holder, int position) {
        holder.cardParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.newsDetailsFragment);
            }
        });

    }

    private void setData(NewsViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 16;
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.news_card_item_image_view)
        ImageView newsCardItemImageView;
        @BindView(R.id.card_news_item_tv)
        TextView cardNewsItemTv;
        @BindView(R.id.card_parent)
        CardView cardParent;
        private View view;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
