package com.viewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Scale extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scale);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	public void imageClicked(View thumbnailView) {
		ImageView thumbnail = (ImageView)thumbnailView;
		ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);
		animatedImage.setImageDrawable(thumbnail.getDrawable());
		animatedImage.setVisibility(View.VISIBLE);

		Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
		animatedImage.startAnimation(animation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.animation1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
