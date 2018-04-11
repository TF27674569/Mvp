package com.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Description : Activity 抽象层
 * <p/> T 为解析的数据返回类型
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public abstract class BaseMvpActivity<P extends BasePresenter, M extends MvpModel,T> extends AppCompatActivity implements MvpView<T>{

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        mPresenter.attachView(this);
    }

    /**
     * 创建Presenter
     */
    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
