package com.demo;


import com.demo.data.UserInfoBean;
import com.demo.model.LoginModel;
import com.demo.presenter.LoginPresenter;
import com.mvp.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<LoginPresenter, LoginModel, UserInfoBean> {

    /**
     * 创建Presenter
     */
    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onSuccess(UserInfoBean result) {

    }

    @Override
    public void onError() {

    }
}
