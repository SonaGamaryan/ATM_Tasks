package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorPowTest {
    private double a;
    private double b;
    private double expected;
    @Factory(dataProvider = "powDataProvider" )
    public CalculatorPowTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test (groups = "main", timeOut = 1000)
    public  void testPowDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.pow(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider(){
        return new Object[][] {
                {11.635, 2.760, 135.373225},
                {-1.0, -1.1, 1.0},
                {1.1, 0.0, 1.0}

        };
    }

}
