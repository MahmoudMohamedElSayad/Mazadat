package com.example.mazadat.view.fragment.AboutUsPages;

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
import com.example.mazadat.adapter.CommonQuestionsAdapter;
import com.example.mazadat.adapter.WalletAdapter;
import com.example.mazadat.utils.Text;
import com.example.mazadat.view.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CommonQuestionsFragment extends BaseFragment {
    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_common_questions_Rv)
    RecyclerView fragmentCommonQuestionsRv;
    private GridLayoutManager gLayout;
    ArrayList<Text> commonQuestionsList = new ArrayList<>();
    NavController navController;
    CommonQuestionsAdapter commonQuestionsAdapter;
    public CommonQuestionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_common_questions, container, false);
        navController = Navigation.findNavController(getActivity(), R.id.home_activity_fragment_normal);
        ButterKnife.bind(this, root);
        setLightStatusBar(root, getActivity());
        setUpActivity();
        setTextToRv();
        initCommonRv();
        return root;
    }

    private void setTextToRv() {
        commonQuestionsList.add(new Text("ما هي منصة المزايد ؟"));
        commonQuestionsList.add(new Text("في حال انتهاء المزاد ولم يصل لقيمته التقديرية هل ترسى العين على صاحب المزايدة الأعلى؟"));
        commonQuestionsList.add(new Text("ما هي مزايا المزايد ؟"));
        commonQuestionsList.add(new Text("هل عملية المزايدة في الموقع موثوقة؟"));
        commonQuestionsList.add(new Text("هل يمكن المشاركة في المزادات بدون تسجيل الدخول للمنصة؟"));
        commonQuestionsList.add(new Text(" ما هو الإجراء في حال عدم رغبة المزايد في إكمال مبلغ الشراء بعد ترسية المزاد؟ "));
        commonQuestionsList.add(new Text("هل بالإمكان الاطلاع على مجريات المزادات بدون تسجيل الدخول على المنصة؟"));
        commonQuestionsList.add(new Text("هل يوجد عدد محدد من المشاركين للبدء في عملية المزايدة؟"));
    }

    private void initCommonRv() {
        gLayout = new GridLayoutManager(getContext(), 1);
        fragmentCommonQuestionsRv.setLayoutManager(gLayout);
        commonQuestionsAdapter  = new CommonQuestionsAdapter(commonQuestionsList, getActivity(), getContext(), navController);
        fragmentCommonQuestionsRv.setAdapter(commonQuestionsAdapter);
    }


    @OnClick(R.id.back_btu)
    public void onClick() {
        super.onBack();
    }
}