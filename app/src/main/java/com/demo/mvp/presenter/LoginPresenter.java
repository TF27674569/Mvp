package com.demo.mvp.presenter;

import com.demo.data.UserInfoBean;
import com.demo.mvp.model.LoginModel;
import com.demo.mvp.view.mvpinterface.LoginView;
import com.mvp.BasePresenter;

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
