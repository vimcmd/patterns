package creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.IProductA;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.ProductA2;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.IProductB;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.ProductB2;

public class ConcreteFactory2 implements IFactory
{
    @Override
    public IProductA createProductA()
    {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB()
    {
        return new ProductB2();
    }
}
