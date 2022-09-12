package com.example.mazadat.view.fragment.userCycle;

import static com.example.mazadat.utils.HelperMethod.disappearKeypad;
import static com.example.mazadat.utils.HelperMethod.replaceFragmentWithAnimation;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.BaseFragment;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class VerificationCodeFragment extends BaseFragment {


    @BindView(R.id.back_btu)
    ImageView backBtu;
    @BindView(R.id.fragment_sub_category_title)
    TextView fragmentSubCategoryTitle;
    @BindView(R.id.fragment_verification_code4_circle_shape)
    TextView fragmentVerificationCode4CircleShape;
    @BindView(R.id.fragment_verification_code4_etx)
    TextInputEditText fragmentVerificationCode4Etx;
    @BindView(R.id.fragment_verification_cell_image4)
    ImageView fragmentVerificationCellImage4;
    @BindView(R.id.fragment_verification_code4_out_border_shape)
    FrameLayout fragmentVerificationCode4OutBorderShape;
    @BindView(R.id.fragment_verification_code3_circle_shape)
    TextView fragmentVerificationCode3CircleShape;
    @BindView(R.id.fragment_verification_code3_etx)
    TextInputEditText fragmentVerificationCode3Etx;
    @BindView(R.id.fragment_verification_cell_image3)
    ImageView fragmentVerificationCellImage3;
    @BindView(R.id.fragment_verification_code3_out_border_shape)
    FrameLayout fragmentVerificationCode3OutBorderShape;
    @BindView(R.id.fragment_verification_code2_circle_shape)
    TextView fragmentVerificationCode2CircleShape;
    @BindView(R.id.fragment_verification_code2_etx)
    TextInputEditText fragmentVerificationCode2Etx;
    @BindView(R.id.fragment_verification_cell_image2)
    ImageView fragmentVerificationCellImage2;
    @BindView(R.id.fragment_verification_code2_out_border_shape)
    FrameLayout fragmentVerificationCode2OutBorderShape;
    @BindView(R.id.fragment_verification_code1_circle_shape)
    TextView fragmentVerificationCode1CircleShape;
    @BindView(R.id.fragment_verification_code1_etx)
    TextInputEditText fragmentVerificationCode1Etx;
    @BindView(R.id.fragment_verification_cell_image1)
    ImageView fragmentVerificationCellImage1;
    @BindView(R.id.fragment_verification_code1_out_border_shape)
    FrameLayout fragmentVerificationCode1OutBorderShape;
    @BindView(R.id.fragment_verification_resend_code_tv_btu)
    TextView fragmentVerificationResendCodeTvBtu;
    @BindView(R.id.fragment_confirm_code_counter_layout)
    LinearLayout fragmentConfirmCodeCounterLayout;
    @BindView(R.id.fragment_verified_code_continue_btu)
    Button fragmentVerifiedCodeContinueBtu;
    @BindView(R.id.scroll_view)
    ScrollView scrollView;
    String code1, code2, code3, code4, code;
    @BindView(R.id.fragment_confirm_code_counter_down)
    LinearLayout fragmentConfirmCodeCounterDown;
    @BindView(R.id.fragment_confirm_code_counter_resend_tv)
    TextView fragmentConfirmCodeCounterResendTv;

    public VerificationCodeFragment() {
        // Required empty public constructor
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_verification_code, container, false);
        ButterKnife.bind(this, root);
        disappearKeypad(getActivity(), getView());
        init();
        return root;
    }

    private void init() {
        new CountDownTimer(TimeUnit.MINUTES.toMillis(1), 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                updateCountDownText(millisUntilFinished);
            }

            @Override
            public void onFinish() {
//                onBack();
                fragmentConfirmCodeCounterDown.setVisibility(View.GONE);
                fragmentConfirmCodeCounterLayout.setVisibility(View.VISIBLE);
            }
        }.start();
        fragmentVerificationCode1Etx.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if (!fragmentVerificationCode1Etx.getText().toString().equalsIgnoreCase("")) {
                    code1 = fragmentVerificationCode1Etx.getText().toString();
                    edieCode2();
                    fragmentVerificationCellImage1.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
                }
                // you can call or do what you want with your EditText here

                // yourEditText...
            }


            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (fragmentVerificationCode1Etx.getText().toString().equalsIgnoreCase("")) {
                    fragmentVerificationCellImage1.setBackgroundColor(getActivity().getResources().getColor(R.color.hint_ABABAB));
                } else {
                    fragmentVerificationCellImage1.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
                }
            }
        });
        fragmentVerificationCode2Etx.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                if (!fragmentVerificationCode2Etx.getText().toString().equalsIgnoreCase("")) {
                    code2 = fragmentVerificationCode2Etx.getText().toString();
                    edieCode3();
                } else {
                    fragmentVerificationCellImage2.setBackgroundColor(getActivity().getResources().getColor(R.color.hint_ABABAB));
                }

                // you can call or do what you want with your EditText here

                // yourEditText...
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (fragmentVerificationCode2Etx.getText().toString().equalsIgnoreCase("")) {
                    fragmentVerificationCellImage2.setBackgroundColor(getActivity().getResources().getColor(R.color.hint_ABABAB));
                } else {
                    fragmentVerificationCellImage2.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
                }
            }
        });
        fragmentVerificationCode3Etx.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                if (!fragmentVerificationCode3Etx.getText().toString().equalsIgnoreCase("")) {
                    code3 = fragmentVerificationCode3Etx.getText().toString();
                    edieCode4();
                } else {

                }
                // you can call or do what you want with your EditText here

                // yourEditText...
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (fragmentVerificationCode3Etx.getText().toString().equalsIgnoreCase("")) {
                    fragmentVerificationCellImage3.setBackgroundColor(getActivity().getResources().getColor(R.color.hint_ABABAB));
                } else {
                    fragmentVerificationCellImage3.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
                }
            }
        });
        fragmentVerificationCode4Etx.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (fragmentVerificationCode4Etx.getText().toString().equalsIgnoreCase("")) {
                    fragmentVerificationCellImage4.setBackgroundColor(getActivity().getResources().getColor(R.color.hint_ABABAB));
                } else {
                    fragmentVerificationCellImage4.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                code4 = fragmentVerificationCode4Etx.getText().toString();
                code = code1 + code2 + code3 + code4;

            }
        });
        changeTextOnfocus();
    }

    private void changeTextOnfocus() {
        fragmentVerificationCode1Etx.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                fragmentVerificationCode1Etx.setText("");
                fragmentVerificationCode2Etx.setText("");
                fragmentVerificationCode3Etx.setText("");
                fragmentVerificationCode4Etx.setText("");
                return false;
            }
        });
        fragmentVerificationCode2Etx.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                fragmentVerificationCode2Etx.setText("");
                fragmentVerificationCode3Etx.setText("");
                fragmentVerificationCode4Etx.setText("");
                return false;
            }
        });
        fragmentVerificationCode3Etx.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                fragmentVerificationCode3Etx.setText("");
                fragmentVerificationCode4Etx.setText("");
                return false;
            }
        });
        fragmentVerificationCode4Etx.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                fragmentVerificationCode3Etx.setText("");
                fragmentVerificationCode4Etx.setText("");
                return false;
            }
        });
    }

    private void edieCode4() {
        fragmentVerificationCode4CircleShape.setVisibility(View.GONE);
        fragmentVerificationCode4Etx.requestFocus();
        InputMethodManager imm4 = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm4.showSoftInput(fragmentVerificationCode4Etx, InputMethodManager.SHOW_IMPLICIT);
        fragmentVerificationCellImage4.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
//        fragmentVerificationCode4OutBorderShape.setBackgroundResource(R.drawable.blue_out_border_shape);

    }

    private void edieCode3() {
        fragmentVerificationCode3CircleShape.setVisibility(View.GONE);
        fragmentVerificationCode3Etx.requestFocus();
        InputMethodManager imm3 = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm3.showSoftInput(fragmentVerificationCode3Etx, InputMethodManager.SHOW_IMPLICIT);
        fragmentVerificationCellImage3.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
//        fragmentVerificationCode3OutBorderShape.setBackgroundResource(R.drawable.blue_out_border_shape);
    }

    private void edieCode2() {
        fragmentVerificationCode2CircleShape.setVisibility(View.GONE);
        fragmentVerificationCode2Etx.requestFocus();
        InputMethodManager imm2 = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm2.showSoftInput(fragmentVerificationCode2Etx, InputMethodManager.SHOW_IMPLICIT);
        fragmentVerificationCellImage2.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));
    }

    private void edieCode1() {
        fragmentVerificationCode1CircleShape.setVisibility(View.GONE);
        fragmentVerificationCode1Etx.requestFocus();
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(fragmentVerificationCode1Etx, InputMethodManager.SHOW_IMPLICIT);
        fragmentVerificationCellImage1.setBackgroundColor(getActivity().getResources().getColor(R.color.app_color));

    }

    @OnClick({R.id.back_btu, R.id.fragment_verified_code_continue_btu,
            R.id.fragment_verification_code1_circle_shape, R.id.fragment_verification_code2_circle_shape,
            R.id.fragment_verification_code3_circle_shape, R.id.fragment_verification_code4_circle_shape, R.id.fragment_verification_resend_code_tv_btu})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fragment_verification_code1_circle_shape:
                edieCode4();
                break;
            case R.id.fragment_verification_code2_circle_shape:
                edieCode3();
                break;
            case R.id.fragment_verification_code3_circle_shape:
                edieCode2();
                break;
            case R.id.fragment_verification_code4_circle_shape:
                edieCode1();
                break;
            case R.id.fragment_verified_code_continue_btu:
                replaceFragmentWithAnimation(getActivity().getSupportFragmentManager(), R.id.user_frame, new NewPasswordFragment(), "l");

//                if (code == null || code.equalsIgnoreCase("")) {
//                    showCookieMsg(getString(R.string.warning), getString(R.string.insert_code), getActivity(), R.color.red2, CookieBar.TOP);
//                    return;
//                } else {
//                    checkSendCode();
//                }
                break;
            case R.id.back_btu:
                onBack();
                break;
            case R.id.fragment_verification_resend_code_tv_btu:

                break;
        }
    }

    private void updateCountDownText(long millisUntilFinished) {
        int minutes = (int) (millisUntilFinished / 1000) / 60;
        int seconds = (int) (millisUntilFinished / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        fragmentConfirmCodeCounterResendTv.setText(timeLeftFormatted);
    }

    private void checkSendCode() {
    }
}