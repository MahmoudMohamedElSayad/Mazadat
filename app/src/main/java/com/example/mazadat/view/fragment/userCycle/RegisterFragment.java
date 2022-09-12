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
import com.example.mazadat.utils.TryAgainOncall;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterFragment extends BaseFragment implements TryAgainOncall {
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_rejester_identify_edit)
    TextInputEditText fragmentRejesterIdentifyEdit;
    @BindView(R.id.input_layout)
    TextInputLayout inputLayout;
    @BindView(R.id.fragment_rejester_birth_date_edit)
    TextInputEditText fragmentRejesterBirthDateEdit;
    @BindView(R.id.fragment_rejester_enter_btu)
    Button fragmentRejesterEnterBtu;
    @BindView(R.id.fragment_register_login_here_btn)
    TextView fragmentRegisterLoginHereBtn;
    @BindView(R.id.scroll_view)
    ScrollView scrollView;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_resister, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @Override
    public void tryAgainCall(String type) {

    }

    @OnClick({R.id.back_btu, R.id.fragment_rejester_enter_btu, R.id.fragment_register_login_here_btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_rejester_enter_btu:
                break;
            case R.id.fragment_register_login_here_btn:

                break;
        }
    }
}