package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorCosTest {

    private double a;
    private double expected;
    @Factory(dataProvider = "cosDataProvider" )
    public CalculatorCosTest(double a, double expected){
        this.a = a;
        this.expected = expected;
    }
    @Test(groups = "Bugs")
    public  void testCosDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.cos(a);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "cosDataProvider")
    public static Object[][] cosDataProvider(){
        return new Object[][] {
                {0.0, 1.0},
                {30.0, 0.8660254},
                {45.0, 0.70710678},
                {60.0, 0.5},
                {90.0, 0},
                {-90, 0}
        };
    }

}
