package com.example.mazadat.view.fragment.userCycle;

import static com.example.mazadat.utils.HelperMethod.replaceFragmentWithAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazadat.R;
import com.example.mazadat.utils.TryAgainOncall;
import com.example.mazadat.view.activity.HomeCycleActivity;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment implements TryAgainOncall {


    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_login_identify_edit)
    TextInputEditText fragmentLoginIdentifyEdit;
    @BindView(R.id.input_layout)
    TextInputLayout inputLayout;
    @BindView(R.id.fragment_login_password_edit)
    TextInputEditText fragmentLoginPasswordEdit;
    @BindView(R.id.fragment_login_forget_pass_btn)
    TextView fragmentLoginForgetPassBtn;
    @BindView(R.id.fragment_login_enter_btu)
    Button fragmentLoginEnterBtu;
    @BindView(R.id.fragment_login_register_btn)
    TextView fragmentLoginRegisterBtn;
    @BindView(R.id.scroll_view)
    ScrollView scrollView;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void tryAgainCall(String type) {

    }

    @Override
    public void onBack() {
        getActivity().finish();
    }

    @OnClick({R.id.back_btu, R.id.fragment_login_forget_pass_btn, R.id.fragment_login_enter_btu, R.id.fragment_login_register_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                getActivity().finish();
                break;
            case R.id.fragment_login_forget_pass_btn:
                replaceFragmentWithAnimation(getActivity().getSupportFragmentManager(), R.id.user_frame, new ForgetPasswordFragment(), "l");
                break;
            case R.id.fragment_login_enter_btu:
//                replaceFragmentWithAnimation(getActivity().getSupportFragmentManager(), R.id.user_frame, new StatisticsFragment(), "l");
                Intent intent = new Intent(getActivity(), HomeCycleActivity.class);
                getActivity().startActivity(intent);
                getActivity().finish();
                break;
            case R.id.fragment_login_register_btn:
                replaceFragmentWithAnimation(getActivity().getSupportFragmentManager(), R.id.user_frame, new RegisterFragment(), "l");

                break;
        }
    }
}