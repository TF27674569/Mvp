package com.demo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mvp.BaseMvpActivity;
import com.mvp.BasePresenter;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/12
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public abstract class BaseActivity<P extends BasePresenter> extends BaseMvpActivity<P> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
