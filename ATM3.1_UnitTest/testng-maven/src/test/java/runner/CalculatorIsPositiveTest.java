package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorIsPositiveTest {
    private long a;
    private boolean expected;
    @Factory(dataProvider = "isPositiveDataProvider" )
    public CalculatorIsPositiveTest(long a, boolean expected){
        this.a = a;
        this.expected = expected;
    }
    @Test
    public  void testIsPositive(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "isPositiveDataProvider")
    public static Object[][] isPositiveDataProvider(){
        return new Object[][] {
                {0, false},
                {30, true},
                {-90, false}
        };
    }
}
