package creational.abstractFactory.cokeAndPepsiExample.abstractFactory;

public class Program
{

    public static final String divider = "============";

    public static void main(String args[])
    {
        Client client = new Client(new PepsiFactory());
        client.run();


        System.out.println(divider);

        client = new Client(new CokeFactory());
        client.run();
    }


}
