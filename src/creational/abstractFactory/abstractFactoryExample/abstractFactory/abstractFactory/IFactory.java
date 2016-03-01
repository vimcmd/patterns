package creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.IProductA;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB.IProductB;

public interface IFactory
{
    IProductA createProductA();
    IProductB createProductB();
}
