package com.demo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.demo.data.UserInfoBean;
import com.demo.model.LoginModel;
import com.demo.presenter.LoginPresenter;
import com.demo.view.LoginView;
import com.mvp.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<LoginPresenter> implements LoginView<UserInfoBean> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().getLogin();
    }

    /**
     * 创建Presenter
     */
    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    /**
     * 创建mvpview
     */
    @Override
    protected LoginView<UserInfoBean> createMvpView() {
        return this;
    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onSuccess(UserInfoBean result) {
        Toast.makeText(this, "5655665", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onComplete() {

    }


    @Override
    public void onSuccess(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}
