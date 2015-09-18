package com.viewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Alpha extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alpha);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	public void imageClicked(View thumbnailView) {
		ImageView thumbnail = (ImageView)thumbnailView;
		thumbnail.setVisibility(View.INVISIBLE);
		ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);
		animatedImage.setImageDrawable(thumbnail.getDrawable());
		animatedImage.setVisibility(View.VISIBLE);

		Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
		animatedImage.startAnimation(animation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.alpha, menu);
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
