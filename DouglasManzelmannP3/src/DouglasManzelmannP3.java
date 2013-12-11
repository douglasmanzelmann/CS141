/**
 * Created by dmanzelmann on 12/10/13.
 */
public class DouglasManzelmannP3 {
    final static int NUMBER_OF_STRINGS = 6;
    final static String[] STRINGS = {"E", "B", "G", "D", "A"};
    private static int numberOfGuitars = 0;
    private int guitarID;
    private boolean isTuned;
    private boolean isPlaying;

    DouglasManzelmannP3() {
        isTuned = false;
        isPlaying = false;
        guitarID = ++numberOfGuitars;
    }

    public boolean isTuned() {
        return isTuned;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void tune() {
        isTuned = true;
        System.out.println("Guitar #" + guitarID + " is now tuned.");
    }

    public void play() {
        if (isTuned) {
            isPlaying = true;
            System.out.println("Guitar #" + guitarID + " is now playing.");
        }

        else {
            System.out.println("Guitar #" + guitarID +  " needs to be tuned before playing it.");
        }
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Guitar #" + guitarID +  " is no longer playing.");
    }

    public void playNote(String note) {
        for (int i = 0; i < STRINGS.length; i++) {
            System.out.print(STRINGS[i]);
        }

        if (STRINGS.toString().lastIndexOf(note) == -1) {
            System.out.println("This note isn't on the guitar!");
        }

        else {
            System.out.println("Playing " + note);
        }
    }
}
