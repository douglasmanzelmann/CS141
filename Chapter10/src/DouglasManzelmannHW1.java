/**
 * Created by dmanzelmann on 1/14/14.
 */
public class DouglasManzelmannHW1 {
    private String typeOfMaker; // i.e., French press, percolator,  coffeemaker
    private int numberOfBrews;
    private boolean isClean;
    private final int MAX_BREWS = 5;

    public DouglasManzelmannHW1() {
        this("Coffeemaker");
    }

    public DouglasManzelmannHW1(String typeOfMaker) {
        this.typeOfMaker = typeOfMaker;
        isClean = true;
        numberOfBrews = 0;
    }

    public boolean isClean() {
        return isClean;
    }

    public void clean() {
        isClean = true;
    }

    public int getNumberOfBrews() {
        return numberOfBrews;
    }

    public String getTypeOfMaker() {
        return typeOfMaker;
    }

    public void brewCoffee(String typeOfBrew) {
        if (numberOfBrews < MAX_BREWS) {
            System.out.println("Your " + typeOfMaker + " is brewing your " + typeOfBrew + ".");
            numberOfBrews++;
            isClean = false;
        }
        else
            System.out.println("Your " + typeOfMaker + " was cheaply made. It is now broken.");

    }
}
