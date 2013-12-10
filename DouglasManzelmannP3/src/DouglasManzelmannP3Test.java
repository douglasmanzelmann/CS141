/**
 * Created by dmanzelmann on 12/10/13.
 */
public class DouglasManzelmannP3Test {
    public static void main(String[] args) {
        DouglasManzelmannP3 guitar = new DouglasManzelmannP3();

        System.out.println("The guitar is tuned? " + guitar.isTuned());
        guitar.play();
        System.out.println("The guitar is playing? " + guitar.isPlaying());
    }
}
