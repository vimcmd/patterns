package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public interface IFactory
{

    IBottle createBottle();

    ILabel createLabel();

    IWater createWater();

}
