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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.adapter.NewsAdapter;
import com.example.mazadat.adapter.NotificationsAdapter;
import com.example.mazadat.adapter.WillFinishCautionsAdapter;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsDetailsFragment extends BaseFragment {
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_news_details_title_name_tv)
    TextView fragmentNewsDetailsTitleNameTv;
    @BindView(R.id.fragment_news_details_image_view)
    ImageView fragmentNewsDetailsImageView;
    @BindView(R.id.fragment_news_details_description_tv)
    TextView fragmentNewsDetailsDescriptionTv;
    @BindView(R.id.fragment_news_details_related_news_Rv)
    RecyclerView fragmentNewsDetailsRelatedNewsRv;
    NavController navController;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    NewsAdapter newsAdapter;
    ArrayList<String> relatedNewsList = new ArrayList<>();
    public NewsDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_news_details, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initRelatedNewsRv();
        return root;
    }

    private void initRelatedNewsRv() {
        recyclerViewLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        fragmentNewsDetailsRelatedNewsRv.setLayoutManager(recyclerViewLayoutManager);
        newsAdapter = new NewsAdapter(relatedNewsList, getActivity(), getContext(), navController,"relatedNews");
        fragmentNewsDetailsRelatedNewsRv.setAdapter(newsAdapter);
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}