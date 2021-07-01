import Calculation.Arithmetics;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


public class TestArithmetics {

    @Rule
    public ExpectedException exp = ExpectedException.none();
    private static Arithmetics a;

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0, 0.001);
    }

    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(res,  -4.0, 0.001);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(res,  21.0, 0.001);
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 5);
        Assert.assertEquals(res,  2.0, 0.001);
    }

    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }
}
