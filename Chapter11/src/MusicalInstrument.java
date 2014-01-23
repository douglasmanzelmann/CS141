/**
 * Created by dmanzelmann on 1/23/14.
 */
public class MusicalInstrument {
    private String name;
    private boolean isPlaying;
    private boolean isTuned;

    public MusicalInstrument() {
        this("");
    }

    public MusicalInstrument(String name) {
        this.name = name;
        isPlaying = false;
        isTuned = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void play() {
        isPlaying = true;
    }

    public String howToPlay() {
        return "I'm not an instrument!";
    }

    public boolean isTuned() {
        return isTuned;
    }

    public void tune() {
        isTuned = true;
    }

}
