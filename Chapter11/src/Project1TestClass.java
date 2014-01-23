import java.util.ArrayList;

/**
 * Created by dmanzelmann on 1/23/14.
 */
public class Project1TestClass {
    public static void main(String[] args) {
        ArrayList<MusicalInstrument> list = new ArrayList<MusicalInstrument>();

        list.add(new Woodwind());
        list.add(new Brass());
        list.add(new Strings());
        list.add(new Percussion());

        for (int i = 0; i < list.size(); i++) {
            MusicalInstrument current = list.get(i);
            System.out.println("Instrument name: " + current.getName());
            current.tune();
            System.out.println(list.get(i).getName() + " is tuned: " + current.isTuned());
            System.out.println(list.get(i).getName() + " instruments are played with/by: " + current.howToPlay());
        }
    }
}
