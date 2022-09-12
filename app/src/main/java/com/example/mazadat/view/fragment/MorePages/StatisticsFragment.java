package com.example.mazadat.view.fragment.MorePages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;


public class StatisticsFragment extends BaseFragment {


    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_statistic_number_of_auctions_tv)
    TextView fragmentStatisticNumberOfAuctionsTv;
    @BindView(R.id.chart)
    PieChartView chart;
    List pieData = new ArrayList<>();

    public StatisticsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_statistics, container, false);
        ButterKnife.bind(this, root);
        setLightStatusBar(root, getActivity());
        initPertChart();
        return root;
    }

    private void initPertChart() {
        pieData.clear();
        int containerCount = 0;
        pieData.add(new SliceValue(200, getActivity().getResources().getColor(R.color.app_color)).setLabel( "200"));
        pieData.add(new SliceValue(100, getActivity().getResources().getColor(R.color.red_E55151)).setLabel( "100"));
        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(10);
        pieChartData.setHasCenterCircle(true).setCenterText1("").setCenterText1FontSize(10).setCenterText1Color(Color.parseColor("#0097A7"));
        chart.setPieChartData(pieChartData);
        chart.setChartRotationEnabled(false);
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}