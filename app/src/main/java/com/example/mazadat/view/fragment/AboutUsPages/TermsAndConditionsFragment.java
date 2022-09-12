package com.example.mazadat.view.fragment.AboutUsPages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class TermsAndConditionsFragment extends BaseFragment {
    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_terms_and_condition_main_tv)
    TextView fragmentTermsAndConditionMainTv;
    @BindView(R.id.fragment_faq_sr_refresh)
    SwipeRefreshLayout fragmentFaqSrRefresh;
    @BindView(R.id.no_wifi)
    LinearLayout noWifi;
    @BindView(R.id.server_error_action)
    Button serverErrorAction;
    @BindView(R.id.server_error)
    LinearLayout serverError;

    public TermsAndConditionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_terms_and_conditions, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        return root;
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}