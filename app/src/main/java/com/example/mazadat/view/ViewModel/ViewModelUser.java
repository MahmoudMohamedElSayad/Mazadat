package com.example.mazadat.view.ViewModel;

import androidx.lifecycle.ViewModel;


import static com.example.mazadat.data.local.SharedPreferencesManger.SaveData;
import static com.example.mazadat.utils.ToastCreator.onCreateErrorToast;;
public class ViewModelUser extends ViewModel {


//
//    public MutableLiveData<UserGetResponce> getResponseSignUp() {
//        return generalRegisteration;
//    }
//    public void setAndMakeSignUpResponse(final Activity activity, final Call<UserGetResponce> method, TryAgainOncall tryAgainOncall, String succes_send, boolean book) {
//        if (isConnected(activity)) {
//
//            if (progressDialog == null) {
//                HelperMethod.showProgressDialog(activity, activity.getString(R.string.wait));
//            } else {
//                if (!progressDialog.isShowing()) {
//                    HelperMethod.showProgressDialog(activity, activity.getString(R.string.wait));
//                }
//            }
//
//            method.enqueue(new Callback<UserGetResponce>() {
//                @Override
//                public void onResponse(Call<UserGetResponce> call, Response<UserGetResponce> response) {
//
//                    if (response != null) {
////                        ToastCreator.onCreateSuccessToast(activity,"RESPONSE NOT NULL");
//
//
//                        try {
////                            ToastCreator.onCreateSuccessToast(activity, succes_send);
////                            ToastCreator.onCreateSuccessToast(activity, response.body().toString());
//                            Log.e("BODY", "" + response.body().getStatus());
//
//                            if (response.body().getStatus() ==true) {
//                                dismissProgressDialog();
//                                generalRegisteration.postValue(response.body());
//                                ToastCreator.onCreateSuccessToast(activity, succes_send);
//                                Log.e("message", response.body().getMessage());
////                                if(!book){
////                                    ToastCreator.onCreateSuccessToast(activity, response.body().getMessage());
////                                }
//                            } else {
//                                dismissProgressDialog();
////                                ToastCreator.onCreateSuccessToast(activity, response.body().getMessage());
//                                onCreateErrorToast(activity, response.body().getMessage());
//
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<UserGetResponce> call, Throwable t) {
//                    dismissProgressDialog();
////                    showToast(activity, String.valueOf(t.getMessage()));
//                    onCreateErrorToast(activity, activity.getString(R.string.error));
//                    generalRegisteration.postValue(null);
//                }
//            });
//        } else {
//            try {
//                showCookieMsg(activity.getString(R.string.warning), activity.getString(R.string.error_inter_net), activity, R.color.red2, CookieBar.TOP);
//            } catch (Exception e) {
//
//            }
//        }
//
//    }
//    /////////////////////////////////////////////
//    public MutableLiveData<LoginGetResponse> makeGeneralLoginAndUpdateProfile() {
//        return generalLoginResponse;
//    }
//    public void setGeneralLogin(final Activity activity, final Call<LoginGetResponse> method, final String password, final boolean remember, final boolean auth,TryAgainOncall tryAgainOncall) {
//        if (isConnected(activity)) {
//
//            if (progressDialog == null) {
//                HelperMethod.showProgressDialog(activity, activity.getString(R.string.wait));
//            } else {
//                if (!progressDialog.isShowing()) {
//                    HelperMethod.showProgressDialog(activity, activity.getString(R.string.wait));
//                }
//            }
//            method.enqueue(new Callback<LoginGetResponse>() {
//                @Override
//                public void onResponse(Call<LoginGetResponse> call, Response<LoginGetResponse> response) {
//
//                    if (response.body() != null) {
//                        try {
//
//                            if (response.body().getStatus() == true) {
//                                showToast(activity, "true");
////                                if (response.body().getMessage() != "the user is not vertified to login please visit your email") {
//                                int userId = response.body().getData().getUser().getId();
////                                new ClientFireBaseToken(activity,userId,genderType);
//                                clean(activity);
//                                SaveData(activity, USER_PASSWORD, password);
//                                SaveData(activity, USER_DATA, response.body().getData());
//                                SaveData(activity, REMEMBER_ME, remember);
//                                SaveData(activity, USER_TOKEN, response.body().getData().getToken());
//                                SaveData(activity, REMEMBER_ME, remember);
////                                saveToSharedPrefrences("authoToken_dr_ayman", response.body().getData().getToken());
//                                Hawk.put("authoToken_dr_ayman", response.body().getData().getToken());
//                                Log.e("authoToken", response.body().getData().getToken());
//                                if (auth) {
//                                    ToastCreator.onCreateSuccessToast(activity, "Success Login");
//
////                                    Call<UserLoginGeneralResponce> tokenCall = null;
////                                    token=new ClientFireBaseToken().getToken();
////                                    apiToken=response.body().getData().getApiToken();
////                                    showToast(activity, "token"+apiToken);
////                                    if (ISCLIENT.equals("true")) {
////
////                                        tokenCall = getApiClient().clientSignUpToken(token, "android",apiToken);
////                                    } else if(ISCLIENT=="false") {
////                                        tokenCall = getApiClient().restaurantSignUpToken(token, "android",apiToken);
////                                    }
////
////
////                                    getAndMakeRegisterToken(activity,tokenCall);
//                                    Intent intent = new Intent(activity, HomeCycleActivity.class);
//                                    activity.startActivity(intent);
//                                    activity.finish();
//                                }else{
//                                    ToastCreator.onCreateSuccessToast(activity, "Success Edit");
//
//                                }
////                            }
//
//                                dismissProgressDialog();
//                                generalLoginResponse.postValue(response.body());
////                                if (response.body().getMessage()!=null) {
//                                ToastCreator.onCreateSuccessToast(activity, "Success");
//
////                                }
//
//                            } else {
//                                dismissProgressDialog();
////                                showLongToast(activity, response.body().getErrorDescription());
////                                onCreateErrorToast(activity, response.body().getErrorDescription());
//                                showCookieMsg(activity.getString(R.string.warning), response.body().getMessage(), activity, R.color.red2, CookieBar.TOP);
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    } else {
//                        dismissProgressDialog();
//                        onCreateErrorToast(activity, "error response is null");
//
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<LoginGetResponse> call, Throwable t) {
//                    dismissProgressDialog();
//                    onCreateErrorToast(activity, activity.getString(R.string.error));
//                    generalLoginResponse.postValue(null);
//                }
//            });
//        } else {
//            try {
//                showCookieMsg(activity.getString(R.string.warning), activity.getString(R.string.error_inter_net), activity, R.color.red2, CookieBar.TOP);
//            } catch (Exception e) {
//
//            }
//
//        }
//
//    }


}

