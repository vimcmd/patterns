package creational.abstractFactory.abstractFactoryExample.abstractFactory;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory.IFactory;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.IProductA;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.IProductB;

public class Client
{
    private IProductA productA = null;
    private IProductB productB = null;

    public Client(IFactory factory)
    {
        this.productA = factory.createProductA();
        this.productB = factory.createProductB();
    }

    public void run()
    {
        this.productB.interact(this.productA);
    }
}
