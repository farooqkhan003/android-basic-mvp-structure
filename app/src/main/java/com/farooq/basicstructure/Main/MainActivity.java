package com.farooq.basicstructure.Main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.farooq.basicstructure.R;
import com.farooq.basicstructure.SecondActivity;
import com.farooq.basicstructure.baseMVP.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter, MainView> implements MainView, View.OnClickListener {

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public MainView createMVPView() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button)).setOnClickListener(this);
    }

    @Override
    public void gotoNextActivity() {
        startActivity(new Intent(getContext(), SecondActivity.class));
    }

    @Override
    public void onClick(View view) {
        gotoNextActivity();
    }
}
