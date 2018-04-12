package com.mvp;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/12
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public abstract class BaseMvpFragment<P extends BasePresenter>  extends Fragment{
    private P mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        if (mPresenter != null) {
            mPresenter.attachView(createMvpView());
        }
    }

    /**
     * 创建Presenter
     */
    protected abstract P createPresenter();

    /**
     * 创建mvpview
     */
    protected abstract MvpView createMvpView();

    /**
     * 获取Presenter
     */
    protected P getPresenter() {
        return mPresenter;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
