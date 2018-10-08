package com.farooq.basicstructure.Main;

import android.util.Log;
import android.widget.Toast;

import com.farooq.basicstructure.baseMVP.BasePresenter;

/**
 * Created by farooq on 10/23/2017.
 */

public class MainPresenter extends BasePresenter<MainView> {
    @Override
    public void init() {
        Log.e("MainPresenter", "init()");
    }

    @Override
    public void destroy() {
        Log.e("MainPresenter", "destroy()");
    }
}
