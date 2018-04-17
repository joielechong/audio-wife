package nl.changer.audiowife;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.antoniotari.audiosister.models.Song;


/**
 * Created by antonio on 23/12/14.
 */
public interface AudioListener {
    void init(String currentUrl,View playBtn,View stopBtn,SeekBar seekBar,TextView elapsed,TextView totalTime,MediaPlayer.OnCompletionListener completionListener);
    void play(Class theActivity,Song song,int durationSeconds,int iconRes);
    void pause();
    void release();
}
