package com.viewanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AngelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel);
    }

    public void scaleAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Scale.class);
        startActivity(i);
    }

    public void translateAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Translate.class);
        startActivity(i);
    }

    public void rotateAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Rotate.class);
        startActivity(i);
    }

    public void alphaAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Alpha.class);
        startActivity(i);
    }

    public void combineAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Combine.class);
        startActivity(i);
    }

    public void sequenceAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, Sequence.class);
        startActivity(i);
    }

    public void cycleAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, CycleInterpolator.class);
        startActivity(i);
    }

    public void repeatAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, RepeatInterpolator.class);
        startActivity(i);
    }

    public void programAnimation(View view) {
        Intent i = new Intent(AngelActivity.this, ProgramAnimation.class);
        startActivity(i);
    }

}
