package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorSumDoubleTest {
    private double a;
    private double b;
    private double expected;
    @Factory(dataProvider = "sumDataProvider" )
    public CalculatorSumDoubleTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test (groups = "main", timeOut = 1000)
    public  void testSumDouble(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(a,b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][] {
                {0.0113, 1.0, 1.0113},
                {-0.0113, -1.0, -1.0113}
        };
    }
}
