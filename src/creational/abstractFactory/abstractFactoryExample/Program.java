package creational.abstractFactory.abstractFactoryExample;

import creational.abstractFactory.abstractFactoryExample.abstractFactory.Client;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory.ConcreteFactory1;
import creational.abstractFactory.abstractFactoryExample.abstractFactory.abstractFactory.ConcreteFactory2;

public class Program
{
    public static void main(String[] args)
    {
        Client client = null;

        client = new Client(new ConcreteFactory1());
        client.run();

        client = new Client(new ConcreteFactory2());
        client.run();
    }
}
