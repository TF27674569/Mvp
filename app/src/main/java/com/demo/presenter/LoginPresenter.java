package com.demo.presenter;

import com.demo.data.UserInfoBean;
import com.demo.model.LoginModel;
import com.demo.view.LoginView;
import com.mvp.BasePresenter;
import com.mvp.MvpView;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class LoginPresenter extends BasePresenter<LoginView<UserInfoBean>,LoginModel> {

    public void getLogin(){
        getView().onSuccess(model.getLogin());
    }

}
