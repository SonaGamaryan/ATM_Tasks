package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Sona_Gamaryan on 6/5/2017.
 */
public class CalculatorDivTest extends BaseCalculatorTest{
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "divDataProvider" )
    public CalculatorDivTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(groups = "main", timeOut = 1000)
    public  void testDiv(){
     //   Calculator calculator = new Calculator();
        long div = calculator.div(a,b);
        Assert.assertEquals(div, expected);
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void testDivByZero(){
        Calculator calculator = new Calculator();
        long result = calculator.div(5,0);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider(){
        return new Object[][] {
                {1,1,1},
                {0,2,0},
                {-1,-1,1}
        };
    }

}
