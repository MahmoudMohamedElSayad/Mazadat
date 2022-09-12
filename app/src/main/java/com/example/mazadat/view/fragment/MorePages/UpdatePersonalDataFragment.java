package com.example.mazadat.view.fragment.MorePages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class UpdatePersonalDataFragment extends BaseFragment {
    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_update_personal_data_name_edit)
    TextInputEditText fragmentUpdatePersonalDataNameEdit;
    @BindView(R.id.fragment_update_personal_data_name_input_layout)
    TextInputLayout fragmentUpdatePersonalDataNameInputLayout;
    @BindView(R.id.fragment_update_personal_data_phone_edit)
    TextInputEditText fragmentUpdatePersonalDataPhoneEdit;
    @BindView(R.id.fragment_update_personal_data_phone_input_layout)
    TextInputLayout fragmentUpdatePersonalDataPhoneInputLayout;
    @BindView(R.id.fragment_update_personal_data_save_update_btu)
    Button fragmentUpdatePersonalDataSaveUpdateBtu;


    public UpdatePersonalDataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_update_personal_data, container, false);

        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        return root;
    }

    @OnClick({R.id.back_btu, R.id.fragment_update_personal_data_save_update_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_update_personal_data_save_update_btu:
                break;
        }
    }
}