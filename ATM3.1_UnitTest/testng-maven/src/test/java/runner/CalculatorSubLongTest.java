package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorSubLongTest {
    private long a;
    private long b;
    private long expected;
    @Factory(dataProvider = "subDataProvider" )
    public CalculatorSubLongTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public  void testSub(){
        Calculator calculator = new Calculator();
        long result = calculator.sub(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProvider(){
        return new Object[][]{
                {1, 1, 0},
                {0, 0, 0},
                {-1, -1000, 999},
        };
    }
}
