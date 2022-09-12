package com.example.mazadat.view.fragment.supPages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.mazadat.R;
import com.example.mazadat.view.dialogs.DialogDone;
import com.example.mazadat.view.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CautionShareFragment extends BaseFragment {
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.share_btu)
    ImageView shareBtu;
    @BindView(R.id.fragment_caution_details_show_records_btu)
    TextView fragmentCautionDetailsShowRecordsBtu;
    NavController navController;
    @BindView(R.id.fragment_caution_details_share_in_cautions_btu)
    Button fragmentCautionDetailsShareInCautionsBtu;
    public CautionShareFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_caution_share, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        ButterKnife.bind(this, root);
        return root;
    }

    @OnClick({R.id.back_btu, R.id.share_btu, R.id.fragment_caution_details_show_records_btu,
            R.id.fragment_caution_details_share_in_cautions_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btu:
                super.onBack();
                break;
            case R.id.share_btu:

                break;
            case R.id.fragment_caution_details_show_records_btu:
                navController.navigate(R.id.cautionRecordsFragment);
                break;
            case R.id.fragment_caution_details_share_in_cautions_btu:
                final DialogDone dialog = new DialogDone();
                dialog.showDialog(getActivity(), getActivity().getString(R.string.Your_bid_has_been_successfully_added));
                break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        setLightStatusBar2(getActivity());
    }
}