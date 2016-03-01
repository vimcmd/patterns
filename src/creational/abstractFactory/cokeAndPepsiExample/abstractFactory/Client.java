package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class Client
{

    private IBottle bottle;
    private ILabel label;
    private IWater water;

    /**
     * @param factory
     */
    public Client(IFactory factory)
    {
        bottle = factory.createBottle();
        label = factory.createLabel();
        water = factory.createWater();
    }

    public void run()
    {
        water.makeWaterAccordingToRecipe();
        bottle.interact(water);
        bottle.interact(label);
    }

}
