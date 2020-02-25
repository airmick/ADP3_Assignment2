package ac.za.cput216001269;

/**
 * Hello world!
 *
 */
public class App 
{
    private String input;
    public App()
    {

    }
    public App(String n)
    {
        this.input = n;
    }

    public boolean comparedEqualityOfTwoObjects(Object object1, Object object2)
    {
        return object1.equals(object2);
    }

    public boolean comparedIdentityOfTwoObjects(Object o1, Object o2)
    {
        return o1 == o2;
    }


}
