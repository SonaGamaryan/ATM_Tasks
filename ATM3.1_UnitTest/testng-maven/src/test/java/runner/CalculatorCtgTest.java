package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorCtgTest {
    private double a;
    private double expected;
    /*@Factory(dataProvider = "ctgDataProvider" )
    public CalculatorCtgTest(double a, double expected){
        this.a = a;
        this.expected = expected;
    }*/
    @Test(dataProvider = "ctgDataProvider", groups = "Bugs")
    public  void testCtgDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expected);
    }
    @Test (expectedExceptions = NumberFormatException.class, groups = "Bugs")
    public void testTg90 (){
        Calculator calculator = new Calculator();
        double result = calculator.ctg(0);
        System.out.println(result);
    }

    @DataProvider(name = "ctgDataProvider")
    public static Object[][] ctgDataProvider(){
        return new Object[][] {
                {-60.0, -1.732050808},
                {30.0, 1.7321},
                {45.0, 1.0},
                {60.0, 0.5774},
                {90.0, 0.0},
                {270.0, 0.0}
        };
    }
}
