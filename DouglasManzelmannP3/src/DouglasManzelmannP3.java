/**
 * Created by dmanzelmann on 12/10/13.
 */
public class DouglasManzelmannP3 {
    final private int NUMBER_OF_STRINGS = 6;
    final private String[] STRINGS = {"E", "B", "G", "D", "A", "E"};
    private boolean isTuned;
    private boolean isPlaying;

    DouglasManzelmannP3() {
        isTuned = false;
        isPlaying = false;
    }

    public boolean isTuned() {
        return isTuned;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void tune() {
        isTuned = true;
        System.out.println("The guitar is now tuned.");
    }

    public void play() {
        isPlaying = true;
        System.out.println("The guitar is now playing.");
    }

    public void stop() {
        isPlaying = false;
        System.out.println("The guitar is no longer playing.");
    }
}
