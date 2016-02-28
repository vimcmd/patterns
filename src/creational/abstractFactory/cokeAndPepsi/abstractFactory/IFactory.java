package creational.abstractFactory.cokeAndPepsi.abstractFactory;

public interface IFactory
{

    IBottle createBottle();

    ILabel createLabel();

    IWater createWater();

}
