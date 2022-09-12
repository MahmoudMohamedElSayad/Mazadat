package com.example.mazadat.view.fragment.supPages;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.adapter.AllCautionsAdapter;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchResultsFragment extends BaseFragment {
    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_result_search_Et)
    AutoCompleteTextView fragmentResultSearchEt;
    @BindView(R.id.item_name)
    TextView itemName;
    @BindView(R.id.fragment_search_results_Rv)
    RecyclerView fragmentSearchResultsRv;
    private List<String> searchResultList = new ArrayList<>();
    private GridLayoutManager gLayout;
    AllCautionsAdapter allCautionsAdapter;
    public SearchResultsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_search_results, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initSearchResultsRv();
        return root;
    }

    private void initSearchResultsRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        fragmentSearchResultsRv.setLayoutManager(gLayout);
        allCautionsAdapter = new AllCautionsAdapter(searchResultList, getActivity(), getContext(), navController);
        fragmentSearchResultsRv.setAdapter(allCautionsAdapter);
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}