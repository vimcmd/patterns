package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class CokeFactory implements IFactory
{

    public IBottle createBottle()
    {
        return new CokeBottle();
    }

    public ILabel createLabel()
    {
        return new CokeLabel();
    }

    public IWater createWater()
    {
        return new CokeWater();
    }

}
