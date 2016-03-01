package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class CokeWater implements IWater
{

    public void makeWaterAccordingToRecipe()
    {
        System.out.println("make a Coca Cola water according to super secret sugar water recipe");
    }

    @Override
    public String getWaterName()
    {
        return "Coca Cola water";
    }

}
