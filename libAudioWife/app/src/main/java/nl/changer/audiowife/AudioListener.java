package nl.changer.audiowife;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import io.vov.vitamio.MediaPlayer;

/**
 * Created by antonio on 23/12/14.
 */
public interface AudioListener {
    public void init(String currentUrl,View playBtn,View stopBtn,SeekBar seekBar,TextView elapsed,TextView totalTime,MediaPlayer.OnCompletionListener completionListener);
    public void play(Class theActivity,String songName,int iconRes);
    public void pause();
    public void release();
}
