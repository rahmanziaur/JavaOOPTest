/**
 * Created by Monir on 8/23/16.
 */
public class Human extends Animal {

    private int numberOfHands;
    private int numberOfLegs;

    public Human(int numberOfHands, int numberOfLegs)
    {
        this.numberOfHands = numberOfHands;
        this.numberOfLegs = numberOfLegs;

    }

    public Human(int numberOfHands, int numberOfLegs, String color, boolean horned)
    {
        this(numberOfHands, numberOfLegs);
        setColor(color);
        setHorned(horned);
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public void setNumberOfHands(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public double getWeight()
    {
        return 35+ (numberOfHands+numberOfLegs)*15;
    }

    public void printHuman()
    {
        System.out.println("Number of Hands:" + getNumberOfHands() + "\nNumber of Legs:" + getNumberOfLegs() + "\nWeight:" + getWeight());
    }
}
