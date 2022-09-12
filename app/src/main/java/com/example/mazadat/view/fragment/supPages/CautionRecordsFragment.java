package com.example.mazadat.view.fragment.supPages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.adapter.CautionsRecordsAdapter;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CautionRecordsFragment extends BaseFragment {
    NavController navController;

    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_cautions_records_recycle_view)
    RecyclerView fragmentCautionsRecordsRecycleView;
    private GridLayoutManager gLayout;
    CautionsRecordsAdapter cautionsRecordsAdapter;
    ArrayList<String> cautionsRecordsList = new ArrayList<>();

    public CautionRecordsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_caution_records, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initCautionsRecordsRv();
        return root;
    }

    private void initCautionsRecordsRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        fragmentCautionsRecordsRecycleView.setLayoutManager(gLayout);
        cautionsRecordsAdapter = new CautionsRecordsAdapter(cautionsRecordsList, getActivity(), getContext(), navController);
        fragmentCautionsRecordsRecycleView.setAdapter(cautionsRecordsAdapter);
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}