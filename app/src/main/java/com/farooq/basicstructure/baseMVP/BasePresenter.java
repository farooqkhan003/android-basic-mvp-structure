package com.farooq.basicstructure.baseMVP;

import android.content.Context;

/**
 * Created by farooq on 10/23/2017.
 */

public abstract class BasePresenter<V extends MVPView> implements Presenter<V> {
    private V view;

    @Override
    public final Context getContext() {
        return view == null ? null : view.getContext();
    }

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public V getView() {
        return view;
    }

}
