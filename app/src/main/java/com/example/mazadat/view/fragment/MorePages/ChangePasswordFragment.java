package com.example.mazadat.view.fragment.MorePages;

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
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ChangePasswordFragment extends BaseFragment {
    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_new_password_current_password_edit)
    TextInputEditText fragmentNewPasswordCurrentPasswordEdit;
    @BindView(R.id.fragment_new_password_new_password_edit)
    TextInputEditText fragmentNewPasswordNewPasswordEdit;
    @BindView(R.id.fragment_new_password_re_enter_new_password_edit)
    TextInputEditText fragmentNewPasswordReEnterNewPasswordEdit;
    @BindView(R.id.fragment_new_password_save_change_password_btu)
    Button fragmentNewPasswordSaveChangePasswordBtu;
    public ChangePasswordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_change_password, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        return root;
    }

    @OnClick({R.id.back_btu, R.id.fragment_new_password_save_change_password_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.fragment_new_password_save_change_password_btu:
                break;
        }
    }
}