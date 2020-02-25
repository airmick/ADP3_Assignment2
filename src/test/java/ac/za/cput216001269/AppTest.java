package ac.za.cput216001269;

import org.junit.*;

public class AppTest
{
    private App obj1, obj2, obj3;

    @Before
    public void setUp() throws Exception
    {
        obj1 = new App("Iphone6");
        obj2 = new App("Iphone7");
        obj3 = obj2;
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void comparedObjectEquality()
    {
        boolean answer = new App().comparedEqualityOfTwoObjects(obj1, obj2);
        Assert.assertSame(false, answer);
    }

    @Test
    public void comparedTwoObjectsIdentity()
    {
        boolean compare = new App().comparedIdentityOfTwoObjects(obj2, obj3);
        Assert.assertSame(true, compare);
    }

    @Test
    public void failingTest()
    {
        Assert.fail("Test Failed!!!");
    }

    @Test(timeout = 20)
    public void timeoutTest()
    {
        for (int i = 0; i < 5000; i++)
        {
            String name;
        }
    }

    @Test
    @Ignore
    public void disablingTest()
    {
        boolean answer = new App().comparedEqualityOfTwoObjects(obj1, obj3);
        Assert.assertSame(true, answer);
    }
}