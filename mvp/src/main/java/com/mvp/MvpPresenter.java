package com.mvp;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface MvpPresenter<V extends MvpView,M extends MvpModel> {

    void attachView(V view);

    void detachView();

    V getView();
}
