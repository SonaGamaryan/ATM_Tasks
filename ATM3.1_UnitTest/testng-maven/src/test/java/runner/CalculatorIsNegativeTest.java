package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorIsNegativeTest {
    private long a;
    private boolean expected;
   /* @Factory(dataProvider = "isNegativeDataProvider" )
    public CalculatorIsNegativeTest(long a, boolean expected){
        this.a = a;
        this.expected = expected;
    }*/
    @Test (dataProvider = "isNegativeDataProvider", groups = "Bugs")
    public  void testIsNegative(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected);
    }

    @Test
    public  void testIsNegative0(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive(0);
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "isNegativeDataProvider")
    public static Object[][] isNegativeDataProvider(){
        return new Object[][] {
                {30, false},
                {-90, true}
        };
    }
}
