package com.example.mazadat.view.fragment.HomeCycle;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mazadat.R;
import com.example.mazadat.adapter.AllCautionsAdapter;
import com.example.mazadat.adapter.WillFinishCautionsAdapter;
import com.example.mazadat.utils.ChangeMenuIcon;
import com.example.mazadat.utils.TryAgainOncall;
import com.example.mazadat.view.activity.HomeCycleActivity;
import com.example.mazadat.view.dialogs.DialogSearchCautions;
import com.example.mazadat.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment implements TryAgainOncall, ChangeMenuIcon {
    NavController navController;
    @BindView(R.id.fragment_home_update_profile_btu)
    FrameLayout fragmentHomeUpdateProfileBtu;
    @BindView(R.id.fragment_fillter_model_car_linear)
    LinearLayout fragmentFillterModelCarLinear;
    @BindView(R.id.fragment_home_notifications_btu)
    FrameLayout fragmentHomeNotificationsBtu;
    @BindView(R.id.fragment_home_frame_welcome_layout)
    FrameLayout fragmentHomeFrameWelcomeLayout;
    @BindView(R.id.fragment_home_search_Et)
    AutoCompleteTextView fragmentHomeSearchEt;
    @BindView(R.id.item_name)
    TextView itemName;
    @BindView(R.id.fragment_caution_filter_btu)
    LinearLayout fragmentCautionFilterBtu;
    @BindView(R.id.fragment_home_will_finish_cautions_recycle)
    RecyclerView fragmentHomeWillFinishCautionsRecycle;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    WillFinishCautionsAdapter willFinishCautionsAdapter;
    @BindView(R.id.fragment_home_all_cautions_recycle)
    RecyclerView fragmentHomeAllCautionsRecycle;
    @BindView(R.id.home_fragment_notifications_btu)
    ImageView homeFragmentNotificationsBtu;
    @BindView(R.id.back_image)
    ImageView backImage;
    @BindView(R.id.home_parent_layout)
    LinearLayout homeParentLayout;
    private List<String> willFinishCautionsList = new ArrayList<>();
    private List<String> allCautionsList = new ArrayList<>();
    private GridLayoutManager gLayout;
    AllCautionsAdapter allCautionsAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        ButterKnife.bind(this, root);
        initWillFinishCautionsRv();
        initAllCautionsRv();
        return root;
    }

    private void initAllCautionsRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        fragmentHomeAllCautionsRecycle.setLayoutManager(gLayout);
        allCautionsAdapter = new AllCautionsAdapter(allCautionsList, getActivity(), getContext(), navController);
        fragmentHomeAllCautionsRecycle.setAdapter(allCautionsAdapter);
    }

    private void initWillFinishCautionsRv() {
        recyclerViewLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        fragmentHomeWillFinishCautionsRecycle.setLayoutManager(recyclerViewLayoutManager);
        willFinishCautionsAdapter = new WillFinishCautionsAdapter(willFinishCautionsList, getActivity(), getContext(), navController);
        fragmentHomeWillFinishCautionsRecycle.setAdapter(willFinishCautionsAdapter);
    }

    @Override
    public void tryAgainCall(String type) {

    }

    @Override
    public void onStart() {
        super.onStart();
        setLightStatusBar2(getActivity());
    }

    @OnClick({R.id.fragment_home_notifications_btu, R.id.fragment_caution_filter_btu,
            R.id.home_fragment_notifications_btu, R.id.fragment_home_search_Et,
            R.id.back_image,R.id.home_parent_layout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_home_notifications_btu:
                break;
            case R.id.fragment_caution_filter_btu:
                final DialogSearchCautions dialogSearchCautions = new DialogSearchCautions(getActivity());
                dialogSearchCautions.show(getActivity().getSupportFragmentManager(), "example");
                break;
            case R.id.home_fragment_notifications_btu:
                navController.navigate(R.id.notificationsFragment2);
                break;
            case R.id.fragment_home_search_Et:
                navController.navigate(R.id.searchResultsFragment);
                break;
            case R.id.back_image:
                ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);
                break;
            case R.id.home_parent_layout:
                break;
        }
    }
    @Override
    public void changeMenuIcon(int type) {
        if (type == 2) {
            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_menu_image));

        } else {
            backImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_close_image_white));
        }

    }

    @Override
    public void onBack() {

        if (((HomeCycleActivity) getActivity()).isMenuOpen()) {
            ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);
        } else {
            getActivity().finish();
        }
    }
}