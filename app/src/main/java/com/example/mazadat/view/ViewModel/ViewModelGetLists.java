package com.example.mazadat.view.ViewModel;

import androidx.lifecycle.ViewModel;


public class ViewModelGetLists extends ViewModel {

//
//    public MutableLiveData<CategoryGetResponse> makeGetUniversityCorses() {
//        return getCategoryInfoResponse;
//    }
//    public void getAllNameCategory(final Activity activity, final LinearLayout errorSubView, final Call<CategoryGetResponse> method, Integer maxPage, TryAgainOncall tryAgainOncall, final SwipeRefreshLayout FragmentSrRefreshRv, final RelativeLayout loadMore) {
//        if (isConnected(activity)) {
//            if (!activity.isFinishing()&&maxPage==1) {
//                FragmentSrRefreshRv.setRefreshing(true);
//            }
//
//            errorSubView.setVisibility(View.GONE);
//            method.enqueue(new Callback<CategoryGetResponse>() {
//                @Override
//                public void onResponse(Call<CategoryGetResponse> call, Response<CategoryGetResponse> response) {
//
//                    if (response != null&&response.body() != null) {
//                        try {
////                            ToastCreator.onCreateSuccessToast(activity, "Success");
////                            clientAndRestaurantHomeFragmentSFlShimmer.stopShimmer();
////                            clientAndRestaurantHomeFragmentSFlShimmer.setVisibility(View.GONE);
//                            if (response.body().getStatus() == true) {
//
//                                loadMore.setVisibility(View.GONE);
//                                FragmentSrRefreshRv.setRefreshing(false);
//                                getCategoryInfoResponse.postValue(response.body());
//                            }
////                                ToastCreator.onCreateSuccessToast(activity, "Success");
////                            } else {
////                                onCreateErrorToast(activity, response.body().getMessage());
//////                                new HomeFragment().setError(String.valueOf(R.string.error_list));
////
////                            }
//
//                        } catch (Exception e) {
//
//                        }
//                    } else {
////                        ToastCreator.onCreateSuccessToast(activity, "null");
//                        if (response.code() == 401) {
//                            showConfirmationDialog(activity, R.string.Sorry, R.string.NotAuthou, R.string.Ok, false);
//                        }
//                    }
//
//                }
//
//                @Override
//                public void onFailure(Call<CategoryGetResponse> call, Throwable t) {
//                    try {
////                        clientAndRestaurantHomeFragmentSFlShimmer.stopShimmer();
////                        clientAndRestaurantHomeFragmentSFlShimmer.setVisibility(View.GONE);
//                        loadMore.setVisibility(View.GONE);
//                        FragmentSrRefreshRv.setRefreshing(false);
//                        Log.i(TAG, String.valueOf(t.getMessage()));
////                        showToast(activity, "false");
//                        Log.i(TAG, String.valueOf(t.getCause()));
////                        new HomeFragment().setError(String.valueOf(R.string.error_list));
//                        getCategoryInfoResponse.postValue(null);
//                    } catch (Exception e) {
//
//                    }
//                }
//            });
//        } else {
//            try {
////                clientAndRestaurantHomeFragmentSFlShimmer.stopShimmer();
////                clientAndRestaurantHomeFragmentSFlShimmer.setVisibility(View.GONE);
//                loadMore.setVisibility(View.GONE);
//                FragmentSrRefreshRv.setRefreshing(false);
//                showNoInternetDialogDialog(activity, tryAgainOncall, "recycle");
////                errorSubView.setVisibility(View.VISIBLE);
////                new HomeFragment().setError(String.valueOf(R.string.error_inter_net));
////                onCreateErrorToast(activity, activity.getString(R.string.error_inter_net));
//            } catch (Exception e) {
//
//            }
//
//        }
//    }
//




    }
