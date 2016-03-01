package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class PepsiFactory implements IFactory
{

    public IBottle createBottle()
    {
        return new PepsiBottle();
    }

    public ILabel createLabel()
    {
        return new PepsiLabel();
    }

    public IWater createWater()
    {
        return new PepsiWater();
    }

}
