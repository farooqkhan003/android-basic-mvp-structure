package com.farooq.basicstructure.baseMVP;

import android.content.Context;

/**
 * Created by farooq on 10/23/2017.
 */

public interface Presenter<V extends MVPView> {
    void init();

    Context getContext();

    V getView();

    void attachView(V view);

    void detachView();

    void destroy();
}
