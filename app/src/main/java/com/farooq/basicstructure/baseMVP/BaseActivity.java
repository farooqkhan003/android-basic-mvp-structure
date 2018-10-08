package com.farooq.basicstructure.baseMVP;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;

import com.farooq.basicstructure.R;

/**
 * Created by farooq on 10/23/2017.
 */

public abstract class BaseActivity<P extends Presenter<V>, V extends MVPView> extends AppCompatActivity {

    private P presenter;
    private V mvpView;

    public abstract P createPresenter();

    public abstract V createMVPView();

    public P getPresenter() {
        if (presenter == null)
            presenter = createPresenter();
        return presenter;
    }

    public V getMvpView() {
        if (mvpView == null)
            mvpView = createMVPView();
        return mvpView;
    }

    public Context getContext() {
        return this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();
        mvpView = createMVPView();

        presenter.attachView(mvpView);
        presenter.init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

}
