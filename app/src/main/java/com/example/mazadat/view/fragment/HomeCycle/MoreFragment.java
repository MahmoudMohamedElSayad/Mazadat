package com.example.mazadat.view.fragment.HomeCycle;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;
import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.mazadat.R;
import com.example.mazadat.utils.ChangeMenuIcon;
import com.example.mazadat.view.activity.HomeCycleActivity;
import com.example.mazadat.view.fragment.BaseFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MoreFragment extends BaseFragment implements ChangeMenuIcon {
    NavController navController;
    @BindView(R.id.fragment_home_update_profile_btu)
    FrameLayout fragmentHomeUpdateProfileBtu;
    @BindView(R.id.fragment_fillter_model_car_linear)
    LinearLayout fragmentFillterModelCarLinear;
    @BindView(R.id.fragment_home_frame_welcome_layout)
    FrameLayout fragmentHomeFrameWelcomeLayout;
    @BindView(R.id.fragment_more_update_personal_data_btu)
    LinearLayout fragmentMoreUpdatePersonalDataBtu;
    @BindView(R.id.fragment_more_change_password_btu)
    LinearLayout fragmentMoreChangePasswordBtu;
    @BindView(R.id.fragment_more_my_statistics_btu)
    LinearLayout fragmentMoreMyStatisticsBtu;
    @BindView(R.id.fragment_caution_details_el_ean_details_btu2)
    LinearLayout fragmentCautionDetailsElEanDetailsBtu2;
    @BindView(R.id.fragment_more_share_app_btu)
    LinearLayout fragmentMoreShareAppBtu;
    @BindView(R.id.back_image)
    ImageView backImage;

    public MoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_more, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        return root;
    }

    @OnClick({R.id.fragment_more_update_personal_data_btu, R.id.fragment_more_change_password_btu,
            R.id.fragment_more_my_statistics_btu, R.id.fragment_more_share_app_btu,R.id.back_image})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_more_update_personal_data_btu:
                navController.navigate(R.id.updatePersonalDataFragment);
                break;
            case R.id.fragment_more_change_password_btu:
                navController.navigate(R.id.changePasswordFragment);
                break;
            case R.id.fragment_more_my_statistics_btu:
                navController.navigate(R.id.statisticsFragment);
                break;
            case R.id.fragment_more_share_app_btu:
                break;
            case R.id.back_image:
                ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);
                break;
        }
    }
    @Override
    public void changeMenuIcon(int type) {
        if (type == 2) {
            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_image));
        } else {
            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_close_image_icone));
            setLightStatusBar2(getActivity());
        }
    }
    @Override
    public void onBack() {

        if (((HomeCycleActivity) getActivity()).isMenuOpen()) {
            ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);

        } else {
           navController.navigate(R.id.homeFragment);
        }
    }
}