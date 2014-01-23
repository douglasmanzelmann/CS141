/**
 * This class brews coffee for CS242 HW1
 * @author Douglas Manzelmann
 */
public class DouglasManzelmannHW1 {
    private String typeOfMaker; // i.e., French press, percolator,  coffeemaker
    private int numberOfBrews;
    private boolean isClean;
    private final static int MAX_BREWS = 5;

    /**
     * No-arg constructor.
     * Passes Coffeemaker to the contructor
     * which accepts args.
     */
    public DouglasManzelmannHW1() {
        this("Coffeemaker");
    }

    /**
     * Constructor initializes typeOfMaker, isClean and numberOfBrews
     * @param typeOfMaker A string specifying the type of maker.
     */
    public DouglasManzelmannHW1(String typeOfMaker) {
        this.typeOfMaker = typeOfMaker;
        isClean = true;
        numberOfBrews = 0;
    }

    /**
     * Returns whether the maker is clean or not
     * @return isClean
     */
    public boolean isClean() {
        return isClean;
    }

    /**
     * Sets isClean to true
     */
    public void clean() {
        isClean = true;
    }

    /**
     * Returns the number of times the maker has brewed.
     * @return numberOfBrews
     */
    public int getNumberOfBrews() {
        return numberOfBrews;
    }

    /**
     * Returns the type of maker this is.
     * @return typeOfMaker
     */
    public String getTypeOfMaker() {
        return typeOfMaker;
    }

    /**
     * Prints a statement about your coffeemaker brewing.
     * Unless numberOfBrews > MAX_BREWS
     * Increments numberOfBrews
     * Sets isClean to false.
     * @param typeOfBrew The coffee bean to be brewed
     */
    public void brewCoffee(String typeOfBrew) {
        if (numberOfBrews < MAX_BREWS) {
            System.out.println("Your " + typeOfMaker + " is brewing your " + typeOfBrew + ".");
            numberOfBrews++;
            isClean = false;
        }
        else {
            System.out.println("Your " + typeOfMaker + " was cheaply made. It is now broken.");
            System.out.println("Total number of brews: " + numberOfBrews);
        }
    }
}
