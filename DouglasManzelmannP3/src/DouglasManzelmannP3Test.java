/**
 * Created by dmanzelmann on 12/10/13.
 */
public class DouglasManzelmannP3Test {
    public static void main(String[] args) {
        DouglasManzelmannP3[] guitar = new DouglasManzelmannP3[10];
        String[] STRINGS = {"E", "B", "G", "D", "A"};

        for (int i = 0; i < guitar.length; i++) {
            guitar[i] = new DouglasManzelmannP3();
        }

        for (int i = 0; i < guitar.length; i++) {
            System.out.println("Guitar #" + guitar[i].guitarID());
            guitar[i].tune();
            guitar[i].play();

            int randomString = (int)(Math.random() *  4);
            guitar[i].playNote(STRINGS[randomString]);
            guitar[i].stop();
        }
    }
}
