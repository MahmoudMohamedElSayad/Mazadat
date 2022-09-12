package com.example.mazadat.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.utils.Text;
import com.example.mazadat.view.activity.BaseActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CommonQuestionsAdapter extends RecyclerView.Adapter<CommonQuestionsAdapter.CommonQuestionsViewHolder> {
    List<Text> commonQuestionsList;
    private BaseActivity activity;
    private Context context;
    NavController navController;
    public CommonQuestionsAdapter(List<Text> commonQuestionsList, Activity activity, Context context, NavController navController) {
        this.commonQuestionsList = commonQuestionsList;
        this.activity = (BaseActivity) activity;
        this.context = context;
        this.navController = navController;
    }

    @NonNull
    @Override
    public CommonQuestionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_common_questions_item, null, false);
        CommonQuestionsViewHolder profileViewHolder = new CommonQuestionsViewHolder(v);
        return profileViewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        return position;

    }

    @Override
    public void onBindViewHolder(@NonNull CommonQuestionsViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);

    }


    private void setAction(CommonQuestionsViewHolder holder, int position) {
        holder.cardCommonQuestionsCommonQuestionBtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.cardCommonQuestionsCommonTvLayout.getVisibility() == View.GONE) {
                    holder.cardCommonQuestionsCommonImageBtu.animate().rotation(180).start();
                    openLayout(holder.cardCommonQuestionsCommonTvLayout);
                } else {
                    holder.cardCommonQuestionsCommonImageBtu.animate().rotation(360).start();
                    closeLayout(holder.cardCommonQuestionsCommonTvLayout, dp2px(50));
                }
            }
        });

    }

    private void setData(CommonQuestionsViewHolder holder, int position) {
        holder.commonQuestionsItemQue.setText(commonQuestionsList.get(position).getText());
    }

    public static void openLayout(final View view) {
        int v = (view.getVisibility() == View.GONE) ? view.VISIBLE : view.GONE;
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getHeight(), View.MeasureSpec.EXACTLY), View.MeasureSpec.UNSPECIFIED);
        view.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final int targetHeight = view.getMeasuredHeight();
        ValueAnimator anim = ValueAnimator.ofInt(view.getMeasuredHeight(), targetHeight);
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                view.setVisibility(v);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) (targetHeight * animation.getAnimatedFraction());
                view.setLayoutParams(layoutParams);

            }
        });
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {

                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            }
        });
        anim.setDuration(300);
        anim.start();
    }


    public static void closeLayout(View linearLayout1, int hight) {
        int v = (linearLayout1.getVisibility() == View.GONE) ? linearLayout1.VISIBLE : linearLayout1.GONE;
        final int targetHeight = linearLayout1.getMeasuredHeight();
        ValueAnimator anim = ValueAnimator.ofInt(linearLayout1.getMeasuredHeight(), hight);
        anim.setInterpolator(new AccelerateInterpolator());
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int val = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = linearLayout1.getLayoutParams();
                layoutParams.height = val;
                linearLayout1.setLayoutParams(layoutParams);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        linearLayout1.setVisibility(v);
                    }

                }, 500);

            }
        });

        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                // At the end of animation, set the height to wrap content
                // This fix is for long views that are not shown on screen
                ViewGroup.LayoutParams layoutParams = linearLayout1.getLayoutParams();
                layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            }
        });
        anim.setDuration(500);
        anim.start();
    }

    public int dp2px(float dp) {
        final float scale = activity.getResources().getDisplayMetrics().density;
        Log.d("scale", "" + scale);
        return (int) (dp * scale + 0.5f);
    }

    @Override
    public int getItemCount() {
        return commonQuestionsList.size();
    }

    class CommonQuestionsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card_common_questions_common_question_btu)
        LinearLayout cardCommonQuestionsCommonQuestionBtu;
        @BindView(R.id.card_common_questions_common_tv)
        TextView cardCommonQuestionsCommonTv;
        @BindView(R.id.card_common_questions_common_image_btu)
        ImageView cardCommonQuestionsCommonImageBtu;
        @BindView(R.id.common_questions_item_que)
        TextView commonQuestionsItemQue;
        @BindView(R.id.card_common_questions_common_tv_layout)
        LinearLayout cardCommonQuestionsCommonTvLayout;
        private View view;

        public CommonQuestionsViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
