package com.demo.mvp.view.mvpinterface;

import com.mvp.MvpView;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface LoginView<T> extends MvpView<T>{

    void onSuccess(String result);
}
