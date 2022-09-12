package com.example.mazadat.view.fragment.userCycle;

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

import butterknife.BindView;
import butterknife.OnClick;


public class NewPasswordFragment extends BaseFragment {


    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_new_password_enter_new_password_password_edit)
    TextInputEditText fragmentNewPasswordEnterNewPasswordPasswordEdit;
    @BindView(R.id.fragment_new_password_new_password_password_edit)
    TextInputEditText fragmentNewPasswordNewPasswordPasswordEdit;
    @BindView(R.id.fragment_forget_password_send_btu)
    Button fragmentForgetPasswordSendBtu;
    @BindView(R.id.scroll_view)
    ScrollView scrollView;

    public NewPasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_new_password, container, false);
        return root;
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        getActivity().finish();
    }
}