
package nl.changer.audiowifedemo;

import nl.changer.audiowife.AudioWife;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseActivity extends FragmentActivity {

	protected Uri mUri;

	@Override
	protected void onPause() {
		super.onPause();

		// when done playing, release the resources
		//AudioWife.getInstance().release();
		mUri = null;
	}
}
