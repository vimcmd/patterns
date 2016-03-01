package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public interface IBottle
{

    /**
     * @param water
     */
    void interact(IWater water);

    /**
     * @param label
     */
    void interact(ILabel label);

}
