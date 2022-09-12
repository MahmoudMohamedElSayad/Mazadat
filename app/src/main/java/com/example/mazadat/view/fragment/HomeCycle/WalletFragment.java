package com.example.mazadat.view.fragment.HomeCycle;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar;
import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazadat.R;
import com.example.mazadat.adapter.WalletAdapter;
import com.example.mazadat.utils.ChangeMenuIcon;
import com.example.mazadat.view.activity.HomeCycleActivity;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class WalletFragment extends BaseFragment implements ChangeMenuIcon {
    NavController navController;
    @BindView(R.id.back_image)
    ImageView backImage;
    private GridLayoutManager gLayout;
    @BindView(R.id.wallet_fragment_available_balance_tv)
    TextView walletFragmentAvailableBalanceTv;
    @BindView(R.id.wallet_fragment_contact_us_btu)
    Button walletFragmentContactUsBtu;
    @BindView(R.id.wallet_fragment_all_physical_transactions_Rv)
    RecyclerView walletFragmentAllPhysicalTransactionsRv;
    WalletAdapter walletAdapter;
    ArrayList<String> walletList = new ArrayList<>();

    public WalletFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_wallet, container, false);
        ButterKnife.bind(this, root);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        initWalletRv();
        return root;
    }

    private void initWalletRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        walletFragmentAllPhysicalTransactionsRv.setLayoutManager(gLayout);
        walletAdapter = new WalletAdapter(walletList, getActivity(), getContext(), navController);
        walletFragmentAllPhysicalTransactionsRv.setAdapter(walletAdapter);
    }



    @OnClick({R.id.back_image, R.id.wallet_fragment_contact_us_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_image:
                ((HomeCycleActivity) getActivity()).SetToolBarHeaderBlack2(this::changeMenuIcon);
                break;
            case R.id.wallet_fragment_contact_us_btu:
                navController.navigate(R.id.contactUsFragment);
                break;
        }
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