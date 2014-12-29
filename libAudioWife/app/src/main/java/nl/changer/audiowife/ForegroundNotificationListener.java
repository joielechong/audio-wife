package nl.changer.audiowife;

/**
 * Created by Antonio Tari on 29/12/14.
 * listener only takes care of adding/removing an existing notification using the AudioWife buttons
 */
public interface ForegroundNotificationListener {
    public void addForeground();
    public void removeForeground();
}
