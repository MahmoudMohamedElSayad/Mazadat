package com.example.mazadat.view.fragment.userCycle;

import static com.example.mazadat.utils.HelperMethod.replaceFragmentWithAnimation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ForgetPasswordFragment extends BaseFragment {


    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_forget_password_phone_edit)
    TextInputEditText fragmentForgetPasswordPhoneEdit;
    @BindView(R.id.input_layout)
    TextInputLayout inputLayout;
    @BindView(R.id.fragment_forget_password_send_btu)
    Button fragmentForgetPasswordSendBtu;
    @BindView(R.id.scroll_view)
    ScrollView scrollView;

    public ForgetPasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_forget_password, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @OnClick({R.id.back_btu, R.id.fragment_forget_password_send_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_forget_password_send_btu:
                replaceFragmentWithAnimation(getActivity().getSupportFragmentManager(), R.id.user_frame, new VerificationCodeFragment(), "l");

                break;
        }
    }
}