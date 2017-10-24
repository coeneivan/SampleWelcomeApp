package com.example.ivancoene.samplewelcomeapp;

import android.os.Bundle;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by ivan.coene on 23/10/2017.
 */

public class IntroActivity extends AppIntro {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntroFragmentBasic basic = new IntroFragmentBasic();
        addSlide(basic);
        addSlide(AppIntroFragment.newInstance(getResources().getText(R.string.app_name),  getResources().getText(R.string.description_sample), R.drawable.icon, Color.rgb(52, 152, 219)));
        addSlide(AppIntroFragment.newInstance(getResources().getText(R.string.app_name),  getResources().getText(R.string.description_sample), R.drawable.icon, Color.rgb(52, 152, 219)));
        addSlide(AppIntroFragment.newInstance(getResources().getText(R.string.app_name),  getResources().getText(R.string.description_sample), R.drawable.icon, Color.rgb(52, 152, 219)));
        setBarColor(Color.parseColor("#000000"));
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
    }
}
