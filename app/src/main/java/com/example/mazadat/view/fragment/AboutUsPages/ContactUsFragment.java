package com.example.mazadat.view.fragment.AboutUsPages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.mazadat.R;
import com.example.mazadat.view.dialogs.DialogDone;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactUsFragment extends BaseFragment {
    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_contact_us_name_edit)
    TextInputEditText fragmentContactUsNameEdit;
    @BindView(R.id.fragment_update_personal_data_name_input_layout)
    TextInputLayout fragmentUpdatePersonalDataNameInputLayout;
    @BindView(R.id.fragment_contact_us_phone_edit)
    TextInputEditText fragmentContactUsPhoneEdit;
    @BindView(R.id.fragment_update_personal_data_phone_input_layout)
    TextInputLayout fragmentUpdatePersonalDataPhoneInputLayout;
    @BindView(R.id.fragment_contact_us_message_edit)
    TextInputEditText fragmentContactUsMessageEdit;
    @BindView(R.id.fragment_contact_us_send_problem_btu)
    Button fragmentContactUsSendProblemBtu;
    @BindView(R.id.fragment_contact_us_send_call_phone_btu)
    TextView fragmentContactUsSendCallPhoneBtu;
    @BindView(R.id.fragment_contact_us_call_whats_btu)
    TextView fragmentContactUsCallWhatsBtu;

    public ContactUsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_contact_us, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        return root;
    }

    @OnClick({R.id.back_btu, R.id.fragment_contact_us_send_problem_btu, R.id.fragment_contact_us_send_call_phone_btu, R.id.fragment_contact_us_call_whats_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_contact_us_send_problem_btu:
                final DialogDone dialog = new DialogDone();
                dialog.showDialog(getActivity(), getActivity().getString(R.string.Your_message_was_sent_successfully));
                break;
            case R.id.fragment_contact_us_send_call_phone_btu:
                break;
            case R.id.fragment_contact_us_call_whats_btu:
                break;
        }
    }
}