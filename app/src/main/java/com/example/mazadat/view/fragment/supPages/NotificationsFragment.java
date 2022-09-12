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
import com.example.mazadat.adapter.NotificationsAdapter;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class NotificationsFragment extends BaseFragment {

    NavController navController;
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_notifications_recycle_view)
    RecyclerView fragmentNotificationsRecycleView;
    private GridLayoutManager gLayout;
    ArrayList<String> notificationsList = new ArrayList<>();
    NotificationsAdapter allNotificationsAdapter;

    public NotificationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_notifications2, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initNotificationsRv();
        return root;
    }

    private void initNotificationsRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        fragmentNotificationsRecycleView.setLayoutManager(gLayout);
        allNotificationsAdapter = new NotificationsAdapter(notificationsList, getActivity(), getContext(), navController);
        fragmentNotificationsRecycleView.setAdapter(allNotificationsAdapter);
    }

    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}