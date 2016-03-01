package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class PepsiWater implements IWater
{

    public void makeWaterAccordingToRecipe()
    {
        System.out.println("Make a pepsi according to recipe");
    }

    @Override
    public String getWaterName()
    {
        return "Pepsi water";
    }

}
