package com.viewanimation;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


public class ProgramAnimation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_animation);

        RotateAnimation rotate
                = new RotateAnimation(0.0f, 1080.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        ScaleAnimation scale
                = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);

        AlphaAnimation alpha = new AlphaAnimation(0.0f, 1.0f);

        AnimationSet set = new AnimationSet(true);
        set.addAnimation(rotate);
        set.addAnimation(scale);
        set.addAnimation(alpha);
        set.setDuration(2000);

        ImageView image = (ImageView)findViewById(R.id.image);
        image.startAnimation(set);

        /*--------------------------*/

       /* Rect imageRect = new Rect();
        Rect globalRect = new Rect();
        Point globalOffset = new Point();

        ImageView image = (ImageView)findViewById(R.id.image);
        View container = findViewById(R.id.container);

        image.getGlobalVisibleRect(imageRect);
        container.getGlobalVisibleRect(globalRect, globalOffset);
        imageRect.offset(-globalOffset.x, -globalOffset.y);

        Animation translate
                = new TranslateAnimation(imageRect.left,
                imageRect.left+2*imageRect.width(),
                imageRect.top,
                imageRect.top);
        translate.setInterpolator(new AnticipateInterpolator());

        Animation scale
                = new ScaleAnimation(1.0f, 2.0f, 1.0f, 2.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scale.setInterpolator(new AccelerateInterpolator());

        Animation alpha = new AlphaAnimation(1.0f, 0.0f);
        alpha.setInterpolator(new LinearInterpolator());

        AnimationSet set = new AnimationSet(false);
        set.addAnimation(translate);
        set.addAnimation(scale);
        //set.addAnimation(alpha);

        image.setVisibility(View.INVISIBLE);

        ImageView animatedImage = (ImageView) findViewById(R.id.image);
        animatedImage.setImageDrawable(image.getDrawable());
        animatedImage.setVisibility(View.VISIBLE);

        set.setFillAfter(true);
        set.setDuration(300);
        set.start();
        animatedImage.setAnimation(set);*/

    }

    /*
        AlphaAnimation
        RotateAnimation
        ScaleAnimation
        TranslateAnimation
        AnimationSet
    */
}
