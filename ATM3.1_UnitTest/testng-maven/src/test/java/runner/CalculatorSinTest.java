package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorSinTest {

    private double a;
    private double expected;
    /*@Factory(dataProvider = "sinDataProvider" )
    public CalculatorSinTest(double a, double expected){
        this.a = a;
        this.expected = expected;
    }*/
    @Test (dataProvider = "sinDataProvider", groups = "Bugs")
    public  void testSinDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.sin(a);
        Assert.assertEquals(result, expected);
    }

    @Test
    public  void testSinDouble0(){
        Calculator calculator = new Calculator();
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0.0);
    }

    @DataProvider(name = "sinDataProvider")
    public static Object[][] sinDataProvider(){
        return new Object[][] {
                {30.0, 0.5},
                {45.0, 0.70710678},
                {60.0, 0.8660254},
                {90.0, 1.0},
                {-90, -1.0}
        };
    }

}
