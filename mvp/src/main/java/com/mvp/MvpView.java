package com.mvp;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public interface MvpView<T> {

    void onLoading();

    void onSuccess(T result);

    void onError();

}
