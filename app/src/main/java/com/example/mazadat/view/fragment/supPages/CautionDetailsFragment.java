package com.example.mazadat.view.fragment.supPages;


import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mazadat.R;
import com.example.mazadat.adapter.GellaryShowImageAdapter;
import com.example.mazadat.view.dialogs.DialogPayballMoney;
import com.example.mazadat.view.fragment.BaseFragment;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CautionDetailsFragment extends BaseFragment {

    NavController navController;
    @BindView(R.id.fragment_caution_details_gellary_images_rv)
    RecyclerView fragmentCautionDetailsGellaryImagesRv;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    GellaryShowImageAdapter gellaryShowImageAdapter;
    @BindView(R.id.caution_details_fragment_image_caution_image)
    ImageView cautionDetailsFragmentImageCautionImage;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_caution_details_caution_status_tv)
    TextView fragmentCautionDetailsCautionStatusTv;
    @BindView(R.id.fragment_caution_details_day_tv)
    TextView fragmentCautionDetailsDayTv;
    @BindView(R.id.fragment_caution_details_clock_tv)
    TextView fragmentCautionDetailsClockTv;
    @BindView(R.id.fragment_caution_details_minute_tv)
    TextView fragmentCautionDetailsMinuteTv;
    @BindView(R.id.fragment_caution_details_second_tv)
    TextView fragmentCautionDetailsSecondTv;
    @BindView(R.id.fragment_caution_details_text_details_tv)
    TextView fragmentCautionDetailsTextDetailsTv;
    @BindView(R.id.fragment_caution_details_arrow_image_caution_btu1)
    ImageView fragmentCautionDetailsArrowImageCautionBtu1;
    @BindView(R.id.fragment_caution_details_caution_btu)
    LinearLayout fragmentCautionDetailsCautionBtu;
    @BindView(R.id.fragment_caution_details_show_records_btu)
    TextView fragmentCautionDetailsShowRecordsBtu;
    @BindView(R.id.caution_details_layout_shape)
    LinearLayout cautionDetailsLayoutShape;
    @BindView(R.id.fragment_client_details_layout_parent1)
    LinearLayout fragmentClientDetailsLayoutParent1;
    @BindView(R.id.fragment_caution_details_arrow_image_caution_btu2)
    ImageView fragmentCautionDetailsArrowImageCautionBtu2;
    @BindView(R.id.fragment_caution_details_el_ean_details_btu2)
    LinearLayout fragmentCautionDetailsElEanDetailsBtu2;
    @BindView(R.id.fragment_client_details_layout_parent2)
    LinearLayout fragmentClientDetailsLayoutParent2;
    @BindView(R.id.fragment_caution_details_arrow_image_caution_btu3)
    ImageView fragmentCautionDetailsArrowImageCautionBtu3;
    @BindView(R.id.fragment_caution_details_el_ean_properties_btu3)
    LinearLayout fragmentCautionDetailsElEanPropertiesBtu3;
    @BindView(R.id.fragment_client_details_layout_parent3)
    LinearLayout fragmentClientDetailsLayoutParent3;
    @BindView(R.id.fragment_caution_details_arrow_image_caution_btu4)
    ImageView fragmentCautionDetailsArrowImageCautionBtu4;
    @BindView(R.id.fragment_caution_details_attachments_btu3)
    LinearLayout fragmentCautionDetailsAttachmentsBtu3;
    @BindView(R.id.fragment_client_details_layout_parent4)
    LinearLayout fragmentClientDetailsLayoutParent4;
    @BindView(R.id.fragment_orders_details_container_image_view)
    RoundedImageView fragmentOrdersDetailsContainerImageView;
    @BindView(R.id.caution_details_layout_shape2)
    LinearLayout cautionDetailsLayoutShape2;
    @BindView(R.id.caution_details_layout_shape3)
    LinearLayout cautionDetailsLayoutShape3;
    @BindView(R.id.caution_details_layout_shape4)
    LinearLayout cautionDetailsLayoutShape4;
    @BindView(R.id.fragment_caution_details_share_in_cautions_btu)
    Button fragmentCautionDetailsShareInCautionsBtu;
    @BindView(R.id.fragment_caution_details_count_cautions_tv)
    TextView fragmentCautionDetailsCountCautionsTv;
    @BindView(R.id.fragment_caution_details_number_cautions_tv)
    TextView fragmentCautionDetailsNumberCautionsTv;
    @BindView(R.id.fragment_caution_details_price_cautions_tv)
    TextView fragmentCautionDetailsPriceCautionsTv;
    @BindView(R.id.fragment_caution_details_meter_price_tv)
    TextView fragmentCautionDetailsMeterPriceTv;
    @BindView(R.id.fragment_caution_details_more_price_tv)
    TextView fragmentCautionDetailsMorePriceTv;
    @BindView(R.id.fragment_caution_details_quest_value_tv)
    TextView fragmentCautionDetailsQuestValueTv;
    @BindView(R.id.fragment_caution_details_added_tax_value_tv)
    TextView fragmentCautionDetailsAddedTaxValueTv;
    @BindView(R.id.fragment_caution_details_start_caution_date_tv)
    TextView fragmentCautionDetailsStartCautionDateTv;
    @BindView(R.id.fragment_caution_details_end_caution_date_tv)
    TextView fragmentCautionDetailsEndCautionDateTv;
    @BindView(R.id.fragment_caution_details_opening_price_tv)
    TextView fragmentCautionDetailsOpeningPriceTv;
    @BindView(R.id.fragment_caution_details_insurance_amount_tv)
    TextView fragmentCautionDetailsInsuranceAmountTv;
    @BindView(R.id.fragment_caution_details_eye_type_tv)
    TextView fragmentCautionDetailsEyeTypeTv;
    @BindView(R.id.fragment_caution_details_Area_m_tv)
    TextView fragmentCautionDetailsAreaMTv;
    @BindView(R.id.fragment_caution_details_Region_tv)
    TextView fragmentCautionDetailsRegionTv;
    @BindView(R.id.fragment_caution_details_City_tv)
    TextView fragmentCautionDetailsCityTv;
    @BindView(R.id.fragment_caution_details_Entity_tv)
    TextView fragmentCautionDetailsEntityTv;
    @BindView(R.id.fragment_caution_details_North_tv)
    TextView fragmentCautionDetailsNorthTv;
    @BindView(R.id.fragment_caution_details_south_tv)
    TextView fragmentCautionDetailsSouthTv;
    @BindView(R.id.fragment_caution_details_East_tv)
    TextView fragmentCautionDetailsEastTv;
    @BindView(R.id.fragment_caution_details_West_tv)
    TextView fragmentCautionDetailsWestTv;
    @BindView(R.id.fragment_caution_details_Number_of_bedrooms_tv)
    TextView fragmentCautionDetailsNumberOfBedroomsTv;
    @BindView(R.id.fragment_caution_details_Number_of_halls_tv)
    TextView fragmentCautionDetailsNumberOfHallsTv;
    @BindView(R.id.fragment_caution_details_Number_of_toilets_tv)
    TextView fragmentCautionDetailsNumberOfToiletsTv;
    private List<String> allGellaryImagesList = new ArrayList<>();

    public CautionDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_caution_details, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        ButterKnife.bind(this, root);

        initGalarryRv();
        return root;
    }

    private void initGalarryRv() {
        recyclerViewLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        fragmentCautionDetailsGellaryImagesRv.setLayoutManager(recyclerViewLayoutManager);
        gellaryShowImageAdapter = new GellaryShowImageAdapter(allGellaryImagesList, getActivity(), getContext(), navController);
        fragmentCautionDetailsGellaryImagesRv.setAdapter(gellaryShowImageAdapter);
    }

    @OnClick({R.id.back_btu, R.id.fragment_caution_details_caution_btu,
            R.id.fragment_caution_details_el_ean_details_btu2, R.id.fragment_caution_details_el_ean_properties_btu3,
            R.id.fragment_caution_details_attachments_btu3, R.id.fragment_caution_details_share_in_cautions_btu, R.id.fragment_caution_details_show_records_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_caution_details_caution_btu:
                if (cautionDetailsLayoutShape.getVisibility() == View.GONE) {
                    fragmentCautionDetailsArrowImageCautionBtu1.animate().rotation(180).start();
                    openLayout(cautionDetailsLayoutShape, fragmentClientDetailsLayoutParent4, fragmentCautionDetailsCautionBtu);
                } else {
                    fragmentCautionDetailsArrowImageCautionBtu1.animate().rotation(360).start();
                    closeLayout(cautionDetailsLayoutShape, dp2px(50));
                }

                break;
            case R.id.fragment_caution_details_el_ean_details_btu2:
                if (cautionDetailsLayoutShape2.getVisibility() == View.GONE) {
                    fragmentCautionDetailsArrowImageCautionBtu2.animate().rotation(180).start();
                    openLayout(cautionDetailsLayoutShape2, fragmentClientDetailsLayoutParent4, fragmentCautionDetailsElEanDetailsBtu2);
                } else {
                    fragmentCautionDetailsArrowImageCautionBtu2.animate().rotation(360).start();
                    closeLayout(cautionDetailsLayoutShape2, dp2px(50));
                }
                break;
            case R.id.fragment_caution_details_el_ean_properties_btu3:
                if (cautionDetailsLayoutShape3.getVisibility() == View.GONE) {
                    fragmentCautionDetailsArrowImageCautionBtu3.animate().rotation(180).start();
                    openLayout(cautionDetailsLayoutShape3, fragmentClientDetailsLayoutParent4, fragmentCautionDetailsElEanPropertiesBtu3);
                } else {
                    fragmentCautionDetailsArrowImageCautionBtu3.animate().rotation(360).start();
                    closeLayout(cautionDetailsLayoutShape3, dp2px(50));
                }
                break;
            case R.id.fragment_caution_details_attachments_btu3:
                if (cautionDetailsLayoutShape4.getVisibility() == View.GONE) {
                    fragmentCautionDetailsArrowImageCautionBtu4.animate().rotation(180).start();
                    openLayout(cautionDetailsLayoutShape4, fragmentClientDetailsLayoutParent4, fragmentCautionDetailsAttachmentsBtu3);
                } else {
                    fragmentCautionDetailsArrowImageCautionBtu4.animate().rotation(360).start();
                    closeLayout(cautionDetailsLayoutShape4, dp2px(50));
                }
                break;
            case R.id.fragment_caution_details_share_in_cautions_btu:
//                navController.navigate(R.id.cautionShareFragment);
                final DialogPayballMoney dialogPayballMoney = new DialogPayballMoney(getActivity(), navController);
                dialogPayballMoney.show(getActivity().getSupportFragmentManager(), "example");
                break;
            case R.id.fragment_caution_details_show_records_btu:
                navController.navigate(R.id.cautionRecordsFragment);
                break;
        }
    }

    private void openLayout(LinearLayout linearLayout1, LinearLayout parentLayout, LinearLayout clickLayout) {
        int v = (linearLayout1.getVisibility() == View.GONE) ? linearLayout1.VISIBLE : linearLayout1.GONE;
        if (linearLayout1.getVisibility() == View.GONE) {
            clickLayout.setEnabled(false);
            parentLayout.measure(View.MeasureSpec.makeMeasureSpec(parentLayout.getHeight(), View.MeasureSpec.EXACTLY), View.MeasureSpec.UNSPECIFIED);
            linearLayout1.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            final int targetHeight = linearLayout1.getMeasuredHeight();
            ValueAnimator anim = ValueAnimator.ofInt(linearLayout1.getMeasuredHeight(), targetHeight);
            anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    linearLayout1.setVisibility(v);
                    int val = (Integer) valueAnimator.getAnimatedValue();
                    ViewGroup.LayoutParams layoutParams = linearLayout1.getLayoutParams();
                    layoutParams.height = (int) (targetHeight * valueAnimator.getAnimatedFraction());
                    linearLayout1.setLayoutParams(layoutParams);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                        }

                    }, 600);

                }
            });
            anim.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    // At the end of animation, set the height to wrap content
                    // This fix is for long views that are not shown on screen

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            clickLayout.setEnabled(true);
                        }

                    }, 200);


                }
            });
            anim.setDuration(600);
            anim.start();
        }
    }

    public static void closeLayout(LinearLayout linearLayout1, int hight) {
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

                }, 450);

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
        final float scale = this.getResources().getDisplayMetrics().density;
        Log.d("scale", "" + scale);
        return (int) (dp * scale + 0.5f);
    }

    @Override
    public void onStart() {
        super.onStart();
        setLightStatusBar2(getActivity());
    }
}