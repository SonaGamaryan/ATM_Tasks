package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorMultLongTest {
    private long a;
    private long b;
    private long expected;
    @Factory(dataProvider = "multDataProvider" )
    public CalculatorMultLongTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test (groups = "main")
    public  void testMultLong(){
        Calculator calculator = new Calculator();
        long result = calculator.mult(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProvider(){
        return new Object[][] {
                {1,1,1},
                {0,0,0},
                {-1,-1000,1000}

        };
    }
}
