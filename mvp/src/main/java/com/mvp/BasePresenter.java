package com.mvp;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.TypeVariable;

/**
 * Description :
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/4/11
 * Email : 27674569@qq.com
 * Version : 1.0
 */
public class BasePresenter<V extends MvpView, M extends MvpModel> {
    // 原始的 View
    private WeakReference<V> mView = null;
    // 代理view
    private V mProxyView = null;
    // 对应model类
    protected M model = null;

    /**
     * 绑定view
     */
    public void attachView(V view) {
        // 软银用activity 获fragment
        this.mView = new WeakReference<>(view);

        try {
            // 通过动态代理处理解绑后未销毁的异常
            mProxyView = (V) Proxy.newProxyInstance(view.getClass().getClassLoader(), view.getClass().getInterfaces(), new MvpInvocationHandler());

            // 通过反射创建model
            createMvpModel();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    /**
     * 解绑
     */
    public void detachView() {
        mView = null;
    }

    /**
     * 获取view对象
     */
    public V getView() {
        return mProxyView;
    }

    private class MvpInvocationHandler implements InvocationHandler {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 没有detachView才实现
            if (mView != null && mView.get() != null) {
                return method.invoke(mView.get(), args);
            }
            return null;
        }
    }


    private void createMvpModel() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<M> modelClazz = (Class<M>) (parameterizedType.getActualTypeArguments()[1]);
        try {
            model = modelClazz.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException(modelClazz.getName() + " constructor() if existence?");
        }
    }
}