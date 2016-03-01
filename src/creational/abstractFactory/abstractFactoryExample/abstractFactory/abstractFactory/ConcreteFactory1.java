package creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.IProductA;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.ProductA1;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.IProductB;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.ProductB1;

public class ConcreteFactory1 implements IFactory
{
    @Override
    public IProductA createProductA()
    {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB()
    {
        return new ProductB1();
    }
}
