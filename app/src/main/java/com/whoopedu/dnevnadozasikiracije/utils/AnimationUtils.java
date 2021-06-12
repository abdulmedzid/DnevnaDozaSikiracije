package com.whoopedu.dnevnadozasikiracije.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;


public class AnimationUtils {

    private static final long DURATION = 450;

    public static void fadeOut(View v) {
        v.setAlpha(0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0);
        alphaAnimation.setDuration(DURATION);
        alphaAnimation.setFillAfter(true);
        v.startAnimation(alphaAnimation);
    }

    public static void fadeOut(View v, Runnable onEnd) {
        v.setAlpha(0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0);
        alphaAnimation.setDuration(DURATION);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new OnAnimationEndListener() {
            @Override
            public void onAnimationEnd(Animation animation) {
                onEnd.run();
            }
        });
        v.startAnimation(alphaAnimation);
    }

    public static void fadeIn(View v) {
        v.setVisibility(View.VISIBLE);
        v.setAlpha(1f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1f);
        alphaAnimation.setDuration(DURATION);
        alphaAnimation.setFillAfter(true);
        v.startAnimation(alphaAnimation);
    }

    public static abstract class OnAnimationEndListener implements Animation.AnimationListener {

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
