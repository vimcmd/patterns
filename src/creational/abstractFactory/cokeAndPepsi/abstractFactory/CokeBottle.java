package creational.abstractFactory.cokeAndPepsi.abstractFactory;

public class CokeBottle implements IBottle
{

    /**
     * @param water
     */
    public void interact(IWater water)
    {
        System.out.println("Coke bottle filled with " + water.getWaterName());
    }

    /**
     * @param label
     */
    public void interact(ILabel label)
    {
        System.out.println("Coke bottle sticked with " + label.printLabel());
    }

}
