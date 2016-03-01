package creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductB;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractProductA.IProductA;

public class ProductB2 implements IProductB
{
    @Override
    public void interact(IProductA a)
    {
        System.out.println(this + " interacts with " + a);
    }
}
