package runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * Created by Sona_Gamaryan on 6/1/2017.
 */
public class CalclulatorTest {
    private long a;
    private long b;
    private long expected;
    @Factory(dataProvider = "sumDataProvider" )
    public CalclulatorTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public  void testSum(){
        Calculator calculator = new Calculator();
        long sum = calculator.sum(a,b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][] {
                {1,1,2},
                {0,0,0},
                {-1,-1000,-1001}

        };
    }
}
