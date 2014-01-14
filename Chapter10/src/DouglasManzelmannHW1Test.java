/**
 * Created by dmanzelmann on 1/14/14.
 */
public class DouglasManzelmannHW1Test {
    public static void main(String[] args) {
        DouglasManzelmannHW1 frenchPress = new DouglasManzelmannHW1("French Press");
        String[] coffeeBrews = {"dark roast", "kona", "pike", "medium", "folgers", "Starbucks"};

        for (int i = 0; i < coffeeBrews.length; i++) {
            if (i % 2 == 0 && i != 0) frenchPress.clean();  // clean every other use

            if (frenchPress.isClean())
                System.out.println("Your " + frenchPress.getTypeOfMaker() + " is clean.");
            else
                System.out.println("Your " + frenchPress.getTypeOfMaker() + " is not clean.");

            frenchPress.brewCoffee(coffeeBrews[i]);
        }
    }
}
