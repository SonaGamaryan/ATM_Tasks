package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorMultDoubleTest {

    private double a;
    private double b;
    private double expected;
    @Factory(dataProvider = "multDataProvider" )
    public CalculatorMultDoubleTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public  void testMultDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.mult(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProvider(){
        return new Object[][] {
                {2.0, 1.0, 2.0},
                {-0.0113, -1.0, 0.0},
                {-0.0113, 0.0, -0.0}
        };
    }

}
