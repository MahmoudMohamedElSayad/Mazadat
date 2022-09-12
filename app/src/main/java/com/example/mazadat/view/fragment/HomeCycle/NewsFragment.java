package com.example.mazadat.view.fragment.HomeCycle;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;
import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.adapter.NewsAdapter;
import com.example.mazadat.utils.ChangeMenuIcon;
import com.example.mazadat.view.activity.HomeCycleActivity;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsFragment extends BaseFragment implements ChangeMenuIcon {
    NavController navController;
    @BindView(R.id.news_fragment_all_news_Rv)
    RecyclerView newsFragmentAllNewsRv;
    @BindView(R.id.back_image)
    ImageView backImage;
    private GridLayoutManager gLayout;
    ArrayList<String> newsList = new ArrayList<>();
    NewsAdapter newsAdapter;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_news, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initNewsRv();
        return root;
    }

    private void initNewsRv() {
        gLayout = new GridLayoutManager(getContext(), 2);
        newsFragmentAllNewsRv.setLayoutManager(gLayout);
        newsAdapter = new NewsAdapter(newsList, getActivity(), getContext(), navController, "");
        newsFragmentAllNewsRv.setAdapter(newsAdapter);

    }

    @OnClick(R.id.back_image)
    public void onClick() {
        ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);
    }
    @Override
    public void changeMenuIcon(int type) {
        if (type == 2) {

            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_image));

        } else {
            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_close_image_icone));
            setLightStatusBar2(getActivity());
        }

    }
    @Override
    public void onBack() {

        if (((HomeCycleActivity) getActivity()).isMenuOpen()) {
            ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);

        } else {
            navController.navigate(R.id.homeFragment);
        }
    }
}