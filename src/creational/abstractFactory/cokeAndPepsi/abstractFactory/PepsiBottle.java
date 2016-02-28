package creational.abstractFactory.cokeAndPepsi.abstractFactory;

public class PepsiBottle implements IBottle
{

    /**
     * @param water
     */
    public void interact(IWater water)
    {
        System.out.println("Pepsi bottle filled with " + water.getWaterName());
    }

    /**
     * @param label
     */
    public void interact(ILabel label)
    {
        System.out.println("Pepsi bottle sticked with " + label.printLabel());
    }

}
