package com.viewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Combine extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combine);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	public void imageClicked(View thumbnailView) {
		ImageView thumbnail = (ImageView)thumbnailView;
		thumbnail.setVisibility(View.INVISIBLE);
		ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);
		animatedImage.setImageDrawable(thumbnail.getDrawable());
		animatedImage.setVisibility(View.VISIBLE);

		Animation animation = AnimationUtils.loadAnimation(this, R.anim.combine_animation);
		animatedImage.startAnimation(animation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.combine, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
