package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorSubDoubleTest {
    private double a;
    private double b;
    private double expected;
    @Factory(dataProvider = "subDataProvider" )
    public CalculatorSubDoubleTest(double a, double b, double expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test (groups = "main", timeOut = 1000)
    public  void testSubDouble(){
        Calculator calculator = new Calculator();
        double result = calculator.sub(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProvider(){
        return new Object[][] {
                {0.0113, 1.0, -0.9887},
                {-0.0113, -1.0, 0.9887}
        };
    }

}
